package com.example.todo_list_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // 뷰의 주소 값을 담을 참조변수
    ListView todoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TodoManager todoManager = new TodoManager();

        for (int i=0; i<19; i++) {
            todoManager.addTodoItem(new TodoItem("제목임" + i, "내용임" + i, "작성날짜임" + i));
        }

        // 뷰의 주소 값을 담는다.
        todoListView = findViewById(R.id.lv_todo);

        // 어댑터를 설정해준다.
        ListAdapter adapter = new ListAdapter(this, todoManager.getList());
        todoListView.setAdapter(adapter);

        // 리스너 설정
        ListListener listener = new ListListener(this, todoManager.getList());
        todoListView.setOnItemClickListener(listener);
    }
}