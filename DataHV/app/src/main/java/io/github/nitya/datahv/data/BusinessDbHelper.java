package io.github.nitya.datahv.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nitya on 4/23/15.
 */
public class BusinessDbHelper extends SQLiteOpenHelper {

    //=======================================================================
    // Use this to retrieve an existing version of helper
    // (creates one if none exists)
    //=======================================================================
    private final Context context;
    private static BusinessDbHelper singleton;
    public static BusinessDbHelper getInstance(final Context context) {
        if (singleton == null) {
            singleton = new BusinessDbHelper(context);
        }
        return singleton;
    }
    //=======================================================================

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;

    static final String DATABASE_NAME = "datahv.businesses.db";


    //=======================================================================
    // Use this to create new (on-demand) instances of a DB helper
    //=======================================================================
    public BusinessDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context.getApplicationContext();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(BusinessContract.County.CREATE_TABLE);
        db.execSQL(BusinessContract.Business.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // On Upgrade, simply discard current data and start over (simplest policy)
        db.execSQL("DROP TABLE IF EXISTS " + BusinessContract.County.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + BusinessContract.Business.TABLE_NAME);
        onCreate(db);

    }
}