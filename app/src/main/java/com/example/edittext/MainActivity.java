package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {            //어플을 처음 실행했을 때의 생명주기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_id = findViewById(R.id.et_id);                           //activity_main.xml의 et_id와 연결
        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {    //여기 View클래스 모든뷰의 최상위 클래스
            @Override                                               //OnClickListener
            public void onClick(View view) {                        //최상의 클래스 뷰의 클릭 이벤트 발생
                et_id.setText("제롱동이");                            // 해당 텍스트 칸안에 무엇인가를 써주고 싶을때 동적으로 작성가능하게 해주는 것을 setText()다
            }
        });
    }
}