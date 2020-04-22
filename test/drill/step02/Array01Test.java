/**
 * Variable01Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step02;

import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;
import org.junit.Test;

/**
 *
 * @author j.mano
 *
 */
public class Array01Test extends BaseTest {

	@Test
	public void array01Test() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		Array01.main(null);

		String resultText = out.toString();
		String[] results = resultText.split(System.getProperty("line.separator"));

		String result1 = "90";

		List<String> expectedList = Arrays.asList(result1);

		for (int i = 0; i < expectedList.size(); i++) {
			String expected = expectedList.get(i);

			if (results.length <= i) {
				AssertionWrapper.fail((i + 1) + "番目のSystem.out.printlnの内容が不足してます。期待値=" + expected);
			}

			AssertionWrapper.assertThat((i + 1) + "番目のSystem.out.printlnの内容が間違っています。", results[i], is(expected));
		}

	}

}
