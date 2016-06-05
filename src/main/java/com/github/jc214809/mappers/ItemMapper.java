package com.github.jc214809.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.github.jc214809.model.Item;

public interface ItemMapper { 
	
	@Select("SELECT * FROM items")
	public List<Item> getItems();
	
	@Insert("INSERT INTO `items`(`itemTitle`, `itemDescription`, `itemPriceRange`, `itemRequester`) VALUES (#{itemTitle},#{itemDescription},#{itemPriceRange},#{itemRequester})")
	public void addItem(Item item);
	
	@Delete("Delete FROM `items` WHERE itemId = #{itemId}")
	public void deleteItem(int itemId);
	
	@Update("UPDATE `items` SET `itemTitle`=#{itemTitle},`itemDescription`=#{itemDescription},`itemPriceRange`=#{itemPriceRange},`itemRequester`=#{itemRequester} WHERE `itemId`=#{itemId}")
	public void editItem(Item item);
	
	@Update("UPDATE `items` SET `itemStatus`='Found' WHERE `itemId`=#{itemId}")
	public void markItemAsFound(int itemId);
	
}
