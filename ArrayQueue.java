/**
 * ���Ա�֮����
 * ������ʵ�ֵĶ���
 */
package linearList;
public class ArrayQueue<E> {
	private ArrayList<E> list=new ArrayList<E>();//�����������ݵĶ���
	private int size;//��ʾ��ǰջԪ�صĸ���
	/**
	 * ���
	 * @param e
	 */
     public void EnQueue(E e){
    	 list.add(e);
    	 size++;
     }
     /**
      * ����
      * @return
      */
     public E DeQueue(){
    	 if(size>0){
    		 E e=list.get(0);
    		 list.delete(0);
    		 return e;
    	 }else{
    		 throw new RuntimeException("�Ѿ�������ж���");
    	 }
     }
}

