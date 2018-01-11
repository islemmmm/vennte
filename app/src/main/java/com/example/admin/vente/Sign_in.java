package com.example.admin.vente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }


    public void inscrire (View view) {
        int i=1;
        clientDB db=new clientDB(getApplicationContext());
        db.open();
        EditText email = (EditText) findViewById(R.id.tv_email);
        EditText password = (EditText) findViewById(R.id.tv_pm);
        EditText nom= (EditText) findViewById(R.id.tv_name);
        EditText prenom= (EditText) findViewById(R.id.tv_prenom);
        EditText phone= (EditText) findViewById(R.id.tv_pm);

        String mail =email.getText().toString();
        String pass= password.getText().toString();
        String name =email.getText().toString();
        String pre_name= password.getText().toString();
        int telephone= Integer.parseInt(phone.getText().toString());
        client cl=new client('i',name,pre_name,telephone,pass,mail);
        db.addClient(cl);
        i++;
        List<client> lst=new ArrayList<client>();
        Toast.makeText(this, "ajouter  client  avec succes", Toast.LENGTH_LONG).show();
    }
}

