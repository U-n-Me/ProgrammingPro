// Definition for singly-linked list.
//			function Node(data){
//				this.data = data
//				this.next = null
//			}

module.exports = {
	//param A : head node of linked list
	//return the head node in the linked list
	reorderList : function(list){
       if(list == null || list.next == null)return list;
       var fast = list, slow = list;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           if(fast != null)
            slow = slow.next;
       }
       fast = slow.next;
       slow.next = null;
       var reverse = null;
       while(fast != null){
           var tmp = fast.next;
           fast.next = reverse;
           reverse = fast;
           fast = tmp;
       }

       var rslt = list;
       while(list.next != null){
           var tmp = list.next;
           list.next = reverse;
           reverse = reverse.next;
           list.next.next = tmp;
           list = tmp;
       }
       list.next = reverse;
       return rslt;
	}
};
