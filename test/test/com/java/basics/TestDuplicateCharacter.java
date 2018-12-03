package test.com.java.basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.java.basics.StringTests;

class TestDuplicateCharacter {

	@Test
	void test() {
		assertTrue(StringTests.checkDuplicateCharacter("test"));
	}

}
