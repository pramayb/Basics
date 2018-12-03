package test.com.java.basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.java.basics.BinaryTreeSample;

public class BinaryTreeSampleTest {
	@Test
	public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
		BinaryTreeSample bt = BinaryTreeSample.createBinaryTree();

//		assertTrue(bt.containsNode(6));
//		assertTrue(bt.containsNode(4));

		assertFalse(bt.containsNode(1));
	}
}
