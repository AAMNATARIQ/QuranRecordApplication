package amnatariq.org.myquranapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    @Override
    public void onCreate(SQLiteDatabase db) {
        //String createTableStatement = "CREATE TABLE USERSTUDENT_TABLE( StudentId Integer PRIMARY KEY AUTOINCREMENT,"
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public DbHelper(@Nullable Context context)
    {
        super(context,"MyDB.db",null,1);
    }
}
