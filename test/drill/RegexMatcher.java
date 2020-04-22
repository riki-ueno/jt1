package drill;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

/**
 * @author j.mano
 *
 */
public class RegexMatcher extends TypeSafeMatcher<String> {

	private final String regex;

	public RegexMatcher(final String regex) {
		this.regex = regex;
	}

	public void describeTo(final Description description) {
		description.appendText("matches regex=`" + regex + "`");
	}

	@Override
	public boolean matchesSafely(final String string) {
		return string.matches(regex);
	}

	public static RegexMatcher matchesRegex(final String regex) {
		return new RegexMatcher(regex);
	}
}