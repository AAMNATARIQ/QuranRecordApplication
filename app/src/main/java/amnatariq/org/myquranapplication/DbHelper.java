package amnatariq.org.myquranapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

//import amnatariq.org.myquranapplication

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {

        public static final String STUDENT_NAME = "STUDENT_NAME";

        public static final String STUDENT_PIC = "STUDENT_PIC";

        public static final String STUDENT_DEPT = "STUDENT_DEPT";
        public static final String STUDENT_ID = "STUDENT_ID";
        public static final String SABAK = "SABAK";
        public static final String SABKI = "SABKI";
        public static final String MANZIL = "MANZIL";

        public static final String SABAK_ST = "SABAK_ST";
        public static final String SABKI_ST= "SABKI_ST";
        public static final String MANZIL_ST = "MANZIL_ST";

        public static final String SABAK_IC = "SABAK_IC";
        public static final String SABKI_IC = "SABKI_IC";
        public static final String MANZIL_IC = "MANZIL_IC";

        public static final String DIVIDER_IC = "DIVIDER_IC";

        public static final String LEARNING_TABLE = "LEARNING_TABLE";

        public DbHelper(@Nullable Context context) {

            super(context, "MyDb.db", null, 4);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String createTableSTatement = "CREATE TABLE " + LEARNING_TABLE + "(" + STUDENT_ID +
                    " Integer PRIMARY KEY AUTOINCREMENT, " +
                    STUDENT_NAME + " Text, "+ STUDENT_PIC + " Int, "+ STUDENT_DEPT + " Text, " + SABAK + " Int, " +SABKI + " Int, " +
                    MANZIL + " Int, " +SABAK_ST + " BOOL, " +SABKI_ST + " BOOL, " +MANZIL_ST + " BOOL, " +
                    SABAK_IC + " Text, " +SABKI_IC + " Text, " +MANZIL_IC + " Text) ";

            sqLiteDatabase.execSQL(createTableSTatement);
            System.out.println("db made successfully");
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }


        public void addStudent(ModalClass lm ) {
            SQLiteDatabase db = this.getWritableDatabase();
            //Hash map, as we did in bundles
            ContentValues cv = new ContentValues();


            cv.put(STUDENT_NAME, lm.getStudentName());

            cv.put(STUDENT_PIC,lm.getPic());

            cv.put(STUDENT_DEPT, lm.getStudentDept());

            cv.put(SABAK, lm.getSabak());
            cv.put(SABKI, lm.getSabki());
            cv.put(MANZIL, lm.getManzil());

            cv.put(SABAK_ST, lm.isSabakStatus());
            cv.put(SABKI_ST, lm.isSabkiStatus());
            cv.put(MANZIL_ST, lm.isManzilStatus());

            cv.put(SABAK_IC, lm.getIncorrectSabak());
            cv.put(SABKI_IC, lm.getIncorrectSabki());
            cv.put(MANZIL_IC, lm.getIncorrectMazil());

            cv.put(DIVIDER_IC,lm.getDivider());

            db.insert(LEARNING_TABLE, null, cv);
            db.close();
        }

    public void updateStudent(ModalClass lm)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        //Hash map, as we did in bundles
        ContentValues cv = new ContentValues();
        cv.put(STUDENT_NAME, lm.getStudentName());

        cv.put(STUDENT_PIC,lm.getPic());

        cv.put(STUDENT_DEPT, lm.getStudentDept());

        cv.put(SABAK, lm.getSabak());
        cv.put(SABKI, lm.getSabki());
        cv.put(MANZIL, lm.getManzil());

        cv.put(SABAK_ST, lm.isSabakStatus());
        cv.put(SABKI_ST, lm.isSabkiStatus());
        cv.put(MANZIL_ST, lm.isManzilStatus());

        cv.put(SABAK_IC, lm.getIncorrectSabak());
        cv.put(SABKI_IC, lm.getIncorrectSabki());
        cv.put(MANZIL_IC, lm.getIncorrectMazil());


        cv.put(DIVIDER_IC,lm.getDivider());

        String [] str=new String[]{"aa"};

        db.update(LEARNING_TABLE,cv, "STUDENT_NAME=?", new String[]{lm.getStudentName()});
        db.close();
    }

        public ArrayList<ModalClass> getAllStudents() {

            SQLiteDatabase db = this.getReadableDatabase();

            Cursor cursorStd = db.rawQuery("SELECT * FROM " + LEARNING_TABLE, null);

            ArrayList<ModalClass> studentArrayList = new ArrayList<>();

            // moving our cursor to first position.
            if (cursorStd.moveToFirst()) {
                do {

                    studentArrayList.add(new ModalClass(cursorStd.getString(1),cursorStd.getInt(2),
                            cursorStd.getString(3),cursorStd.getInt(4),cursorStd.getInt(5) == 1 ? true : false,
                            cursorStd.getInt(6),cursorStd.getInt(7) == 1 ? true : false,cursorStd.getInt(8),
                            cursorStd.getInt(9) == 1 ? true : false,cursorStd.getString(10),cursorStd.getString(11),
                            cursorStd.getString(12),cursorStd.getString(13)));
                } while (cursorStd.moveToNext());

            }

            cursorStd.close();
            return studentArrayList;
        }

        public ModalClass getStudent(String name) {

            SQLiteDatabase db = this.getReadableDatabase();

            Cursor cursorStd = db.rawQuery("select * from "+ LEARNING_TABLE +" WHERE "+ STUDENT_NAME
                    + "= ?",new String[]{ name });
            System.out.println("Herer");
            System.out.println(cursorStd);
            ModalClass student1;
            cursorStd.moveToFirst();
            student1 = new ModalClass(cursorStd.getString(1),cursorStd.getInt(2),
                    cursorStd.getString(3), cursorStd.getInt(4), cursorStd.getInt(5) == 1 ? true : false,
                    cursorStd.getInt(6), cursorStd.getInt(7) == 1 ? true : false, cursorStd.getInt(8),
                    cursorStd.getInt(9) == 1 ? true : false, cursorStd.getString(10), cursorStd.getString(11),
                    cursorStd.getString(12),cursorStd.getString(13));


            cursorStd.close();
            return student1;
        }

    }