package es.fgd192.lesson8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var IntMassiv = arrayOf(4, 45, 234, 234, 23)
    var TVtext: TextView? = null
    var TVtext2: TextView? = null
    var TVtext3: TextView? = null
    var TVtext4: TextView? = null
    var TVtext5: TextView? = null
    var ETwrite: EditText? = null
    var ETwrite2: EditText? = null
    var ETwrite3: EditText? = null
    var ETwrite4: EditText? = null
    var ETwrite5: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         ETwrite = findViewById<EditText>(R.id.write)
         ETwrite2 = findViewById<EditText>(R.id.write2)
         ETwrite3 = findViewById<EditText>(R.id.write3)
         ETwrite4 = findViewById<EditText>(R.id.write4)
         ETwrite5 = findViewById<EditText>(R.id.write5)

        ETwrite?.setText(IntMassiv[0].toString())
        ETwrite2?.setText(IntMassiv[1].toString())
        ETwrite3?.setText(IntMassiv[2].toString())
        ETwrite4?.setText(IntMassiv[3].toString())
        ETwrite5?.setText(IntMassiv[4].toString())


        TVtext = findViewById<TextView>(R.id.textv)
        TVtext2 = findViewById<TextView>(R.id.textv2)
        TVtext3 = findViewById<TextView>(R.id.textv3)
        TVtext4 = findViewById<TextView>(R.id.textv4)
        TVtext5 = findViewById<TextView>(R.id.textv5)


        var TVtest = IntMassiv[0] * 3.14
        TVtest.toString()
        var TVtest2 = IntMassiv[1] * 3.14
        TVtest2.toString()
        var TVtest3 = IntMassiv[2] * 3.14
        TVtest3.toString()
        var TVtest4 = IntMassiv[3] * 3.14
        TVtest4.toString()
        var TVtest5 = IntMassiv[4] * 3.14
        TVtest5.toString()

        TVtext?.setText(TVtest.toString())
        TVtext2?.setText(TVtest2.toString())
        TVtext3?.setText(TVtest3.toString())
        TVtext4?.setText(TVtest4.toString())
        TVtext5?.setText(TVtest5.toString())

        button.setOnClickListener {
            calculate()
        }

    }

    fun calculate() {
        IntMassiv[0] = ETwrite?.text.toString().toInt()
        IntMassiv[1] = ETwrite2?.text.toString().toInt()
        IntMassiv[2] = ETwrite3?.text.toString().toInt()
        IntMassiv[3] = ETwrite4?.text.toString().toInt()
        IntMassiv[4] = ETwrite5?.text.toString().toInt()

        var TVtest = IntMassiv[0] * 3.14
        TVtest.toString()
        var TVtest2 = IntMassiv[1] * 3.14
        TVtest2.toString()
        var TVtest3 = IntMassiv[2] * 3.14
        TVtest3.toString()
        var TVtest4 = IntMassiv[3] * 3.14
        TVtest4.toString()
        var TVtest5 = IntMassiv[4] * 3.14
        TVtest5.toString()

        TVtext?.setText(TVtest.toString())
        TVtext2?.setText(TVtest2.toString())
        TVtext3?.setText(TVtest3.toString())
        TVtext4?.setText(TVtest4.toString())
        TVtext5?.setText(TVtest5.toString())
    }
}


