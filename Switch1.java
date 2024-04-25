class Switch1{
    public static void main(String[] args) {
        int a=6;
        String s = "good";
        // int c =a-4;
        switch(s){
            case "hai": System.out.println("1");
            break;
            case "hello": System.out.println("2");
            break;
            case "well": System.out.println("3");
            break;
            case "good": System.out.println("4");
            break;
            case "bye": System.out.println("5");
            break;
            default: System.out.println("no number");
            break;
        }
    }
}