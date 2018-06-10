package academy.elqoo.java8.defaultmethods;

import java.util.List;
import java.util.Optional;

public interface Shape {

    int getXPos();

    int getYPos();

    void setXPos(int xPOs);

    void setYPos(int yPos);

    default void move(int x, int y){
        setXPos(x);
        setYPos(y);
    }

    static void moveXPosWith10(List<AbstractShape> shapes){
        shapes.forEach(shape -> shape.setXPos(shape.getXPos() + 10));
    }

    default String getName(){
        return "";
    }

}
