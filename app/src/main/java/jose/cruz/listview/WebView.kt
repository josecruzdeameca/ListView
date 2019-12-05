package jose.cruz.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient

class WebView : AppCompatActivity() {

    private var MiWebView: android.webkit.WebView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        MiWebView = findViewById<android.webkit.WebView>(R.id.wv_navegador);
        MiWebView!!.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: android.webkit.WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        MiWebView!!.loadUrl("https://www.google.com")


    }
}
