package com.sacks.InitialProject17.todolists;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoList {

    @Id
    @GeneratedValue
    private long id;
    private String activity;

    public TodoList() {
    }

    public TodoList(long id, String activity) {
        super();
        this.id = id;
        this.activity = activity;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getActivity() {
        return this.activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public TodoList id(long id) {
        setId(id);
        return this;
    }

    public TodoList activity(String activity) {
        setActivity(activity);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TodoList)) {
            return false;
        }
        TodoList todoList = (TodoList) o;
        return id == todoList.id && Objects.equals(activity, todoList.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activity);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", activity='" + getActivity() + "'" +
                "}";
    }

}
