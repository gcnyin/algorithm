/**
 * Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 *
 * Example:
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

const map = new Map<string, string>([
  ["2", "abc"],
  ["3", "def"],
  ["4", "ghi"],
  ["5", "jkl"],
  ["6", "mno"],
  ["7", "pqrs"],
  ["8", "tuv"],
  ["9", "wxyz"],
]);

export function letterCombinations(digits: string): string[] {
  if (!digits) {
    return [];
  }
  const head = map.get(digits.charAt(0)) as string;
  const subResult = letterCombinations(digits.slice(1, digits.length));
  const result = new Array<string>();
  for (const char of head) {
    if (subResult.length === 0) {
      result.push(char);
    } else {
      for (const r of subResult) {
        result.push(char + r);
      }
    }
  }
  return result;
}
