<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.todo.Todo" %>
<html>
<head>
    <title>Simple TODO App</title>
</head>
<body>
<h2>TODO List</h2>

<form action="addTodo" method="post">
    <input type="text" name="task" placeholder="Enter new task" required />
    <button type="submit">Add</button>
</form>

<br/>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Task</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <%
        List<Todo> todos = (List<Todo>) request.getAttribute("todos");
        if (todos != null) {
            for (Todo todo : todos) {
    %>
    <tr>
        <td><%= todo.getId() %></td>
        <td><%= todo.getTask() %></td>
        <td><%= todo.isCompleted() ? "Done" : "Pending" %></td>
        <td>
            <% if (!todo.isCompleted()) { %>
                <form action="completeTodo" method="post" style="display:inline;">
                    <input type="hidden" name="id" value="<%= todo.getId() %>" />
                    <button type="submit">Complete</button>
                </form>
            <% } else { %>
                Completed
            <% } %>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
