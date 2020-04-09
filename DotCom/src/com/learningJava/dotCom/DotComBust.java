package com.learningJava.dotCom;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;
    public void setUpGame() {
        DotCom a = new DotCom(), b = new DotCom(), c = new DotCom();
        a.setName("Ask.com");
        b.setName("Google.com");
        c.setName("Amazon.com");
        dotComList.add(a);
        dotComList.add(b);
        dotComList.add(c);
        System.out.println("AAA");
        for(DotCom dotComToSet: dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(dotComList.size());
            dotComToSet.setLocationCells(newLocation);
        }
    }
    public void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess  = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest: dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) break;
            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    public void finishGame(){
        System.out.println("asdf");
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
