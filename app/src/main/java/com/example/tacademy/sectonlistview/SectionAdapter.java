package com.example.tacademy.sectonlistview;

import android.content.ClipData;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class SectionAdapter extends BaseAdapter {

    List<SectionData> items = new ArrayList<SectionData>();

    private static final int VIEW_TYPE_COUNT = 2;

    private static final int VIEW_TYPE_PARENT = 0;
    private static final int VIEW_TYPE_CHILD = 1;

    public void add(SectionData data) {
        items.add(data);
        notifyDataSetChanged();
        }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        SectionData data = items.get(position);
        if (data instanceof ParentItem) {
            return VIEW_TYPE_PARENT;
        } else
            return VIEW_TYPE_CHILD;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch (getItemViewType(position)) {
            case VIEW_TYPE_PARENT: {
                ParentView view;
                if (convertView != null && convertView instanceof ParentView) {
                    view = (ParentView) convertView;
                } else {
                    view = new ParentView(parent.getContext());
                }
                view.setData((ParentItem) items.get(position));
                return view;
            }
            case VIEW_TYPE_CHILD: {
                ChildView view;
                if (convertView != null && convertView instanceof ChildView) {
                    view = (ChildView) convertView;
                } else {
                    view = new ChildView(parent.getContext());
                }
                view.setData((ChildItem) items.get(position));
                return view;
            }
        }
        return convertView;
    }
}
