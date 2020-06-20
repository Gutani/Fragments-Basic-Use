package com.magie.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.magie.fragments.R;
import com.magie.fragments.fragment.ContatosFragment;
import com.magie.fragments.fragment.ConversasFragment;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Remove elevation from action bar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        //Setting the object to a fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameView, conversasFragment);
        transaction.commit();//Ending the transaction

        buttonConversas.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameView, conversasFragment);
                transaction.commit();
            }
        });

        buttonContatos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameView, contatosFragment);
                transaction.commit();
            }
        });

    }
}