/*                 997. Find the Town Judge

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:
The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

 
Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2

Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3

Example 3:
Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Constraints:
    1 <= n <= 1000
    0 <= trust.length <= 104
    trust[i].length == 2
    All the pairs of trust are unique.
    ai != bi
    1 <= ai, bi <= n
 */



/*  my leetcode soln
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n + 1]; // Define an array of length n+1
        for (int[] person : trust) { // loop through the 'trust' array
            trusted[person[0]]--; // outdegree // if a given person trust someone then decrement the count of his
                                  // index
            trusted[person[1]]++; // indegree // increment the count of the index whom he trusts
        }

        // In last, check the 'arr' array that if there is any index having count equals
        // to n-1
        for (int i = 1; i < trusted.length; i++) {
            if (trusted[i] == n - 1)
                return i; // person doesnt trust anybody but everyone else trust him. Return their index
        }
        return -1;
    }
}
 */

/*  Approach 
    Intution: So we have following conditions on which we have to work:

    *Town judge trust nobody
    *Every other trust town judge.
     So here we gonna use concept of indegree and outdegree used in graph:
    
    If a person A trust other person B then we can see it as directed edge from A to B ( A --> B ) and so here edge is coming out of A and going into B.
    So increase the oudegree (or decrease the indegree) of A and increase indegree of B.
    So here we can observe that if 5 person trust B then indegree of B will be 5 and if B trust 2 other person the its outdgeree will be 2 i.e., net indegree will be 5 - 2 = 3.
    And to become the town judge we know that judge can not have trust on any other person so outdegree of judge = 0 and every other person trust the judge so indegree of judge = n-1.
    Hence we can say that judge will be the person for which we have indegree - outdegree = n-1.
*/    