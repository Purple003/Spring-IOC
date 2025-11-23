# TP 2 : Spring - Inversion de Contrôle et Injection de Dépendances

## Objectif
Ce TP a pour objectif de créer une application Java utilisant **Spring** pour mettre en œuvre :
- L'Inversion de Contrôle (IoC)
- L'Injection de Dépendances (DI) via annotations et configuration XML

Nous allons définir des interfaces DAO et métier, créer des implémentations, et gérer leur injection dans la couche métier.

---

## Structure du projet
```
springdi/
├─ src/main/java/
│ ├─ dao/
│ │ ├─ IDao.java
│ │ ├─ DaoImpl.java
│ │ └─ DaoImpl2.java
│ ├─ metier/
│ │ ├─ IMetier.java
│ │ └─ MetierImpl.java
│ └─ presentation/
│ ├─ Presentation2.java
│ └─ PresentationXML.java
├─ src/main/resources/
│ └─ applicationContext.xml
└─ pom.xml
```

---

## Packages et classes

### DAO
- **IDao** : interface avec `double getValue()`.
- **DaoImpl** : implémentation renvoyant 100.0.
- **DaoImpl2** : implémentation alternative renvoyant 150.0.

### Métier
- **IMetier** : interface avec `double calcul()`.
- **MetierImpl** : implémentation qui double la valeur renvoyée par l’IDao injecté.

### Présentation
- **Presentation2** : configuration Spring basée sur annotations.
- **PresentationXML** : configuration Spring via fichier XML.

---

## Fonctionnement

- L’annotation `@Component` déclare les classes comme beans Spring.
- `@Autowired` injecte automatiquement une implémentation compatible.
- `@Qualifier("dao2")` permet de choisir une implémentation spécifique.
- La couche métier utilise la DAO injectée pour effectuer le calcul.
- La configuration XML et les profils Spring (`@Profile`) offrent une alternative flexible.

---

## Exécution

1. Compiler et résoudre les dépendances avec Maven :
```bash
mvn clean install
```
2. Exécuter la classe Presentation2 (annotations) :
<img width="624" height="346" alt="Screenshot 2025-11-23 225809" src="https://github.com/user-attachments/assets/310261a8-f10e-479e-b56e-51c8259fd94e" />


3. Exécuter la classe PresentationXML (XML) :
<img width="660" height="288" alt="Screenshot 2025-11-23 225841" src="https://github.com/user-attachments/assets/f39dc737-92c0-4d3b-8b37-3b774235cdb7" />



