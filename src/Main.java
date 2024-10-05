import java.util.Objects;
import java.util.Scanner;

//main()
//String party = “”
//OUTPUT “Enter whether you are a Democrat, Republication, or Independent [R,D,I]”
//INPUT party
//if party == “R”
//   OUTPUT “You get a Republican Elephant!”
//elseIf party == “D”
//   OUTPUT “You get a Democratic Donkey!”
//else
//   OUTPUT “You get an Independent Man!”
//endIf
//return
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";
        System.out.println("Enter whether you are a Democrat, Republican, or Independent [R,D,I]: ");
        if(in.hasNext())
        {
            party = in.next();
            in.nextLine();
            if(Objects.equals(party, "R"))
            {
                System.out.println("You get a Republican Elephant!");
            }
            else if(Objects.equals(party, "D"))
            {
                System.out.println("You get a Democratic Donkey!");
            }
            else if(Objects.equals(party, "I"))
            {
                System.out.println("You get an Independent Man!");
            }
            else
            {
                System.out.println("You chose other! Good for you!");
            }
        }
    }
}