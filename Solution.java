class Solution {
    public int numberOfSteps(int num) {
        int out = 0;
        while(num != 0){
            if(num%2 == 0){
                num /= 2;
            }else{
                num--;
            }
            out++;
        }
        return out;
    }
}
