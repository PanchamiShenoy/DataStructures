package com.yml.dataStructures;

class Stack {
	char data[];
	int top = -1;

	Stack() {
		data = new char[100];
	}

	/**
	 * push symbol into the stack
	 * 
	 * @param a
	 */
	public void push(char a) {
		data[++top] = a;

	}

	/**
	 * pop element from the stack
	 */
	public char pop() {
		char c = data[top--];
		return c;
	}
}
