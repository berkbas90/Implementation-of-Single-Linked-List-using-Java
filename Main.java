
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1=new LinkedList();
		l1.head=new Node(1);
		Node sec=new Node(2);
		Node thr=new Node(3);
		
		l1.head.next=sec;
		sec.next=thr;
		l1.BasaEkle(23);
		l1.SonaEkle(56);
        l1.ElemandanSonraEkle(2, 'k');
		l1.BelirtilenSiradakiElemaniSil(3);
		l1.ElemanlariYaz();
		System.out.println(l1.ListeninBoyutunuBul());
	}

}
