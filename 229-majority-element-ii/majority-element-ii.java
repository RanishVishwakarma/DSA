import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int cnt1 = 0, cnt2 = 0;
        int ele1 = 0, ele2 = 0;

        for (int i=0;i<nums.length;i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele1 != nums[i]) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i]) cnt1++;
            else if (ele2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        cnt1 = 0; cnt2 = 0;
        for (int i = 0;i<nums.length;i++) {
            if (ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }
        int mini = (nums.length/3) + 1;
        if (cnt1 >= mini) list.add(ele1);
        if (cnt2 >= mini && ele1 != ele2) list.add(ele2);
        Collections.sort(list);
        return list;

    }
}