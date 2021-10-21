package com.diana.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton question1option1 = findViewById(R.id.question1option1);
        RadioButton question1option2 = findViewById(R.id.question1option2);
        RadioButton question1option3 = findViewById(R.id.question1option3);
        RadioButton question1option4 = findViewById(R.id.question1option4);
        RadioButton question2option1 = findViewById(R.id.question2option1);
        RadioButton question2option2 = findViewById(R.id.question2option2);
        RadioButton question2option3 = findViewById(R.id.question2option3);
        RadioButton question2option4 = findViewById(R.id.question2option4);

        TextView textViewResult = findViewById(R.id.text_view_result);

        Button button_check = findViewById(R.id.button_check);

        button_check.setOnClickListener(v -> {
            boolean test = question1option3.isChecked();
            boolean test1 = question2option4.isChecked();
            int result = 0;

            if (test) {
                result += 1;
            }
            if (test1) {
                result += 1;
            }

            String re2sult;
            if (result < 2) {
                re2sult = "Jalaste muggle";
            } else {
                re2sult = "10 puntos para Slytherin";
            }

            button_check.setVisibility(View.GONE);
            textViewResult.setText("Tienes " + result + " de 2 \n" + re2sult);
        });
    }
}