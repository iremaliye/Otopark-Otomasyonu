package com.irem.otoparkotomasyonu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button musteriGiris,personelGiris,teknikServisGiris;
    Button girisYapB,sifremiUnuttumB;
    EditText girisTc, girisSifre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musteriGiris=findViewById(R.id.musteributton);
        personelGiris=findViewById(R.id.personelbutton);
        teknikServisGiris=findViewById(R.id.teknikSbutton);

        sifremiUnuttumB=findViewById(R.id.SifremiUnuttumButton);
        girisTc=findViewById(R.id.editTextGirisTc);
        girisSifre=findViewById(R.id.editTextGirisSifre);


        //getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler,new MusteriFragment()).commit();
        /*Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sagdan_sola);
        girisTc.startAnimation(animation);
        girisSifre.startAnimation(animation);*/


        girisYapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent giris = new Intent(getApplicationContext(),MusteriBilgileri.class);
                startActivity(giris);

            }
        }
        );


        musteriGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new MusteriFragment()).commit();
            }
        }
        );
        personelGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new PersonelFragment()).commit();
            }
        }
        );

        teknikServisGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new TeknikServisFragment()).commit();
            }
        }
        );




    }

}