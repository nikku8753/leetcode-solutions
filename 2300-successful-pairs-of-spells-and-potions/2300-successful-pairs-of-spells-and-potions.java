class Solution {
   public  int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];

        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            ans[i] = bs(spells[i],potions,success);
        }
        return ans;
    }

    public  int bs(int ele , int[] pot , long target){
        int s = 0;
        int e = pot.length-1;
        while (s <= e){
            int mid = s + (e -s)/2;
            if ((long) ele * pot[mid] >= target ){
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return pot.length - s;
    }
}