package com.diiage.guillaumebidault.tp1auto.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.diiage.guillaumebidault.tp1auto.beans.Books;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GuillaumeBidault on 20/09/2017.
 */

public class BookDao {
    DataBaseHelper mDataBaseHelper;
    SQLiteDatabase mSqliteDateBase;

    public BookDao(Context context) {
        mDataBaseHelper=new DataBaseHelper(context);
    }

    public void open() throws SQLiteException{
        mSqliteDateBase=mDataBaseHelper.getWritableDatabase();
    }

    public void close(){
        mSqliteDateBase.close();
    }

    public List<Books> getAllBooks(){
        List<Books> books=new ArrayList<Books>();
        Cursor cursor=mSqliteDateBase.query("Books",new String[]{"*"},null,null,null,null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            Books book=new Books(cursor);
            books.add(book);
            cursor.moveToNext();
        }
        cursor.close();
        return books;
    }
}
