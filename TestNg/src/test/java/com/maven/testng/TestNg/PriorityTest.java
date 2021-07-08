package com.maven.testng.TestNg;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test (priority = -5)
	private void switchon() {

		System.out.println("Switch On");
	}
	@Test (priority = -3)
	private void clickwindows() {

		System.out.println("Windows");
	}
	@Test (priority = 0)
	private void utorrent() {

		System.out.println("torrent");
	}
	@Test (priority = 3)
	private void downlod() {

			System.out.println("Download");
	}
	@Test (priority = 5)
	private void delete() {
		System.out.println("Delete Torrent");
	}
	@Test (priority = 7)
	private void shutdown() {
		System.out.println("Shut Down");
		
	}


}
