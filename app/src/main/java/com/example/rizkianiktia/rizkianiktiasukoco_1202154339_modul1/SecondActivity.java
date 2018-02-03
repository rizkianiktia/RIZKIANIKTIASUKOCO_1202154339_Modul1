package com.example.rizkianiktia.rizkianiktiasukoco_1202154339_modul1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView porsi;
    TextView tempat;
    TextView nasi;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    Intent intent = getIntent();


        String aJumlah = intent.getStringExtra("jumlah");
        String aTempat = intent.getStringExtra("tempat");
        String aMenu = intent.getStringExtra("menu");
        String aHarga = intent.getStringExtra("Harga");

        int jHarga = Integer.valueOf(aHarga)*Integer.valueOf(aJumlah);

        tempat = (TextView)findViewById(R.id.textViewrumahmakan);
        tempat.setText(aTempat);
        nasi = (TextView)findViewById(R.id.textViewMenu);
        nasi.setText(aMenu);
        porsi = (TextView)findViewById(R.id.textViewangka);
        porsi.setText(aJumlah);
        harga = (TextView)findViewById(R.id.textViewrp);
        harga.setText(String.valueOf(jHarga));

        if (jHarga > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya!!! uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
