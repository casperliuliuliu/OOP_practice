public class phrase_o_matic {
    public static void main(String args[])
    {
        String[] word_list1 = {
            "agnostic", "AI-enabled", "extensible"
        };
        String[] word_list2 = {
            "cloud", "IoT"
        };
        String[] word_list3 = {
            "framework", "REST API", "library", "services"
        };
        int lengh1 = word_list1.length;
        int lengh2 = word_list2.length;
        int lengh3 = word_list3.length;

        java.util.Random GenRan = new java.util.Random();
        int ran1 = GenRan.nextInt(lengh1);
        int ran2 = GenRan.nextInt(lengh2);
        int ran3 = GenRan.nextInt(lengh3);

        String phrase = word_list1[ran1] + 
        " " + word_list2[ran2] + 
        " " + word_list3[ran3];
        System.out.println(phrase); 
    }

}
