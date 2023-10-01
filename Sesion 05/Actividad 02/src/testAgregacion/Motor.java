package testAgregacion;

public class Motor {
    private int numMotor;
    private int revolucionesPorMin;

    public Motor(int numMotor, int revolucionesPorMin) {
        this.numMotor = numMotor;
        this.revolucionesPorMin = revolucionesPorMin;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getRevolucionesPorMin() {
        return revolucionesPorMin;
    }

    public void setRevolucionesPorMin(int revolucionesPorMin) {
        this.revolucionesPorMin = revolucionesPorMin;
    }

    @Override
    public String toString() {
        return "Numero de Motor: " + numMotor + "\n" + "Las Revoluciones por Minuto: " + revolucionesPorMin;
    }
}
