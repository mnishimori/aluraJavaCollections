package br.com.alura;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private Integer tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getTempo() {
        return tempo;
    }
    
    public String toString() {
    	return "Aula: " + this.titulo + " tempo: " + this.tempo;
    }

	@Override
	public int compareTo(Aula aulaComparar) {
		return this.titulo.compareTo(aulaComparar.getTitulo());
	}
}