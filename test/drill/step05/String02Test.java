/**
 * StringAPI02Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */
package drill.step05;

import static org.hamcrest.CoreMatchers.*;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;
import org.junit.Test;

/**
 * @author namba
 * @version 2014/05/09
 */
public class String02Test extends BaseTest {

	@Test
	public void string02Test() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		String02.main(null);

		AssertionWrapper.assertThat("mainメソッドの実行結果が異なります", out.toString(), is("defg\r\ncdef\r\n"));
	}

}
