/**
 * Variable01Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step01;

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
public class Variable03Test extends BaseTest {

	@Test
	public void variable03Test() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		Variable03.main(null);

		String resultText = out.toString();
		String[] results = resultText.split(System.getProperty("line.separator"));

		String result1 = "a=1680,b=1980";

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
