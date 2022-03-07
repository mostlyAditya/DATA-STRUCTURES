#!/usr/bin/env python
# coding: utf-8

# Given an array arr of integers, check if there exists two integers x and y such that x is the double of y ( i.e. x = 2 * y).
# Return True if there exists such a index else False

# In[6]:


def checkIfExist(self, arr: List[int]) -> bool:
    """if len(arr)==0 or arr is None:
        return False
    for i in range(0,len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i]%2==0:

                if 2*arr[i]==arr[j] or arr[j]==arr[i]/2:
                    return True
            elif arr[j]==2*arr[i]:
                return True

    return False"""


    if arr.count(0)>1:
        return True
    find_element=set(arr)-{0}

    for i in find_element:
        if 2*i in find_element:
            print(i)
            return True
    return False


# In[ ]:




