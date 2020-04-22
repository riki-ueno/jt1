/**
 * Variable01Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step03;

import static org.hamcrest.CoreMatchers.*;
import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 *
 * @author j.mano
 *
 */
public class If01Test extends BaseTest {

	@Test
	public void if01Test() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		If01.main(null);

		String resultText = out.toString();
		String[] results = resultText.split(System.getProperty("line.separator"));

		String result1 = "正の数です";
		String result2 = "負の数です";
		String result3 = "0です";

		List<String> expectedList = Arrays.asList(result1, result2, result3);

		for (int i = 0; i < expectedList.size(); i++) {
			String expected = expectedList.get(i);

			if (results.length <= i) {
				AssertionWrapper.fail((i + 1) + "番目のSystem.out.printlnの内容が不足してます。期待値=" + expected);
			}

			AssertionWrapper.assertThat((i + 1) + "番目のSystem.out.printlnの内容が間違っています。", results[i], is(expected));
		}

	}
}
