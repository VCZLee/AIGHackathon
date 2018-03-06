package com.example.myfirstapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Claims_Reporting_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claims__reporting__form);

        Typeface futuralight = Typeface.createFromAsset(getAssets(), "FuturaPTMedium.otf");
        TextView report_claims_button = (TextView) findViewById(R.id.claims_title);
        report_claims_button.setTypeface(futuralight);

        Button submit_claims_button = (Button) findViewById(R.id.SubmitClaim);
        submit_claims_button.setTypeface(futuralight);
    }
}
