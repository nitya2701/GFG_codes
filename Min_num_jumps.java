class Solution{
    static int minJumps(int[] arr){
        // your code here
        int jumps = 0, start = 0, nextjump = 0;
for (int i = 0; i < arr.length; i++) {
        if (i > nextjump) return -1;
nextjump = Math.max(nextjump, i + arr[i]);
if (i < arr.length-1 && i == start) {
jumps++;
start = nextjump;
}
}
return jumps;
    }
}
