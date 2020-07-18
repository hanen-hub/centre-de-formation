package projetjava;

public class Formation  {
String nom_langue  ; 
String prix  ; 
String nom_de_prof ; 
String date  ; 
String nombre_de_heurs  ; 
int jour  ; 
int mois ;
int annee  ; 
public Formation(String nom_langue,String prof  ) {
	
this.nom_langue=nom_langue ;
this.nom_de_prof=prof ; 
this.date="**/**/**"  ;
this.nombre_de_heurs="on nest pas fixer le nombre de heure jusqu a maintenant " ;
}
public String getNom_langue() {
	return nom_langue;}
public void setNom_langue(String nom_longue) {
	this.nom_langue = nom_longue;}
public String getPrix() {
	return prix;}
public void setPrix(String prix) {
	this.prix = prix;}
public String getNom_de_prof() {
	return nom_de_prof;}
public void setNom_de_prof(String nom_de_prof) {
	this.nom_de_prof = nom_de_prof;}
public String getDate() {
	return date;}
public void setDate(String date) {
	this.date = date;}
public String getNombre_de_heurs() {
	return nombre_de_heurs;}
public void setNombre_de_heurs(String nombre_de_heurs) {
	this.nombre_de_heurs = nombre_de_heurs;
}




}
