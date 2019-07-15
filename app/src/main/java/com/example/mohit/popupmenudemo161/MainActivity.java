package com.example.mohit.popupmenudemo161;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       }

    public void showpop(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item1:
                        Toast.makeText(MainActivity.this, "Item1 selected", Toast.LENGTH_SHORT).show();
                        break;
                        case R.id.item2:
                        Toast.makeText(MainActivity.this, "Item2 selected", Toast.LENGTH_SHORT).show();
                        break;
                        case R.id.item3:
                        Toast.makeText(MainActivity.this, "Item3 selected", Toast.LENGTH_SHORT).show();
                        break;
                        case R.id.item4:
                        Toast.makeText(MainActivity.this, "Item4 selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}

