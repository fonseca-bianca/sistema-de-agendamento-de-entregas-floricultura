import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private List<Entrega> entregasAgendadas;

    public Agendamento() {
        this.entregasAgendadas = new ArrayList<>();
    }

    public void agendarEntrega(Entrega entrega) throws AgendamentoException {
        for (Entrega e : entregasAgendadas) {
            if (e.getDataHora().equals(entrega.getDataHora())) {
                throw new AgendamentoException("Já existe uma entrega agendada para os mesmos dia e horário.");
            }
        }
        entregasAgendadas.add(entrega);
    }
}