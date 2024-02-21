package Es1;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Carlo");
        info.setCognome("Olivieri");
        info.setDataDiNascita(new GregorianCalendar(2000, GregorianCalendar.APRIL, 18).getTime());

        DataSourceAdapter dsAdapter = new DataSourceAdapter(info);

        UserData userData = new UserData();
        userData.getData(dsAdapter);

        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
    }
}
