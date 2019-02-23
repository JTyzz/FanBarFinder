package com.earthdefensesystem.fanbarfinder;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class PinDbDao {
    private static SQLiteDatabase db;

    public static void initializeInstance(Context context){
        if (db == null) {
            PinDbHelper helper = new PinDbHelper(context);
            db = helper.getWritableDatabase();
        }
    }

    public static ArrayList<Pins> listSports(){
        String getSports = String.format("SELECT * FROM %s", PinDbContract.PinEntry.PIN_TABLE_NAME);
        Cursor cursor = db.rawQuery(getSports, null);
        int index;
        ArrayList<Pins> sports = new ArrayList<>();
        while(cursor.moveToNext()){
            index = cursor.getColumnIndexOrThrow(PinDbContract.PinEntry.COLUMN_SPORT);
            String sportname = cursor.getString(index);
            Pins sport = new Pins (null, sportname);
            sports.add(sport);
        }
        cursor.close();
        return sports;
    }
    public static ArrayList<Pins> listTeams(){
        String getSports = String.format("SELECT * FROM %s", PinDbContract.PinEntry.PIN_TABLE_NAME);
        Cursor cursor = db.rawQuery(getSports, null);
        int index;
        ArrayList<Pins> sports = new ArrayList<>();
        while(cursor.moveToNext()){
            index = cursor.getColumnIndexOrThrow(PinDbContract.PinEntry.COLUMN_SPORT);
            String sportname = cursor.getString(index);
            Pins sport = new Pins (null, sportname);
            sports.add(sport);
        }
        cursor.close();
        return sports;
    }

}
