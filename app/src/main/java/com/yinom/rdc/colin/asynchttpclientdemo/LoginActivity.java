package com.yinom.rdc.colin.asynchttpclientdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    Button btnSin = null;
    EditText ettName = null;
    EditText ettPwd = null;
    TextView ttvTitle = null;
    TextView ttvNotice = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSin = (Button) findViewById(R.id.btnLgSin);
        ettName = (EditText) findViewById(R.id.ettLgName);
        ettPwd = (EditText) findViewById(R.id.ettLgPwd);
        ttvTitle = (TextView) findViewById(R.id.ttvLgTitle);
        ttvNotice = (TextView) findViewById(R.id.ttvLgNotice);


    }


}