package com.example.todo_list_java;

import java.util.ArrayList;

public class TodoManager {
    private ArrayList<TodoItem> list;

    public TodoManager() {
        list = new ArrayList<>();
    }

    public void addTodoItem(TodoItem todoItem) {
        list.add(todoItem);
    }

    public ArrayList<TodoItem> getList() {
        return list;
    }
}
