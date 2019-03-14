package impl;

import inter.Observer;

public class ConcreteObserver implements Observer {

    private String name;
    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        String msg = name +":temperature "+ temp +" ,humidity:" + humidity +" ,pressure:" +pressure ;
        System.out.println(msg);
    }
}
