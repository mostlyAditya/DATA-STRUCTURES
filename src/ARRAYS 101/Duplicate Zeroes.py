#!/usr/bin/env python
# coding: utf-8

# Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

# In[6]:


def duplicateZeros(arr):
    """
    Do not return anything, modify arr in-place instead.
    """
    #for i in range(0,len(arr)):
    i=0
    while i <len(arr):
        if arr[i]==0:
            for j in range(len(arr)-2,i-1,-1):
                arr[j+1]=arr[j]
            i+=1
            #arr[i+1]=0
        i+=1


# In[ ]:




