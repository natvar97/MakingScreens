package com.example.makingscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener  {

    private lateinit var selectPaymentMethodSpinner : Spinner
    private val paymentMethods = arrayListOf(
            "SELECT PAYMENT OPTIONS",
            "Debit/Credit/ATM Card",
            "EMI",
            "UPI-BHIM",
            "Other UPIs"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_payment_layout)

        selectPaymentMethodSpinner = findViewById(R.id.selectPaymentMethodSpinner)

        selectPaymentMethodSpinner.onItemSelectedListener = this

        val adapter = ArrayAdapter(this , android.R.layout.simple_spinner_item , paymentMethods)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        selectPaymentMethodSpinner.adapter = adapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

}