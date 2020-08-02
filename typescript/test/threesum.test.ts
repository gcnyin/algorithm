import threeSum from "../src/threeSum";

describe("test threeSum", () => {
  it("", () => {
    const result = threeSum([-1, 0, 1, 2, -1, -4]);
    expect(result).toEqual([
      [-1, -1, 2],
      [-1, 0, 1],
    ]);
  });
});
