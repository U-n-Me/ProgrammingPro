// Definition for singly-linked list.
//			function Node(data){
//				this.data = data
//				this.next = null
//			}

module.exports = {
	//param A : head node of linked list
	//return an integer
	lPalin : function(list){
       if(list == null || list.next == null)return 1;
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

       while(list != null && reverse != null){
           if(list.data != reverse.data)
                return 0;
            list = list.next;
            reverse = reverse.next;
       }
       return 1;
	}
};
