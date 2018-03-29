package linearList;

public class ArrayList <E> {
	Object[] data=null;//��������˶��������ݵ�����
	int current;//���浱ǰΪ�ڼ���Ԫ�ص�ָ��
	int capacity;//��ʾ�����С��ָ��
	/**
	 * �����ʼ��ʱ��δ������С����Ĭ��Ϊ10��
	 */
	public ArrayList(){
		this(10);
	}
	/**
	 * ��ʼ�����Ա����������������ݵ������С
	 */
	public ArrayList(int initalSize){
		if(initalSize<0){
			throw new RuntimeException("�����С����"+initalSize);
			
		}else{
			this.data=new Object[initalSize];
			this.current=0;
			capacity=initalSize;
		}
	}
	/**
	 * ���Ԫ�صķ��������ǰ����ȷ���Ƿ��Ѿ����ˣ�
	 * @param e
	 * @return
	 */
	public boolean add(E e){
		ensureCapacity(current);//ȷ������
		this.data[current]=e;
		current++;
		return true;
		
	}
	/**
	 * ȷ��ϵͳ��ǰ�����Ƿ�������Ҫ��������㣬��ִ�в�������������㣬��������
	 *@param cur ��ǰ����
	 */
	private void ensureCapacity(int cur){
		if(cur==capacity){//����ﵽ�������ޣ�����10������,���Ƶ�ǰ����
			this.capacity=this.capacity+10;
			Object[] newdata=new Object[capacity];
			for(int i=0;i<cur;i++){
				newdata[i]=this.data[i];
			}
			this.data=newdata;
		}
	}
	/**
	 * �õ�ָ���±������
	 * @param index
	 * @return
	 */
	public E get(int index){
		validateIndex(index);
		return (E) this.data[index];
	}
	/**
	 * ���ص�ǰ���д�С
	 * @return
	 */
	public int size(){
		return this.current;
	}
	/**
	 * ����ָ���±�Ԫ�ص�����Ϊe(�滻)
	 * @param index
	 * @param e
	 * @return
	 */
	public boolean set(int index,E e){
		validateIndex(index);
		this.data[index]=e;
		return true;
	}
	/**
	 * ��֤��ǰ�±��Ƿ�Ϸ���������Ϸ����׳�����ʱ�쳣
	 * @param index �±�
	 */
	private void validateIndex(int index){
		if(index < 0 ||index >current){
			throw new RuntimeException("����index����:"+index);
		}
	}
	/**
	 * ��ָ���±�λ�ô���������e
	 * @param index �±�
	 * @param e ��Ҫ���������
	 * @return
	 */
	public boolean insert(int index,E e){
		validateIndex(index);
		Object[] tem=new Object[capacity];//��һ����ʱ������Ϊ����
		//��ʼ��������
		for(int i=0;i<current;i++){
			if(i<index){
				tem[i]=this.data[i];
			}else if(i==index){
				tem[i]=e;
			}else if(i>index){
				tem[i]=this.data[i-1];
			}
		}
		this.data=tem;
		return true;
	}
	/**
	 * ɾ��ָ���±괦��Ԫ��
	 * @param index
	 * @return
	 */
	public boolean delete(int index){
		validateIndex(index);
		Object[] tem=new Object[capacity];//��һ����ʱ������Ϊ����
		//��ʼ����
		for(int i=0;i<current;i++){
			if(i<index){
				tem[i]=this.data[i];
			}else if(i==index){
				tem[i]=this.data[i+1];
			}else if(i>index){
				tem[i]=this.data[i+1];
			}
		}
		this.data=tem;
		return true;
	}
	

}
