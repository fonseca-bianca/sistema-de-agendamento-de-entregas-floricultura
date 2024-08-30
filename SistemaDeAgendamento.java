import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaDeAgendamento {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Agendamento de Entregas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Layout da interface
        frame.setLayout(new GridLayout(7, 2));

        // Componentes da interface
        JLabel lojaLabel = new JLabel("Selecione a Loja:");
        JComboBox<String> lojaComboBox = new JComboBox<>(new String[]{"Loja 1", "Loja 2", "Loja 3"});

        JLabel enderecoLabel = new JLabel("Endereço de Entrega:");
        JTextField enderecoField = new JTextField();

        JLabel bairroLabel = new JLabel("Bairro:");
        JTextField bairroField = new JTextField();

        JLabel dataHoraLabel = new JLabel("Data e Hora (dd/MM/yyyy HH:mm):");
        JTextField dataHoraField = new JTextField();

        JButton agendarButton = new JButton("Agendar Entrega");
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        // Adicionando os componentes à interface
        frame.add(lojaLabel);
        frame.add(lojaComboBox);
        frame.add(enderecoLabel);
        frame.add(enderecoField);
        frame.add(bairroLabel);
        frame.add(bairroField);
        frame.add(dataHoraLabel);
        frame.add(dataHoraField);
        frame.add(new JLabel()); // Placeholder para alinhamento
        frame.add(agendarButton);
        frame.add(new JLabel("Entregas Agendadas:"));
        frame.add(new JScrollPane(resultadoArea));

        // Configuração do agendamento
        Agendamento agendamento = new Agendamento();

        agendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String lojaSelecionada = (String) lojaComboBox.getSelectedItem();
                    String endereco = enderecoField.getText();
                    String bairro = bairroField.getText();
                    LocalDateTime dataHora = LocalDateTime.parse(dataHoraField.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

                    Entrega entrega = new Entrega(endereco, bairro, dataHora);

                    agendamento.agendarEntrega(entrega);

                    resultadoArea.append("Loja: " + lojaSelecionada + ", Endereço: " + endereco + ", Bairro: " + bairro + ", Data/Hora: " + dataHora + ", Taxa: R$" + entrega.getTaxa() + "\n");

                } catch (AgendamentoException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Erro de Agendamento", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Formato de data/hora inválido. Use dd/MM/yyyy HH:mm", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}