package com.example.NoPlanetTheme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class BMain extends AppCompatActivity {
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmain);
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }


// cast al Layout SwipeRefresh con el que rodeamos la vista en // el xml y le colocamos un listener

    // construimos el Listener que lanza un Toast y desactiva a
// continuación del Swipe la animación
    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
                Toast toast0 = Toast.makeText(BMain.this, "Suma puntos Ernesto", Toast.LENGTH_LONG);
                toast0.show();
                swipeLayout.setRefreshing(false);

        }

    };
}

