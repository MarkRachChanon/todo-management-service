package nvc.it.todo_management_service.services.impl

import nvc.it.todo_management_service.entities.Todo
import nvc.it.todo_management_service.exceptions.NotFoundException
import nvc.it.todo_management_service.repositories.TodoRepo
import nvc.it.todo_management_service.services.TodoService
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl(val todoRepo: TodoRepo) : TodoService {
    override fun createTodo(todo: Todo): Todo {
        return todoRepo.saveAndFlush(todo)
    }

    override fun getTodo(id: Long): Todo {
        return todoRepo.findById(id).orElseThrow {
            NotFoundException("No Todo with id $id")
        }
    }

    override fun getTodoList(): List<Todo> {
        return todoRepo.findAll()
    }

    override fun updateTodo(id: Long, todo: Todo): Todo {
        val existingTodo = todoRepo.findById(id).orElseThrow {
            NotFoundException("No Todo with id $id")
        }
        existingTodo.title = todo.title
        return todoRepo.saveAndFlush(existingTodo)
    }

    override fun deleteTodo(id: Long): Todo {
        val existingTodo = todoRepo.findById(id).orElseThrow {
            NotFoundException("No Todo with id $id")
        }
        todoRepo.delete(existingTodo)
        return existingTodo
    }
}