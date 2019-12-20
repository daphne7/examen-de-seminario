package daphne.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        LoadComponents();
    }



    private void LoadComponents() {
        //load Default Fragment
        //fragment = new com.deve.ditmar.examen.ui.ListFragment();
        //getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    //@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.registrar: {
                fragment = new register();
                break;
            }
            case R.id.lista: {
                fragment = new list();
                break;
            }

            /*aqui mi codigo*/
            case R.id.ver: {
                fragment = new detail();
                break;
            }
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        return super.onOptionsItemSelected(item);
    }
}
