package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counterF = 0;
        int counterB = 0;
        for(int i = 0; i <= startIndex; i++){
            counterF++;
        }
        for(int j = 0; j <= playList.length; j++){
            counterB++;
        }
        if(counterF < counterB){
            return counterF;
        }
        return counterB;
    }
}
