/**
 * ArrayList05Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */
package drill.step08;

import static org.hamcrest.CoreMatchers.*;

import java.util.HashMap;
import java.util.Map;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;
import org.junit.Test;

/**
 * @author namba
 * @version 2014/06/03
 */
public class Map01Test extends BaseTest {

	@Test
	public void map01Test_0() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");

		Map<String, String> map = new HashMap<>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");

		try {
			AssertionWrapper.assertThat(map + "を入力した結果が異なります", Map01.getFromMap(map, "aaa"), is("111"));
		} catch (IllegalArgumentException e) {
			AssertionWrapper.fail(map + "の入力の場合は例外は発生しません。" + e.getMessage());
		}
	}

	@Test
	public void map01Test_1() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");

		Map<String, String> map = new HashMap<>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");

		String result = null;

		try {
			AssertionWrapper.assertThat(map + "を入力した結果が異なります", Map01.getFromMap(map, "ddd"), is(result));
		} catch (IllegalArgumentException e) {
			AssertionWrapper.fail(map + "の入力の場合は例外は発生しません。" + e.getMessage());
		}
	}

}
