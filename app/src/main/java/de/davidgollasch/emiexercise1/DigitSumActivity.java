package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static de.davidgollasch.emiexercise1.R.id.B_Quer;
import static de.davidgollasch.emiexercise1.R.id.E_Quer;
import static de.davidgollasch.emiexercise1.R.id.TV_Quer;
import static de.davidgollasch.emiexercise1.R.id.buttonFire;
import static de.davidgollasch.emiexercise1.R.id.textViewFibonacci;

public class DigitSumActivity extends AppCompatActivity {

    private TextView tvOutput;
    private EditText etNumber;
    private Button btnFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_sum);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        // Initialises the views and event listeners
        InitializeActivity();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeActivity() {

        tvOutput = (TextView) findViewById(TV_Quer);
        btnFire = (Button) findViewById(B_Quer);
        etNumber = (EditText) findViewById(E_Quer);

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear text view
                tvOutput.setText("");

                // Invoke calculation
                CalculateDigitSum();
            }
        });

    }

    /**
     * Trigger the Digit Sum Calculation
     */
    private void CalculateDigitSum() {
        /*
         *
         *  TODO: IMPLEMENT THIS
         *  NUMBER 3: CALCULATE AND PRINT DIGIT SUM
         *
         *
         */

        /*
         * a) Get entered number
         */
        try{
            int i = Integer.parseInt(etNumber.getText().toString());
            i = getDigitSum(i);



        /*
         * b) Calculate digit sum
         *    (Hint: This can be done recursively using an additional function/method
         *    private int getDigitSum(int n))
         */

        /*
         * c) Print result
         */

        }

}
