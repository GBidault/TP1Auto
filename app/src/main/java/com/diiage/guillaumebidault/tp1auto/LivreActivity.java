package com.diiage.guillaumebidault.tp1auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.diiage.guillaumebidault.tp1auto.adapter.LivreAdapter;
import com.diiage.guillaumebidault.tp1auto.beans.Books;
import com.diiage.guillaumebidault.tp1auto.dao.BookDao;

import java.util.List;

public class LivreActivity extends AppCompatActivity {

    Button mBtnReturn;
    ListView mListLivre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livre);

        mBtnReturn=(Button)findViewById(R.id.btn_livre_retour);
        mListLivre =(ListView)findViewById(R.id.lst_livre_livre);

        //Declaration des listener pour les boutons
        mBtnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishActivity(0);
            }
        });

        BookDao bookDao=new BookDao(this);
        bookDao.open();
        List<Books> books=bookDao.getAllBooks();
        LivreAdapter livreAdapter=new LivreAdapter(this,books);
        mListLivre.setAdapter(livreAdapter);
        bookDao.close();
    }
}
