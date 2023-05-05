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
		assertEquals(Welcome.welcome("bob,dupond"), "Hello, Bob and Dupond");
		assertEquals(Welcome.welcome("dupond,tintin"), "Hello, Dupond and Tintin");
		assertEquals(Welcome.welcome("tintin,bob"), "Hello, Tintin and Bob");
	}
	
	@Test
	void testEx5() {
		assertEquals(Welcome.welcome("bob,dupond,tintin,jean,jack"), "Hello, Bob, Dupond, Tintin, Jean and Jack");
		assertEquals(Welcome.welcome("asterix,obelix,panoramix,jean"), "Hello, Asterix, Obelix, Panoramix and Jean");
		assertEquals(Welcome.welcome("boutade,rigolade,sourire,jean,jack,benoit"), "Hello, Boutade, Rigolade, Sourire, Jean, Jack and Benoit");
	}
	
	@Test
	void testEx6() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"), "Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("BOB,tintin"), "Hello, Tintin. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("asterix,obelix,JEAN"), "Hello, Asterix and Obelix. AND HELLO, JEAN !");
		assertEquals(Welcome.welcome("asterix,OBELIX,JEAN"), "Hello, Asterix. AND HELLO, OBELIX AND JEAN !");
	}
	
	@Test
	void testEx7() {
		assertEquals(Welcome.welcome("bob    ,amy   "), "Hello, Bob and Amy");
		assertEquals(Welcome.welcome("       amy,  JACK  , bob   "), "Hello, Amy and Bob. AND HELLO, JACK !");
		assertEquals(Welcome.welcome("amy,   JACK                      ,                                          bob   , TINTIN"), "Hello, Amy and Bob. AND HELLO, JACK AND TINTIN !");
	}
	
	@Test 
	void testEx8() {
		assertEquals(Welcome.welcome("bob,JERRY,amy,bob,JERRY,bob"), "Hello, Bob (x3) and Amy. AND HELLO, JERRY (x2) !");
		assertEquals(Welcome.welcome("bob,jerry,amy,bob,Jerry,bob"), "Hello, Bob (x3), Jerry (x2) and Amy");
		assertEquals(Welcome.welcome("BOB,JERRY,AMY,BOB,JERRY,BOB"), "HELLO, BOB (x3), JERRY (x2) AND AMY !");
	}
	
	@Test
	void testEx9() {
		assertEquals(Welcome.welcome("yoda,bob,amy,amy"), "Yoda, Bob and Amy (x2), Hello");
		assertEquals(Welcome.welcome("YODA,BOB,AMY,AMY"), "YODA, BOB AND AMY (x2), HELLO !");
		assertEquals(Welcome.welcome("yoda,bob,amy,amy,JEAN"), "Yoda, Bob and Amy (x2), Hello. AND HELLO, JEAN !");
	}

}
