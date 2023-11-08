class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int j;
        ArrayList<Integer> lis = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(i==0 || i%2==0){
                for(j=0;j<matrix[0].length;j++){
                    lis.add(matrix[i][j]);
                }
            }
            else{
                for(j=matrix[0].length-1;j>=0;j--)
                lis.add(matrix[i][j]);
            }
        }
        
        return lis;
    }
}
