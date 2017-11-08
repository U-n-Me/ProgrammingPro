// Definition for singly-linked list.
//			function Node(data){
//				this.data = data
//				this.next = null
//			}

module.exports = {
	//param A : head node of linked list
	//return the head node in the linked list
	deleteDuplicates : function(a){
        if(a == null || a.next == null)return a;
        var head = null, last = null;

        while(a != null){
            var val = a.data;
            if(a.next == null || val != a.next.data){
                if(head == null){
                    head = a;
                    last = head;
                }else{
                    last.next = a;
                    last = a;
                }
                a = a.next;
            }
            else
                while(a != null && val == a.data)a = a.next;
        }

        if(last != null)last.next = null;
        return head;
	}
};
