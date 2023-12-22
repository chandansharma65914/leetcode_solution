// function singleNumber(nums: number[]): number {
    
// };


// /**
//  * @param {number[]} nums
//  * @return {number}
//  */
const singleNumber = (nums: number[]): number => {
    let ans = 0;
    for (let i = 0; i < nums.length; i++) {
        ans ^= nums[i];
    }
    return ans;
};
