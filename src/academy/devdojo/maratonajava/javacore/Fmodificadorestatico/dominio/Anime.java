package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização NÃO estático 3");
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {

        for(int episodios: Anime.episodios) {
            System.out.println("Episódios: " + episodios);
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
