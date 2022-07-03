package com.example.todo_list_java;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListListener implements AdapterView.OnItemClickListener {
    private Context context;
    private ArrayList<TodoItem> list;

    public ListListener(Context context, ArrayList<TodoItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(context, list.get(position).title + " - 클릭 되었습니다.", Toast.LENGTH_SHORT).show();
    }
}
