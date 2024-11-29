package com.example.rejestracja;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mail;
    private EditText haslo;
    private EditText h2;
    private Button guzik;
    private TextView k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mail = findViewById(R.id.mail);
        haslo = findViewById(R.id.haslo);
        h2 = findViewById(R.id.haslo2);
        guzik = findViewById(R.id.button);
        k = findViewById(R.id.textView);

        haslo.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        h2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        guzik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String maill = mail.getText().toString().trim();
                String pass = haslo.getText().toString().trim();
                String pass2 = h2.getText().toString().trim();


                if (!maill.contains("@")) {
                    k.setText("Nieprawidłowy adres email!");
                }
                else if (!pass.equals(pass2))
                    {
                        k.setText("Hasła nie są takie same!");
                    }
                    else
                        {
                            k.setText("Witaj: " + maill);
                        }
                    }



        });

    }
}