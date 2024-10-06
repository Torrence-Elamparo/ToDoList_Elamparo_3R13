package com.example.to_do_list

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)


fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo( 1, "First to do", Date.from(Instant.now())),
    Todo( 2,  "Second to do", Date.from(Instant.now())),
    Todo(  3,  "Third to do", Date.from(Instant.now())),
    Todo( 4,  "Fourth to do", Date.from(Instant.now()))
    );
}