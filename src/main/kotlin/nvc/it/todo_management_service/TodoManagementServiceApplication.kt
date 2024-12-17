package nvc.it.todo_management_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoManagementServiceApplication

fun main(args: Array<String>) {
	runApplication<TodoManagementServiceApplication>(*args)
}
