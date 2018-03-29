package linearList;

import javax.xml.soap.Node;

/**
 * 用链式存储实现的线性表
 */
public class LinkedList<E> {
	private Node<E> header=null;//头结点
	int size=0;//表示数组大小的指标
	
	public LinkedList(){
		this.header=new Node<E>();
	}
	public boolean add(E e){
		if(size==0){
			header.e=e;
		}else{
			//根据需要添加的内容，封装为结点
			Node<E> newNode =new Node<E>(e);
			//得到当前最后一个结点
			Node<E> last=getNode(size-1);
			//在最后一个结点后加上新结点
			last.addNext(newNode);
			//将表尾指向最后一个元素
			last=newNode;
		}
		size++;
		return true;
	}
	/**
	 * 遍历当前链表，取得当前索引对应的元素
	 * 
	 * @return
	 */
	private Node<E> getNode(int index){
		//先判断索引正确性
		if(index >size ||index<0){
			throw new RuntimeException("索引值有错:"+index);
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
	 * 根据索引，取得该索引下的数据
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index){
		//先判断索引正确性
		if(index >=size ||index<0){
			throw new RuntimeException("索引值有错:"+index);
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
	 * 设置第N个结点的值
	 *
	 *@param x
	 *@param e
	 *@return
	 */
	 public boolean set(int index,E e){
		 //先判断索引正确性
		 if(index > size ||index <0){
			 throw new RuntimeException("索引值有错:"+index);
		 }
		 Node<E> newNode=new Node<E>();
		 //得到第X个结点
		 Node<E> cNode=getNode(index);
		 cNode.e=e;
		 return true;
	 }
	 /**
	  * 用来存放数据的结点型内部类
	  */
	 class Node<e>{
		 private E e;//结点中存放的数据
 		 Node<E> next;//用来指向该结点的下一个结点
 		 Node(){
 			
 			 }
 		 Node(E e){
 			 this.e=e;
 		 }
 		 //在此结点后加上一个结点
 		 void addNext(Node<E> node){
 			 next=node;
 		 }
	 }

}
