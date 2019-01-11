package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment3 {

    public static void main(String args[]) {

        int noOfPings = 10;
        while(true) {
            // Pattern to extract time out of ping system call's ouput
            Pattern pattern = Pattern.compile("(time=)(\\d+\\.?\\d*)");
            Double[] pingTimes = new Double[noOfPings];

            try{
                Scanner sc = new Scanner(System.in);

                // Ask the user for a URL
                System.out.print("Enter a URL(like www.mywebsite.com): ");
                String urlString = sc.next();

                // Notify user about pinging
                System.out.println("Pinging " + urlString + "...");

                // Run the ping process and get the input stream of that process
                Process process = Runtime.getRuntime().exec("ping -c " + noOfPings + " " + urlString);
                BufferedReader pingResult = new BufferedReader(new InputStreamReader(process.getInputStream()));

                // Omitting the initial info given by ping system call
                pingResult.readLine();

                String line;
                for(int i=0; i<noOfPings; i++) {
                    line = pingResult.readLine();
                    // Create a matcher that matches the given input against the pattern
                    Matcher matcher = pattern.matcher(line);
                    //System.out.println(line);
                    if (matcher.find()) {
                        //System.out.println(matcher.group(2));
                        pingTimes[i] = Double.parseDouble(matcher.group(2));
                    }
                }

                Thread.sleep(1000);
                Arrays.sort(pingTimes);

                if ((noOfPings%2) == 0) {
                   Double median = (pingTimes[noOfPings/2 - 1] + pingTimes[noOfPings/2]) / 2;
                    System.out.println("Median Time: " + median + " milliseconds.");
                }
                else {
                    System.out.println("Median Time: " + pingTimes[noOfPings/2 + 1] + " milliseconds.");
                }
            }
            catch(IOException e) {
                System.out.println("Failed\nIO error.");
            }
            catch(NullPointerException e) {
                System.out.println("Failed to ping. Please check the destination entered.");
            }
            catch(Exception e) {
                System.out.println(e.getClass() + e.getMessage());
            }
        }
    }
}
