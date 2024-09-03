	class Solution {
		public int minimumDeletions (int[] nums) {
			int n = nums.length;
            
            //Trivial cases
            if (n == 1) return 1;
            if (n == 2 || n == 3) return 2;
            
			int i = 0;
			int minIdx = 0; //index of minimum element
			int maxIdx = 0; //index of maximum element
            
			while (i < n) {
				if (nums[i] > nums[maxIdx])
					maxIdx = i; 
				if (nums[i] < nums[minIdx])
					minIdx = i;
				i++;
			}
            /*
            [2, 10, 7, 5, 4, 1, 8, 6]
            [2, maxIdx, 7, 5, 4, minIdx, 8, 6]
            [2, left, 7, 5, 4, right, 8, 6]
            left = 1
            right = 5
            */
			int left = Math.min(maxIdx, minIdx);
			int right = Math.max(maxIdx, minIdx);
            /*
            We have 3 options - just find the minimum 
            1. (left + 1) + (n - right)
            2. (right + 1)
            3. (n - left)
            */
			int res = Math.min((Math.min((right + 1), (n - left))), ((left + 1) + (n - right)));
			return res;
		}
	}