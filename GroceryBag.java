import java.util.ArrayList;
import java.util.Iterator;


/**
 * A bag with a list of items
 * @author jonesb1
 *
 */
public class GroceryBag {
	
	private ArrayList<Item> items;

	public GroceryBag() {
		items = new ArrayList<>();
	}

	/**
	 * 
	 * @return The list of items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}

	/**
	 * 
	 * @param items The list of items
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	/**
	 * Adds an item
	 * @param description The description of the item to be added
	 * @param value       The value of the item to be added
	 */
	public void addItem(String description, int value) {
		items.add(new Item(description, value));
	}
	
	/**
	 * Gives the price of all items
	 * @return the total value of all items
	 */
	public int totalValue() {
		int total = 0;
		for(Item item: items) {
			total = total + item.getValue();
		}
		return total;
	}
	
	/**
	 * Counts all the items of one type
	 * @param searchString The item being counted
	 * @return The amount of items
	 */
	public int itemCount(String searchString) {
		int count = 0;
		for(Item item: items) {
			if(item.getDescription().contains(searchString)) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 *  Searches the bag for a specific item
	 * @param searchString The item to be searched
	 * @return Whether the item was found
	 */
	public boolean inBag(String searchString) {
		boolean found = false;
		for(Iterator<Item> it = items.iterator(); it.hasNext() && !found; ) {
			if(it.next().getDescription().contains(searchString)) {
				found = true;
			}
		}
		return found;
		
	}
	
}
