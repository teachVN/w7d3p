package Es1;

import java.util.Date;
import java.util.GregorianCalendar;

public class DataSourceAdapter implements DataSource{
    private Info info;

    public DataSourceAdapter(Info info) {
        this.info = info;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome()+" "+info.getCognome();
    }

    @Override
    public int getEta() {
        Date dateNow = new Date();
        Date dataDiNascita = info.getDataDiNascita();

        System.out.println(dateNow);
        System.out.println(dataDiNascita);

//        GregorianCalendar gcDataNascita = new GregorianCalendar();
//        gcDataNascita.setTime(dataDiNascita);
//
//        GregorianCalendar gcDateNow = new GregorianCalendar();
//        gcDateNow.setTime(dateNow);

        long diffMs = dateNow.getTime()-dataDiNascita.getTime();
        long diffdays = (diffMs/(24*60*60*1000));

        return (int)(diffdays/365);

    }


}
