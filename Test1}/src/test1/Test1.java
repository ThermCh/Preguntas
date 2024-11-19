package test1;

import javax.swing.JOptionPane;


public class Test1 {
    
    public static void main(String[] args) {
        //Worker worker= new Worker("Juan", "1234", "Heredia", "ABCDE", "1");
        Client client = new Client("Juan", "aimdiwoas", "5");
        Bill bill1 = new Bill("ABCD", 300000, 2, 2, 2, worker, client);
        
        
        Worker worker = new Worker(workerName, workerId, workerBranch, workerCode, vehicle);
        String workerName= JOptionPane.showInputDialog("Cual es el nombre del trabajador");
        String workerId= JOptionPane.showInputDialog("Cual es el id del trabajador");
     
        bill1.showInformation();
        JOptionPane.showMessageDialog(null, bill1.extraBonus(3));
    }
    
}
