import maxArea from "../src/containerWithMostWater";

describe("test containerWithMostWater", () => {
  it("test maxArea", () => {
    expect(maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7])).toEqual(49);
  });
});
