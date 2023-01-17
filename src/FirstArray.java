public class FirstArray
{
    public static void main(String[] args)
    {
        // Create the 3 arrays here
        String [] nameList = {"Las Vegas", "Minsk", "Sao Paulo"};
        int [] populationList = {667501,2038822,12330000};
        double [] sunList = {8.11,1.36,6.05};

        // Print all 3 arrays according to the output in the description
        System.out.println(nameList[0] + "'s population is " + populationList[0] + ".");
        System.out.println(nameList[1] + "'s population is " + populationList[1] + ".");
        System.out.println(nameList[2] + "'s population is " + populationList[2] + ".");
        System.out.println();
        System.out.println("The least amount of sunshine " + nameList[0] + " gets is " + sunList[0] + " hours a day.");
        System.out.println("The least amount of sunshine " + nameList[1] + " gets is " + sunList[1] + " hours a day.");
        System.out.println("The least amount of sunshine " + nameList[2] + " gets is " + sunList[2] + " hours a day.");
    }
}

