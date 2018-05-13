package ua.nure.strebkov.Practice6.part5;

import java.util.Objects;

public class Tree<E extends Comparable<E>> {

	private static final String INDENT = "   ";

	private Node<E> root = null;

	public boolean remove(E element) {
		Node<E> temp = root, current = null;

		while (temp != null) {
			int tmp = temp.element.compareTo(element);
			if (tmp == 0) {
				break;
			}
			current = temp;
			if (tmp < 0) {
				temp = temp.leftChild;
			} else {
				temp = temp.rightChild;
			}
		}

		if (temp == null) {
			return false;
		}

		if (temp.rightChild == null) {
			if (current == null) {
				root = temp.leftChild;
			} else {
				if (temp == current.leftChild) {
					current.leftChild = temp.leftChild;
				} else {
					current.rightChild = temp.rightChild;
				}
			}
		} else {
			Node<E> theLeftist = temp.rightChild;
			current = null;
			while (theLeftist.leftChild != null) {
				current = theLeftist;
				theLeftist = theLeftist.leftChild;
			}
			if (current == null) {
				temp.rightChild = theLeftist.rightChild;
			} else {
				current.leftChild = theLeftist.rightChild;
			}
			temp.element = theLeftist.element;
		}
		return true;

	}

	public void add(E[] elements) {
		for (E element : elements) {
			add(element);
		}
	}

	public boolean add(E e) {
		if (Objects.isNull(e)) {
			return false;
		}
		if (Objects.isNull(root)) {
			root = new Node<E>();
			root.element = e;
			return true;
		} else {
			Node<E> temp = root;
			while (true) {
				if (temp.element.compareTo(e) == 0) {
					return false;
				}
				if (temp.element.compareTo(e) < 0) {
					if (Objects.isNull(temp.rightChild)) {
						Node<E> node = new Node<>();
						node.element = e;
						node.parrent = temp;
						temp.rightChild = node;
						return true;
					} else {
						temp = temp.rightChild;
					}
				}
				if (temp.element.compareTo(e) > 0) {
					if (Objects.isNull(temp.leftChild)) {
						Node<E> node = new Node<>();
						node.element = e;
						node.parrent = temp;
						temp.leftChild = node;
						return true;

					}
					temp = temp.leftChild;
				}
			}

		}
	}

	public void print() {
		if (!Objects.isNull(root)) {
			root.printSubTree(INDENT);
		}

	}

	private static class Node<E> {
		E element;
		Node<E> parrent;
		Node<E> leftChild;
		Node<E> rightChild;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((element == null) ? 0 : element.hashCode());
			return result;
		}

		public void printSubTree(String splitter) {
			if (rightChild != null) {
				rightChild.printSubTree(splitter + "\t");

			}
			System.out.println(splitter + element);
			if (leftChild != null) {
				leftChild.printSubTree(splitter + "\t");
			}

		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (element == null) {
				if (other.element != null)
					return false;
			} else if (!element.equals(other.element))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return element.toString();
		}

	}

}