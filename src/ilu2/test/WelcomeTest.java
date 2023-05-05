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
		assertEquals(Welcome.welcome("jean"), "Hello, Jean");
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
		assertEquals(Welcome.welcome("TINTIN,BOB"), "HELLO, TINTIN AND BOB !");
		assertEquals(Welcome.welcome("tintin,BOB"), "Hello, Tintin. AND HELLO, BOB !");
	}
	
	@Test
	void testEx5() {
		assertEquals(Welcome.welcome("bob,dupond,tintin,jean,jack"), "Hello, Bob, Dupond, Tintin, Jean and Jack");
		assertEquals(Welcome.welcome("asterix,obelix,panoramix,jean"), "Hello, Asterix, Obelix, Panoramix and Jean");
		assertEquals(Welcome.welcome("boutade, rigolade,sourire,jean,jack,benoit"), "Hello, Boutade, Rigolade, Sourire, Jean, Jack and Benoit");
		assertEquals(Welcome.welcome("ASTERIX,OBELIX,PANORAMIX,JEAN"), "HELLO, ASTERIX, OBELIX, PANORAMIX AND JEAN !");
		assertEquals(Welcome.welcome("ASTERIX,obelix,PANORAMIX,jean"), "Hello, Obelix and Jean. AND HELLO, ASTERIX AND PANORAMIX !");
	}
	
	@Test
	void testEx6() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"), "Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("BOB,  tintin"), "Hello, Tintin. AND HELLO, BOB !");
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
		assertEquals(Welcome.welcome("bob,jerry,amy,bob,jerry,bob"), "Hello, Bob (x3), Jerry (x2) and Amy");
		assertEquals(Welcome.welcome("BOB,JERRY,AMY,BOB,JERRY,BOB"), "HELLO, BOB (x3), JERRY (x2) AND AMY !");
		assertEquals(Welcome.welcome("BOB,BOB,BOB,BOB,BOB    , BOB   "), "HELLO, BOB (x6) !");
	}
	
	@Test
	void testEx9() {
		assertEquals(Welcome.welcome("yoda,bob,amy,amy"), "Yoda, Bob and Amy (x2), Hello");
		assertEquals(Welcome.welcome("YODA,BOB,AMY,AMY"), "YODA, BOB AND AMY (x2), HELLO !");
		assertEquals(Welcome.welcome("yoda,bob,amy,amy,JEAN"), "Yoda, Bob and Amy (x2), Hello. AND HELLO, JEAN !");
		assertEquals(Welcome.welcome("   yoda,bob,  amy,amy,JEAN,JEAN,YODA"), "Yoda, Bob and Amy (x2), Hello. AND JEAN (x2) AND YODA, HELLO !");
		assertEquals(Welcome.welcome("yoda,yoda,yoda,yoda"), "Yoda (x4), Hello");
		assertEquals(Welcome.welcome("YODA,YODA,YODA,YODA"), "YODA (x4), HELLO !");
	}

}
