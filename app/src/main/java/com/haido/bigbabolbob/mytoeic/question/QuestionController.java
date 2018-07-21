package com.haido.bigbabolbob.mytoeic.question;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Lenovo on 13/11/2017.
 */

public class QuestionController {
    private DBHelper dbHelper;

    public QuestionController(Context context) {
        dbHelper = new DBHelper(context);
    }

    public int getCountDB(int dethi, String dokho){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM cauhoi where dethi = '"+dethi+"' AND dokho = '"+dokho+"'", null);
        int rowDB = cursor.getCount();
        cursor.close();
        return rowDB;

    }

    public ArrayList<Question> getQuestion(int dethi, String dokho ){
        ArrayList<Question> lsData = new ArrayList<Question>();
        SQLiteDatabase db =  dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM cauhoi where dethi = '"+dethi+"' AND dokho = '"+dokho+"'", null);
        cursor.moveToFirst();

        do {
            Question item;
            item = new Question(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7), cursor.getString(8), cursor.getInt(9), cursor.getString(10), cursor.getInt(11), "");
            lsData.add(item);
        } while (cursor.moveToNext());
        return lsData;
    }
}
