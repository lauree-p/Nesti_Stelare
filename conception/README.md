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

![Matrice](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/functional_dependency_matrix_and_concepts_found.png)

## Convention de Nommage :

### Diagramme de classe : 

- Nous avons utilisé le "CamelCase" dans le diagramme de classe.
- Langage en Anglais.

### MCD :

- Nous avons utilisé le "Snake_Case" dans le MCD.
- Le nom des entités sont en majuscules.
- Le nom des associations sont en minuscules.
- Langage en Anglais.

### UseCase : 

- Nous avons utilisé le "CamelCase" dans l'UseCase.
- Langage en Anglais.

## Use Case

![Use Case](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/use_case.png)

### Documentation Use Case

- Manage Admin : permet d'ajouter, de mettre à jour ou de supprimer les administrateurs.
- Manage Supplier : permet d'ajouter, de mettre à jour ou de supprimer les fournisseurs.
- Manage Article :  permet d'ajouter, de mettre à jour ou de supprimer les articles.
- Manage on Order : permet d'ajouter, de mettre à jour ou de supprimer les commandes.
- Connect : permet une connexion et une déconnexion.
- Administrator : Cest lui qui joue sur l'application, c'est à dire qu'il rentre des données et modifie les valeurs. Il peut tout gérer sauf la liste des administrateurs.
- Super Admin : Il a les mêmes fonctionnalités que l' « Administrator » sauf qu'il peut aussi gérer la liste des adminstrateurs.

## Diagramme de classe

![Diagramme de classe](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/class_diagram.png)

## MCD

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/mcd.png)

## MLD

![MLD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/mld.png)

## Maquette

![Maquette](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/mockup.png)

## Outils

### Répartition des taches

Utilisation de Trello

Trello : https://trello.com/b/Ixz1jhAb/nestistelare

#### Diagramme de GANTT

![GANTT](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/gantt_diagram.png)

### Logiciels utilisés

- StarUML (https://staruml.io/)
- Looping (https://www.looping-mcd.fr/)
- SmartSheet (https://fr.smartsheet.com/)

 2021©Nesti_Stelare Réalisé par Stéphane, Laurélenne et Rémi

