/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * ```json
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 * ```
 */
export function generateParenthesis(n: number): string[] {
  if (n === 1) {
    return ["()"];
  }
  const array = generateParenthesis(n - 1);
  const result = [];
  for (const item of array) {
    result.push(`(${item})`);
    result.push(`()${item}`);
    result.push(`${item}()`);
  }
  const set = new Set(result);
  return Array.from(set);
}
