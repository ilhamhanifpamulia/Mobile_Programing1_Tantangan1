package com.jefri.tantangan1

class hitungLogic {
    var result=0.0

    fun hitungKali(h1:Double, h2:Double, h3:Double) : Double {
        this.result = h1 * h2 * h3
        return h1*h2*h3
    }
    fun hitungKurang(h1:Double, h2:Double, h3:Double) : Double {
        this.result = h1 - h2 - h3
        return h1-h2-h3
    }

    fun hitungBagi(h1:Double, h2:Double, h3:Double) : Double {
        this.result = h1 / h2 / h3
        return h1/h2/h3
    }

    fun hitungTambah(h1:Double, h2:Double, h3:Double) : Double {
        this.result = h1 + h2 + h3
        return h1+h2+h3
    }
}