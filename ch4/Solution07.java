package ch4;

import java.util.LinkedList;

public class Solution07 { 
	public LinkedList<Integer> BuildOrder(int numProj, int[][] prerequisites) {
		if (prerequisites == null){
			return null;
		}
		
		int[] numPre = new int[numProj];
		
		//Count the numeber of the projects which is considered as prerequisites
		for (int i = 0; i < prerequisites.length; i++){
			numPre[prerequisites[i][0]] ++;
		}
		
		//store the projects without prerequisites in a linked list
		LinkedList<Integer> NoPrerequisites = new LinkedList<Integer>();
		for (int i =0; i<numProj; i++){
			if (numPre[i] == 0){
				NoPrerequisites.add(i);
			}
		}
		
		//count the number of the project without a prerequisite
		int numNoPre = NoPrerequisites.size();
		//create a linked list to store the project can be built
		LinkedList projects = new LinkedList();
		
		//check if a project's prerequisite can be satisfied by another project
		while (!NoPrerequisites.isEmpty()){
			int top = NoPrerequisites.remove();
			projects.push(top);
			
			for (int i = 0; i<prerequisites.length; i++) {
				if (prerequisites[i][1] == top){
					numPre[prerequisites[i][1]] --;
					//
					if (numPre[prerequisites[i][0]] == 0){
						numNoPre++;
						NoPrerequisites.add(prerequisites[i][0]);
					}
				}
			}
		}
	    /*If the number of project without a prerequisites is equal to the number of project, that means 
		  there is no cycle in graph, return the linked list project  */
		if (numProj == numNoPre){
		   return projects;
	   }
		
	   else {
		   return null;
	   }
	}

}
