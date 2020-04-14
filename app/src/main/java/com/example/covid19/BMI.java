package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BMI extends AppCompatActivity {
    private RadioGroup rg;
    int age2 = 0, age3 = 0, height2 = 0, height3 = 0, weight2 = 0, weight3 = 0, gender = -1, t1 = 0, t2 = 0, t3 = 0, t4 = 0;
    float temp1 = 0, temp2 = 0, temp3 = 0;
    String age1 = "", height1 = "", weight1 = "";
    EditText age, height, weight;
    // For the bmi window
    private CardView cardVieMale, FemaleCardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        cardVieMale = findViewById(R.id.MaleCardview);
        FemaleCardview  = findViewById(R.id.FemaleCardview);
        cardVieMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BMI.this, "Men", Toast.LENGTH_SHORT).show();
                gender = 0;
                cardVieMale.setCardBackgroundColor(getResources().getColor(R.color.black));
                FemaleCardview.setCardBackgroundColor(getResources().getColor(R.color.BMI));
            }
        });
        FemaleCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BMI.this, "Women", Toast.LENGTH_SHORT).show();
                gender = 1;
                cardVieMale.setCardBackgroundColor(getResources().getColor(R.color.BMI));
                FemaleCardview.setCardBackgroundColor(getResources().getColor(R.color.black));

            }
        });

       rg = (RadioGroup) findViewById(R.id.rg);

        //To remove the focus from the activity when the activity starts
      //  this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    //Used to add some time so that user cannot directly press and exity out of the activity
    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(BMI.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }


    private float bmiCalculator(int a, int b) {
        if (b == 0 || a == 0) {
            Toast.makeText(this, "Enter valid details", Toast.LENGTH_SHORT).show();
            return 0;
        }
        double temp = (b * 10000.0) / (a * a * 1.0);
        float f = (float) temp;
        return f;
    }
    private int ageit() {
        t1 = 1;
        age = (EditText) findViewById(R.id.age);
        age1 = age.getText().toString();
        try {
            age2 = Integer.parseInt(age1);
        } catch (NumberFormatException e) {
            // Toast.makeText(this,"Only Digits Allowed",Toast.LENGTH_SHORT).show();
        }
        return age2;
    }
    //Take height from user
    private int heightit() {
        t2 = 1;
        height = (EditText) findViewById(R.id.height);
        height1 = height.getText().toString();
        try {
            height2 = Integer.parseInt(height1);
        } catch (NumberFormatException e) {
            // Toast.makeText(this,"Only Digits Allowed",Toast.LENGTH_SHORT).show();
        }
        return height2;
    }

    //take weight from user
    private int weightit() {
        t3 = 1;
        weight = (EditText) findViewById(R.id.weight);
        weight1 = weight.getText().toString();
        try {
            weight2 = Integer.parseInt(weight1);
        } catch (NumberFormatException e) {
            //Toast.makeText(this,"Only Digits Allowed",Toast.LENGTH_SHORT).show();
        }
        return weight2;
    }

    private void showdatamen(float f, int a) {

        TextView normal = (TextView) findViewById(R.id.Stauts);

        TextView tv = (TextView) findViewById(R.id.result);
        if (a < 10) {
            tv.setText("< 14.6");
            normal.setText("Normal ");

            if (f == 0) {
                tv.setText("--");


            } else if (f < 14.6) {
                tv.setText("" + f);

            } else if (f >= 14.6 && f < 21.3) {
                tv.setText("" + f);

            } else if (f >= 21.3 && f < 25.0) {
                tv.setText("" + f);

            } else if (f >= 25.0) {
                tv.setText("" + f);

            }
        } else if (a >= 10 && a < 15) {
            tv.setText("< 16.7");
            normal.setText("Normal ");
            if (f == 0) {
                tv.setText("--");


            } else if (f < 16.7) {
                tv.setText("" + f);
                normal.setText("Normal ");

            } else if (f >= 16.7 && f < 22.5) {
                tv.setText("" + f);
                normal.setText("Normal ");

            } else if (f >= 22.5 && f < 25.6) {
                tv.setText("" + f);
                normal.setText("Over Weight ");

            } else if (f >= 25.6) {
                tv.setText("" + f);
                normal.setText("Obese  ");

            }
        } else if (a >= 15 && a < 20) {
            tv.setText("< 18.6");
            normal.setText("Normal ");

            if (f == 0) {
                tv.setText("--");


            } else if (f < 18.6) {
                tv.setText("" + f);
                normal.setText("Normal ");

            } else if (f >= 18.6 && f < 23.9) {
                tv.setText("" + f);
                normal.setText("Normal ");

            } else if (f >= 23.9 && f < 26.7) {
                tv.setText("" + f);
                normal.setText("Over Weight ");

            } else if (f >= 26.7) {
                tv.setText("" + f);
                normal.setText("Obese ");

            }
        } else if (a >= 20) {
            tv.setText("< 20");
            normal.setText("Normal ");

            if (f == 0) {
                tv.setText("--");


            } else if (f < 20) {
                tv.setText("" + f);
                normal.setText("Under Weight ");

            } else if (f >= 20 && f < 25) {
                tv.setText("" + f);
                normal.setText("Normal ");

            } else if (f >= 25 && f < 30) {
                tv.setText("" + f);
                normal.setText("Over Weight");

            } else if (f >= 30 && f < 40) {
                normal.setText("Obese ");

            } else {
                tv.setText("" + f);
                normal.setText("Morbidly Obese ");

            }
        }
    }


    private void showdatawomen(float f, int a) {
        TextView stauts = (TextView) findViewById(R.id.Stauts);
        TextView Result = (TextView) findViewById(R.id.result);

        if (a < 10) {




            if (f == 0) {
                Result.setText("--");



            } else if (f < 14.2) {
                Result.setText("" + f);
                stauts.setText("Under Weight");

            } else if (f >= 14.2 && f < 20.6) {
                Result.setText("" + f);
                stauts.setText("Under Weight");

            } else if (f >= 20.6 && f < 23.3) {
                Result.setText("" + f);
                stauts.setText("Normal");

            } else if (f >= 23.3) {
                Result.setText("" + f);
                stauts.setText("Normal");

            }
        } else if (a >= 10 && a < 15) {

            stauts.setText("Under Weight");

            if (f == 0) {
                Result.setText("--");


            } else if (f < 15) {
                Result.setText("" + f);

            } else if (f >= 15 && f < 21.4) {
                Result.setText("" + f);

            } else if (f >= 21.4 && f < 23.3) {
                Result.setText("" + f);

            } else if (f >= 23.3) {
                Result.setText("" + f);

            }
        } else if (a >= 15 && a < 20) {

            stauts.setText("Normal");
            if (f == 0) {
                Result.setText("--");


            } else if (f < 17.8) {
                Result.setText("" + f);

            } else if (f >= 17.8 && f < 23.3) {
                Result.setText("" + f);

            } else if (f >= 23.3 && f < 25.6) {
                Result.setText("" + f);

            } else if (f >= 25.6) {
                Result.setText("" + f);

            }
        } else if (a >= 20) {



            if (f == 0) {
                Result.setText("--");


            } else if (f < 19) {
                Result.setText("" + f);
                stauts.setText("Under Weight");

            } else if (f >= 19 && f < 24) {
                Result.setText("" + f);
                stauts.setText("Normal");

            } else if (f >= 24 && f < 30) {
                Result.setText("" + f);
                stauts.setText("Over Weight");

            } else if (f >= 30 && f < 40) {
                Result.setText("" + f);
                stauts.setText("Obese");

            } else {
                Result.setText("" + f);
                stauts.setText("Morbidly Obese");

            }
        }
    }



    public void result(View view) {
     //   Button button = (Button) findViewById(R.id.res);
        age3 = ageit();
        height3 = heightit();
        weight3 = weightit();
        if ((gender == 0 || gender == 1) && t1 == 1 && t2 == 1 && t3 == 1) {
            temp1 = bmiCalculator(height3, weight3);
            t4 = 1;
           if (gender == 0)
               showdatamen(temp1, age3);
           else
               showdatawomen(temp1, age3);
        } else if (t1 == 0 || t2 == 0 || t3 == 0) {
            Toast.makeText(this, "Choose the Required Fields", Toast.LENGTH_SHORT).show();
            age3 = ageit();
            height3 = heightit();
            weight3 = weightit();
        } else {

            Toast.makeText(this, "Choose Gender", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
//        Animation animation = new AlphaAnimation(1.0f, 0.0f);
//        animation.setDuration(600);
//        Button button = (Button) findViewById(R.id.reset);
//        button.startAnimation(animation);
//        if (t4 != 0) {
//            TextView under = (TextView) findViewById(R.id.underweight);
//            TextView normal = (TextView) findViewById(R.id.normal);
//            TextView over = (TextView) findViewById(R.id.overweight);
//            TextView obese = (TextView) findViewById(R.id.obese);
//            TextView morobese = (TextView) findViewById(R.id.morobese);
//            age2 = 0; age3 = 0;
//            height2 = 0;height3 = 0;
//            weight2 = 0;weight3 = 0;
//            gender = -1;
//            t1 = 0;t4 = 0;t2 = 0;t3 = 0;
//            temp1 = 0;temp2 = 0;temp3 = 0;
//            age1 = "";height1 = "";weight1 = "";
//            TextView t = (TextView) findViewById(R.id.result);
//            t.setText("0.0");
//            t.setBackgroundColor(Color.parseColor("#FFCDCDC6"));
//            rg.clearCheck();
//            under.setText("-");
//            normal.setText("-");
//            over.setText("-");
//            obese.setText("-");
//            morobese.setText("-");
//            height.setText("");
//            weight.setText("");
//            age.setText("");
        }
    }


