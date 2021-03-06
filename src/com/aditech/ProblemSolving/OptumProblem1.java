package com.aditech.ProblemSolving;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Node{
	int val;
	char letter;
	public Node(int val, char c){
		this.val = val;
		this.letter = c;
	}
}
public class OptumProblem1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		map.put('a', sc.nextInt());
		map.put('b', sc.nextInt());
		System.out.println(findString(map));
	}

	public static String findString(Map<Character, Integer> map){
		Queue<Node> q = new PriorityQueue<>(new Comparator<Node>(){
			@Override
			public int compare(Node a, Node b){
				return b.val - a.val;
			}
		});

		for(Character l : map.keySet()){
			if(map.get(l) != 0){
				Node n = new Node(map.get(l) ,l);
				q.offer(n);
			}
		}

		StringBuilder res = new StringBuilder();
		while(!q.isEmpty()){
			Node first = q.poll();
			// System.out.println(res.toString());
			if(res.length() != 0 && res.charAt(res.length() - 1) == first.letter){
				if(q.isEmpty()){
					return res.toString();
				}
				else{
					Node second = q.poll();
					res.append(second.letter);
					second.val--;
					if(second.val != 0){
						q.offer(second);
					}
					q.offer(first);
				}
			}
			else{
				int limit = Math.min(2, first.val);
				for(int i = 0; i < limit; i++){
					res.append(first.letter);
					first.val--;
				}
				if(first.val != 0){
					q.offer(first);
				}
			}
		}
		return res.toString();
	}
}