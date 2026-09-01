class Solution {
    public int numberOfSubstrings(String s) {
        //int left=0;
        int lasta=-1;
        int lastb=-1;
        int lastc=-1;
        int count=0;
        //String temp="";
      for(int right=0;right<s.length();right++){
        //temp+=temp+String.valueOf(s.charAt(right));
        char ch=s.charAt(right);
        if(ch=='a')lasta=right;
        else if(ch=='b')lastb=right;
        else lastc=right;
        if(lasta!=-1 && lastb!=-1 && lastc!=-1){
            int minidx=Math.min(lasta,Math.min(lastb,lastc));
            count+=minidx+1;
        }
      }  
      return count;
    }
}