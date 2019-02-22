package com.earthdefensesystem.fanbarfinder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PinDbDao {
    private static SQLiteDatabase db;

    public static void initializeInstance(Context context){
        if (db == null) {
            PinDbHelper helper = new PinDbHelper(context);
            db = helper.getWritableDatabase();
        }
    }
    
}
