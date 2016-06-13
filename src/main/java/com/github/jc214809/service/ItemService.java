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
	
	public List<Item> getNotFoundItems() {
		return itemMapper.getNotFoundItems();
	}
	
	public List<Item> getFoundItems() {
		return itemMapper.getFoundItems();
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
	
	public void markItemAsFound(Item item) {
		itemMapper.markItemAsFound(item);
	}
	
	public void markItemAsNotFound(int itemId) {
		itemMapper.markItemAsNotFound(itemId);
	}
	
	public List<Item> getUsers() {
		return itemMapper.getUsers();
	}
}
