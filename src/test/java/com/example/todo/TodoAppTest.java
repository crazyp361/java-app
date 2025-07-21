package com.example.todo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TodoAppTest {

    @Test
    public void testAddTodo() {
        Todo todo = new Todo(1, "Test Task");
        assertEquals("Test Task", todo.getTask());
        assertFalse(todo.isCompleted());
    }

    @Test
    public void testCompleteTodo() {
        Todo todo = new Todo(2, "Complete Me");
        todo.complete();
        assertTrue(todo.isCompleted());
    }
}
