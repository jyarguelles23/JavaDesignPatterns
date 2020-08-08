package com.vicsystems.DesignPatterns.CreationalDesignPatterns.Prototype;

/*Support cloning*/
public class Swordsman extends GameUnit{
    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman "+state+" @ "+getPosition();
    }

    @Override
    protected void reset() {
        state = "idle";
    }
}
