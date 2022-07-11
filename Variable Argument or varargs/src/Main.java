public class Main {

    static void show(int ...A){
        for(int x :A){
            System.out.println(x);
        }
    }

    static void showList(String ...s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(i+1+". "+s[i]);
        }
    }

    static void showL(int start, String ...s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(start+ ". " + s[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        show();
        show(10, 20, 30);
        show(new int[]{7, 5, 6, 10,11});

        showList("Negi", "Singh", "Rawat", "Bisht", "Sushant");

        showL(5, "Negi", "Singh", "Rawat", "Bisht", "Sushant");
    }
}