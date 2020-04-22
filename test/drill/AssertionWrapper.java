package drill;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hamcrest.Matcher;

/**
 * @author i.ogawa
 *
 */
public class AssertionWrapper {

	public static void assertTrue(boolean condition) throws Exception {
		assertTrue(null, condition);
	}

	public static void assertTrue(String message, boolean condition) throws Exception {
		try {
			org.junit.Assert.assertTrue(message, condition);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}
	}

	public static void assertFalse(boolean condition) throws Exception {
		try {
			org.junit.Assert.assertFalse(condition);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(Collection<Long> actual, Matcher<? super Collection<Long>> matcher)
			throws Exception {
		try {
			org.junit.Assert.assertThat(actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(Set<String> actual, Matcher<? super Set<String>> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(Map<String, Long> actual, Matcher<? super Map<String, Long>> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static <T> void assertThat(String reason, T actual, Matcher<? super T> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(reason, actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(List<String> actual, Matcher<? super List<String>> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(Integer actual, Matcher<? super Integer> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(String actual, Matcher<? super String> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(String reason, String actual, Matcher<? super String> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(reason, actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(String reason, List<String> actual, Matcher<? super List<String>> matcher)

			throws Exception {
		try {
			org.junit.Assert.assertThat(reason, actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(String reason, Boolean actual, Matcher<? super Boolean> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(reason, actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(String reason, Integer actual, Matcher<? super Integer> matcher) throws Exception {
		try {
			org.junit.Assert.assertThat(reason, actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertThat(String reason, String[] actual, Matcher<? super String[]> matcher)
			throws Exception {
		try {
			org.junit.Assert.assertThat(reason, actual, matcher);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertArrayEquals(String message, Object[] expecteds, Object[] actuals)

			throws Exception {
		try {
			org.junit.Assert.assertArrayEquals(message, expecteds, actuals);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertArrayEquals(String message, int[] expecteds, int[] actuals)

			throws Exception {
		try {
			org.junit.Assert.assertArrayEquals(message, expecteds, actuals);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void fail(String message) throws Exception {
		try {
			org.junit.Assert.fail(message);
			TestOther.failed();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void fail() throws Exception {
		try {
			org.junit.Assert.fail();
			TestOther.failed();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertNull(Object object) throws Exception {
		try {
			org.junit.Assert.assertNull(object);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertNull(String message, Object object) throws Exception {
		try {
			org.junit.Assert.assertNull(message, object);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertEquals(long expected, long actual) throws Exception {
		try {
			org.junit.Assert.assertEquals(expected, actual);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertEquals(String message, long expected, long actual) throws Exception {
		try {
			org.junit.Assert.assertEquals(message, expected, actual);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

	public static void assertEquals(String message, Object expected, Object actual) throws Exception {
		try {
			org.junit.Assert.assertEquals(message, expected, actual);
			TestOther.allSuccess();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}

			TestOther.failed();

			throw new Exception(e);
		} catch (Error e) {
			if (e.getMessage() != null) {
				System.out.println(e.getMessage());
				BaseTest.errorMessage = e.getMessage();
			}
			TestOther.failed();
			throw new Error(e);
		}

	}

}