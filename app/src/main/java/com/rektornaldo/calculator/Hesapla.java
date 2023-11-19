package com.rektornaldo.calculator;

public class Hesapla {
    private float gelenSayi1, gelenSayi2;

    public Hesapla(int s1, int s2){
        this.gelenSayi1 = s1;
        this.gelenSayi2 = s2;
    }

    public float Toplam(){
        return gelenSayi1 + gelenSayi2;
    }
    public float Fark(){
        return gelenSayi1 - gelenSayi2;
    }
    public float Bolum(){
        return gelenSayi1 / gelenSayi2;
    }
    public float Carpim(){
        return gelenSayi1 * gelenSayi2;
    }
}
