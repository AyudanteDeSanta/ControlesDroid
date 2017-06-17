package myapp.surfer.com.controles2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("WebView1","definiendo webview");
        WebView wbExplorer= (WebView) findViewById(R.id.wbExplorer);
        wbExplorer.getSettings().setJavaScriptEnabled(true);
        wbExplorer.getSettings().setBuiltInZoomControls(true);
        Log.d("WebView2","asignando url");

        wbExplorer.loadUrl("https://github.com/");
        Log.d("WebView3","eventoclick");

        wbExplorer.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }
        });
    }
}
