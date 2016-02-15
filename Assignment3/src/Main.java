/**
 * Created by William on 2/9/2016.
 */

import java.util.*;

public class Main {

    public static void main(String[] args){
        char[] line = {'$','$','$','$','$','$','$','$','$'};
        for(int i = 0; i < 9; i++){
            line[i] = '*';
            System.out.println(line);
            if(i == 1) System.out.println("William");
            if(i == 6) System.out.println("Lin");
        }
    }

}
