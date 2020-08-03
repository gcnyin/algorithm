import numWaterBottles from "../src/waterBottles";

describe("test waterBottles", () => {
  it("numBottles = 9, numExchange = 3", () => {
    expect(numWaterBottles(9, 3)).toEqual(13);
  });
  it("numBottles = 15, numExchange = 4", () => {
    expect(numWaterBottles(15, 4)).toEqual(19);
  });
  it("numBottles = 5, numExchange = 5", () => {
    expect(numWaterBottles(5, 5)).toEqual(6);
  });
  it("numBottles = 2, numExchange = 3", () => {
    expect(numWaterBottles(2, 3)).toEqual(2);
  });
});
