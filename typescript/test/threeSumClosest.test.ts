import threeSumClosest from "../src/threeSumClosest";

describe("test threeSumClosest", () => {
  it("[-1, 2, 1, -4], 1", () => {
    expect(threeSumClosest([-1, 2, 1, -4], 1)).toEqual(2);
  });
  it("[0, 0, 0], 1", () => {
    expect(threeSumClosest([0, 0, 0], 1)).toEqual(0);
  });
  it("[-1, 0, 1, 2, -1, -4], 0", () => {
    expect(threeSumClosest([-1, 0, 1, 2, -1, -4], 0)).toEqual(0);
  });
});
