package com.example.lesson8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etArrayNumber1: EditText? = null
    private var etArrayNumber2: EditText? = null
    private var etArrayNumber3: EditText? = null
    private var etArrayNumber4: EditText? = null
    private var etArrayNumber5: EditText? = null

    private var tvCircle1: TextView? = null
    private var tvCircle2: TextView? = null
    private var tvCircle3: TextView? = null
    private var tvCircle4: TextView? = null
    private var tvCircle5: TextView? = null

    private var btnUpdate: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initButton()

        val p = 3.14

        val intArray = arrayOf(4, 45, 234, 234, 23)
        val floatArray = Array<Float>(5){0F}

        etArrayNumber1?.setText(intArray[0].toString())
        etArrayNumber2?.setText(intArray[1].toString())
        etArrayNumber3?.setText(intArray[2].toString())
        etArrayNumber4?.setText(intArray[3].toString())
        etArrayNumber5?.setText(intArray[4].toString())

        for (i in 0..4)
            floatArray[i] = (intArray[i]*p).toFloat()

        tvCircle1?.text = floatArray[0].toString()
        tvCircle2?.text = floatArray[1].toString()
        tvCircle3?.text = floatArray[2].toString()
        tvCircle4?.text = floatArray[3].toString()
        tvCircle5?.text = floatArray[4].toString()

        btnUpdate?.setOnClickListener {
            intArray[0] = etArrayNumber1?.text.toString().toInt()
            intArray[1] = etArrayNumber2?.text.toString().toInt()
            intArray[2] = etArrayNumber3?.text.toString().toInt()
            intArray[3] = etArrayNumber4?.text.toString().toInt()
            intArray[4] = etArrayNumber5?.text.toString().toInt()

            for (i in 0..4)
                floatArray[i] = (intArray[i]*p).toFloat()

            tvCircle1?.text = floatArray[0].toString()
            tvCircle2?.text = floatArray[1].toString()
            tvCircle3?.text = floatArray[2].toString()
            tvCircle4?.text = floatArray[3].toString()
            tvCircle5?.text = floatArray[4].toString()

        }
    }

    private fun initView(){
        etArrayNumber1 = findViewById<EditText>(R.id.edArrayNumber1)
        etArrayNumber2 = findViewById<EditText>(R.id.edArrayNumber2)
        etArrayNumber3 = findViewById<EditText>(R.id.edArrayNumber3)
        etArrayNumber4 = findViewById<EditText>(R.id.edArrayNumber4)
        etArrayNumber5 = findViewById<EditText>(R.id.edArrayNumber5)

        tvCircle1 = findViewById<TextView>(R.id.tvCircle1)
        tvCircle2 = findViewById<TextView>(R.id.tvCircle2)
        tvCircle3 = findViewById<TextView>(R.id.tvCircle3)
        tvCircle4 = findViewById<TextView>(R.id.tvCircle4)
        tvCircle5 = findViewById<TextView>(R.id.tvCircle5)
    }

    private fun initButton(){
        btnUpdate = findViewById<Button>(R.id.btnUpdate)
    }
}