package org.example;

import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReadCSVForPerf {

//    @Test
//    public void modifiedCSV() throws IOException {

//        BufferedReader br=null;
//        BufferedWriter bw=null;
//        final String lineSep=System.getProperty("line.separator");
//
//        try {
//            File file = new File("/Users/chathurajayasinghe/Documents/Brakes/PSV/Peak3/2nd/jmeter/hybrissearch.csv");
//            File file2 = new File("/Users/chathurajayasinghe/Documents/Brakes/PSV/Peak3/2nd/jmeter/OrderDetailsQuickAdd_Peak3.csv");//so the
//            //names don't conflict or just use different folders
//
//            br = new BufferedReader(new InputStreamReader(new FileInputStream(file))) ;
//            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
//            String line = null;
//            int i=0;
//            for ( line = br.readLine(); line != null; line = br.readLine(),i++)
//            {
//               String aa =  br.readLine().toString();
//                String[] namesList = aa.split(",");
//                String addedColumn = namesList[0];
//                long data = Long.parseLong(addedColumn);
//                //int data=Integer.parseInt(addedColumn);
//                long newdata = (long) (((data + (5.5 * 3600000)) / 86400000) + 25569);
//
//                String  = Long.toString(newdata);
//
//
//                Date date = new Date(1481086800000); //replace the long value with timeStamp you captured.
//                DateFormat formatter = new SimpleDateFormat("MM/dd/YYYY HH:mm");
//
//                TimeZone tzInAmerica = TimeZone.getTimeZone("America/Anchorage");
//                formatter.setTimeZone(tzInAmerica);
//                String dateFormatted = formatter.format(date);
//                vars.put("newDate", dateFormatted); //access new value using ${newDate}, in your script.
//                log.info(dateFormatted);
//
//                bw.write(line+addedColumn+lineSep);
//            }
//
//        }catch(Exception e){
//            System.out.println(e);
//        }finally  {
//            if(br!=null)
//                br.close();
//            if(bw!=null)
//                bw.close();
//        }
//    }
}
