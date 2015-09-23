package ch4;

import ch3.Solution03.node;

class Graph{
	public node[] nodes;
	private String state;
	public node getnode(){
		// get the adjacent nodes
	}
}
public class Solution01 {
	enum states {visiting, unvisited, visited};
	
	public boolean Route(Graph g, node nodeStart, Node nodeEnd){
		if (nodeStart == nodeEnd)
			return true;
		
		for (node n:g.getnode()){
			n.state = states. unvisited;
		}
	 
		nodeStart.state = stsNodevisiting;
		
		LinkedList<node> search = new LinkedList<node>;
		search.add(nodeStart);
		
		node top;
		while(!search.empty()) {
			top = search.removeFirst();
			if (top!= null){
				for (node n: n.getAdjacent()){
					if (n.state == states.unvisited){
						if(n == endNode){
							return true;
						}
						else {
							n.state = states.visiting;
							search.add(n);
						}
					}
				}
				n.state = states.visited;
			}
		}
		return false;
}
                                                                                       