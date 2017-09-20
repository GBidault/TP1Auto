package com.diiage.guillaumebidault.tp1auto.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GuillaumeBidault on 20/09/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "livre.sql";
    private static final int DATABASE_VERSION = 1;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String requette="CREATE TABLE Books ('id' INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , 'title' VARCHAR NOT NULL , 'author' VARCHAR NOT NULL , 'genre' VARCHAR NOT NULL );/"
                +"CREATE TABLE Comments ('id'  PRIMARY KEY  NOT NULL , 'bookId'  NOT NULL , 'comment'  NOT NULL , 'date'  NOT NULL );/"
                +"INSERT INTO Books VALUES(1,'Les fleurs du mal','Charles Baudelaire','Poèmes');/"
                +"INSERT INTO Books VALUES(2,'Germinal','Emile Zola','Roman');/"
                +"INSERT INTO Books VALUES(3,'Les misérables','Victor Hugo','Roman');/"
                +"INSERT INTO Books VALUES(4,'1984','George Orwell','Science-Fiction');/"
                +"INSERT INTO Books VALUES(5,'Le Meilleur des mondes','Aldous Huxley','Science-Fiction');/"
                +"INSERT INTO Books VALUES(6,'Vingt mille lieues sous les mers','Jules Verne','Aventure');/"
                +"INSERT INTO Books VALUES(7,'Les Trois Mousquetaires','Alexandre Dumas','Aventure');";
        sqLiteDatabase.execSQL(requette);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
