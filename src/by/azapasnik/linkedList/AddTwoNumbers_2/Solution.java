package by.azapasnik.linkedList.AddTwoNumbers_2;

import java.util.LinkedList;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode v1 = l1;
        ListNode v2 = l2;
        int numeral = 0;

        LinkedList<Integer> listResult = new LinkedList<>();

        while (v1 != null && v2 != null) {
            int val = v1.val + v2.val;
            if (numeral != 0) {
                val += numeral;
            }

            if (val >= 10) {
                numeral = 1;
                val -= 10;
            } else {
                numeral = 0;
            }

            listResult.add(val);

            v1 = v1.next;
            v2 = v2.next;
        }
        while (v1 != null) {
            int val = v1.val;
            if (numeral != 0) {
                val += numeral;
            }
            if (val >= 10) {
                numeral = 1;
                val -= 10;
            } else {
                numeral = 0;
            }

            listResult.add(val);
            v1 = v1.next;
        }

        while (v2 != null) {
            int val = v2.val;
            if (numeral != 0) {
                val += numeral;
            }
            if (val >= 10) {
                numeral = 1;
                val -= 10;
            } else {
                numeral = 0;
            }

            listResult.add(val);
            v2 = v2.next;
        }

        if (numeral != 0) {
            listResult.add(1);
        }


        ListNode result = null;

        while (listResult.peekLast() != null) {
            Integer integer = listResult.pollLast();
            if (result == null) {
                result = new ListNode(integer);
            } else {
                result = new ListNode(integer, result);
            }
        }

        return result;
    }

}
