package com.tufanakcay.factorialcalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText m_editText;
    Button m_button;
    TextView m_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        tiklama();

    }


    private void init() {
        m_editText = findViewById(R.id.editTextID);
        m_button = findViewById(R.id.buttonID);
        m_textView = findViewById(R.id.textViewID);

    }

    private void tiklama() {
        m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String deger = m_editText.getText().toString();

                if (TextUtils.isEmpty(deger)) {
                    Toast.makeText(MainActivity.this, "Please enter Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                int fakHesaplanacakSayi = Integer.parseInt(deger);
                int faktoriyel = hesapla(fakHesaplanacakSayi);

                m_textView.setText("Result : " + faktoriyel);
            }
        });

    }

    private int hesapla(int sayi) {
        int sonuc = 1;
        int a = 1;
        for (int i = sayi; i > 1; i--) {
            sonuc = sonuc * i;
        }

        return sonuc;
    }
}