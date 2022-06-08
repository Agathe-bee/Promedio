package com.fati.promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=findViewById(R.id.txtres);

        int mater1 = 8, mater2 = 10, mater3 =9;
        
        int prom=(mater1 + mater2 + mater3)/3;
        
        res.setText(String.valueOf(prom));

        if ( prom < 7) {

            Toast.makeText(this, "Reprobado", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(this, "Aprobado", Toast.LENGTH_LONG).show();

        }
    }
}