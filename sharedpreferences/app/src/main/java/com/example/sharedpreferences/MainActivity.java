package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = editText.getText().toString();
                SharedPreferences shrd = getSharedPreferences("Demo", MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.putString("str", msg);
                editor.apply();
                
                textView.setText(msg);

            }
        });
        // get the value of sharedpreferences back..
        SharedPreferences getshared = getSharedPreferences("Demo", MODE_PRIVATE);
        String value = getshared.getString("str","Save a note and it will show up here");
        textView.setText(value);
    }
}
