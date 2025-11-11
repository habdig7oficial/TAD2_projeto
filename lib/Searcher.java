package lib;

import tokens.BaseToken;

public class Searcher<Generic1, Generic2>{
        public short search(Generic1 arr[], Generic2 element){
        for (short i = 0; i < arr.length; i++) {
            //System.out.println(element);
            if(arr[i].equals(element))
                return i;
        }
        return -1;
    }
}
