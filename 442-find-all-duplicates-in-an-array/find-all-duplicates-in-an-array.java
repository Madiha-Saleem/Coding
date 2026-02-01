class Solution {
    // static {
    //     Runtime.getRuntime().gc();
    //     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         try (FileWriter f = new FileWriter("display_runtime.txt")) {
    //             f.write("0");
    //         } catch (Exception e) {

    //         }
    //     }));
    // }
    public List<Integer> findDuplicates(int[] nums) {
        int i;
        List<Integer> s=new ArrayList<>();
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            s.add(nums[i]);
        }
        return s;
    }
}