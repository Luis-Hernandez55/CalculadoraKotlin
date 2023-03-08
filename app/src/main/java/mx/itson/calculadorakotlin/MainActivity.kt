package mx.itson.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //var = variable que va a cambiar su valor en diferentes ambientes o metotos
    //val = constante cuyo valor no va a cambiar
    private lateinit var txtValor1 : EditText
    private lateinit var txtValor2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtValor1 = findViewById(R.id.txtNum1)
        txtValor2 = findViewById(R.id.txtNum2)

        val btnSumar = findViewById<Button>(R.id.btnSuma)
        btnSumar.setOnClickListener(this)

        val btnRestar = findViewById<Button>(R.id.btnResta)
        btnRestar.setOnClickListener(this)

        val btnMultiplicar = findViewById<Button>(R.id.btnMul)
        btnMultiplicar.setOnClickListener(this)

        val btnDividir = findViewById<Button>(R.id.btnDiv)
        btnDividir.setOnClickListener(this)

    }

    fun sumar (a:Int, b:Int) : Int{
        return a + b
    }

    fun sumar2 (a:Int, b:Int) = a+b

    fun restar (a:Int, b:Int) : Int{
        return a - b
    }

    fun multiplicar (a:Int, b:Int) : Int{
        return a * b
    }

    fun dividir (a:Int, b:Int) : Int{
        return a / b
    }

    override fun onClick(v: View?) {

        when(v?.id){

            (R.id.btnSuma) -> {
                try{
                    var resultado = sumar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())

                    Toast.makeText(applicationContext, "El resultado de la suma es: ".plus(resultado),
                        Toast.LENGTH_LONG).show()
                } catch (ex: Exception){
                    //Log.e("Ocurrio un error en la suma", ex.toString())
                    Toast.makeText(applicationContext, "Ocurrio un erro en la suma: ",
                        Toast.LENGTH_LONG).show()
                }
            }

            (R.id.btnResta) -> {
                try {
                    var resultado = restar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())

                    Toast.makeText(applicationContext, "El resultado de la resta es: ".plus(resultado),
                        Toast.LENGTH_LONG).show()
                } catch (ex: Exception){
                    Toast.makeText(applicationContext, "Ocurrio un erro en la resta",
                        Toast.LENGTH_LONG).show()
                }
            }

            (R.id.btnMul) -> {
                try {
                    var resultado = multiplicar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())

                    Toast.makeText(applicationContext, "El resultado de la suma es: ".plus(resultado),
                        Toast.LENGTH_LONG).show()
                } catch (ex: Exception){
                    Toast.makeText(applicationContext, "Ocurrio un erro en la multiplicacion",
                        Toast.LENGTH_LONG).show()
                }
            }

            (R.id.btnDiv) -> {
                try {
                    var resultado = dividir(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())

                    Toast.makeText(applicationContext, "El resultado de la suma es: ".plus(resultado),
                        Toast.LENGTH_LONG).show()
                }catch (ex: Exception){
                    Toast.makeText(applicationContext, "Ocurrio un erro en la divicion",
                        Toast.LENGTH_LONG).show()
                }
            }
        }

    }

}