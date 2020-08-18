package structure;


public class ListNode {
      public int val;
      public ListNode next;
      public ListNode(int x) { val = x; }

        public void c(){

        }
      /**
       * 在控制台递归输出一个链表元素
       * */
      public static void printNodeList(ListNode node){
          while(node!=null){
              System.out.print(node.val+" -> ");
              node = node.next;
          }
         /* if(node==null){
              return;
          }else{
               System.out.print(node.val+" -> ");
               printNodeList(node.next);
          }*/
      }

      /**
       * 根据数组按顺序创建链表
       * */
      public static ListNode createNodeList(int []a){
          ListNode head=null;
          ListNode curr=null;
          ListNode pre=null;
          for(int i=0;i<a.length;i++){
              curr = new ListNode(a[i]);
              if(i==0){
                  head = curr;
                  pre = curr;
                  continue;
              }
              pre.next = curr;
                pre= curr;
          }
          return head;
      }


}