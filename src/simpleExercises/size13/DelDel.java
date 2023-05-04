package simpleExercises.size13;

public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    public static String delDel(String string){
        if(string.startsWith("del", 1)){
            return new StringBuilder(string).delete(1,4).toString();
        } else
            return string;
    }

}
