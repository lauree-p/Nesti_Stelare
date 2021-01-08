# Nesti_Stelare

![Logo_Nesti_Stelare](https://github.com/lauree-p/Nesti_Stelare/blob/main/img/Nesti_Stelare-logo.png)

## Gestion de stock en JAVA

Contexte :
L’entreprise Nesti souhaite gérer ses stocks via une application. 
Pour cela, L’entreprise Nesti vous propose de développer une application en JAVA accompagnée d’une base de données locale ( MySQL ) qui sera accessible uniquement par les administrateurs.

### Objectif :
Le but de cette application est de gérer les articles de type ustensile de cuisine, ainsi que les ingrédients nécessaires aux recettes.
L’outil doit être clair et intuitif.

### Connexion :
L’application sera accessible après une étape de connexion par un administrateur.

### Ingrédients :
L’application doit permettre de créer, modifier, supprimer et mettre à jour les informations des ingrédients.
A partir d’ingrédient, l’administrateur peut choisir de créer un article vendable.

Par exemple :
- un paquet de 1 kg de farine
Un ingrédient peut être vendu sous différents conditionnements.
Par exemple :
- une boite de 6 oeufs
- une boite de 12 oeufs

### Ustensiles :
L'administrateur peut aussi ajouter des articles de type ustensiles de cuisine, comme :
- cuillère en bois
- fouet
- manic

### Articles :
Les articles peuvent être de type ustensile ou de type ingrédient.
Les frais de livraison varient en fonction du poids de l’article.
Les articles seront achetés à différents fournisseurs. 
Il se peut qu’un nouveau fournisseur puisse nous vendre des articles. Il faut donc prévoir la possibilité d’ajouter un nouveau fournisseur avec les informations suivantes :
- Nom de l’entreprise et adresse
- Nom et prénom du contact, avec son numéro de téléphone
Les prix varient aussi en fonction du temps.

### Commande aux fournisseurs
Prévoir un affichage qui permet de saisir une entrée dans le stock d’un article.

Par exemple :
Achat de 100 articles ( 1kg de farine ) au fournisseur X.
Et ainsi le stock de cet article sera augmenté de 100 unités.
Un article peut être vendu par plusieurs fournisseurs. Le prix d’achat peut varier d’un fournisseur à l’autre.
Le prix d’achat permet de déterminer le prix de vente de l’article .
Le prix de vente est égal au prix d’achat le plus élevé, augmenté de 20%.

Par exemple :
L’article 1 est un paquet de 1kg de farine.
Le fournisseur A vend cet article 89 centimes
Le fournisseur B vend cet article 69 centimes

Le prix de vente est :
89 + ( 89 * 20 / 100 ) = 89 + 17.8 = 106,9

Après arrondis :
Le prix de vente de l’article 1 est de 107 centimes, soit 1 euros et 7 centimes.

### Livrables
- L2-1 Dossier de conception
- L2-2 Code source via un accès d’un repo public sur github ( par exemple )
- L2-3 Documentation sur le fonctionnement du code, des algorithmes, recherches techniques réalisées au cours du développement.
Cette documentation doit être illustrée par des captures d’écran et clairement expliquer le fonctionnement du code.
- L2-4 Script de la base de données
- L2-5 Rapport de réunion écrit et daté attestant des échanges réalisés entre les différents développeurs.
- L2-6 Manuel d’utilisation pour l’administrateur. Réunissant des captures d’écran de l’application commentée.
- L2-7 Démonstration de l’application présentant les différentes étapes de création. ( Visioconférences )

### Contraintes :
Utilisation de SWING, Java, Mysql
Pour des raisons pédagogiques : on ne tiendra pas compte de la TVA.

## Outils

### Répartition des taches

Utilisation de Trello

Trello : https://trello.com/b/Ixz1jhAb/nestistelare

### Logiciels utilisés

- StarUML (https://staruml.io/)
- Looping (https://www.looping-mcd.fr/)


 2021©Nesti_Stelare Réalisé par Stéphane, Laurélenne et Rémi
