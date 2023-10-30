import java.util.*;

public class Whiteboard {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String myName = input.nextLine();
        int agentsNum = input.nextInt(); input.nextLine();
        ArrayList<String> StringOfNames = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        StringOfNames.add(myName);
        Collections.sort(StringOfNames);

        int groupNum = (int) Math.ceil(((double)(StringOfNames.indexOf(myName) + 1)) / agentsNum);
        if (groupNum < 1){
            groupNum = 1;
        }
        int totalMinutes = groupNum * 20;
        System.out.println(totalMinutes);
    }
}
