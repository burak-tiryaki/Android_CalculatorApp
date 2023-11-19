package com.rektornaldo.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtBirinciSayi, editTxtIkinciSayi;
    private TextView txtSonuc;
    private int s1,s2;
    private float sonuc;
    private Hesapla hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-------- Bağlamalar ---------

        editTxtBirinciSayi = findViewById(R.id.editTextBirinci);
        editTxtIkinciSayi = findViewById(R.id.editTextIkinci);
        txtSonuc = findViewById(R.id.textViewSonuc);
    }

    public void btnHesapla(View view){
        if (!TextUtils.isEmpty(editTxtBirinciSayi.getText()) && !TextUtils.isEmpty(editTxtIkinciSayi.getText())){
            s1 = Integer.valueOf(editTxtBirinciSayi.getText().toString());
            s2 = Integer.valueOf(editTxtIkinciSayi.getText().toString());

            hesapla = new Hesapla(s1,s2);

            if (R.id.btnTopla == view.getId())
                sonuc = hesapla.Toplam();
            else if (R.id.btnCikar == view.getId())
                sonuc = hesapla.Fark();
            else if(R.id.btnBol == view.getId())
                sonuc = hesapla.Bolum();
            else if( R.id.btnCarp == view.getId())
                sonuc = hesapla.Carpim();

            txtSonuc.setText("Sonuç: " +Float.toString(sonuc));
        }
        else
            txtSonuc.setText("Lütfen boş değer bırakmayınız!");
    }
}