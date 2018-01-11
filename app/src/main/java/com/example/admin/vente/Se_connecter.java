package com.example.admin.vente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class Se_connecter extends AppCompatActivity{
    EditText email;
    EditText password;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se_connecter);
        email = (EditText) findViewById(R.id.adresse);
        password = (EditText) findViewById(R.id.pass);
    }

    public void connecter(View view) {
        clientDB db=new clientDB(getApplicationContext());
        db.open();
        String mail =email.getText().toString();
        String pass= password.getText().toString();
        List<client> lst=new ArrayList<client>();
        if((email.equals(lst.get(5)))&&(password.equals(lst.get(4)))) {
            Intent i=new Intent(this,Boutique.class);
            startActivity(i);
        }
    }

}
