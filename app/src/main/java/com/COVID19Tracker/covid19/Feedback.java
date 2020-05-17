package com.COVID19Tracker.covid19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.sql.Timestamp;
import java.util.HashMap;

public class Feedback extends AppCompatActivity {
    private FirebaseFirestore firebaseFirestore;
    private EditText EmailAddress, Feedback;
    private Button button;
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Please wait, .. ..");
        EmailAddress = findViewById(R.id.Email);
        Feedback = findViewById(R.id.feedback_content);
        button = findViewById(R.id.feedback_publish);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressDialog.show();
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (TextUtils.isEmpty(Feedback.getText().toString())){
                    Toast.makeText(com.COVID19Tracker.covid19.Feedback.this,"Error", Toast.LENGTH_LONG).show();
                    return;
                }
                SendData(EmailAddress.getText().toString(), Feedback.getText().toString(),timestamp.toString() );
            }
        });


    }
    public void SendData (String Email, final String Feedbac, final String Time){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Email", Email);
        hashMap.put("FeedBack", Feedbac);
        hashMap.put("Time", Time);
        FirebaseFirestore.getInstance().collection("Feedback")
                .document(Time)
                .set(hashMap, SetOptions.merge())
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            mProgressDialog.dismiss();
                            Toast.makeText(com.COVID19Tracker.covid19.Feedback.this,"Thanks for your feedback", Toast.LENGTH_LONG).show();
                        }else {
                            mProgressDialog.dismiss();
                            Toast.makeText(com.COVID19Tracker.covid19.Feedback.this,"Error", Toast.LENGTH_LONG).show();

                        }
                    }
                });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(com.COVID19Tracker.covid19.Feedback.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
