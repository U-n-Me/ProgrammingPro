// Definition for singly-linked list.
//			function Node(data){
//				this.data = data
//				this.next = null
//			}

module.exports = {
	//param A : head node of linked list
	//param B : integer
	//param C : integer
	//return the head node in the linked list
	reverseBetween : function(list, m, n){
        var prev = null, first = null, reverse = null, rslt = list;
        var i = 1;
        for(i = 1; i < m; i++){
            prev = list;
            list = list.next;
        }
        first = list;
        for(; i <= n; i++){
            var tmp = list.next;
            list.next = reverse;
            reverse = list;
            list = tmp;
        }
        if(prev != null)
            prev.next = reverse;
        first.next = list;
        if(prev == null)return reverse;
        return rslt;
	}
};
