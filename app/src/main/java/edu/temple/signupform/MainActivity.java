package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name, email, password, password_conf;
    TextView name_err, email_err, password_err, password_conf_err, message_area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing editText variables
        name = findViewById(R.id.person_name_text);
        email = findViewById(R.id.email_text);
        password = findViewById(R.id.password_text);
        password_conf = findViewById(R.id.passwordconf_text);

        // Initializing textView variables
        name_err = findViewById(R.id.name_err);
        email_err = findViewById(R.id.email_err);
        password_err = findViewById(R.id.password_err);
        password_conf_err = findViewById(R.id.password_conf_err);
        message_area = findViewById(R.id.messageArea_text);

        // onClickListener used by submit
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_errors();
                boolean filled = true;

                if("".equals(name.getText().toString())){
                    name_err.setText("Enter name");
                    filled = false;
                }
                if("".equals(email.getText().toString())){
                    email_err.setText("Enter Email");
                    filled = false;
                }
                if("".equals(password.getText().toString())){
                    password_err.setText("Enter Password");
                    filled = false;
                }
                if("".equals(password_conf.getText().toString())){
                    password_conf_err.setText("Enter Password");
                    filled = false;
                }
                // All info supplied, check password match
                if(filled) {
                    if(password.getText().toString().equals(password_conf.getText().toString())){
                        message_area.setText("Welcome " + name.getText().toString() + " to SignUpForm!");
                    }
                    else {
                        password_conf_err.setText("No match!");
                    }

                }

            }
        });

    }
    public void reset_errors(){
        message_area.setText("Please enter information below.");
        name_err.setText("");
        email_err.setText("");
        password_err.setText("");
        password_conf_err.setText("");
    }
}