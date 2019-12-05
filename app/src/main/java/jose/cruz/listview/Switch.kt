package jose.cruz.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_switch.*

class Switch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)

        s_regresar.setOnClickListener(){
            val regresar = Intent(this, MainActivity::class.java)
            startActivity(regresar)
        }

        cb_regresar.setOnClickListener(){
            val regresar = Intent(this, MainActivity::class.java)
            startActivity(regresar)
        }

        rb_regresar.setOnClickListener(){
            val regresar = Intent(this, MainActivity::class.java)
            startActivity(regresar)
        }


    }



}
