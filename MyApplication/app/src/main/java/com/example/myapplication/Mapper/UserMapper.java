package com.example.myapplication.Mapper;
import android.database.Cursor;
import com.example.myapplication.Entity.User;

public class UserMapper {
    public static User fromCursor (Cursor cursor){
        int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
        String username = cursor.getString(cursor.getColumnIndexOrThrow("username"));
        String password = cursor.getString(cursor.getColumnIndexOrThrow("password"));
        return new User(id, username, password);
    }
}
