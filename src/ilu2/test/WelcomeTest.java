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
	
	@Test
	void testEx2() {
		assertEquals(Welcome.welcome(null), "Hello, my friend");
		assertEquals(Welcome.welcome(" "), "Hello, my friend");
		assertEquals(Welcome.welcome("   "), "Hello, my friend");
		assertEquals(Welcome.welcome(""), "Hello, my friend");
	}
	
	@Test
	void testEx3() {
		assertEquals(Welcome.welcome("BOB"), "Hello, BOB !");
		assertEquals(Welcome.welcome("JERRY"), "Hello, JERRY !");
		assertEquals(Welcome.welcome("DUPOND"), "Hello, DUPOND !");
		assertEquals(Welcome.welcome("TINTIN"), "Hello, TINTIN !");
	}
	
	@Test
	void testEx4() {
		assertEquals(Welcome.welcome("bob,dupond"), "Hello, Bob, Dupond");
		assertEquals(Welcome.welcome("dupond,tintin"), "Hello, Dupond, Tintin");
		assertEquals(Welcome.welcome("tintin,bob"), "Hello, Tintin, Bob");
	}
	
	@Test
	void testEx5() {
		assertEquals(Welcome.welcome("bob,dupond,tintin"), "Hello, Bob, Dupond, Tintin");
		assertEquals(Welcome.welcome("asterix,obelix,panoramix"), "Hello, Asterix, Obelix, Panoramix");
		assertEquals(Welcome.welcome("boutade,rigolade,sourire"), "Hello, Boutade, Rigolade, Sourire");
	}

}
