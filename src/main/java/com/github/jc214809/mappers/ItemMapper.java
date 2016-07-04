package com.github.jc214809.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.github.jc214809.model.Item;

public interface ItemMapper { 
	
	@Select("SELECT * FROM items WHERE itemStatus='NOT FOUND'")
	public List<Item> getNotFoundItems();
	
	@Select("SELECT * FROM items WHERE itemStatus='FOUND'")
	public List<Item> getFoundItems();
	
	@Insert("INSERT INTO items(itemTitle, itemDescription, itemPriceRange, itemStatus, itemRequesterID, itemRequesterName, itemRequesterImageURL) VALUES (#{itemTitle},#{itemDescription},#{itemPriceRange}, 'NOT FOUND', #{itemRequesterID},#{itemRequesterName},#{itemRequesterImageURL})")
	public void addItem(Item item);
	
	@Delete("Delete FROM items WHERE itemId = #{itemId}")
	public void deleteItem(int itemId);
	
	@Update("UPDATE items SET itemTitle=#{itemTitle},itemDescription=#{itemDescription},itemPriceRange=#{itemPriceRange} WHERE itemId=#{itemId}")
	public void editItem(Item item);
	
	@Update("UPDATE items SET itemStatus='FOUND',itemFinderID =#{itemFinderID}, itemFindersName=#{itemFindersName}, itemFinderImageURL=#{itemFinderImageURL} WHERE itemId= #{itemId}")
	public void markItemAsFound(Item item);
	
	@Update("UPDATE items SET itemStatus='NOT FOUND',itemFinderID =NULL, itemFindersName=NULL, itemFinderImageURL=NULL WHERE itemId=#{itemId}")
	public void markItemAsNotFound(int itemId);
	
	@Select("SELECT `itemRequesterID`, `itemRequesterName`, `itemRequesterImageURL` FROM items WHERE itemStatus = 'NOT FOUND' group by `itemRequesterID`")
	public List<Item> getUsers();
	
	
}
