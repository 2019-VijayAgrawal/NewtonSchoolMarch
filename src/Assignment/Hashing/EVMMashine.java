package Assignment.Hashing;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

/*EVM Machine
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
During the elections, Bob is in charge of conducting voting in his village, but the EVM system malfunctioned, and there was a long line of voters waiting outside to vote. The following is how the Advanced EVM Machine works.
Each time when a voter scans his VoterId Card and votes for the party of his choice, the Voter's id and Party Name are registered in the background, and if the same voter votes again, the EVM does not capture his vote, then the vote is skipped and the vote given the first time is used.
Now that you are Bob's best mate, you can't bear to see him in such a strained situation when outside voters are being very aggressive and screaming at him. Can you easily write a piece of code to save your friend's life while Bob is busy calming down the outside situation?
Input
The number N (1 ≤ N ≤ 1e5) appears on the first line. The queries to the machine are included in the next n lines. Each request consists of two strings and is written on a non- empty line. The first string is an Voter Card Id, and the second string is the Party Name, all of which are atmost 32 characters long and all lowercase Latin letters.

Constraints
1 ≤ N ≤ 100000
1 ≤ Voter Id length, PartyName length ≤ 40
Output
Output a single line indicating which party has won and by how many votes. In case of a draw between parties print all the parties with the same winning vote, in lexographically increasing order on basis of Party Name.
Example
Sample Input
4
12678345 BJP
57891082 Congress
12678345 AAP
65489 TMC

Sample Output
BJP 1
Congress 1
TMC 1

Explanation : As Winning Parties here as BJP, Congress, TMC with 1 vote(s) each, but AAP vote is not considered because the same VoterId - 12678345 has done a vote again.*/
public class EVMMashine {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,Integer> votecount = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();

        int maxvotes =0;
        for(int i=0 ; i<n ; i++){
            String voterid= sc.next();
            String party = sc.next();
            if(!map.containsKey(voterid)){
                map.put(voterid,party);

                int val;
                if(!votecount.containsKey(party)){
                    val=1;
                    votecount.put(party,val);
                    list.add(party);
                }else{
                    val = votecount.get(party)+1;
                    votecount.put(party,val);
                }

                if(val > maxvotes){
                    maxvotes=val;
                }

            }
        }

        ArrayList<String> last = new ArrayList<String>();
        for(String element: list){
            if(votecount.get(element)==maxvotes){
                last.add(element);
            }
        }
        Collections.sort(last);
        for(String element : last){
            System.out.println( element+ " "+ maxvotes);
        }

    }
}