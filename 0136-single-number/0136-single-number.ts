
const singleNumber = (nums: number[]): number => {
    let ans:number = 0;
    for (let i :number = 0; i < nums.length; i++) {
        ans ^= nums[i];
    }
    return ans;
};
