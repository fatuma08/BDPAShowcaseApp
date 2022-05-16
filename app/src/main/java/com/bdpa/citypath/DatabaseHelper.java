package com.bdpa.citypath;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String USER_TABLE = "USER_TABLE";
    public static final String COLUMN_FIRSTNAME = "FIRSTNAME";
    public static final String COLUMN_LASTNAME = "LASTNAME";
    public static final String COLUMN_EMAIL = "EMAIL";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";
    public static final String COLUMN_ID = "ID";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "usersAccounts.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + USER_TABLE + " (" + COLUMN_ID + " INTEGEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_FIRSTNAME + " TEXT, "
                + COLUMN_LASTNAME + " TEXT, " + COLUMN_EMAIL + " TEXT, " + COLUMN_USERNAME + " TEXT, " + COLUMN_PASSWORD + " TEXT)";

        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Boolean insertUsers(Integer Column_ID, String COLUMN_FIRSTNAME, String COLUMN_LASTNAME, String COLUMN_EMAIL, String COLUMN_USERNAME, String COLUMN_PASSWORD){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", COLUMN_ID);
        contentValues.put("firstname", COLUMN_FIRSTNAME);
        contentValues.put("lastname", COLUMN_LASTNAME);
        contentValues.put("email", COLUMN_EMAIL);
        contentValues.put("username", COLUMN_USERNAME);
        contentValues.put("password", COLUMN_PASSWORD);
        long result = db.insert("id", null, contentValues);
        if (result == -1) return false;
        else return true;
    }

   /* public Boolean checkusername(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from id where username = ?", new String[] {username});
        if (cursor.getCount() > 0) return true;
        else return false;
    }*/
}
