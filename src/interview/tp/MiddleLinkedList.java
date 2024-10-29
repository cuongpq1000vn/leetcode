package interview.tp;

public class MiddleLinkedList {
  public static void main(String[] args) {

  }

  /**
   * Since fast moves at twice the speed of slow, by the time fast reaches the end, slow will be at the midpoint.
   * @param head
   * @return
   */
  public ListNode middleNode(ListNode head) {
    ListNode temp = head;
    ListNode middle = head;
    int count = 0;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    for(int i = 0; i < count / 2 ;i ++){
      middle = middle.next;
    }
    return middle;
  }

  public ListNode optimizeMiddleNode(ListNode head){
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
