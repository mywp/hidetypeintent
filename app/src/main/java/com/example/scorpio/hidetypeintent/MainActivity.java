package com.example.scorpio.hidetypeintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void click(View view){
        // 杀 action
        // 人 数据
        // 附件的数据 Category 类别
        Intent intent = new Intent();
        intent.setAction("com.example.scorpio.hidetypeintent.open2");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        
        //URL:统一资源定位符 http https ftp rtsp  URI:统一资源标识符 url是uri的一个子集
        //intent.setData(Uri.parse("jianren:张三"));
       // intent.setType("application/person");
        intent.setDataAndType(Uri.parse("jianren:张三"),"application/person");
        startActivity(intent);
    }
}
