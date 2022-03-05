package Searching;
/* standard input/output: 2s/128000 kB

After saving the planet of Xander in 2014 from Ronan, the guardians of the galaxy decide to play a game on it. Between the vast furious oceans, they discover a row of dilapidated buildings. The buildings are of different heights arranged at each index along a number line. Gamora starts at building 0 and a height of 0. Groot gets the task to determine the minimum thrust that Gamora needs at the start of the game so that she can jump to the top of each building without her thrust going below zero. Write a code to help Groot with his task.
The units of height relate directly to units of thrust. Gamora’s thrust level is calculated as follows:
• If gamorasthrustis less than the height of the building, her newthrust=gamorasthrust – (height – gamorasthrust)
• If gamorasthrust is greater than equal to the height of the building, her newthrust=gamorasthrust+(gamorasthrust- height)
Input
The first line contains an integer n, the number of buildings.
The second line n space- separated integers, arr[1], arr[2]…arr[n], the heights of the building.

Constraints:-
1<=n<=100000
1<=arr[i]<=100000
Output
The output contains a single integer denoting the minimum thrust Gamora needs at the start of the game.*/

/*Example-  Sample Input:-
5
3 4 3 2 4

Sample Output:-
4

Explanation:-
If we take 3 then:-
at index 1:- 3 + 3-3 = 3
at index 2:- 3 - (4-3) = 2
at index 3:- 2 - (3-2) = 1
at index 4:- 1 - (2-1) = 0


Sample Input:-
3
4 4 4

Sample Output:-
4

*/

import java.util.Scanner;

public class GuardiansOfGalaxy {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i<n; i++) {
            h[i] = scan.nextInt();
        }

        long l = 0;
        long r = Integer.MAX_VALUE;

        long ans = 0;

        while(l<r){
            long m = l+(r-l)/2;

            if(checkWithValue(h,n,m)){
                r = m;
                ans = m;

            }
            else{
                l = m+1;
            }
        }

        System.out.println(ans);
    }
    public static boolean checkWithValue(int[] h, int n, long thrust){

        for(int i=0;i<n;i++){
            thrust += thrust - h[i];
            if(thrust >= Integer.MAX_VALUE)
                return true;
            if(thrust < 0)
                return false;
        }

        return true;
    }
}
