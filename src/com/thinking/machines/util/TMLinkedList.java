package com.thinking.machines.util;
public class TMLinkedList<T> implements TMList<T>
{
class TMNode<T>
{
public T data;
public TMNode<T> next;
public TMNode()
{
this.data=null;
this.next=null;
}
}
private TMNode<T> start;
private TMNode<T> end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
}

public class TMLinkedListIterator<T> implements TMIterator<T>
{
private TMNode<T> ptr;
public TMLinkedListIterator(TMNode<T> ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
return this.ptr!=null;
}
public T next()
{
if(ptr==null)throw new InvalidIteratorException("Iterator has no more elements");
T data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
}

public TMIterator<T> iterator()
{
return new TMLinkedListIterator(this.start);
}

public void forEach(TMListItemAcceptor<T> a)
{
if(a==null)return;
TMNode<T> t;
for(t=start;t!=null;t=t.next)a.accept(t.data);
}

public void add(T data)
{
TMNode<T> t=new TMNode<T>();
t.data=data;
if(this.start==null)
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
this.end=t;
}
this.size++;
}

public void add(int index,T data)
{
if(index<0 )throw new ArrayIndexOutOfBoundsException("Invalid index"+index);
if(index>=size)
{
add(data);
return;
}
TMNode<T> node=new TMNode<T>();
node.data=data;

if(index==0)
{
node.next=this.start;
this.start=node;
}
else
{
TMNode<T> j,k;
int i=0;
j=this.start;
k=null;
while(i<index)
{
k=j;
j=j.next;
i++;
}
k.next=node;
node.next=j;
}
this.size++;
}

public void insert(int index,T data)
{
add(index,data);
}

public void removeAll()
{
clear();
}

public T removeAt(int index)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index"+index);
TMNode<T> t1,t2;
T data;
t2=null;
t1=this.start;
int pos=index;
for(int e=0;e<pos;e++)
{
t2=t1;
t1=t1.next;
}
if(t1==this.start && t1==this.end )
{
this.start=null;
this.end=null;
}
if(t1==this.start && t1!=this.end)
{
this.start=t1.next;
}
if(t1!=this.start && t1==this.end)
{
t2.next=null;
this.end=t2;
}
data=t1.data;
t2.next=t1.next;
this.size--;
return data;
}

public void clear()
{
this.start=null;
this.end=null;
this.size=0;
}

public int size()
{
return this.size;
}

public T get(int index)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index"+index);
int x=0;
TMNode<T> t;
t=this.start;
while(x<index)
{
t=t.next;
x++;
}
return t.data;
}

public void update(int index,T data)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index"+index);
if(index==0)
{
this.start.data=data;
return;
}
if(index==this.size-1)
{
this.end.data=data;
return;
}
TMNode<T> t;
int x=0;
t=this.start;
while(x<index)
{
t=t.next;
x++;
}
t.data=data;
}

public void copyTo(TMList<T> other)
{
other.clear();
for(int e=0; e<this.size(); e++)
other.add(this.get(e));
}

public void copyFrom(TMList<T> other)
{
this.clear();
for(int e=0; e<other.size(); e++)
this.add(other.get(e));
}

public void appendTo(TMList<T> other)
{
for(int e=0; e<this.size(); e++)
other.add(this.get(e));
}

public void appendFrom(TMList<T> other)
{
for(int e=0; e<other.size(); e++)
this.add(other.get(e));
}

}