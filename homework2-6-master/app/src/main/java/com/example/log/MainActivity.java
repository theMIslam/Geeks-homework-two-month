package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        Button btn = findViewById(R.id.btn_sign);
        TextView signup = findViewById(R.id.sign_up);
        TextView login = findViewById(R.id.login);
        CheckBox checkBox = findViewById(R.id.checkBox);

       Button button = findViewById(R.id.btn_sign);
        button.setOnClickListener(v -> {
            if (!name.getText().toString().equals("Clown") && !email.getText().toString().equals("Password")&& !password.getText().toString().equals("Password")){
                Toast.makeText(this, "Пароль не верный", Toast.LENGTH_SHORT).show();

            }else {  Toast.makeText(this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                name.setVisibility(View.INVISIBLE);
                email.setVisibility(View.INVISIBLE);
               password.setVisibility(View.INVISIBLE);
                email.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.INVISIBLE);
                signup.setVisibility(View.INVISIBLE);
                login.setVisibility(View.INVISIBLE);
                checkBox.setVisibility(View.INVISIBLE);




            }
        });
    }
}
