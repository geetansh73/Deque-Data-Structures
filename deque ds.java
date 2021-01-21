public class deque
{
    int size;
    int front=-1;
    int rear=-1;
    int arr[]=new int[100];
    deque(int n)
    {
    size=n;
    }
    boolean isFull()
    {
    return ((front==0&&rear==size-1)||(front==rear+1));
    }
    boolean isEmpty()
    {
    return front==-1;
    }
    void insertfront(int key)
    {
if (isFull())
{
System.out.println("Overflow");
return;
}
if (front==-1)
{
front=0;
rear=0;
}
else if(front==0)
{
front=size-1;
}
else
{
front=front-1;
}
arr[front]=key;
}
void insertrear(int key)
{
if (isFull())
{
System.out.println("Overflow");
return;
}
if (front==-1)
{
front=0;
rear=0;
}
else if(rear==size-1)
{
rear=0;
}
else
{
rear=rear+1;
}
arr[rear]=key;
}
void deletefront()
{
if (isEmpty())
{
System.out.println("underflow");
return;
}
if (front==rear)
{
        System.out.println("deleted item "+arr[front]);
front=-1;
rear=-1;
}
else if (front==size-1)
{
        System.out.println("deleted item "+arr[front]);
front=0;
}
else
{
    System.out.println("deleted item "+arr[front]);
front=front+1;
}
}
void deleterear()
{
    if (isEmpty())
    {
    System.out.println("Underflow");
    return;
    }
    if (front==rear)
    {
        System.out.println("deleted item "+arr[rear]);
    front=-1;
    rear=-1;
    }
    else if (rear==0)
    {
            System.out.println("deleted item "+arr[rear]);
    rear=size-1;
    }
    else
    {
            System.out.println("deleted item "+arr[rear]);
    rear=rear-1;
    }
}
    public static void main(String g[])
    {
    deque obj=new deque(5);
    obj.insertfront(1);
    obj.insertfront(2);
    obj.insertfront(3);
 obj.insertrear(4);
  obj.insertrear(5);
  obj.insertrear(6);
  obj.deletefront();
    obj.deletefront();
        obj.deleterear();
        obj.deleterear();
            obj.deletefront();
            obj.deleterear();
    }
}