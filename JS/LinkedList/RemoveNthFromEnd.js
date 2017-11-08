// Definition for singly-linked list.
//			function Node(data){
//				this.data = data
//				this.next = null
//			}

module.exports = {
	//param A : head node of linked list
	//param B : integer
	//return the head node in the linked list
	removeNthFromEnd : function(list, n){
        var l1 = list, l2 = list;
        for(var i = 0; i <= n; i++){
            if(l1 != null)
                l1 = l1.next;
            else return list.next;
        }
        while(l1 != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        l2.next = l2.next.next;
        return list;
	}
};
