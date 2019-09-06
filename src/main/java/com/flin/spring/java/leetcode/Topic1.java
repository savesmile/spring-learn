package com.flin.spring.java.leetcode;

/**
 * @author F_lin
 * @since 2019/4/9
 **/
public class Topic1 {

    public static void main(String[] args) {


    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(S.substring(i, i + 1))) {
                ++count;
                String s = S.toLowerCase();
            }
        }
        return count;
    }



    /**
     * 双向指针排序
     */
    public static int[] sortedSquares(int[] A) {
       /* List<Integer> eg = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            eg.add(A[i]*A[i]);
        }
        return eg.parallelStream().sorted().mapToInt(Integer::intValue).toArray();*/
        int minPoint = 0;
        int maxPoint = A.length - 1;
        int i1;
        int i2;

        int length = maxPoint;
        int[] temp = new int[A.length];

        for (int j = 0; j < A.length; j++) {
            i1 = A[minPoint];
            i2 = A[maxPoint];

            if (i1 < 0) {
                i1 = i1 * -1;
            }

            if (i1 > i2) {
                temp[length] = i1 * i1;
                ++minPoint;
            } else {
                temp[length] = i2 * i2;
                --maxPoint;
            }
            --length;
        }

        return temp;
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            int[] temp1 = A[i];
            int[] temp2 = new int[temp1.length];
            for (int j = 0; j < temp1.length; j++) {
                temp2[temp1.length - 1 - j] = temp1[j];
            }
            for (int j = 0; j < temp2.length; j++) {
                if (temp2[j] == 0) {
                    temp2[j] = 1;
                } else {
                    temp2[j] = 0;
                }
            }
            result[i] = temp2;
        }
        return result;
    }

    private static void deleteNode(ListNode node) {
        //思想  直接将本节点的内容替换成下一个节点 也就不需要head or pre
        node.setVal(node.getNext().getVal());
        node.setNext(node.getNext().getNext());

    }

    public static class ListNode {
        private Object val;
        private ListNode next;

        public Object getVal() {
            return val;
        }

        public void setVal(Object val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode(Object val) {
            this.val = val;
        }
    }
}
