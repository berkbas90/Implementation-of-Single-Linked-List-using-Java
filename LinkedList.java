
public class LinkedList {
	Node head;
	
public void ElemanlariYaz()
{
	Node n=head;
	while(n!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
}

public void BasaEkle(Object new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
}

public void SonaEkle(Object new_data)
{
	Node new_node=new Node(new_data);
     if(head==null) {
    	  head=new_node;
     }
     else {
    		Node last=head;
    		while(last.next!=null) {
    	        last=last.next;  	        
    		}
    
     last.next=new_node;
     
     }

}

public void ElemandanSonraEkle(Object ListeElemani,Object data)
{
	
	Node new_node=new Node(data);
	new_node.next=null;
	Node tmp=head;
	
	if(ListeElemani==null)
	{
		System.out.println("Aradığınız elemanı boş girmeyiniz");
	}
	else {
		
		while(tmp.data.toString().compareTo(ListeElemani.toString())!=0) {
			tmp=tmp.next;
		}
		
		new_node.next=tmp.next;
		tmp.next=new_node;
		
		
	}
	
}

public void BelirtilenElemanıSil(Object eleman)
{
	Node prev=null;
	Node temp=head;
	while(temp.data.toString().compareTo(eleman.toString())!=0) {
		prev=temp;
		temp=temp.next;
	}
	
	prev.next=temp.next;
	
}

public void BelirtilenSiradakiElemaniSil(int sirano)
{   Node temp=head;
	Node prev=null;
	for (int i = 0; i < sirano; i++) {
		prev=temp;
		temp=temp.next;
		
	}

     prev.next=temp.next;
}

public int ListeninBoyutunuBul() {
	int boyut=0;
	Node temp=head;
	while(temp.next!=null)
	{
		boyut=boyut+1;
		temp=temp.next;
		
	}
return boyut+1;
}

}
