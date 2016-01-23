package com.example.tacademy.sectonlistview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class ParentItem implements SectionData{
    String parentName;
    List<ChildItem> children = new ArrayList<ChildItem>();
}
