package sqs.test.iv;

import sqs.test.iv.isolation.TimeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by mgh on 12.12.15.
 */
public class QSVU_UEbung3_0727981_Huter_Martin_TimeService_Mock implements TimeService {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Date getCurrentDate() {
        Calendar now = new GregorianCalendar();
        now.setTime(new Date());
        now.set(Calendar.MONTH, Calendar.DECEMBER);
        now.set(Calendar.DAY_OF_MONTH, 15);
        return now.getTime();
    }

    public long daysBetween(Date dateFrom, Date dateTo) {
        Calendar christmas = new GregorianCalendar();
        christmas.setTime(new Date());
        christmas.set(Calendar.MONTH, Calendar.DECEMBER);
        christmas.set(Calendar.DAY_OF_MONTH, 24);
        Date dateToExpected = christmas.getTime();
        Calendar now = new GregorianCalendar();
        now.setTime(new Date());
        now.set(Calendar.MONTH, Calendar.DECEMBER);
        now.set(Calendar.DAY_OF_MONTH, 15);
        Date dateFromExpected = now.getTime();

        if(dateFrom.equals(dateFromExpected) && dateTo.equals(dateToExpected)){
            return 9;
        }
        return 0;
    }
}
