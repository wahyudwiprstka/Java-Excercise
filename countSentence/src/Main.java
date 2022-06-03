public class Main {
    public static String countSentence(String sentences){
        int count = 0;
        for (int i = 0; i < sentences.length(); i++){
            char temp = sentences.charAt(i);
            if (temp == '.'){
                count++;
            }
        }
        return "There are " + count + " sentences";
    }

    public static void main(String[] args) {
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi non augue dignissim, lobortis enim in, fringilla libero. Duis scelerisque faucibus nibh ut consequat. Donec eget consectetur leo. Aenean odio ex, tempor quis arcu et, vulputate imperdiet arcu. Sed maximus lectus id diam tempus malesuada. Donec eu feugiat justo. Pellentesque a tortor egestas, aliquam metus vitae, dapibus purus.";
        System.out.println(countSentence(sentence));
    }
}
