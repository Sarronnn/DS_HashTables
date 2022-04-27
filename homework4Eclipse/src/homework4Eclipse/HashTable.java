package homework4Eclipse;

public class HashTable {
	public class tuple{
		private int first, second;
		public tuple(int f, int s) {
			this.first = f;
			this.second = s;
		}
		public int getFirst() {
			return this.first;
		}
		public int getSecond() {
			return this.second;
		}
		
		// You might need to add more here!
		
	}
	
	HashTable(int sum){
		throw new UnsupportedOperationException("Not yet implemented");		
	}
	
	// Make a hash table of type:
	// Keys = integer, where the integer is the sum of your tuple
	// Values = tuple of two ints (from the original list)
	
	// HINT: Your HashTable will likely be much simpler than our in class example
	
	/**
	 * Creates a tuple t into our hash table at the key: sum of our two nums
	 * 
	 * @param t A tuple containing two integers from our query
	 */
	public void put(int one, int two) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	/**
	 * Gets back a tuple where the tuple sums to a certain size
	 * @param n The sum value to find
	 * @return A corresponding tuple with sum
	 */
	public tuple get(int sum) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
}
