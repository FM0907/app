package com.example.fanzhaoyu.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button login = (Button) findViewById(R.id.login);
        Button Register = (Button) findViewById(R.id.register);
        EditText username = super.findViewById(R.id.username);//获取用户输入的用户名
        EditText password = super.findViewById(R.id.pwd);//获取用户密码
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "注册成功！", Toast.LENGTH_SHORT).show();//提示用户登陆成功
                //goToSecondAty(v);
            }
        });
    }
}
