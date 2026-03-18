public class HelloCommandM {
    public static void main(String[] args){
        String name = "World";
        if (args.length == 0){
            System.out.println("Hello, "+name+ "!");
        } else{
            for(int i= 0; i<args.length; i++){
                System.out.println("Hello, "+args[i]+"!");
            }
        }

    }
}
