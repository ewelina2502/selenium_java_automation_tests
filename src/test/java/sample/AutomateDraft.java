package sample;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AutomateDraft  extends SelectorsAndGenerators {

    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);
    }


}