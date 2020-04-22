/**
 * ArrayAggregation01Test.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */
package drill.step06;

import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import drill.AssertionWrapper;
import drill.BaseTest;
import drill.TestOther;

/**
 * @author namba
 * @version 2014/05/10
 */
@RunWith(Theories.class)
public class ArrayLoop01Test extends BaseTest {

	private static int[] array1 = { 321, 121, 52, 13, 623, 39, 31, 60, 121 };
	private static int[] array2 = { 95, 0, -49, 3, 1, -1 };
	private static int[] array3 = { -251, 214, 424, 424, -291, 271, -332, 274, -37, -93, -194, -251, -93, -173, 374 };
	private static int[] array4 = { -76, 14, -46, -76, -22, -65, -35, -1, -76, -8, -51, -65, 5, -16, -2, 12 };

	public static class Fixture {
		private int[] array;
		private int result;
		private int testNo;

		private Fixture(int[] array, int result, int testNo) {
			this.array = array;
			this.result = result;
			this.testNo = testNo;
		}

		@Override
		public String toString() {
			return "[array=" + Arrays.toString(array) + "]";
		}
	}

	@DataPoints
	public static Fixture[] getParameters() {
		Fixture[] fixtures = { new Fixture(array1, 1381, 0), // 正常系
				new Fixture(array2, 49, 1), // 正常系
				new Fixture(array3, 266, 2), // 正常系
				new Fixture(array4, -508, 3), // 正常系
		};

		return fixtures;
	}

	@Theory
	public void arrayLoop01Test(Fixture fixture) throws Exception {
		TestOther.setQuestion(testName.getMethodName() + "_" + fixture.testNo, "");
		String message = fixture.toString() + "を入力した結果が不正です";
		AssertionWrapper.assertThat(message, ArrayLoop01.sum(fixture.array), is(fixture.result));
	}

}
