package com.uvg.intel

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSuma.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            /*intent.putExtra("valor", "Hola")
            intent.putExtra("valor2","Prueba")
            intent.putExtra("valor3","asdfasdf")*/
            //startActivity(intent)
            //finish()

            startActivityForResult(intent,1)
        }

        btnResta.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivityForResult(intent,1)
        }

        btnMultiplicacion.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivityForResult(intent,1)
        }

        btnDivision.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity5::class.java)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                val bundle = data?.extras
                if(bundle!=null){
                    val text = bundle.getString("resultado")
                    txtTexto.text = text
                //Toast.makeText(this,text,Toast.LENGTH_LONG).show()

                }


            }
        }
    }
}
