//216230009-박기나
//좋아하는 동물의 사진을 선택하는 프로그램
package com.example.owner.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ServeActivity extends AppCompatActivity {
    TextView text1;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK;
    ImageView imagPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serve);
        setTitle("애완동물 사진 고르기");

        text1 = (TextView) findViewById(R.id.text1);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);
        btnOK  = (Button) findViewById(R.id.BtnOK);
        imagPet = (ImageView) findViewById(R.id.imagPet);

        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoDog:
                        imagPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RdoCat:
                        imagPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        imagPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getBaseContext(),"동물을 선택 하세요",
                                Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

