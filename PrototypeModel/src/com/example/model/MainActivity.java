package com.example.model;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WordDocument originDoc = new WordDocument();
        originDoc.setmText("这是一篇文档");
        originDoc.addImages("图片1");
        originDoc.addImages("图片2");
        originDoc.addImages("图片3");
        originDoc.show();
        
        WordDocument doc2 = originDoc.clone();
        doc2.show();
        doc2.setmText("hahah");
        doc2.show();
        
        originDoc.show();
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
