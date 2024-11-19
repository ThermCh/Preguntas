package test1;

import javax.swing.JOptionPane;

public class Bill {

    private String codeBill;
    private float amountBill;
    private int amountElectric;
    private int amountVehicle;
    private int amountContruction;
    private Worker worker;
    private Client client;
    
    //Contructor

    public Bill(String codeBill, float amountBill, int amountElectric, int amountVehicle, int amountContruction, Worker worker, Client client) {
        this.codeBill = codeBill;
        this.amountBill = amountBill;
        this.amountElectric = amountElectric;
        this.amountVehicle = amountVehicle;
        this.amountContruction = amountContruction;
        this.worker = worker;
        this.client = client;
    }
    

//Additionals
    private int points;
    private float bonus;

    public float getBonus() {
        return bonus;
    }

    public int getPoints() {
        return points;
    }
    
    
    
    public float setBonus() {
        int counter = 0;
        float bonus = 0;
        if (amountElectric > 0 && amountVehicle > 0 && amountContruction > 0) {
            bonus += (float) (amountBill * 0.10);
            counter = 1;
            this.points += 3;

        }
        //Amount bonus Electronics
        if (amountElectric >= 3 && counter == 0) {
            bonus += (float) (amountBill * 0.04);
            this.points += 1;
        } else {
            bonus += (float) (amountBill * 0.02);
            this.points += 1;
        }

        //Amount bonus Construction
        if (amountContruction >= 1 && counter == 0) {
            bonus += (float) (amountBill * 0.08);
            this.points += 2;
        }

        //Amount bonus Vehicle
        if (amountVehicle >= 4 && counter == 0) {
            bonus += (float) (amountBill * 0.04);
        } else {
            bonus += (float) (amountBill * 0.02);
        }
        this.bonus = bonus;
        return bonus;
        

    }

    public String extraBonus(int amountBills) {
        String mensaje = "";
        if (amountBills >= 3 || this.amountBill > 50000) {
            this.bonus += 20000;
            mensaje = "Si logro el bono extra";
        } else {
            mensaje = "No logro el bono extra";
        }
        return mensaje;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void showInformation() {
        JOptionPane.showMessageDialog(null, "El nombre del trabajador es: " + worker.getWorkerName() + "\n El trabajador trabaja en: " + worker.getWorkerBranch() + "\n Y el codigo del trabajador es: "
                + worker.getWorkerCode() + "\nEl trabajador tiene una factura de: " + this.amountBill + "\n En comisiones gano: " + getBonus() + "\n Y tiene un total de puntos " + getPoints());

    }
}
