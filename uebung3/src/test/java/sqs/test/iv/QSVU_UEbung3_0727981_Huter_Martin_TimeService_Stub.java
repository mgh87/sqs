package sqs.test.iv;

import sqs.test.iv.isolation.TimeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mgh on 12.12.15.
 */
public class QSVU_UEbung3_0727981_Huter_Martin_TimeService_Stub implements TimeService {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date getCurrentDate() {
        try {
            return sdf.parse("15/12/2015");
        } catch (ParseException e) {
            //Not Possible if Implemtation of sdf isnt changed
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Stubs cant use input Params
     * @param dateFrom
     * @param dateTo
     * @return
     */
    public long daysBetween(Date dateFrom, Date dateTo) {
        return 0L;
    }
}

