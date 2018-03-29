/**
 *用数组实现的栈 
 */
package linearList;

public class ArrayStack <E> {
	private ArrayList<E> list=new ArrayList();//用来保存数据线性表
	private  int size;//表示当前栈元素个数
	/**
	 * 入栈操作
	 * @param e
	 */
	public void push(E e){
		list.add(e);
		size++;
	}
	/**
	 * 出栈操作
	 * @return
	 */
	public E pop(){
		E e=list.get(size-1);
		size--;
		return e;
	}
	

}
