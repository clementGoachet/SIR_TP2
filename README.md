# SIR_TP2

## JPA

### Présentation
Ce projet a pour but de générer une base de donnée a partir de classe java. On pourra aussi rajouter des données dans cette base de donnée via la création d'objet JAVA.

### Utilisation
Il suffit de lancer le serveur :

 run-hsqldb-server.bat
 
 puis 
 show-hsqldb.bat
 
Une fois le serveur de base de donnée lancé, vous pouvez lancez le programme java qui va créer à partir d'objet JAVA des entités dans la base de donnée.

### Description des fichiers

  Pour pouvoir créer une entité dans la base de donnée, il faut créer la classe correspondante et lui attribué l'annotation @Entity.
  On lui définit certains attributs avec ces assesseurs.
  On peut créer des clés étrangeres en mappant deux objets avec le code suivant.
  
  @OneToMany(mappedBy = "home", cascade = CascadeType.PERSIST)
	public List<Device> getHeaters() {
		return heaters;
	}
	
	Sur cette attribut on définit une liste d'objets. Ici pour "home" on définit plusieurs "heaters".
	
## Servlet

Cette partie du projet n'est pas encore abouti...

###### Projet réalisé par Clément Goachet et Paul Chemin
