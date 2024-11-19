package test1;

public class Client {

    private String nameClient;
    private String nameId;
    private String month;

    public Client() {
    }

    public Client(String nameClient, String nameId, String month) {
        this.nameClient = nameClient;
        this.nameId = nameId;
        this.month = month;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String setMonthNumber(String number) {
        int monthNumber = Integer.parseInt(number);
        String mes = "";
        switch (monthNumber) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Feb";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "May";
                break;
            case 6:
                mes = "Jun";
                break;
            case 7:
                mes = "Jul";
                break;
            case 8:
                mes = "Agost";
                break;
            case 9:
                mes = "Sept";
                break;
            case 10:
                mes = "Oct";
                break;
            case 11:
                mes = "Nov";
                break;
            case 12:
                mes = "Dic";
                break;
            default:
                mes = "N-A";
                break;
        }
        return mes;

    }

}
