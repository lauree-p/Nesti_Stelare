# Nesti_Stelare

![Logo_Nesti_Stelare](https://github.com/lauree-p/Nesti_Stelare/blob/main/img/Nesti_Stelare-logo.png)

## Conception

## Dictionnaire de données

### Acteurs :

- Admin/Administrateur : Personne qui gère l'application, le stock, Mais n'a pas accès à la gestion des rôles d'administration.

- SuperAdmin : A les même droit qu'un admin et à accès a la gestion des administrateurs.

### Spécificités :

- Article : Produit à vendre, un ustensile de cuisine ou un ingredient (banane, oeuf etc).
- Fournisseur : Personne qui vend l'article en question, est rentré dans la base de données par un admin, n'a pas accés au logiciel.
- Stock : Liste le nombre d'articles disponibles (ou non).
(-onglet alerte : un onglet dans lequel il y a la liste de tous les articles "en deficit")

## Liste des concepts trouvés et matrice de dépendance fonctionnelle

![Use Case](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/Liste_des_concepts_trouves_et_matrice_de_dependance_fonctionnelle.png)

## Use Case

![Use Case](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/UseCaseV3.png)

### Documentation Use Case

- Manage Admin : permet d'ajouter, de mettre à jour ou de supprimer les administrateurs.
- Manage Supplier : permet d'ajouter, de mettre à jour ou de supprimer les fournisseurs.
- Manage Article :  permet d'ajouter, de mettre à jour ou de supprimer les articles.
- Manage on Order : permet d'ajouter, de mettre à jour ou de supprimer les commandes.
- Connect : permet une connexion et une déconnexion.
- Administrator : Cest lui qui joue sur l'application, c'est à dire qu'il rentre des données et modifie les valeurs. Il peut tout gérer sauf la liste des administrateurs.
- Super Admin : Il a les mêmes fonctionnalités que l' « Administrator » sauf qu'il peut aussi gérer la liste des adminstrateurs.

## Diagramme de classe

## MCD

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/MVCV3.png)

## Maquette

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/maquette_articles.png)

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/maquette_stock.png)

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/maquette_fournisseurs.png)

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/maquette_mon_compte.png)

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/maquette_mon_compte_modifier.png)

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/maquette_gestion_administrateurs.png)

## Outils

### Répartition des taches

Utilisation de Trello

Trello : https://trello.com/b/Ixz1jhAb/nestistelare

#### Diagramme de GANTT

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/Diagramme_de_GANTT.png)

### Logiciels utilisés

- StarUML (https://staruml.io/)
- Looping (https://www.looping-mcd.fr/)
- SmartSheet (https://fr.smartsheet.com/)

 2021©Nesti_Stelare Réalisé par Stéphane, Laurélenne et Rémi

