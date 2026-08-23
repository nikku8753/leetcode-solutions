class Solution {
  /*  public String mostCommonWord(String paragraph, String[] banned) {
      String[] ch= paragraph.split(" ");
      //String[] chh=banned.split(" ");
      Map<String,Integer> map=new HashMap<>();
      Map<String ,Integer> map2=new HashMap<>();
      for(int i=0;i<ch.length ;i++) {
        
        map.put(ch[i],map.getOrDefault(ch[i],0)+1);
      }
      for(int i=0;i<banned.length;i++){
        map.put(banned[i],map.getOrDefault(banned[i],0)+1);
      }
      String ans="";
      int max=0;
      for(Map.Entry<String,Integer> entry: map.entrySet()){
        max=Math.max(max,entry.getValue());
        if(entry.getValue()>max && !map2.containsKey(entry.getKey())){
            ans=entry.getKey();
        }
      }
      return ans;
    }*/
        public String mostCommonWord(String p, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        for (String w : words) if (!ban.contains(w)) count.put(w, count.getOrDefault(w, 0) + 1);
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}