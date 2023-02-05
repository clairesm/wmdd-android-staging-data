package com.example.stagingdatainexplicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button submitBtn ;
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submitBtn);
        nameEditText = findViewById(R.id.nameEditText);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                Bundle b = new Bundle();
                b.putString("name", nameEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);*/

//                passDataFirstMethod();
                passDataSecondMethod();
            }
        });
    }

    private void passDataFirstMethod() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

        Bundle b = new Bundle();
        b.putString("name", nameEditText.getText().toString());
        intent.putExtras(b);

        startActivity(intent);
    }

    private void passDataSecondMethod() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        intent.putExtra("name", nameEditText.getText().toString());
        startActivity(intent);
    }
}