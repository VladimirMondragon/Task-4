public class StringBuilderLab {
    public static void main(String[] args) {
        // Create StringBuilder object initialized with "StringBuilder Lab"
        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        // 1. append(): Add " - Learning Java"
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        // 2. insert(): Insert " is fun" after the word "Lab"
        int insertPos = sb.indexOf("Lab") + "Lab".length(); // position right after "Lab"
        sb.insert(insertPos, " is fun");
        System.out.println("After insert: " + sb);

        // 3. delete(): Delete the word "Learning"
        int startDelete = sb.indexOf("Learning");
        int endDelete = startDelete + "Learning".length();
        sb.delete(startDelete, endDelete);
        System.out.println("After delete: " + sb);

        // 4. reverse(): Reverse the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}