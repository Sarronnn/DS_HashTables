package homework4Eclipse;

import static org.junit.Assert.*;

import org.junit.Test;

public class Homework4OfficialTests {

	@Test
	public void hashTest1() {
		// Arbitrarily set at 100 for 100 buckets
		HashTable ht = new HashTable(100);
		ht.put(1, 2);
		HashTable.tuple t = ht.get(3);
		assertTrue(t.getFirst() == 1);
		assertTrue(t.getSecond() == 2);
	}
	
	@Test
	public void hashTest2() {
		HashTable ht = new HashTable(100);
		ht.put(1, 4);
		ht.put(2, 3);
		HashTable.tuple t = ht.get(5);
		assertTrue(t.getFirst() + t.getSecond() == 5);
		assertTrue(t.getSecond() == 3 || t.getSecond() == 4);
	}
	@Test
	public void hashTest3() {
		HashTable ht = new HashTable(100);
		ht.put(1, 2);
		HashTable.tuple t = ht.get(3);
		assertTrue(t.getFirst() == 1);
		assertTrue(t.getSecond() == 2);
	}
	
	@Test
	public void hashTest4() {
		HashTable ht = new HashTable(100);
		ht.put(1, 4);
		ht.put(2, 3);
		ht.put(21, 12);
		ht.put(21, 15);
		ht.put(1, 18);
		ht.put(10, 11);
		ht.put(13, 3);
		ht.put(4, 12);
	}
	
	@Test
	public void hashTest5() {
		HashTable ht = new HashTable(100);
		ht.put(1, 4);
		ht.put(2, 3);
		ht.put(21, 12);
		ht.put(21, 15);
		
		assertTrue(ht.get(36).getFirst() == 21 || ht.get(36).getFirst() == 15);
		
	}
	
	
	
	
	@Test
	public void hashTest6() {
		HashTable ht = new HashTable(100);
		ht.put(1, 4);
		ht.put(3, 7);
		ht.put(10, 7);
		try {
			assertTrue(ht.get(11) == null);
		} catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	
	@Test
	public void graphTest1() {
		Graph g = new Graph(2);
		g.addEdge(0, 1);
		
		assertTrue(g.hasEdge(0, 1));
		assertFalse(g.hasEdge(1, 0));
	}
	
	
	@Test
	public void graphTest2() {
		Graph g = new Graph(3);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		
		assertTrue(g.hasEdge(0, 1));
		assertFalse(g.hasEdge(1, 0));
		assertTrue(g.hasCycle());
	}
	
	@Test
	public void graphTest3() {
		Graph g = new Graph(1);
		// Having a 1 vertex graph is legal
		g.addEdge(0, 0);
		assertTrue(g.hasEdge(0, 0));
	}
	
	
	
	@Test
	public void graphTest4() {
		Graph g = new Graph(5);
		// Having a 1 vertex graph is legal
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		assertFalse(g.hasEdge(0, 0));
		assertFalse(g.hasEdge(1, 0));
		assertTrue(g.hasEdge(2, 3));
	}
	
	
	@Test
	public void graphTest5() {
		Graph g = new Graph(3);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		g.addEdge(2, 2);
		
		assertFalse(g.hasEdge(0, 0));
		assertFalse(g.hasEdge(0, 2));
		assertFalse(g.hasEdge(1, 2));
		assertFalse(g.hasEdge(1, 1));
		
	}
	
	
	@Test
	public void graphTest6() {
		Graph g = new Graph(1);
		// Having a 1 vertex graph is legal
		g.addEdge(0, 0);
		assertTrue(g.hasEdge(0, 0));
		assertTrue(g.hasCycle());
	}
	
	
	
	
	
	
	
	
	@Test
	public void canGraduate1() {
		int[][] a = { {0, 1}, {1,0} };
		assertFalse(Homework4.canGraduate(2, a));

		int[][] a2 = { {0, 1} };
		assertTrue(Homework4.canGraduate(2, a2));
	}
	
	
	@Test
	public void canGraduate2() {
		
		int[][] a3 = { {0, 1}, {1,2}, {2, 0} };
		assertFalse(Homework4.canGraduate(3, a3));
		
	}
	
	@Test
	public void canGraduate3() {

		int[][] a = {{0,1}, {1,2}, {2,4}, {2,5}, {2,6}, {7,2}};
		assertTrue(Homework4.canGraduate(8, a));

	}
	
	@Test
	public void canGraduate4() {

		int[][] a = {{0,1}, {1,2}, {2,4}, {2,5}, {2,6}, {6,0}};
		assertFalse(Homework4.canGraduate(7, a));

	}
	
	@Test
	public void canGraduate5() {

		int[][] a = {{0,1}, 
				{0,2}, 
				{0,4}, 
				{2,4}, 
				{4,6}, 
				{5,6},
				{5,3},
				{6,7},
				{7,8},
				{9,2}};
		assertTrue(Homework4.canGraduate(10, a));

	}
	
	@Test
	public void canGraduate6() {

		int[][] a = {{1,2}, 
				{2,5}, 
				{2,4}, 
				{1,4}, 
				{1,3}, 
				{3,6},
				{4,6},
				{4,7},
				{5,4},
				{5,7}};
		assertTrue(Homework4.canGraduate(8, a));

	}
	

	
	
	@Test
	public void sumtest1() {
		int[] nums = {1, 2, 3, 4};
		assertTrue(Homework4.fourSum(nums, 10));
	}
	
	@Test
	public void sumtest2() {
		int[] nums = {1, 2, 3, 4, 5};
		assertFalse(Homework4.fourSum(nums, 21));
	}
	
	
	@Test
	public void sumtest3() {
		int[] nums = {1, 2, 3, 8, 9, 10, 20, 21, 22};
		assertTrue(Homework4.fourSum(nums, 60));
		
	}
	
	@Test
	public void sumtest4() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertFalse(Homework4.fourSum(nums, 7));
		
		
		assertTrue(Homework4.fourSum(nums, 11));
		assertFalse(Homework4.fourSum(nums, 31));
		
	}
	
	@Test
	public void sumtest5() {
		int[] nums = {10, 2, 3, 4, 5, 9, 7, 8};
		assertTrue(Homework4.fourSum(nums, 23));
		assertFalse(Homework4.fourSum(nums, 33));
		
	}
	
	
	@Test
	public void sumtest6() {
		int[] nums = {1, 2, 3, 5, 6, 11, 15, 16, 17, 18};
		assertTrue(Homework4.fourSum(nums, 20));
		assertFalse(Homework4.fourSum(nums, 13));
		assertFalse(Homework4.fourSum(nums, 99999));
		
		
		
	}
	
	
	
	
	
}
