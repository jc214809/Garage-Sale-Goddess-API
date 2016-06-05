package com.github.jc214809.model;

public class Item {

	private int itemId;
		
	private String itemTitle;
	
	private String itemDescription;
	
	private String itemPriceRange;

	private String itemRequester;
	
	private String itemStatus;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemPriceRange() {
		return itemPriceRange;
	}

	public void setItemPriceRange(String itemPriceRange) {
		this.itemPriceRange = itemPriceRange;
	}

	public String getItemRequester() {
		return itemRequester;
	}

	public void setItemRequester(String itemRequester) {
		this.itemRequester = itemRequester;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
}
