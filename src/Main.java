import impl.ConcreteObserver;
import impl.WeatherData;
import inter.Observer;

public class Main {

    public static void main(String[] args) {

        //主题
        WeatherData weatherData = new WeatherData();

        //观察者
        Observer observer1 = new ConcreteObserver("observer1");
        Observer observer2 = new ConcreteObserver("observer2");
        Observer observer3 = new ConcreteObserver("observer3");

        //注册观察者
        weatherData.registerObserver(observer1);
        weatherData.registerObserver(observer2);
        weatherData.registerObserver(observer3);


        //主题状态发生变化通知观察者,observer1 observer2 observer3都能收到更新信息
        weatherData.measurementsChanged(12,12,1000);

        //取消订阅
        weatherData.removeObserver(observer2);

        //主题状态发生变化通知观察者,observer2 不能收到更新信息
        weatherData.measurementsChanged(10,15,2000);



    }
}
