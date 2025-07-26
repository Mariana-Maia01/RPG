public class Personagem {

        private String nome;
        private String classe;

        public Personagem() {
            this.nome = "";
            this.classe = "";
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getClasse() {
            return classe;
        }

        public void setClasse(String classe) {
            this.classe = classe;
        }

        public void mostrarFicha() {
            System.out.println("===Ficha===");
            System.out.println("Nome: " + nome);
            System.out.println("Classe: " + classe);
        }
}


