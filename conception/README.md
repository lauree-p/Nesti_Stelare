# Nesti_Stelare

![Logo_Nesti_Stelare](https://github.com/lauree-p/Nesti_Stelare/blob/main/img/Nesti_Stelare-logo.png)

## Conception

## Dictionnaire de données

# Acteurs :

  - Admin/Administrateur : Personne qui gère l'application, le stock, Mais n'a pas accès à la gestion des rôles d'administration.

  - SuperAdmin : A les même droit qu'un admin et à accès a la gestion des administrateurs.

# Spécificités :

  - Article : Produit à vendre, un ustensile de cuisine ou un ingredient (banane, oeuf etc).
  - Fournisseur : Personne qui vend l'article en question, est rentré dans la base de données par un admin, n'a pas accés au logiciel.
  - Stock : Liste le nombre d'articles disponibles (ou non).
  (-onglet alerte : un onglet dans lequel il y a la liste de tous les articles "en deficit")


## Use Case

# Use Case v1

![Use Case](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/UseCaseV2.png)

# Use Case v2

![Use Case](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/UseCaseV1.png)

# Documentation Use Case

- Manage Admin : permet d'ajouter, de mettre à jour ou de supprimer les administrateurs.
- Manage Supplier : permet d'ajouter, de mettre à jour ou de supprimer les fournisseurs.
- Manage Article :  permet d'ajouter, de mettre à jour ou de supprimer les articles.
- Place on Order : permet de passer une commande quand les stocks d'articles sont bas.
- Connect : permet une connexion et une déconnexion.
- Administrator : Cest lui qui joue sur l'application, c'est à dire qu'il rentre des données et modifie les valeurs. Il peut tout gérer sauf la liste des administrateurs.
- Super Admin : Il a les mêmes fonctionnalités que l' « Administrator » sauf qu'il peut aussi gérer la liste des adminstrateurs.

## Diagramme de classe

# Diagramme de classe v1

![Diagramme de classe](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/Class_diagramV2.png)

# Diagramme de classe v2

![Diagramme de classe](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/Class_diagramV1.png)

## MCD

# MCD v1

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/MVCV2.png)

# MCD v2

![MCD](https://github.com/lauree-p/Nesti_Stelare/blob/main/conception/img/MVCV1.png)

Trello : https://trello.com/b/Ixz1jhAb/nestistelare

Logiciels utilisés : 
- https://staruml.io/
- https://www.looping-mcd.fr/