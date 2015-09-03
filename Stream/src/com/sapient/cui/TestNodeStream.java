/**
 * 
 */
package com.sapient.cui;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author spra26
 * 
 */
public class TestNodeStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader input = new FileReader(args[0]);
			try {
				FileWriter output = new FileWriter(args[1]);
				try {
					char[] buffer = new char[128];
					int charsRead;

					// read the first buffer
					charsRead = input.read(buffer);
					while (charsRead != -1) {
						// write buffer to the output file
						output.write(buffer, 0, charsRead);

						// read the next buffer
						charsRead = input.read(buffer);
					}

				} finally {
					output.close();
				}
			} finally {
				input.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
