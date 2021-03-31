#!/usr/bin/env python
# coding: utf-8

# In[1]:


import random


# In[23]:


def bSearch(A,key,l,h):
    mid=(l+h)//2
    
    if h>=l:
        if A[mid]==key:
            return mid
        elif A[mid]>key:
            return bSearch(A,key,l,mid-1)
        else:
            return bSearch(A,key,mid+1,h)
    
        
    return -1

def bSearchI(A,key):
    l=0
    r=len(A)-1
    while r>=l:
        
        mid=(l+r)//2
    
        
        if A[mid]==key:
            return mid
        elif A[mid]>key:
            
            r=mid-1
        else:
            
            l=mid+1
    
        
    return -1
            
        
    


# In[9]:


my_list=[]
for _ in range(16):
    my_list.append(random.randint(0,100))


# In[10]:


my_list=sorted(my_list)
my_list


# In[28]:


bSearch(my_list,2,0,15)
bSearchI(my_list,0)


# In[18]:





# In[31]:



            
    


# In[34]:





# In[ ]:




