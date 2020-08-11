import { removeNthFromEnd, ListNode } from "../src/removeNthNodeFromEndofList";

describe("test removeNthNodeFromEndofList", () => {
  it("", () => {
    const listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    const node = removeNthFromEnd(listNode, 2);
    expect(JSON.stringify(node)).toEqual('{"val":1,"next":{"val":2,"next":{"val":3,"next":{"val":5,"next":null}}}}');
  });
});
