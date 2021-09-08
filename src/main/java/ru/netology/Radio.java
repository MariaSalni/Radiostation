package ru.netology;

public class Radio {
    private int currentRadioStation;
    int minNumber = 0;
    int maxNumber = 9;
    private int soundVolume;
    int minVolume = 0;
    int maxVolume = 10;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }



    // Операция next
    public void NextRadioStation() {

        if (currentRadioStation < maxNumber) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minNumber;
        }
    }

    //Операция prev
    public void PrevRadioStation() {
        if (currentRadioStation > minNumber) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumber;
        }
    }


    //Ввод номера радиостанции
   public void SelectRadioStation() {
        return;
   }

   // Увеличение +
   public void MaxVolumeLevel() {

       if (soundVolume >= maxVolume) {
           soundVolume = maxVolume;
       } else {
           soundVolume = soundVolume + 1;
       }
   }

    // Уменьшение -
    public void MinVolumeLevel() {

        if (soundVolume <= minVolume) {
            soundVolume = minVolume;
        } else {
            soundVolume = soundVolume - 1;
        }
    }
}



