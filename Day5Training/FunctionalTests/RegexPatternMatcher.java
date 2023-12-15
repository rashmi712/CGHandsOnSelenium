package FunctionalTests;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegexPatternMatcher {
	@Test
	 public static boolean patternMatches(String actualPattern, String regexPattern) {
		    return Pattern.compile(regexPattern)
		      .matcher(actualPattern)
		      .matches();
		}

}
