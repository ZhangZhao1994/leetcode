package leetcodetest.p1;

import com.alibaba.fastjson.JSON;
import leetcode.p1.Solution;

/**
 *
 * @author zhangzh
 * @date 2021/06/09
 */
public class TestP1 {

    public void test() {
        Solution solution = new Solution();

        System.out.println(JSON.toJSONString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(JSON.toJSONString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(JSON.toJSONString(solution.twoSum(new int[]{3, 3}, 6)));
    }

}
