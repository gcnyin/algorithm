/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, iust two one's added together.
 * Twelve is written as, XII, which is simply X + II.
 * The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * Example 1:
 *
 * Input: 3
 * Output: "III"
 * Example 2:
 *
 * Input: 4
 * Output: "IV"
 * Example 3:
 *
 * Input: 9
 * Output: "IX"
 * Example 4:
 *
 * Input: 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 5:
 *
 * Input: 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

function divide(i: number, level1: string, level5: string, level10: string) {
  if (i <= 3) {
    return level1.repeat(i);
  }
  if (i === 4) {
    return level1 + level5;
  }
  if (i <= 8) {
    return level5 + level1.repeat(i - 5);
  }
  if (i === 9) {
    return level1 + level10;
  }
  return "";
}

/**
 * @param num range from 1 to 3999
 */
function intToRoman(num: number): string {
  let tmp = num;

  const d1000 = Math.floor(tmp / 1000);
  const r1000 = divide(d1000, "M", "", "");
  tmp -= d1000 * 1000;

  const d100 = Math.floor(tmp / 100);
  const r100 = divide(d100, "C", "D", "M");
  tmp -= d100 * 100;

  const d10 = Math.floor(tmp / 10);
  const r10 = divide(d10, "X", "L", "C");
  tmp -= d10 * 10;

  const d1 = Math.floor(tmp / 1);
  const r1 = divide(d1, "I", "V", "X");

  return r1000 + r100 + r10 + r1;
}

export default intToRoman;
