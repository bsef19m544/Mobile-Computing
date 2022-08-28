package com.example.crud;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import kotlin.text.UStringsKt;

public class DBHelper extends SQLiteOpenHelper {
        public static final String STUDENT_ID = "StudentID";
        public static final String STUDENT_NAME = "StudentName";
        public static final String STUDENT_ROLL = "StudentRollNumber";
        public static final String STUDENT_ENROLL = "IsEnrolled";
        public static final String STUDENT_TABLE = "StudentTable";



        public DBHelper(@Nullable Context context) {
            super(context, "MyDB.db", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            //String createTableSTatementOne = "CREATE TABLE CustTable(CustomerID Integer PRIMARY KEY AUTOINCREMENT, " + CUSTOMER_NAME_FIRST + " Text, CustomerAge Int, ActiveCustomer BOOL) ";
            String createTableSTatement = "CREATE TABLE " + STUDENT_TABLE + "(" +
                    STUDENT_ID + " Integer PRIMARY KEY AUTOINCREMENT, " + STUDENT_NAME + " Text, "
                    + STUDENT_ROLL + " Text, " + STUDENT_ENROLL + " int) ";
            db.execSQL(createTableSTatement);
        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + STUDENT_TABLE);
            onCreate(db);
        }

        public void  addStudent(StudentModel STUDENTModel){
            SQLiteDatabase db = this.getWritableDatabase();
            //Hash map, as we did in bundles
            ContentValues cv = new ContentValues();

            cv.put(STUDENT_NAME, STUDENTModel.getName());
            cv.put(STUDENT_ROLL, STUDENTModel.getRollNmber());
            cv.put(STUDENT_ENROLL, STUDENTModel.isEnroll());
            db.insert(STUDENT_TABLE, null, cv);
            db.close();
            //NullCoumnHack
            //long insert =
            //if (insert == -1) { return false; }
            //else{return true;}
        }

        public ArrayList<StudentModel> getAllStudents() {

            SQLiteDatabase db = this.getReadableDatabase();

            Cursor cursorCourses = db.rawQuery("SELECT * FROM " + STUDENT_TABLE, null);

            ArrayList<StudentModel> studentArrayList = new ArrayList<>();

            // moving our cursor to first position.
            if (cursorCourses.moveToFirst()) {
                do {

                    studentArrayList.add(new StudentModel(cursorCourses.getString(1),
                            cursorCourses.getInt(2),
                            cursorCourses.getInt(3) == 1 ? true : false));
                } while (cursorCourses.moveToNext());

            }

            cursorCourses.close();
            return studentArrayList;
        }
    public void Dltstd(String rollno)
    {
            SQLiteDatabase db = this.getWritableDatabase();
            db.delete(STUDENT_TABLE, STUDENT_ROLL+"=?", new String[] {rollno});
            db.close();
    }
    public  StudentModel getstd(String roll)
    {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query(STUDENT_TABLE, new String[]{STUDENT_ID,STUDENT_ROLL, STUDENT_NAME,STUDENT_ENROLL}, STUDENT_ROLL+"=?", new String[]{String.valueOf(roll)}, null, null, null);
            if(cursor!=null){
                cursor.moveToFirst();
            }
            StudentModel studentModel = new StudentModel(cursor.getString(0), cursor.getString(1), cursor.getInt(2)  );
            db.close();
            return  studentModel;
    }
    public int updateuser (StudentModel studentModel){
            SQLiteDatabase db= this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(STUDENT_NAME, studentModel.getName());
            contentValues.put(STUDENT_ROLL, studentModel.getRollNmber());
            return  db.update(STUDENT_TABLE, contentValues ,STUDENT_ROLL+ "=?", new String[]{String.valueOf(studentModel.getRollNmber())});

    }
    }

