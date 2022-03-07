#!/usr/bin/env python
# coding: utf-8

# Return if the array is a valid Mountain array 

# In[6]:


def validMountainArray(self, arr: List[int]) -> bool:
    if len(arr)<3:
        return False
    flag=True
    count=0
    for i in range(len(arr)-1):
        if flag==True:

            if arr[i]<arr[i+1]:
                count+=1
                continue
            elif arr[i]>arr[i+1]:
                flag=False

            else:
                return False
        elif flag==False:
            if arr[i]<arr[i+1] or arr[i]==arr[i+1]:
                return False

    if flag==False and count:
        return True
    return False


# In[ ]:




