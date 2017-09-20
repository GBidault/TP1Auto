package com.diiage.guillaumebidault.tp1auto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button mBtnLivre;
    Button mBtnNote;
    Button mBtnCreateCom;

    TextView mTxtNbLivre;
    TextView mTxtNbCom;
    TextView mTxtMoyComLivre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Affectation des controlleurs dans les variables
        mBtnLivre=(Button)findViewById(R.id.btn_accueil_livre);
        mBtnNote=(Button)findViewById(R.id.btn_accueil_note);
        mBtnCreateCom=(Button)findViewById(R.id.btn_accueil_com);

        mTxtNbLivre=(TextView)findViewById(R.id.txt_accueil_nbLivre);
        mTxtNbCom=(TextView)findViewById(R.id.txt_accueil_nbCom);
        mTxtMoyComLivre=(TextView)findViewById(R.id.txt_accueil_nbMoyCom);

        //Declaration des listener pour les boutons
        mBtnLivre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LivreActivity.class));
            }
        });

        mBtnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ComActivity.class));
            }
        });

        mBtnCreateCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(MainActivity.this,CreateComActivity.class)));
            }
        });
    }


}
