package com.example.tacademy.sectonlistview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class ParentView extends FrameLayout{
    public ParentView(Context context) {
        super(context);
        init();
    }

    TextView messageView;
    ParentItem item;

    private void init() {
        inflate(getContext(), R.layout.list_parent, this);
        messageView = (TextView)findViewById(R.id.textMessage);
    }

    public void setData(ParentItem item) {
        this.item = item;
        messageView.setText(item.parentName);
    }
}
