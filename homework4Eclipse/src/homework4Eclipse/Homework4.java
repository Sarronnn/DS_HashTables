package homework4Eclipse;

public class Homework4 {

	
	/**
	 * Checks if any four elements in the array add up to a given sum.
	 * Must use a hash table to solve the problem.
	 * Time complexity should be no worse than O(n^3), though this hinted solution is better.
	 * @param arr The array of integers to check. Each number is a unique positive integer.
	 * @param sum The target sum
	 * @return True if there exists any 4 elements that sum up to sum
	 */
	public static boolean fourSum(int[] arr, int sum) {
		// HINT: Consider breaking this problem down into another: Look for 2 sets of pairs where the pairs sum to our sum
		 throw new UnsupportedOperationException("Not yet implemented");
		}

	
	/**
	 * There are a total of num courses you have to take, labeled from 0 to num-1.
	 * You are given an array prerequisites where prerequisites[i] = [a_i, b_i] indicates
	 * that you must take course b_i first if you want to take course a_i
	 * 
	 * For example, the pair [1, 3] means to take course 1 you must take course 3
	 * 
	 * Return true if it is possible to finish all courses. Otherwise return false
	 * 
	 * You do not need to efficiently check. Just find the correct answer.
	 * 
	 * @param num the number of courses
	 * @param prerequisites array of prerequisite pairs
	 * 
	 */
	public static boolean canGraduate(int num, int[][] prerequisites) {
		// HINT: This is the same as finding if a cycle exists in a directed graph.
		// If a cycle exists, no ordering exists and therefore it is impossible
		Graph classTaken = new Graph(num);

	    for (int[] req : prerequisites) {
	    	classTaken.addEdge(req[0], req[1]);
	    }
	        return !classTaken.hasCycle();
	    }
	
	/*
	 * Tests: 17/24
	 * Style: 10
	 * Score: 73.75
	 * 
	 */
}
