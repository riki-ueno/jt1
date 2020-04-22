/**
 * ArrayList01Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */
package drill.step07;

import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;
import org.junit.Test;

/**
 * @author namba
 * @version 2014/06/02
 */
public class List03Test extends BaseTest {

	@Test
	public void list03Test_0() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");

		List<String> list = Arrays.asList("aaa", "bbb", "ccc");
		List03.display(list);

		String[] results = out.toString().split(System.getProperty("line.separator"));
		AssertionWrapper.assertThat(list + "を入力した結果が異なります", results, is(list.toArray(new String[0])));
	}

	@Test
	public void list03Test_1() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
		List03.display(list);

		String[] results = out.toString().split(System.getProperty("line.separator"));
		AssertionWrapper.assertThat(list + "を入力した結果が異なります", results, is(list.toArray(new String[0])));
	}

	@Test
	public void list03Test_2() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		List<String> list = Arrays.asList("aaa", "bbb", "", "ddd", null);
		List03.display(list);

		String[] results = out.toString().split(System.getProperty("line.separator"));
		AssertionWrapper.assertThat(list + "を入力した結果が異なります", results, is(new String[] { "aaa", "bbb", "", "ddd", "null" }));
	}

}
