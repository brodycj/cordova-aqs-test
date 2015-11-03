package me.brodybits;

import org.apache.cordova.CordovaPlugin;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceResponse;

import android.util.Log;

public class AQS extends CordovaPlugin {
  @Override
  public void pluginInitialize() {
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "*************** AQS INIT");
  }
  @Override
  public Boolean shouldAllowRequest(String url) {
Log.i("info", "*************** AQS URL");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "***************************************");
Log.i("info", "got url: " + url);
    if (url.startsWith("aqaq", 0) || url.startsWith("file:///aq", 0)) {
Log.i("info", "url match: " + url);
      //webView.loadUrl("javascript:aqcallback('got uri: " + url + "')");
      webView.sendJavascript("aqcallback('got uri: " + url + "')");
      return false;
    }

    return true;
  }
}
