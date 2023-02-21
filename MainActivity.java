package com.esranursevilmis.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view){
        ImageView imageView =findViewById(R.id.imageView); //iki constraint'den Button'i secmememizin sebebi imageView'i degistirecek olmamizdir.
        imageView.setImageResource(R.drawable.cat2); //drawable klasorundeki catt yine ayni klasordeki cat2 dosyasina donusmus oldu.

    }
}
