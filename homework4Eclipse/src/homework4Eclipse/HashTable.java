package homework4Eclipse;
import java.util.LinkedList;

public class HashTable {
	private int size;
	private Entry[] buckets;

	public class tuple {
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

		//// You might need to add more here!
		boolean hasDuplicate(tuple other) {
			return this.first == other.first || this.first == other.second
					|| this.second == other.first || this.second == other.second;
		}

		@Override
		public int hashCode() {
			return this.first + this.second;
		}

		@Override
		public boolean equals(Object other) {
			if (this.getClass() != other.getClass()) {
				return false;
			}
			tuple otherTuple = (tuple)other;
			return this.first == otherTuple.first && this.second == otherTuple.second;
		}
	}

	private class Entry {
		int key;
		LinkedList<tuple> vals;	

		/**
		 * Creates a new, empty Entry 
		 */
		Entry() {
			key = 0;
			vals = new LinkedList<>();
		}

		/**
		 * Adds a new tuple to the current Entry. 
		 * @param one the first integer
		 * @param two the second integer
		 */
		void addVal(int one, int two) {
			if (vals.size() == 0) {
				key = Math.abs(one + two);
			}

			tuple toAdd = new tuple(one, two);
			if (!vals.contains(toAdd)) {
				size++;
				vals.add(new tuple(one, two));
			}
		}

		/**
		 * Adds a new tuple to the current Entry. It does nothing if Entry already contains the incoming value. 
		 * Increments the size of the current Graph if the Entry was previously empty
		 * 
		 * @param one the first integer
		 * @param two the second integer
		 */
		void addUniqueVal(int one, int two) {
			if (vals.size() == 0) {
				key = Math.abs(one + two);
			}

			size++;
			vals.add(new tuple(one, two));
		}
	}
	

	HashTable(int num){
		
		size = 0;
		buckets = new Entry[num];

		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new Entry();
		}
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
		if (one + two >= buckets.length) {
			throw new IllegalArgumentException("Your numbers are too big for this HashTable");
		}
		buckets[one + two].addVal(one, two);
	}
	
		/**
		 * Gets back a tuple where the tuple sums to a certain size
		 * @param n The sum value to find
		 * @return A corresponding tuple with sum
		 */
	
	public tuple get(int sum) {
		if (sum >= buckets.length || sum < 0) {
			return null;
		}

		Entry bucket = buckets[Math.abs(sum)];

		if (bucket.vals.size() > 0) {
			return bucket.vals.get(0);
		}

		return null;
	}	
}
