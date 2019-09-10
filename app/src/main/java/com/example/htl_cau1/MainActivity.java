package com.example.htl_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_dn, btn_thoat;
    EditText edt_1, edt_2;
    CheckBox chb_luu;
    AlertDialog.Builder d1;
    AlertDialog.Builder d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        AddEvent1();
        AddEvent2();
    }
    public void Anhxa(){
        btn_dn=(Button)findViewById(R.id.btn_login);
        btn_thoat=(Button)findViewById(R.id.btn_exit);
        chb_luu=(CheckBox)findViewById(R.id.chb_save);
    }
    public void AddEvent1(){

        d1=new AlertDialog.Builder(this);
        d1.setTitle( Html.fromHtml("<font color='#0066CC'>Thông báo</font>"));
        d1.setIcon(R.drawable.icon_notification);
        btn_dn.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                if(chb_luu.isChecked()){

                    d1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else
                {
                    d1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
               d1.show();
            }
        });
        d2=new AlertDialog.Builder(this);
        d2.setTitle("Thông báo");


    }
    public void  AddEvent2(){
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d2.setIcon(R.drawable.icon_notification);
                d2.setTitle( Html.fromHtml("<font color='#0066CC'>Thông báo</font>"));
                d2.setMessage("Bạn muốn thoát không?");
                d2.setPositiveButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                d2.setNegativeButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                d2.show();
            }

        });
    }
}
