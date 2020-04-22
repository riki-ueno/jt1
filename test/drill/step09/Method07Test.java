/**
 * Method10Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */
package drill.step09;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.RegexMatcher;
import drill.TestOther;
import org.junit.Test;

/**
 * @author namba
 * @version 2014/05/06
 */
public class Method07Test extends BaseTest {

	@Test
	public void method07Test_0() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		Method07.main(null);

		String[] results = out.toString().split(System.getProperty("line.separator"));

		String expected = "サイコロを振った出目は[1-6]でした";

		for (int i = 0; i < 5; i++) {

			if (results.length <= i) {
				AssertionWrapper.fail("サイコロの振った回数が5回未満です。振った回数=" + (i + 1));
			}

			AssertionWrapper.assertThat("mainメソッドの実行結果が異なります", results[i], RegexMatcher.matchesRegex(expected));
		}

	}

}
