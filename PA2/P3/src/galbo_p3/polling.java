package galbo_p3;
import java.util.Scanner;

public class polling {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
        String[] topics = {"Sports", "Music", "Education", "Programming", "Games"};
        int [][] ratings = new int [topics.length][];

        int i, j, participants, rating;

        for(i = 0; i < ratings.length; i++)
        {
        	ratings[i] = new int[10];

            for(j = 0; j < ratings[i].length; j++)
            	ratings[i][j] = 0;
        }

        System.out.print("Enter number of participants: ");
        participants = scnr.nextInt();

        for(i = 0; i < participants; i++)
        {
        	System.out.println("Rate each topic on a scale of 1-10 for the following "+ topics.length + " topics: ");

            	for(j = 0; j < topics.length; j++)
                {
            		System.out.print("Enter your rating for " + topics[j] + ": ");
                    rating = scnr.nextInt();

                    	while(rating < 1 || rating > 10)
                        {
                    		System.out.println("Error, rating must be between 1 and 10");
                    		System.out.print("Enter your rating for " + topics[j] + ": ");
                            rating = scnr.nextInt();
                        }

                           ratings[j][rating-1]++;
                }
        }

        int avgRating[] = new int[topics.length];
        String highestPointIssue = "", lowestPointIssue = "";
        int highestPointTotal = 0, lowestPointTotal = 0;

        for(i = 0; i < ratings.length; i++)
        {

        	avgRating[i] = 0;

            	for(j=0;j<ratings[i].length;j++)
            		avgRating[i] += (ratings[i][j] * (j+1));



            	if(i == 0)
                {
                     highestPointTotal = avgRating[i];
                     lowestPointTotal = avgRating[i];
                     highestPointIssue = topics[i];
                     lowestPointIssue = topics[i];

                }
                else
                {
                	 if(avgRating[i] > highestPointTotal)
                     {
                		 highestPointIssue = topics[i];
                         highestPointTotal = avgRating[i];
                     }

                     if(avgRating[i] < lowestPointTotal)
                     {
                         lowestPointIssue = topics[i];
                         lowestPointTotal = avgRating[i];
                     }
                 }

                    avgRating[i] = avgRating[i] / participants;
        }



             // output the topics and its count of ratings and average rating in tabular format

             System.out.printf("\n%-20s", "");

             for(i = 0; i < 10; i++)
                    System.out.printf("%-10d",(i+1));

             System.out.printf("%20s","Average Rating\n");

             for(i = 0; i < ratings.length; i++)
             {
                    System.out.printf("\n%-20s",topics[i]);

                    for(j=0; j < ratings[i].length; j++)
                           System.out.printf("%-10d", ratings[i][j]);

                    System.out.printf("%20d", avgRating[i]);
             }


             System.out.println("\nHighest point total: " + highestPointTotal);
             System.out.println("Highest issue: " + highestPointIssue);
             System.out.println("Lowest point total: " + lowestPointTotal);
             System.out.println("Lowest issue: " + lowestPointIssue);
       }
}
