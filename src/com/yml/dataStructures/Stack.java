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
	public void pop() {
		if (top == -1) {
			return;
		}
		char c = data[top--];
	}

	/**
	 * check if stock is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
}
