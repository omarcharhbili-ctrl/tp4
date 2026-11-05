# Gestion_Bib – version refactorisée

Refactoring de `gestion_Bib_V2` (analyse CKJM) avec les mêmes fonctionnalités :
la sortie de `LibraryApp` est identique à celle de la version d'origine.

## Compilation et exécution (Java 8)

    javac -source 1.8 -target 1.8 -d bin src/library/app/*.java src/library/model/*.java src/library/service/*.java
    java -cp bin library.app.LibraryApp

## Modifications
- `Book` : ne contient plus `complexMethodExample` ; méthode privée `changeState` factorisant `borrow`/`returnItem`.
- `Lendable` : ajout de `isBorrowed()` et `getDescription()`.
- `Library` : plus de `instanceof`/cast ; `getAvailableItems()` ne retourne que les items non empruntés ; `listAllItems()` retourne les descriptions.
- `Customer` : `Set` à la place de `List`.
- `app/ParityReport` (nouvelle) : ancienne `complexMethodExample`, décomposée.

Mesures CKJM : `metrics/metrics_avant.txt` et `metrics/metrics_apres.txt`. Compte-rendu : `docs/`.
