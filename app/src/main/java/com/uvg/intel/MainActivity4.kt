package com.uvg.intel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

//este servira para realizar la multiplicacion
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnRegresar.setOnClickListener {
            //obtener los dos string del edit text, convertirlos en un float y sumar y regresar el dato
            val data1: EditText = valor1
            val num1: String = data1.text.toString()
            val val1:Float =num1.toFloat()
            val data2: EditText = valor2
            val num2: String = data2.text.toString()
            val val2:Float = num2.toFloat()
            val suma: Float = val1 * val2
            val resultadoString: String = suma.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("resultado",resultadoString)
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}