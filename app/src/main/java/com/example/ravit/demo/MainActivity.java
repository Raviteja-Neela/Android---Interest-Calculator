package com.example.ravit.demo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText principal = (EditText) findViewById(R.id.etprincipal);

        final EditText roi = (EditText) findViewById(R.id.etroi);

        final TextView result1=(TextView)findViewById(R.id.tvresult1);
        final TextView result2=(TextView)findViewById(R.id.tvresult2);
        final TextView result3=(TextView)findViewById(R.id.tvresult3);
        final TextView result4=(TextView)findViewById(R.id.tvresult4);
        final TextView result5=(TextView)findViewById(R.id.tvresult5);
        final TextView result6=(TextView)findViewById(R.id.tvresult6);



        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                   int prin =Integer.parseInt(principal.getText().toString());

                   int interest =Integer.parseInt(roi.getText().toString());

                   double amount = (prin * interest) / 100;

                double amount5 = (double) (amount * 5 );
                double amount10 = (double) (amount * 10 );
                double amount15 = (double) (amount * 15 );
                double amount20 = (double) (amount * 20 );
                double amount25 = (double) (amount * 25 );
                double amount30 = (double) (amount * 30 );

                DecimalFormat formater = new DecimalFormat("#.00");

                double monthlyInstallment5 = (amount5+ prin) / (5*12);
                double monthlyInstallment10 = (amount10+ prin) / (10*12);
                double monthlyInstallment15 = (amount15+ prin) / (15*12);
                double monthlyInstallment20 = (amount20+ prin) / (20*12);
                double monthlyInstallment25 = (amount25+ prin) / (25*12);
                double monthlyInstallment30 = (amount30+ prin) / (30*12);

                result1.setText("Installent for 5 years:" + formater.format(monthlyInstallment5));
                result2.setText("Installent for 10 years:" + formater.format(monthlyInstallment10));
                result3.setText("Installent for 15 years:" + formater.format(monthlyInstallment15));
                result4.setText("Installent for 20 years:" + formater.format(monthlyInstallment20));
                result5.setText("Installent for 25 years:" + formater.format(monthlyInstallment25));
                result6.setText("Installent for 30 years:" + formater.format(monthlyInstallment30));



            }
        });

    }
}
