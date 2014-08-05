package com.example.hub_project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Common sense on 05/08/2014.
 */
public class about extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TextView txtview = (TextView) findViewById(R.id.bio);
        txtview.setText(R.string.bio);

    }

    public boolean onCreateOptionsMenu( android.view.Menu menu )
    {
        super.onCreateOptionsMenu(menu);
        MenuInflater sizeUp = getMenuInflater();
        sizeUp.inflate(R.menu.my_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);

        switch(item.getItemId())
        {
            case R.id.about:
                Intent goTo = new Intent("com.example.hub_project1.ABOUT");
                startActivity(goTo);
                break;
            case R.id.special:
                Intent goToOther = new Intent("com.example.hub_project1.SPECIAL");
                startActivity(goToOther);
                break;
        }
        return false;
    }

    protected void onPause()
    {
        super.onPause();
        finish();
    }
}