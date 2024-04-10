package org.example;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class createURL {
    @Test
    public void  createURLs() throws IOException {
        String baseUrl = "https://server6.filedownloadlink.xyz/";
        String format = ".mp4";
        FileWriter writer2 = new FileWriter("I:\\ul\\b1.txt", true);
        for (int i = 188609; i <= 199999; i++) {
            String videoUrl = baseUrl + i + format;

            URL url = new URL(videoUrl);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

            try {
                int responseCode = huc.getResponseCode();


                System.out.println(i);
                if (responseCode == 200) {
                    // FileWriter writer2 = new FileWriter("I:\\cc.txt", true);
                    System.out.println("good" + i);
                    writer2.write(videoUrl + System.lineSeparator());
                    writer2.close();
                }
            }
            catch (Exception e)
            {
                System.out.println("error"+i);
            }



        }
    }

    @Test
    public  void testURL() throws IOException {

        String mp4URL = "https://download.filedownloadlink.xyz/desiporn4/1.mp4"; // Replace with your URL
        //String mp4URL = "https://www.example.com/example.mp4"; // Replace with your MP4 file URL

        String baseUrl = "https://download.filedownloadlink.xyz/desiporn4/";
        String format = ".mp4";
        FileWriter writer2 = new FileWriter("I:\\zz.txt", true);
        for (int i = 187034; i <= 188609; i++) {
            String videoUrl = baseUrl + i + format;

            URL url = new URL(videoUrl);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

            int responseCode = huc.getResponseCode();

            System.out.println(i);
            if (responseCode == 200) {
               // FileWriter writer2 = new FileWriter("I:\\cc.txt", true);
                System.out.println("good"+i);
                writer2.write(videoUrl + System.lineSeparator());
                writer2.close();
            }
        }

    }
    //15498

    @Test
    public void  createURLsThread() throws IOException {

        //String baseUrl = "https://server2.filedownloadlink.xyz/";

        //String baseUrl = "https://download.filedownloadlink.xyz/desiporn4/";

        //String baseUrl = "https://dphdd.filedownloadlink.xyz/";

        String baseUrl = "https://server6.filedownloadlink.xyz/";

        String format = ".mp4";

        FileWriter writer2 = new FileWriter("I:\\server6_4.txt", true);

        int startRange = 190113;//188911;
        int endRange = 190967;
        int threads = 8; // Number of threads for concurrent processing

        ExecutorService executor = Executors.newFixedThreadPool(threads);

        for (int i = startRange; i <= endRange; i++) {
            final int currentURL = i;
            executor.submit(() -> {
                try {
                    String videoUrl = baseUrl + currentURL + format;
                    URL url = new URL(videoUrl);
                    HttpURLConnection huc = (HttpURLConnection) url.openConnection();

                    huc.setConnectTimeout(5000); // Set connection timeout
                    huc.setReadTimeout(5000); // Set read timeout

                    int responseCode = huc.getResponseCode();

                    System.out.println(currentURL);
                    if (responseCode == 200) {
                        System.out.println("good " + currentURL);
                          if(foureightypURLCheckNew(videoUrl))
                        {

                        }
                        else {


                        synchronized (writer2) {
                            writer2.write(videoUrl + System.lineSeparator());
                        }

                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }
        writer2.close();
    }

    public boolean foureightypURLCheckNew(String line) throws IOException {
        String outputFilePath = "I:\\server6_4_480.txt";  // Re
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath,true));


                // Modify the URL
                String modifiedUrl = line.replace(".mp4", "_480p.mp4");

                // Check the HTTP status code
                if(isUrlReturning200(modifiedUrl)) {
                    writer.write(modifiedUrl);
                    writer.newLine();
                    writer.close();

                    return true;

                }


        return false;
    }

    @Test
    public void foureightypURLCheck()


        {
            String inputFilePath = "I:\\server6_3.txt";  // Replace 'input.txt' with the actual path to your input text file
            String outputFilePath = "I:\\server6_3_480.txt";  // Replace 'output.txt' with the desired output file path

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    // Modify the URL
                    String modifiedUrl = line.replace(".mp4", "_480p.mp4");

                    // Check the HTTP status code
                    if (isUrlReturning200(modifiedUrl)) {
                        writer.write(modifiedUrl);
                        writer.newLine();
                    }
                }
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        private static boolean isUrlReturning200(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            int statusCode = connection.getResponseCode();
            return statusCode == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            // Handle any exception that may occur during the HTTP connection
            return false;
        }
    }

    @Test
    public  void compareAndDelete() {

        String file1Path = "I:\\server6_2.txt";
        String file2Path = "I:\\server6_2_480.txt";
        try {
            // Read lines from both files
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));

            HashSet<String> linesInFile2 = new HashSet<>();

            // Store lines from file2 in a HashSet
            String line;
            while ((line = reader2.readLine()) != null) {
                linesInFile2.add(line);
            }

            reader2.close();

            // Rewrite file1, skipping lines found in file2
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1Path));
            while ((line = reader1.readLine()) != null) {
                if (!linesInFile2.contains(line)) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader1.close();
            writer.close();

            System.out.println("Comparison and deletion completed successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }


}

//180574