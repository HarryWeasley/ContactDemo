package com.example.lgx.contactdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);
        //图标字符设置
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "iconfont.ttf");
//        tv.setTypeface(typeface);
//        tv.setText(getString(R.string.test));
    }
}
