package org.example;

import org.junit.Test;

import java.io.File;

public class renam {

    @Test
    public void rename()
    {
        // Path of folder where files are located
        String folder_path =
                "E:\\New folder\\New folder (10)";

        // creating new folder
        File myfolder = new File(folder_path);

        File[] file_array = myfolder.listFiles();
        for (int i = 0; i < file_array.length; i++)
        {

            if (file_array[i].isFile())
            {

                File myfile = new File(folder_path +
                        "\\" + file_array[i].getName());
                String long_file_name = file_array[i].getName();
                String[] tokens = long_file_name.split("\\s");
               // String new_file_name = tokens[1];
                System.out.println(i);
                System.out.print(i);

                // file name format: "Snapshot 11 (12-05-2017 11-57).png"
                // To Shorten it to "11.png", get the substring which
                // starts after the first space character in the long
                // _file_name.
                myfile.renameTo(new File(folder_path +
                        "\\" + i + ".mp4"));
            }
        }
    }
}
