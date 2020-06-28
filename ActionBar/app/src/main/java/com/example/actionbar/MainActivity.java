package com.example.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //actionbar
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }

    //metodo para funciones correspondientes
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.item1){
            Toast.makeText(this, "comer una poliburguer", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item2){
            Toast.makeText(this, "comer una salchipapa", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item3){
            Toast.makeText(this, "comer un pincho", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    public void ocultar(View v){
        getSupportActionBar().hide();
    }

    public void mostrar(View v){
        getSupportActionBar().show();
    }
}