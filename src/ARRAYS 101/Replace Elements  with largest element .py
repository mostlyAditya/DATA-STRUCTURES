#!/usr/bin/env python
# coding: utf-8

# Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

# In[6]:


def replaceElements(self, arr: List[int]) -> List[int]:
    """for i in range(len(arr)):
            if i==len(arr)-1:
                arr[i]=-1
            else:

                arr[i]=max(arr[i+1:])
    return arr"""

    max_val =-1
    new_max_val=0

    for i in range(len(arr)-1,-1,-1):


        if arr[i]>max_val:
            new_max_val=arr[i]


        arr[i]=max_val
        max_val=new_max_val
    return arr


# In[ ]:




