enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int dangerLevels;

    DangerLevel(int dangerLevels){
        this.dangerLevels = dangerLevels;
    }

    public int getLevel(){
        return this.dangerLevels;
    }
}

