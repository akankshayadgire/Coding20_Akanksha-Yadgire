import java.util.HashMap;
import java.util.Map;

class ArraySumIndexFinder
{
	public static void main(String[] args) 
	{
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] indices = findIndicesWithSum(nums, target);

        if (indices[0] != -1 && indices[1] != -1) 
        {
            System.out.println("Indices with sum " + target + " are: " + indices[0] + " and " + indices[1]);
        } 
        else 
        {
            System.out.println("No such indices found with sum " + target);
        }
    }

     public static int[] findIndicesWithSum(int[] nums, int target) 
     {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            if (map.containsKey(complement)) 
            {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}