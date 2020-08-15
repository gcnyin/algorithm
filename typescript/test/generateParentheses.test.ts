import { generateParenthesis } from "../src/generateParentheses";

describe("test Generate Parentheses", () => {
  it("3 default", () => {
    expect(generateParenthesis(3).sort()).toEqual(["((()))", "(()())", "(())()", "()(())", "()()()"].sort());
  });

  it("4", () => {
    expect(generateParenthesis(4).sort()).toEqual(
      [
        "(((())))",
        "((()()))",
        "((())())",
        "((()))()",
        "(()(()))",
        "(()()())",
        "(()())()",
        "(())(())",
        "(())()()",
        "()((()))",
        "()(()())",
        "()(())()",
        "()()(())",
        "()()()()",
      ].sort()
    );
  });
});
