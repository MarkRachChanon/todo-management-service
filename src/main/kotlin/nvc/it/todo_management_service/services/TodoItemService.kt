package nvc.it.todo_management_service.services

import nvc.it.todo_management_service.entities.TodoItem

interface TodoItemService {
    fun createTodoItem(todoId: Long, todoItem: TodoItem): TodoItem

    fun updateTodoItem(id: Long, todoItem: TodoItem): TodoItem

    fun deleteTodoItem(id: Long): TodoItem
}