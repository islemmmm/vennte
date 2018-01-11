package com.example.admin.vente;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

public class clientDB extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ClientDB";
    public static final String TABLE_NAME = "Client";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PRENOM = "prenom";
    public static final String KEY_TEL = "tel";
    public static final String KEY_PM = "pm";
    public static final String KEY_EMAIL = "email";
    private SQLiteDatabase database;

    public clientDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public SQLiteDatabase open() {
        database = this.getWritableDatabase();
        return database;
    }

    public void close() {
        database.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(" + KEY_ID + " INTEGER PRIMARY KEY autoincrement," + KEY_NAME + "TEXT," + KEY_PRENOM + "TEXT," + KEY_TEL + "TEXT," + KEY_PM + "TEXT," + KEY_EMAIL +
                "TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(db);
    }

    public void addClient(client cl) {
        ContentValues v = new ContentValues();
        v.put(KEY_ID, cl.getId());}
}