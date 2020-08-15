export function divide(dividend: number, divisor: number): number {
  let result = Math.trunc(dividend / divisor);
  if (result > 2147483647 || result < -2147483648) result = 2147483647;
  return result;
}
