package com.example.demo.model;

public class Todo {
	private String todoId;
	private String desc;
	private boolean isCompleted;
	public Todo() {
		super();
	}
	public Todo(String todoId, String desc, boolean isCompleted) {
		super();
		this.todoId = todoId;
		this.desc = desc;
		this.isCompleted = isCompleted;
	}
	public String getTodoId() {
		return todoId;
	}
	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public String displayDetails()
	{
		return "ToDo ID:"+getTodoId()+" ToDo Name: "+getDesc()+" ToDo Completed? "+isCompleted();
	}
	
	public void destrorToDo()
	{
		todoId=null;
		desc=null;
		isCompleted=false;
		System.out.println("todo destroyed sucessfully...");
		
	}

	public void init()
	{
		System.out.println("init called.");
	}
}
