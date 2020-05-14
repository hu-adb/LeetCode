class test {
  public static void main(String[] args) {
      
int[] strs ={1,2,5,6};
//
        int r= searchInsert(strs,5);
        System.out.println(r);
    }
    public static int searchInsert(int[] nums, int target) {
        HashMap<Integer, Integer>  data= new HashMap();
        int i;
        for(i=0;i<nums.length;i++){
            if(data.containsKey(target)) return data.get(nums[i]);
            if(nums[i]>target) return i;
            data.put(nums[i],i);
        }
        return i;

    }

}