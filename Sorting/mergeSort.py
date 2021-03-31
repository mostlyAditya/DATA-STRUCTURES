#!/usr/bin/env python
# coding: utf-8

# In[3]:


import random 
my_list=[]
for _ in range(17):
    my_list.append(random.randint(0,100))

def mergeSort(arr):
    if len(arr)>1:
        mid=len(arr)//2
        
        L=arr[:mid]
        R=arr[mid:]
        
        mergeSort(L)
        mergeSort(R)
        
        i=j=k=0
        
        while i<len(L) and j<len(R):
            if L[i]<R[j]:
                arr[k]=L[i]
                i+=1
            else:
                arr[k]=R[j]
                j+=1
            k+=1
        
        while i<len(L):
            arr[k]=L[i]
            i+=1
            k+=1
        while j<len(R):
            arr[k]=R[j]
            j+=1
            k+=1
        


# In[4]:


print(my_list)


# In[6]:


mergeSort(my_list)


# In[7]:


my_list


# In[ ]:




