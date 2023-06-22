package it.pegaso2000.FastFoodApi.dto;

public class PiattoDto {

	private int piattoid;
	private String nomePiatto;
	private boolean is_vegano;
	private int costo;
	
	
	
	public int getPiattoid() {
		return piattoid;
	}
	public void setPiattoid(int piattoid) {
		this.piattoid = piattoid;
	}
	public String getNomePiatto() {
		return nomePiatto;
	}
	public void setNomePiatto(String nomePiatto) {
		this.nomePiatto = nomePiatto;
	}
	public boolean isIs_vegano() {
		return is_vegano;
	}
	public void setIs_vegano(boolean is_vegano) {
		this.is_vegano = is_vegano;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
