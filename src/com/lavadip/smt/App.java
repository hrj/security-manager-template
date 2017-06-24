package com.lavadip.smt;

import java.io.FileWriter;
import java.io.IOException;
import java.security.Policy;

public class App {

	public static void main(String[] args) throws IOException {
		Policy.setPolicy(new LocalSecurityPolicy());
		System.setSecurityManager(new SecurityManager());

		System.out.println("Security manager installed.");

		System.out.println("The following file access should fail with a security exception.");
		final FileWriter writer = new FileWriter("test-file-removeme.out");
		writer.write("dummy text");
		writer.close();
	}

}
