/**
 * Variable01Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step04;

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
public class For06Test extends BaseTest {

	@Test
	public void for06Test() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		For06.main(null);

		String resultText = out.toString();
		String[] results = resultText.split(System.getProperty("line.separator"));

		String resultExample = "------------例題----------------";
		String result1 = "java";
		String result2 = "ruby";
		String result3 = "c++";
		String result4 = "python";
		String result5 = "c#";
		String resultTodo = "------------TODO----------------";
		String result6 = "c#";
		String result7 = "python";
		String result8 = "c++";
		String result9 = "ruby";
		String result10 = "java";

		// python
		// c#

		List<String> expectedList = Arrays.asList(resultExample, result1, result2, result3, result4, result5,
				resultTodo, result6, result7, result8, result9, result10);

		for (int i = 0; i < expectedList.size(); i++) {
			String expected = expectedList.get(i);

			if (results.length <= i) {
				AssertionWrapper.fail((i + 1) + "番目のSystem.out.printlnの内容が不足してます。期待値=" + expected);
			}

			AssertionWrapper.assertThat((i + 1) + "番目のSystem.out.printlnの内容が間違っています。", results[i], is(expected));
		}

	}
}
