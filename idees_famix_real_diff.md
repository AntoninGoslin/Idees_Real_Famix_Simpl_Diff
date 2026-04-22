# Présentation du contexte

Dans le cadre d'un stage à l'INRIA, j'ai integré l'équipe EVREF afin de travailler sur un outil nommé Famix-Simpl-Diff qui permet de comparer deux modèles de code.

Pour le moment cet outil renvoie uniquement un boolean pour savoir si les deux modèles passés en paramètres sont identiques. 

On ne peut pas vraiment voir les différences qui existe entre les modèles.

## Liste des idées

### Remplacer les fails par du vrai comportement
Pour le moment Famix-Simpl-Diff ne parcours pas réelement tout le modèle en cas d'echec. Il va parcourir le modèle et dès qu'il trouve une différence, il appelle fail afin d'arreter l'execution de la recherche de différence.

La première idée ici serait donc de remplacer au maximum les fails par du vrai comportement pour pouvoir afficher les différences. On continue l'exploration des modèles, quand on a une différence, on la recupère, on la stocke dans une liste de différence et on renvoie la liste de différence à la fin.

recap:
- Parcourir les modèles
- Si différence -> recuperer + stocker dans une liste
- A la fin du parcours des modèles, on renvoie la liste des différences

### Différencier la localisation de la différence 

Pour se baser sur ce que fait git diff, il prend un code 1 et un code 2, et il renvoie les lignes qui ont changés. Donc les ajouts et les retraits.

Pour faire ça, il doit y avoir deux listes de différences, un liste qui vient de 1 et un liste qui vient de deux. Il faudra voir comment localiser la différence.

## Liste des taches à faire

TODO