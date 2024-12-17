package nvc.it.todo_management_service.repositories

import nvc.it.todo_management_service.entities.TodoItem
import org.springframework.data.jpa.repository.JpaRepository

interface TodoItemRepo : JpaRepository<TodoItem, Long>