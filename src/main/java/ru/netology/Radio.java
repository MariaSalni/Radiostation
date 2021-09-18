package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int amountStation = 10;
    private int minNumber = 0;
    private int maxNumber = 9;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    // конструктор на переключение радиостанций и звука


    public Radio(int currentRadioStation, int amountStation, int minNumber, int maxNumber, int soundVolume, int minVolume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.amountStation = amountStation;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.soundVolume = soundVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }



// создаем конструктор без параметров

    public Radio () {

    }



    public void setCurrentRadioStation(int newCurrentRadioStation) {

        currentRadioStation = newCurrentRadioStation;
        if (currentRadioStation > maxNumber) {
            return;
        }
        if (currentRadioStation < minNumber) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setAmountStation(int newAmountStation) {

        amountStation = newAmountStation;
        if (amountStation > 10) {
            return;
        }
        if (amountStation < 1) {
            return;
        }
        this.amountStation = amountStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
        if(soundVolume > maxVolume) {
            return;
        }
        if (soundVolume < minVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }



    // Операция next
    public void nextRadioStation() {

        if (currentRadioStation < maxNumber) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minNumber;
        }
    }

    //Операция prev
    public void prevRadioStation() {
        if (currentRadioStation > minNumber) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumber;
        }
    }



   // Увеличение +
   public void maxVolumeLevel() {

       if (soundVolume >= maxVolume) {
           soundVolume = maxVolume;
       } else {
           soundVolume = soundVolume + 1;
       }
   }

    // Уменьшение -
    public void minVolumeLevel() {

        if (soundVolume <= minVolume) {
            soundVolume = minVolume;
        } else {
            soundVolume = soundVolume - 1;
        }
    }
}



