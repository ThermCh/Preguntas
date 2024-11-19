package test1;

public class Worker {

    private String workerName;
    private String workerId;
    private String workerBranch;
    private String workerCode;
    private String vehicle;

    public Worker() {
    }
    
    public Worker(String workerName, String workerId, String workerBranch, String workerCode, String vehicle) {
        this.workerName = workerName;
        this.workerId = workerId;
        this.workerBranch = workerBranch;
        this.workerCode = workerCode;
        this.vehicle = vehicle;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerBranch() {
        return workerBranch;
    }

    public void setWorkerBranch(String workerBranch) {
        this.workerBranch = workerBranch;
    }

    public String getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        if (vehicle.equals(1)) {
            this.vehicle = "Si tiene carro";
        } else {
            this.vehicle = "no tiene carro";
        }
    }

    public String setvehicle(int confirm) {
        String mensaje = "";
        if (confirm == 1) {
            mensaje = "Si tiene carro";

        } else {
            mensaje = "No tiene carro";
        }

        return mensaje;
    }
}
