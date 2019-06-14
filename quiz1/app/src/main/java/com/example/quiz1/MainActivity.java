package com.example.quiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtBuildVariant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtBuildVariant = findViewById(R.id.txt_build_varient);

        updateTextView();
    }

    /**
     *depending on build variant( release or debug) perform the actions as bellow ,as we used to update the text view
     */
    private void updateTextView() {
        String buildVarient = getApplicationContext().getResources().getString(R.string.test_some_card_text);
        txtBuildVariant.setText(buildVarient);
    }
}
