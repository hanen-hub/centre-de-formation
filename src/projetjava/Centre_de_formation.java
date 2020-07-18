package projetjava;

public class Centre_de_formation {
	String nom_de_centre  ; 
	String lieu ; 
	String nom_de_directeur  ; 
	String site_web_de_centre  ; 
	String num_de_télé ; 
	public Centre_de_formation(String nom_de_centre, String nom_de_directeur  ,String site_web_de_centre , String num_de_télé ){
		this.nom_de_centre=nom_de_centre ;
		this.nom_de_directeur=nom_de_directeur ; 
		this.site_web_de_centre=site_web_de_centre ;
		this.num_de_télé=num_de_télé ;
		
	}
	public String getNom_de_centre() {
		return this.nom_de_centre;}
	
	public void setNom_de_centre(String nom_de_centre) {
		this.nom_de_centre = nom_de_centre;}
	public String getLieu() {
		return lieu;}
	public void setLieu(String lieu) {
		this.lieu = lieu;}
	public String getNom_de_directeur() {
		return nom_de_directeur;}
	public void setNom_de_directeur(String nom_de_directeur) {
		this.nom_de_directeur = nom_de_directeur;}
	public String getSite_web_de_centre() {
		return site_web_de_centre;}
	public void setSite_web_de_centre(String site_web_de_centre) {
		this.site_web_de_centre = site_web_de_centre;}
	public String getNum_de_télé() {
		return num_de_télé;}
	public void setNum_de_télé(String num_de_télé) {
		this.num_de_télé = num_de_télé;
	}
	
	
	}
	
	


