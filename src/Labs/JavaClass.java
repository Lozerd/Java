package Labs;

public class JavaClass {
    private static class Solution {
        private String customName;
        private Boolean newLine;
        public Solution(String customName, Boolean newLine){
            this.customName = customName;
            this.newLine = newLine;
        }

        public void SayHelloToName() {
            if (!this.newLine) {
                System.out.print(this.customName);
            } else {
                System.out.println(this.customName);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution("Mikhail", false);

        s.SayHelloToName();
        s.customName = "Roman";
        s.newLine = true;
        s.SayHelloToName();

        System.out.print("Hello World!");
        // Output will be MikhailRoman\nHello World!
    }
}