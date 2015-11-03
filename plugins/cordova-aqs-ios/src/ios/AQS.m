#import "AQS.h"

static UIWebView * webView = NULL;

@interface AQSURLProtocol: NSURLProtocol

@end

@implementation AQSURLProtocol

+(BOOL)canInitWithRequest:(NSURLRequest *)request
{
    NSLog(@"url can init for url: %@", request.URL);
    if ([request.URL.absoluteString hasPrefix:@"file:///aq"]) {
        NSLog(@"match ok");
        dispatch_async(dispatch_get_main_queue(), ^{
            NSString * s1 = [NSString stringWithFormat: @"got uri: %@", request.URL.absoluteString];
            NSString * e = [NSString stringWithFormat:@"%@('%@');", @"aqcallback", s1];

            [webView stringByEvaluatingJavaScriptFromString: e];
        });
        return NO;
    }

    return NO;
}

+ (NSURLRequest *) canonicalRequestForRequest:(NSURLRequest *)request {
    return request;
}

- (void) startLoading {
    //NSLog(@"start loading");
}

- (void) stopLoading {
    //NSLog(@"stop loading");
}

@end

@implementation AQS

-(void)pluginInitialize
{
    webView = self.webView;
    [NSURLProtocol registerClass: [AQSURLProtocol class]];
}

@end
