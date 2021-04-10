package com.example.examinationmad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String name;
    String password;
    EditText Username , Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Reset(View view)
    {

        EditText Username = (EditText) findViewById(R.id.etname);
        EditText Password = (EditText) findViewById(R.id.etpass);

        String name = Username.getText().toString();
        String password = Password.getText().toString();
        Username.setText("");
        Password.setText("");
    }

    public void Submit(View view)
    {
        EditText Username = (EditText) findViewById(R.id.etname);
        EditText Password = (EditText) findViewById(R.id.etpass);

        String name = Username.getText().toString();
        String password = Password.getText().toString();


        if (name.equals("MAD") && password.equals("MAD"))
        {
            Toast.makeText(getApplicationContext()," User Name ANd Password are Valid",Toast.LENGTH_LONG).show();
        }

        else  if (TextUtils.isEmpty(name))
        {
            Toast.makeText(getApplicationContext()," User Name is empty",Toast.LENGTH_LONG).show();
        }
        else  if (TextUtils.isEmpty(password))
        {
            Toast.makeText(getApplicationContext()," Password is empty",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext()," User Name ANd Password are INvalid",Toast.LENGTH_LONG).show();
        }

    }


}