function maxArea(height: number[]): number {
  let result = 0;
  for (let i = 0; i < height.length; i++) {
    for (let j = i + 1; j < height.length; j++) {
      result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
    }
  }
  return result;
}

export default maxArea;
