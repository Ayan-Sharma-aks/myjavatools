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
if(ptr==null) throw new InvalidIteratorException("Iterator has no elements");
T data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
}
public TMIterator<T> iterator()
{
return new TMLinkedListIterator<T>(this.start);
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
end=t;
}
this.size++;
}

public void add(int index,T data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("Invalid index");
if(index>=size)
{
add(data);
return;
}

TMNode<T> t=new TMNode<T>();
t.data=data;

if(index==0)
{
t.next=this.start;
this.start=t;
}
else
{
TMNode<T> j,k;
int i;
j=this.start;
i=0;
k=null;
while(i<index)
{
k=j;
j=j.next;
i++;
}
k.next=t;
t.next=j;
}
this.size++;
}

public void insert(int index,T data)
{
add(index,data);
}

public void update(int index,T data)
{
throw new RuntimeException("Not yet implimented");
}

public void clear()
{
this.size=0;
}

public void removeAll()
{
clear();
}

public T removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index");
T data;
if(start==end)
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
return data;
}
if(index==0)
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode<T> j,k;
k=null;
int i;
j=this.start;
i=0;
while(i<index)
{
k=j;
j=j.next;
i++;
}
data=j.data;
k.next=j.next;
if(this.end==j) this.end=k;
this.size--;
return data;
}


public T get(int index)
{
if(index<0 || index>=size) throw new IndexOutOfBoundsException("Invalid index");
TMNode<T> j;
j=this.start;
int i=0;
T data;
while(i<index)
{
j=j.next;
i++;
}
data=j.data;
return data;
}

public int size()
{
return this.size;
}


public void copyTo(TMList<T> other)
{
this.clear();
for(int e=0;e<this.size();e++) other.add(this.get(e));
}

public void copyFrom(TMList<T> other)
{
other.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}

public void appendTo(TMList<T> other)
{
for(int e=0;e<this.size();e++) other.add(this.get(e));
}

public void appendFrom(TMList<T> other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}

public void forEach(TMListAcceptor<T> a)
{
if(a==null) return;
TMNode<T> t;
for(t=start;t!=null;t=t.next); a.accept((T)t.data);
}

}