import java.time.LocalDateTime;

public class Entrega implements AgendamentoInterface {
    private String endereco;
    private String bairro;
    private double taxa;
    private LocalDateTime dataHora;

    // nome da rua, numero do bairro e data e hora da entrega
    public Entrega(String endereco, String bairro, LocalDateTime dataHora) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.dataHora = dataHora;
        this.taxa = calcularTaxa(bairro);
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public double getTaxa() {
        return taxa;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public void agendar(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    private double calcularTaxa(String bairro) {
        switch (bairro) {
            case "1":
                return 24.0;
            case "2":
                return 15.0;
            case "3":
                return 18.0;
            default:
                return 0.0; // taxa zero quando o número do bairro não constar na lista
        }
    }
}