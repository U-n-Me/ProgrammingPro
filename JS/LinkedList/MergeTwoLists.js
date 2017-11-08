// Definition for singly-linked list.
//			function Node(data){
//				this.data = data
//				this.next = null
//			}

module.exports = {
	//param A : head node of linked list
	//param B : head node of linked list
	//return the head node in the linked list
	mergeTwoLists : function(A, B){
        var head = null, last = null;
        while(A != null && B != null){
            if(A.data < B.data){
                if(head == null){
                    head = A;
                    last = head;
                }else{
                    last.next = A;
                    last = last.next;
                }
                A = A.next;
            }else{
                if(head == null){
                    head = B;
                    last = head;
                }else{
                    last.next = B;
                    last = last.next;
                }
                B = B.next;
            }
        }
        if(A == null)last.next = B;
        else last.next = A;
        return head;
	}
};
