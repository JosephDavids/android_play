package com.example.hub_project1;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button btnLog;
    Button btnCancel;
    EditText ussr;
    EditText pssw;

    List<String> list;

    private Spinner spinner;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        spinner = (Spinner) findViewById(R.id.spinner_lang);
        addArray();


        //TextView viewpass = (TextView) findViewById(R.id.password);
        //viewpass.setText(R.string.password);

        btnLog = (Button) findViewById(R.id.btnlogin);
        btnLog.setText(R.string.btntxtlogin);

        btnCancel = (Button) findViewById(R.id.btncancel);
        btnCancel.setText(R.string.btncancel);

        ussr = (EditText) findViewById(R.id.myuser);
        //ussr.setText(R.string.username);

        pssw = (EditText) findViewById(R.id.mypass);
       // pssw.setText(R.string.password);

        btnLog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if( ussr.getText().toString().equals("joseph") && pssw.getText().toString().equals("joseph"))
                {
                    Intent gohome = new Intent("com.example.hub_project1.HOME");
                    startActivity(gohome);
                }
                else
                {
                    Toast.makeText( getApplicationContext(), "wrong username or password!", Toast.LENGTH_SHORT ).show();
                }
            }
        });

        btnCancel.setOnClickListener( new View.OnClickListener()
        {
            public void onClick( View v )
            {
                ussr.setText("");
                pssw.setText("");
            }
        });


    }
    private void addArray()
    {
        list = new ArrayList<String>();
        list.add("af");
        list.add("en");
    }
    private void addListenerSpinner()
    {
        //spinner.setOnItemClickListener();
    }


    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
