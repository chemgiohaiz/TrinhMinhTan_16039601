package com.example.student.tmt_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alertdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_dangnhap,bt_thoat;
        final CheckBox ckb_luu;
        final TextView tv_thongbao;
        alertdialog = new AlertDialog.Builder(this);
        bt_dangnhap=(Button)findViewById(R.id.button_dangnhap);
        ckb_luu=(CheckBox)findViewById(R.id.ckbluu);
        tv_thongbao=(TextView)findViewById(R.id.textView_thongbao);

        bt_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ckb_luu.isChecked()){
                    tv_thongbao.setText("Chào mừng bạn đăng nhập vào hệ thống, thông tin của bạn đã được luu");
                }else{
                    tv_thongbao.setText("Chào mừng bạn đăng nhập vào hệ thống, thông tin của bạn không được luu");
                }
            }
        });
        bt_thoat=(Button)findViewById(R.id.button_thoat);
        bt_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // AlertDialog.Builder builder = new AlertDialog.Builder(this);
                alertdialog.setTitle("Thông báo");
                alertdialog.setMessage("Bạn có muốn thoát không");
                alertdialog.setCancelable(false);
                alertdialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });
//sao để đăng xuất git t ra
                alertdialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                alertdialog.show();
            }

        });
    }
}
