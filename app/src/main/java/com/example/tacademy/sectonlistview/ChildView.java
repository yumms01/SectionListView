package com.example.tacademy.sectonlistview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class ChildView extends FrameLayout{
    public ChildView(Context context) {
        super(context);
        init();
    }

    TextView messageView;
    ChildItem item;

    private void init() {
        inflate(getContext(), R.layout.list_child, this);
        messageView = (TextView)findViewById(R.id.textMessage);
    }

    public void setData(ChildItem item) {
        this.item = item;
        messageView.setText(item.childName);
    }
}
