package padroescriacao.builder;

import java.util.Date;

public class PacienteBuilder {

    private Paciente paciente;

    public PacienteBuilder() {
        paciente = new Paciente();
    }

    public Paciente build() {
        if (paciente.getProntuario() == 0) {
            throw new IllegalArgumentException("Prontuário inválido");
        }
        if (paciente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return paciente;
    }

    public PacienteBuilder setProntuario(int prontuario) {
        paciente.setProntuario(prontuario);
        return this;
    }

    public PacienteBuilder setNome(String nome) {
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder setDataNascimento(Date dataNascimento) {
        paciente.setDataNascimento(dataNascimento);
        return this;
    }

    public PacienteBuilder setCpf(String cpf) {
        paciente.setCpf(cpf);
        return this;
    }

    public PacienteBuilder setTipoSanguineo(String tipoSanguineo) {
        paciente.setTipoSanguineo(tipoSanguineo);
        return this;
    }

    public PacienteBuilder setConvenio(String convenio) {
        paciente.setConvenio(convenio);
        return this;
    }

    public PacienteBuilder setEmail(String email) {
        paciente.setEmail(email);
        return this;
    }

    public PacienteBuilder setCelular(String celular) {
        paciente.setCelular(celular);
        return this;
    }

    public PacienteBuilder setAlergias(String alergias) {
        paciente.setAlergias(alergias);
        return this;
    }
}
