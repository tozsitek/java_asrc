package dietel_ch6_methods;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatSamples {
  public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.YYYY");
    Date date = new Date();
    System.out.println(formatter.format(date));

/*
    Calendar date1 = Calendar.getInstance();
    date1.setTime(new Date());
    Format f = new SimpleDateFormat("MM.dd.YYYY");
    System.out.println(f.format(date1.getTime()));
    date1.add(Calendar.YEAR,1);
    System.out.println(f.format(date1.getTime()));
  */
    Calendar date1 = Calendar.getInstance();
    date1.setTime(new Date());
    Format f = new SimpleDateFormat("MM.dd.YYYY");
    //System.out.println(f.format(date.getTime()));
    date1.add(Calendar.DAY_OF_MONTH, -1);
    //System.out.println(f.format(date.getTime()));
    //return f.format(date1.getTime());
    System.out.println(f.format(date1.getTime()));

    String dayToPick = "Yesterday";

    dayToPick = dayToPick.toLowerCase();
    if (dayToPick == "yesterday") {
      //dayToPick = complrev.getYesterdaysDate();
      System.out.println("yesterday");
    } else if (dayToPick == "tomorrow") {
      //dayToPick = complrev.getTomorrowsDate();
      System.out.println("tomorrow");
    } else {
      //dayToPick = complrev.getTodaysDate();
      System.out.println("today");
    }
    //logger.info("Selected date is: " + dayToPick);
    //seleniumUtils.sendInputText(complrev.getElementsOnCompReviewNewModal(textArea), dayToPick);


  }

}
