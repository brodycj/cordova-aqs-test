package me.brodybits;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceResponse;

import android.net.Uri;

import android.util.Log;

import java.io.ByteArrayInputStream;

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
  public Uri remapUri(Uri uri) {
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
Log.i("info", "*************** AQS remapUri");
Log.i("info", "remapUri: " + uri.toString());
    String url = uri.toString();
    if (url.startsWith("aqaq", 0) || url.startsWith("file:///aq", 0)) {
      webView.sendJavascript("aqcallback('got uri: " + uri.toString() + "')");
      // Trigger handleOpenForRead in order to avoid 404 message in debug console
      return toPluginUri(uri);
    }

    return null;
  }

  @Override
  public CordovaResourceApi.OpenForReadResult handleOpenForRead(Uri uri) throws java.io.IOException {
Log.i("info", "***************************************");
Log.i("info", "*************** AQS handleOpenForRead");
Log.i("info", "handleOpenForRead: " + uri.toString());
    //webView.sendJavascript("aqcallback('handleOpenForRead uri: " + uri.toString() + "')");
    //return null;
    return new CordovaResourceApi.OpenForReadResult(uri, new ByteArrayInputStream(new byte[0]), "a", 0, null);
  }
}
