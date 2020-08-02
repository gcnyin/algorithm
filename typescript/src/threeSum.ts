function threeSum(nums: number[]): number[][] {
  nums.sort();
  const result = new Array<number[]>();
  for (let i = 0; i < nums.length; i++) {
    const e1 = nums[i];
    if (i > 0 && e1 === nums[i - 1]) {
      continue;
    }
    for (let j = i + 1; j < nums.length; j++) {
      const e2 = nums[j];
      if (j > i + 1 && e2 === nums[j - 1]) {
        continue;
      }
      for (let k = j + 1; k < nums.length; k++) {
        const e3 = nums[k];
        if (k > j + 1 && e3 === nums[k - 1]) {
          continue;
        }
        if (e1 + e2 + e3 === 0) {
          result.push([e1, e2, e3]);
        }
      }
    }
  }
  return result;
}

export default threeSum;
