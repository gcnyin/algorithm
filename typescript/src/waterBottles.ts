function numWaterBottles(numBottles: number, numExchange: number): number {
  let result = numBottles;
  let d = Math.floor(numBottles / numExchange);
  let r = numBottles - d * numExchange;
  for (;;) {
    if (d === 0) {
      break;
    }
    result += d;
    const n = d + r;
    d = Math.floor(n / numExchange);
    r = n - d * numExchange;
  }
  return result;
}

export default numWaterBottles;
