class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ls=new ArrayList<>();
       /* for(int i=0;i<map.size();i++){
            if(map.get(nums[i])>1){
                ls.add(nums[i]);
        }
        }*/
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                ls.add(e.getKey());
            }
        }
        Collections.sort(ls);
        return ls;
    }
}