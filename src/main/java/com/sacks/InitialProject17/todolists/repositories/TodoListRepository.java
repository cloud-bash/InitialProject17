package com.sacks.InitialProject17.todolists.repositories;

import com.sacks.InitialProject17.todolists.TodoList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {

}