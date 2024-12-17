package nvc.it.todo_management_service.repositories

import nvc.it.todo_management_service.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepo : JpaRepository<Todo, Long>