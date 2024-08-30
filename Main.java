import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Loja 1");
        Agendamento agendamento = new Agendamento();

        // algumas entregas com bairro e data e hora
        Entrega entrega1 = new Entrega("Rua A, Alphaville", "Bairro 1", LocalDateTime.of(2024, 9, 1, 10, 0));
        Entrega entrega2 = new Entrega("Avenida B, Barnabé", "Bairro 2", LocalDateTime.of(2024, 9, 1, 11, 0));
        Entrega entrega3 = new Entrega("Rua C, Alphaville", "Bairro 1", LocalDateTime.of(2024, 9, 1, 10, 0));

        try {
            agendamento.agendarEntrega(entrega1);
            agendamento.agendarEntrega(entrega2);
            // Tentando agendar uma entrega para os mesmos dia e horário. Irá gerar uma Exceção
            agendamento.agendarEntrega(entrega3);
        } catch (AgendamentoException e) {
            System.out.println(e.getMessage());
        }

        loja1.adicionarEntrega(entrega1);
        loja1.adicionarEntrega(entrega2);

        System.out.println("Entregas da " + loja1.getNome() + ":");
        for (Entrega e : loja1.getEntregas()) {
            System.out.println("Endereço: " + e.getEndereco() + ", Bairro: " + e.getBairro() + ", Data/Hora: " + e.getDataHora() + ", Taxa: R$" + e.getTaxa());
        }
    }
}