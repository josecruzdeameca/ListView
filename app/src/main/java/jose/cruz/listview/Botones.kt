package jose.cruz.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_botones.*

class Botones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        b_regresar.setOnClickListener(){
            val regresar = Intent(this, MainActivity::class.java)
            startActivity(regresar)
        }




    }
}
