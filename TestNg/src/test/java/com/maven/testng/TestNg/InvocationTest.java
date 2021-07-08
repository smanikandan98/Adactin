package com.maven.testng.TestNg;

import org.testng.annotations.Test;

public class InvocationTest {
	
	@Test
	private void switchon() {

		System.out.println("Switch On");
	}
	@Test (invocationCount = 2)
	private void clickwindows() {

		System.out.println("Windows");
	}
	@Test (invocationCount = 2)
	private void utorrent() {

		System.out.println("torrent");
	}
	@Test (invocationCount = 2)
	private void downlod() {

			System.out.println("Download");
	}
	@Test (invocationCount = 2)
	private void delete() {
		System.out.println("Delete Torrent");
	}
	@Test (invocationCount = 2)
	private void shutdown() {
		System.out.println("Shut Down");
		
	}


}
