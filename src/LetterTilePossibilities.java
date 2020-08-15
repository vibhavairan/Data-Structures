import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterTilePossibilities {
    static List<String> subsets(String tiles) {
        List<String> lists = new ArrayList<>();
        if(tiles==null||tiles.length()==0)
            return lists;
        combinations(tiles,  lists, "",0);
        return lists;
    }

    static void combinations(String tiles, List<String> lists, String ans, int index){
        for(int x = index; x<tiles.length();x++)
        {
            ans = ans + tiles.charAt(x);
            combinations(tiles, lists,ans,x+1);
            lists.add(ans);
            ans = ans.substring(0,ans.length()-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(subsets(s));
    }
}
