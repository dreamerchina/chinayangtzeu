package linearList;

import javax.xml.soap.Node;

/**
 * ����ʽ�洢ʵ�ֵ����Ա�
 */
public class LinkedList<E> {
	private Node<E> header=null;//ͷ���
	int size=0;//��ʾ�����С��ָ��
	
	public LinkedList(){
		this.header=new Node<E>();
	}
	public boolean add(E e){
		if(size==0){
			header.e=e;
		}else{
			//������Ҫ��ӵ����ݣ���װΪ���
			Node<E> newNode =new Node<E>(e);
			//�õ���ǰ���һ�����
			Node<E> last=getNode(size-1);
			//�����һ����������½��
			last.addNext(newNode);
			//����βָ�����һ��Ԫ��
			last=newNode;
		}
		size++;
		return true;
	}
	/**
	 * ������ǰ����ȡ�õ�ǰ������Ӧ��Ԫ��
	 * 
	 * @return
	 */
	private Node<E> getNode(int index){
		//���ж�������ȷ��
		if(index >size ||index<0){
			throw new RuntimeException("����ֵ�д�:"+index);
		}
		Node<E> tem=new Node<E>();
		tem=header;
		int count =0;
		while(count !=index){
			tem=tem.next;
			count++;
		}
		return tem;	
	}
	/**
	 * ����������ȡ�ø������µ�����
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index){
		//���ж�������ȷ��
		if(index >=size ||index<0){
			throw new RuntimeException("����ֵ�д�:"+index);
		}
		Node<E> tem=new Node<E>();
		tem=header;
		int count=0;
		while(count!=index){
			tem=tem.next;
			count++;
		}
		E e=tem.e;
		return e;
	}
	
	public int size(){
		return size;
	}
	/**
	 * ���õ�N������ֵ
	 *
	 *@param x
	 *@param e
	 *@return
	 */
	 public boolean set(int index,E e){
		 //���ж�������ȷ��
		 if(index > size ||index <0){
			 throw new RuntimeException("����ֵ�д�:"+index);
		 }
		 Node<E> newNode=new Node<E>();
		 //�õ���X�����
		 Node<E> cNode=getNode(index);
		 cNode.e=e;
		 return true;
	 }
	 /**
	  * ����������ݵĽ�����ڲ���
	  */
	 class Node<e>{
		 private E e;//����д�ŵ�����
 		 Node<E> next;//����ָ��ý�����һ�����
 		 Node(){
 			
 			 }
 		 Node(E e){
 			 this.e=e;
 		 }
 		 //�ڴ˽������һ�����
 		 void addNext(Node<E> node){
 			 next=node;
 		 }
	 }

}
