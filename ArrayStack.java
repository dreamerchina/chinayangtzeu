/**
 *������ʵ�ֵ�ջ 
 */
package linearList;

public class ArrayStack <E> {
	private ArrayList<E> list=new ArrayList();//���������������Ա�
	private  int size;//��ʾ��ǰջԪ�ظ���
	/**
	 * ��ջ����
	 * @param e
	 */
	public void push(E e){
		list.add(e);
		size++;
	}
	/**
	 * ��ջ����
	 * @return
	 */
	public E pop(){
		E e=list.get(size-1);
		size--;
		return e;
	}
	

}
