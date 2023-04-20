package ilu2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest {

	@Test
	void testEx1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
		assertEquals(Welcome.welcome("dupond"), "Hello, Dupond");
		assertEquals(Welcome.welcome("tintin"), "Hello, Tintin");
	}

}
