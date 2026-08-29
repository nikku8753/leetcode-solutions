class Solution {
    public int[] twoSum(int[] nums, int target) {
      /* for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target) return new int[]{i,j};
        }
       } 
      // return 0;
      return new int[]{};*/
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int r=target-nums[i];
        if(map.containsKey(r)){
            return new int[]{map.get(r),i};
        }
        map.put(nums[i],i);
      }
      return new int[]{};
    }
}