package com.prog.com;

import com.base.org.Base_Class;
import com.pom.org.Book_Hotel;
import com.pom.org.Login_Page;
import com.pom.org.Select_Hotel;
import com.pom.org.Welcome_Page;

public class Adactin extends Base_Class {
	
	public static void main(String[] args) {
		browserLauch("chrome");
		url("https://adactinhotelapp.com/");
		
		Login_Page lp = new Login_Page(driver);
		sendKeys(lp.getUsername(), "vinovicky");
		sendKeys(lp.getPassword(), "Jan@2020");
		checkBox(lp.getLogin());
		
		Welcome_Page ll = new Welcome_Page(driver);
		dropDown(ll.getLocation(), "byValue", "Los Angeles");
		dropDown(ll.getHotels(), "byValue", "Hotel Sunshine");
		dropDown(ll.getRooms(), "byValue", "Super Deluxe");
		dropDown(ll.getNos(), "byValue", "1");
		erase(ll.getDate1());
		sendKeys(ll.getDate1(), "30/05/2022");
		erase(ll.getDate2());
		sendKeys(ll.getDate2(), "31/05/2022");
		dropDown(ll.getAdult(), "byValue", "2");
		dropDown(ll.getChild(), "byValue", "0");
		checkBox(ll.getSearch());
		
		Select_Hotel sh = new Select_Hotel(driver);
		checkBox(sh.getRadio());
		checkBox(sh.getProceed());
		
		Book_Hotel bh = new Book_Hotel(driver);
		sendKeys(bh.getFirst(), "Manikandan");
		sendKeys(bh.getLast(), "Shanmugam");
		sendKeys(bh.getAddress(), "Arockiya Nagar");
		sendKeys(bh.getCredit(), "1234567890123456");
		dropDown(bh.getType(), "byValue", "MAST");
		dropDown(bh.getCcexpiry(), "byValue", "3");
		dropDown(bh.getCcyear(), "byValue", "2013");
		sendKeys(bh.getCcv(), "599");
		checkBox(bh.getBook());
		
		
		
	
	}

}
