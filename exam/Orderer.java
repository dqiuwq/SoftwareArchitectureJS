package exam;

import java.util.ArrayList;

public interface Orderer {
    void isGOE(Object obj1, Object obj2);
    static Object maxOf(ArrayList<Object> objList, Orderer orderer) {
        // declare a tmpObject to store the largest orderer
        // for each object in objList
            // compare orderer with (Orderer) object
            // whichever is more
                // set reference of tmpObject to the object
        // end loop
        // return tmpObject
    }

    public static void main(String[] args) {

    }
}
