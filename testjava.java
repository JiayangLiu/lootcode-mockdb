public class Solution {
  public boolean existSum1(int[] array, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++){
      int check = target - array[i];
      if (map.containsKey(check)){
        return true;
      }
      map.put(array[i], i);
    }
    return false;
  }
  
  public boolean existSum(int[] array, int target) {
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;
    while(left < right){
      int sum = array[left] + array[right];
      if (sum == target){
        return true;
      }else if (sum < target){
        left++;
      }else{
        right--;
      }
    }
    return false;
  }
}
