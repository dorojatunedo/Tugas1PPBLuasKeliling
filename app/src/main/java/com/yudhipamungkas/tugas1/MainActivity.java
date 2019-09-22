package com.yudhipamungkas.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextView txtDataLuas;
    private TextView txtDataKeliling;
    private EditText alas;
    private EditText tinggi;
    private Button btnShow1;
    private Button btnShow2;
    private Button btnShow3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDataLuas = (TextView)findViewById(R.id.hasilLuas);
        txtDataKeliling = (TextView)findViewById(R.id.hasilKeliling);
        btnShow1 = (Button)findViewById(R.id.show1);
        btnShow2 = (Button)findViewById(R.id.show2);
        btnShow3 = (Button)findViewById(R.id.show3);
        alas = (EditText)findViewById(R.id.alas);
        tinggi = (EditText)findViewById(R.id.tinggi);

        btnShow1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String Alas, Tinggi;

                Alas = alas.getText().toString();
                Tinggi = tinggi.getText().toString();

                double a;
                a = Double.parseDouble(Alas);
                double t;
                t = Double.parseDouble(Tinggi);
                double m;
                m = Math.sqrt(Math.pow(a,2)+Math.pow(t,2));

                double hasilLuas1;
                double hasilKeliling1;

                hasilLuas1 = (a * t)/2;
                hasilKeliling1 = a+t+m;
                txtDataLuas.setText("Luas = "+hasilLuas1);
                txtDataKeliling.setText("Keliling = "+hasilKeliling1);
            }
        });

        btnShow2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String Alas, Tinggi;

                Alas = alas.getText().toString();
                Tinggi = tinggi.getText().toString();

                double a;
                a = Double.parseDouble(Alas);
                double t;
                t = Double.parseDouble(Tinggi);

                double hasilLuas2;
                double hasilKeliling2;

                hasilLuas2 = (a * t);
                hasilKeliling2 = 2*(a+t);
                txtDataLuas.setText("Luas = "+hasilLuas2);
                txtDataKeliling.setText("Keliling = "+hasilKeliling2);
            }
        });

        btnShow3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String Alas, Tinggi;

                Alas = alas.getText().toString();
                Tinggi = tinggi.getText().toString();

                double a;
                a = Double.parseDouble(Alas);
                double t;
                t = Double.parseDouble(Tinggi);
                double m;
                m = Math.pow(a,2);

                double hasilLuas3;
                double hasilKeliling3;

                hasilLuas3 = (3.14)*m/4;
                hasilKeliling3 = (3.14)*a;
                txtDataLuas.setText("Luas = "+hasilLuas3);
                txtDataKeliling.setText("Keliling = "+hasilKeliling3);
            }
        });
    }


}
