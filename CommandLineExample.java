//The java command-line argument is an argument i.e. passed at the time of running the java program.
class CommandLineExample {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
