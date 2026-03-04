public class Curso extends Conteudo{

    private int CargaH;

    @Override
    public double calcularXp() {
        return XP_PADRAO * CargaH;
    }

    public void setCargaHoraria(int i) {
        this.CargaH = i;
    }
}
