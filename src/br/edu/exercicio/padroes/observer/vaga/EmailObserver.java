package br.edu.exercicio.padroes.observer.vaga;

public class EmailObserver implements VagaObserver{
    private Vaga vaga;
    @Override
    public void update(Vaga vaga) {
        this.vaga = vaga;
    }

    private void sendMail() {
        System.out.println("enviando email..." + vaga.getDescricaoVaga());
    }
}
