package ru.netology.Radio.Control;

public class RadioChanels {
    private int currentRadioStationNumber; //текущий номер радиостанции

    public int getCurrentRadioStationNumber() { //отдать текущий номер радиостанции
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) { //установить новый текущий номер радиостанции
        if (newCurrentRadioStationNumber < 0) {
            newCurrentRadioStationNumber = 9;
        }
        if (newCurrentRadioStationNumber > 9) {
            newCurrentRadioStationNumber = 0;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next1ChannelNumber() {
        int next = getCurrentRadioStationNumber() + 1;
        setCurrentRadioStationNumber(next);
    }

    public void prev1ChannelNumber() {
        int prev = getCurrentRadioStationNumber() - 1;
        setCurrentRadioStationNumber(prev);
    }

    public void setTheRadioStationNumber(int newCurrentRadioStationNumber) {//установить номер станции в диапазоне от 0 до 9
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }
}