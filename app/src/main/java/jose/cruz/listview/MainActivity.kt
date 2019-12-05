package jose.cruz.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val opciones = arrayOf("Botones", "Imágenes", "WebView", "Switch", "Opción 5", "Opción 6", "Opción 7", "Opción 8", "Opción 9", "Opción 10", "Opción 11", "Opción 12")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones)
        lv_milistview.adapter = adaptador

        lv_milistview.setOnItemClickListener { adapterView, view, i, l ->
            //Toast.makeText(this,"$i", Toast.LENGTH_LONG).show()
            var intento = Intent()
            if (i<4) {
                when (i) {
                    0 -> intento = Intent(this, Botones::class.java)
                    1 -> intento = Intent(this, Imagenes::class.java)
                    2 -> intento = Intent(this, WebView::class.java)
                    3 -> intento = Intent(this, Switch::class.java)
                }

                startActivity(intento)

            } else {Toast.makeText(this,"Opción sin programar.", Toast.LENGTH_LONG).show()}
        }


    } //onCreate
}
