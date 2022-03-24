package com.arif.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.exitButton);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        // for setting title
        alertDialogBuilder.setTitle(R.string.Title);
        //for setting icon
        alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // if user click exit button program will be exit
                finish();

            }
        });

        alertDialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        alertDialogBuilder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"you have clicked on cancel button",Toast.LENGTH_SHORT).show();


            }
        });


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();








    }
}