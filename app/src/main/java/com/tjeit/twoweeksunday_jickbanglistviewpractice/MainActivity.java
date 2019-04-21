package com.tjeit.twoweeksunday_jickbanglistviewpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.tjeit.twoweeksunday_jickbanglistviewpractice.adapters.BangAdapter;
import com.tjeit.twoweeksunday_jickbanglistviewpractice.databinding.ActivityMainBinding;
import com.tjeit.twoweeksunday_jickbanglistviewpractice.datas.Bang;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BangAdapter mBangAdapter;
    List<Bang> bangList = new ArrayList<>();
    ActivityMainBinding act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        fillBangs();

        mBangAdapter = new BangAdapter(MainActivity.this, bangList);
        act.jickBangRankListView.setAdapter(mBangAdapter);

        //상세정보
        act.jickBangRankListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });
    }

    void fillBangs() {

        bangList.add(new Bang(100, 13,"경상북도 구미시 송정동1", "분리형 원룸1", "풀옵션 초대박1"));
        bangList.add(new Bang(200, 15,"경상북도 구미시 송정동2", "분리형 원룸2", "풀옵션 초대박2"));
        bangList.add(new Bang(150, 16,"경상북도 구미시 송정동3", "분리형 원룸3", "풀옵션 초대박3"));
        bangList.add(new Bang(300, 20,"경상북도 구미시 송정동4", "분리형 원룸4", "풀옵션 초대박4"));
        bangList.add(new Bang(120, 30,"경상북도 구미시 송정동5", "분리형 원룸5", "풀옵션 초대박5"));
    }
}
