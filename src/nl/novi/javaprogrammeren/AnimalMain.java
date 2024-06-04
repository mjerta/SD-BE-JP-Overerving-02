package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.*;

import javax.swing.*;

public class AnimalMain {
  /*
  Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

  Opdracht
  Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
  je nog niet te maken.

  Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
  herkomst op en de hoeveelheid kinderen.

  Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
  herkomst op. Ook willen we het aantal strepen weten.

  Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
  Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
  of het een binnen of buitenkat is.

  Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
  herkomst op. Ook willen we de naam van de roedel weten.

  Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
  de console dat deze 0.25 meter is verplaatst.

  Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

  Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

  Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

  Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

   */
  public static void main(String[] args) {
    var nameLion = "lion";
    var genderLion = "female";
    var ageLion = 12;
    var cageLion = "lion cage";
    var lastFedLion = "gisteren";
    var originLion = "Africa";
    var childrenAmountLion = 4;

    Lion lion = new Lion(nameLion, genderLion, ageLion, cageLion, lastFedLion, originLion, childrenAmountLion);
    lion.printPropertys();
    lion.moveAnimal();
    lion.sleepAnimal();
    lion.makeSound();
    lion.feedAnimal("steak");
    System.out.println();

    var nameTiger = "Tiger";
    var genderTiger = "female";
    var ageTiger = 12;
    var cageTiger = "tiger cage";
    var lastFedTiger = "gisteren";
    var originTiger = "Azië";
    var stripesAmount = 44;
    Tiger tiger = new Tiger(nameTiger, genderTiger, ageTiger, cageTiger, lastFedTiger, originTiger, stripesAmount);
    tiger.printPropertys();
    tiger.makeSound();
    System.out.println();

    var nameWolf = "Wolf";
    var genderWolf = "Male";
    var ageWolf = 7;
    var cageWolf = "Wolf cage";
    var lastFedWolf = "day before yesterday.";
    var originWolf = "Siberia";
    var roedelNamwe = "daddy wolf";
    Wolf wolf = new Wolf(nameWolf, genderWolf, ageWolf, cageWolf, lastFedWolf, originWolf, roedelNamwe);
    wolf.printPropertys();
    wolf.makeSound();
    System.out.println();

    var nameDog = "Doggie";
    var genderDog = "Female";
    var ageDog = 6;
    var petOwner = "Maarten";
    var favouriteFoodBrand = "Duck";
    var species = "Samoyed";

    Dog dog = new Dog(nameDog, genderDog, ageDog, petOwner, favouriteFoodBrand, species);
    dog.printPropertys();
    dog.makeSound();

    var nameCat = "Cat";
    var genderCat = "Male";
    var ageCat = 12;
    var petOwnerCat = "Pietje";
    var favouriteFoodBrandCat = "Nice";
    var speciesCat = "Syamees";
    var indoorCat = false;

    Cat cat = new Cat(nameCat, genderCat, ageCat, petOwnerCat, favouriteFoodBrandCat, speciesCat, indoorCat);
    cat.printPropertys();
    cat.makeSound();

  }

}
