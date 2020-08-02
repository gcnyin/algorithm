import intToRoman from "../src/integerToRoman";

describe("test containerWithMostWater", () => {
  it("3 equals III", () => {
    expect(intToRoman(1)).toEqual("I");
    expect(intToRoman(2)).toEqual("II");
    expect(intToRoman(3)).toEqual("III");
  });
  it("4 equals IV", () => {
    expect(intToRoman(4)).toEqual("IV");
  });
  it("9 equals IX", () => {
    expect(intToRoman(5)).toEqual("V");
    expect(intToRoman(6)).toEqual("VI");
    expect(intToRoman(7)).toEqual("VII");
    expect(intToRoman(8)).toEqual("VIII");
    expect(intToRoman(9)).toEqual("IX");
  });
  it("58 equals LVIII", () => {
    expect(intToRoman(58)).toEqual("LVIII");
  });
  it("1994 equals MCMXCIV", () => {
    expect(intToRoman(1994)).toEqual("MCMXCIV");
  });
});
