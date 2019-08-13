package br.com.etecia.listaplaneta;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] namePlanets = {"Jupiter", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Vênus"};
    int[] imgPlanets = {R.drawable.jupiter, R.drawable.lua, R.drawable.marte, R.drawable.plutao, R.drawable.saturno, R.drawable.saturno, R.drawable.sol, R.drawable.terra, R.drawable.venus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnClickListener(parent, view, position, id
            Intent intent = new Intent(getApplicationContext(), GridItemActivity.class);
            intent.putExtra("name", namePlanetas[position]);
            intent.putExtra("image", imagePlanetas[position]);

        );

    }


}


