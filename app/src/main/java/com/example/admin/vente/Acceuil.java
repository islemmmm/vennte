
package com.example.admin.vente;
import android.Manifest;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.net.Uri;
import android.content.Intent;

public class Acceuil extends AppCompatActivity
{

        Button b = (Button) findViewById(R.id.buttonCall);

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_acceuil);
            b.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View arg0)
                {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("95201478"));

                    if (ActivityCompat.checkSelfPermission(Acceuil.this,
                            Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {

                        return;
                    }
                    startActivity(callIntent);

                }
            })
            ; }
    }
