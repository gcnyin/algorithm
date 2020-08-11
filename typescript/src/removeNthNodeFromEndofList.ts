export class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

export function removeNthFromEnd(head: ListNode | null, n: number): ListNode | null {
  if (!head) {
    return null;
  }
  const nodes = new Array<ListNode>();
  let tmp: ListNode | null = head;
  while (tmp !== null) {
    nodes.push(tmp);
    tmp = tmp.next;
  }
  if (nodes.length < n) {
    return head;
  }
  if (nodes.length === n) {
    return head.next;
  }
  const index = nodes.length - n;
  nodes[index - 1].next = nodes[index + 1] ?? null;
  return head;
}
