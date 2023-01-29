package amnatariq.org.myquranapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME ="MyDB.db";
    private static final int DATABASE_VERSION =1;

    private SQLiteDatabase db;

    @Override
    public void onCreate(SQLiteDatabase db) {
        //String createTableStatement = "CREATE TABLE USERSTUDENT_TABLE( StudentId Integer PRIMARY KEY AUTOINCREMENT,"
        this.db =db;
//        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE "+
//                UserStudent_TABLE + " ( " +
//                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
//                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
//                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
//                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
//                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
//                QuestionsTable.COLUMN_ANSWER + " TEXT, " +
//                QuestionsTable.COLUMN_MYANSWER + " TEXT" + ")";
//
//        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
//        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public DbHelper(@Nullable Context context)
    {
        super(context,"MyDB.db",null,1);
    }
}
