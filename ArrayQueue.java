/**
 * 线性表之队列
 * 用数组实现的队列
 */
package linearList;
public class ArrayQueue<E> {
	private ArrayList<E> list=new ArrayList<E>();//用来保存数据的队列
	private int size;//表示当前栈元素的个数
	/**
	 * 入队
	 * @param e
	 */
     public void EnQueue(E e){
    	 list.add(e);
    	 size++;
     }
     /**
      * 出队
      * @return
      */
     public E DeQueue(){
    	 if(size>0){
    		 E e=list.get(0);
    		 list.delete(0);
    		 return e;
    	 }else{
    		 throw new RuntimeException("已经到达队列顶部");
    	 }
     }
}

