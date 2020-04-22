/**
 * method04Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */
package drill.step09;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author namba
 * @version 2014/05/06
 */
public class Method04Test extends BaseTest {

	private final Class<Method04> target = Method04.class;
	private final String targetMethod = "sum";

	@Before
	public void assertExistsMethod() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		Method m = null;

		try {
			m = target.getDeclaredMethod(targetMethod, int.class, int.class);
			m.setAccessible(true);
		} catch (NoSuchMethodException e) {
			AssertionWrapper.fail("メソッド: " + targetMethod + " が宣言されていません。");
		}
	}

	@Ignore
	public int call_sum(int a, int b) throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		int ret = 0;
		Method m = null;

		try {
			m = target.getDeclaredMethod(targetMethod, int.class, int.class);
			m.setAccessible(true);

			ret = (int) m.invoke(null, a, b);
		} catch (NoSuchMethodException e) {
			AssertionWrapper.fail("メソッド: " + targetMethod + " が宣言されていません。");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			AssertionWrapper.fail("メソッド: " + targetMethod + " が呼び出しできません。");
		}

		return ret;
	}

	@Test
	public void method04Test_0() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		AssertionWrapper.assertEquals("3, 5を入力した結果が異なります", 8, call_sum(3, 5));
	}

	@Test
	public void method04Test_1() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		AssertionWrapper.assertEquals("108, 4408を入力した結果が異なります", 4516, call_sum(108, 4408));
	}

	@Test
	public void method04Test_2() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		AssertionWrapper.assertEquals("911, -200039を入力した結果が異なります", -199128, call_sum(911, -200039));
	}

	@Test
	public void method04Test_3() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		AssertionWrapper.assertEquals("2147483647, -2147483648を入力した結果が異なります", -1, call_sum(2147483647, -2147483648));
	}

	@Test
	public void method04Test_4() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		AssertionWrapper.assertEquals("2147483647, -2147483647を入力した結果が異なります", 0, call_sum(2147483647, -2147483647));
	}

	@Test
	public void method04Test_5() throws Exception {
		TestOther.setQuestion(testName.getMethodName(), "");
		AssertionWrapper.assertEquals("-2147483648, -2147483648を入力した結果が異なります", 0, call_sum(-2147483648, -2147483648));
	}

}
