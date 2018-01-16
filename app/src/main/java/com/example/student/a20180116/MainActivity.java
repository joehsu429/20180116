package com.example.student.a20180116;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        String str=getFilesDir().getAbsolutePath();
        Log.d("File",str);
        String str1=getFilesDir().getAbsolutePath();
        Log.d("File",str1);
    }
    public void click2(View v)//m3 輸入檔案到Files/data/data
    {
        File f=new File(getFilesDir(),"mytext");
        try {
            FileWriter fw=new FileWriter(f);
            fw.write("Hello world");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

