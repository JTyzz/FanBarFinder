package com.earthdefensesystem.fanbarfinder;

import android.provider.BaseColumns;

public class PinDbContract {
    public static class PinEntry implements BaseColumns {
        public static final String PIN_TABLE_NAME = "pins";

        public static final String COLUMN_BAR =       "bar";
        public static final String COLUMN_LATITUDE =  "latitude";
        public static final String COLUMN_LONGITUDE = "longitude";
        public static final String COLUMN_TEAM =      "team";
        public static final String COLUMN_SPORT =     "sport";
        public static final String COLUMN_FAVORITE =  "favorite";

        public static final String SQL_CREATE_PIN_TABLE = "CREATE TABLE " +
                PIN_TABLE_NAME +   "(" +
                _ID +              " INTEGER PRIMARY KEY, " +
                COLUMN_BAR +       " TEXT, " +
                COLUMN_LATITUDE +  " DOUBLE, " +
                COLUMN_LONGITUDE + " DOUBLE," +
                COLUMN_TEAM +      " TEXT," +
                COLUMN_SPORT +     " TEXT," +
                COLUMN_FAVORITE +  " INTEGER);";

        public static final String SQL_DELETE_PIN_TABLE = "DROP TABLE IF EXISTS " +
                PIN_TABLE_NAME + ";";
    }
}
