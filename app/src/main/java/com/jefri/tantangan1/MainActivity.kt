package com.jefri.tantangan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private val hitungLogic = hitungLogic()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inisiasi variabel
        val hitung1 = edtAngka.text
        val hitung2 = edtAngka2.text
        val hitung3 = edtAngka3.text
        // handler button
        btnKali.setOnClickListener {
            edtJumlah.text = "Hasil Perkalian= ${
                hitungLogic.hitungKali(
                    hitung1.toString().toDouble(),
                    hitung2.toString().toDouble(),
                    hitung3.toString().toDouble()
                )
            }"
        }
        btnKurang.setOnClickListener {
            edtJumlah.text = "Hasil Perkurangan= ${
                hitungLogic.hitungKurang(
                    hitung1.toString().toDouble(),
                    hitung2.toString().toDouble(),
                    hitung3.toString().toDouble()
                )
            }"
        }
        btnBagi.setOnClickListener {
            edtJumlah.text = "Hasil Pembagian= ${
                hitungLogic.hitungBagi(
                    hitung1.toString().toDouble(),
                    hitung2.toString().toDouble(),
                    hitung3.toString().toDouble()
                )
            }"
        }
        btnHitung.setOnClickListener {
            edtJumlah.text = "Hasil Pembagian= ${
                hitungLogic.hitungTambah(
                    hitung1.toString().toDouble(),
                    hitung2.toString().toDouble(),
                    hitung3.toString().toDouble()
                )
            }"
        }
        btnKeluar.setOnClickListener {
            finish()
            System.exit(0)
        }
    }

}
