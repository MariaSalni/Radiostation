package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int minNumber = 0;
    private int maxNumber = 9;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public void setCurrentRadioStation(int currentRadioStation) {
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

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxVolume) {
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

        if (currentRadioStation == maxNumber) {
            currentRadioStation = minNumber;

        } else {
            currentRadioStation = currentRadioStation + 1;
        }

     }



    //Операция prev
    public void prevRadioStation() {
        if (currentRadioStation == minNumber) {
            currentRadioStation = maxNumber;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

        // Увеличение +
        public void maxVolumeLevel () {

            if (soundVolume == maxVolume) {
                soundVolume = maxVolume;
            }
            else {
                soundVolume = soundVolume + 1;
            }
        }



        // Уменьшение -
        public void minVolumeLevel () {

            if (soundVolume == minVolume) {
                soundVolume = minVolume;
            } else {
                soundVolume = soundVolume - 1;
            }
        }


    }




