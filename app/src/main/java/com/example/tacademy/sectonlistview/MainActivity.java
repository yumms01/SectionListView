package com.example.tacademy.sectonlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    SectionAdapter mAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        mAdapter = new SectionAdapter();
        listView.setAdapter(mAdapter);

        initData();

    }

    private void initData() {

        for (int i = 1; i < 4; i++) {
            ParentItem pi = new ParentItem();
            pi.parentName = "Parent Item #" + i;
            mAdapter.add(pi);

            for (int j = 1; j<4; j++) {
                ChildItem ci = new ChildItem();
                ci.childName = "Child Item #" + i + " " + j;
                mAdapter.add(ci);

            }
        }
    }
}
