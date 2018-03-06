package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToClaimsReportingForm = (Button) findViewById(R.id.report_claim_button);
        goToClaimsReportingForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Claims_Reporting_Form.class);
                startActivity(intent);
            }
        });

        Typeface futuralight = Typeface.createFromAsset(getAssets(), "FuturaPTMedium.otf");
        Button report_claims_button = (Button) findViewById(R.id.report_claim_button);
        report_claims_button.setTypeface(futuralight);
    }
}
