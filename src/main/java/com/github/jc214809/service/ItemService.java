package com.github.jc214809.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jc214809.mappers.ItemMapper;
import com.github.jc214809.model.Item;

@Service
public class ItemService {
	
	@Autowired
	private ItemMapper itemMapper;
	
	public List<Item> getItems() {
		return itemMapper.getItems();
	}
	
	public void addItem(Item item) {
		itemMapper.addItem(item);
	}
	
	public void deleteItem(int itemId) {
		itemMapper.deleteItem(itemId);
	}
	
	public void editItem(Item item) {
		itemMapper.editItem(item);
	}
	
	public void markItemAsFound(int itemId) {
		itemMapper.markItemAsFound(itemId);
	}
}
