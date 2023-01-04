public class practiceSet3 {
    public static void main(String[] args) {
        // 1
        String name = "Aman Chaurasia";
        String letter = "Dear |<Name>|, how are you!";
        // name= name.toLowerCase();
        // System.out.println(name);

        // 2
        name= name.replace(" ","_");
        System.out.println(name);

        // 3
        letter = letter.replace("|<Name>|", "Supriyo");
        System.out.println(letter);

        // 4
        String doubtrip = "The boy  is very   good";
        System.out.println(doubtrip.indexOf("  "));
        System.out.println(doubtrip.indexOf("   "));

        // 5
        System.out.println("\"Dear Harry, This java course is nice. Thanks\"");

    }
}
