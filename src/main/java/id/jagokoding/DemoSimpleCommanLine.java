package id.jagokoding;

import java.util.Arrays;

import org.springframework.core.env.SimpleCommandLinePropertySource;

public class DemoSimpleCommanLine {

	public static void main(String[] args) {
		SimpleCommandLinePropertySource ps = new SimpleCommandLinePropertySource(args);
		Arrays.stream(ps.getPropertyNames()).forEach(s -> System.out.printf("%s => %s%n", s, ps.getProperty(s)));
	}
}