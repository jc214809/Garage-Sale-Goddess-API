package com.github.jc214809.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.jc214809.model.Item;
import com.github.jc214809.service.ItemService;


@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
    
	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

	@RequestMapping(value = "/getNotFoundItems", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Item> getNotFoundItems() {
		List<Item> items = itemService.getNotFoundItems();
		return items;
	}
	
	@RequestMapping(value = "/getFoundItems", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Item> getFoundItems() {
		List<Item> items = itemService.getFoundItems();
		return items;
	}
	
	@RequestMapping(value = "/addItem", method = RequestMethod.POST)
	@ResponseBody
	public void addItem(@RequestBody final Item item) {
		itemService.addItem(item);
	}
	
	@RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
	@ResponseBody
	public void deleteItem(@RequestBody final Item item) {
		itemService.deleteItem(item.getItemId());
	}
	
	@RequestMapping(value = "/editItem", method = RequestMethod.POST)
	@ResponseBody
	public void editItem(@RequestBody final Item item) {
		itemService.editItem(item);
	}
	
	@RequestMapping(value = "/markItemAsFound", method = RequestMethod.POST)
	@ResponseBody
	public void markItemAsFound(@RequestBody final Item item) {
		itemService.markItemAsFound(item);
	}
	
	@RequestMapping(value = "/markItemAsNotFound", method = RequestMethod.POST)
	@ResponseBody
	public void markItemAsNotFound(@RequestBody final Item item) {
		itemService.markItemAsNotFound(item.getItemId());
	}
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<Item> getUsers() {
		return itemService.getUsers();
	}
}
