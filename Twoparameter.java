//A generic class with two parameter
package generics;
class Pair<k,v>{
    private k key;
    private v value;
    public Pair(k key,v value){
        this.key=key;
        this.value=value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
    
}
public class Twoparameter {
    public static void main(String[] args) {
        Pair<String,String>tcode=new  Pair("01","kathmandu");
        System.out.println("key:"+tcode.getKey());
        System.out.println("value:"+tcode.getValue());
    }
    
}
