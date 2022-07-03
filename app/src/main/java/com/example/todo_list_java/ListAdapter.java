package com.example.todo_list_java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<TodoItem> list;

    public ListAdapter(Context context, ArrayList<TodoItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 재사용 가능한 뷰가 없다면 뷰를 만들어준다.
        if (convertView == null) {
            // LayoutInflater를 통해 XML으로 뷰를 만들 수 있다.
//            LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_list, parent, false);
        }

        // 뷰를 구성한다.
        TextView titleTextView = convertView.findViewById(R.id.tv_title);
        TextView contentTextView = convertView.findViewById(R.id.tv_content);
        TextView dateTextView = convertView.findViewById(R.id.tv_date);

        titleTextView.setText(list.get(position).title);
        contentTextView.setText(list.get(position).content);
        dateTextView.setText(list.get(position).date);

        // 뷰를 반환한다.
        return convertView;
    }
}
