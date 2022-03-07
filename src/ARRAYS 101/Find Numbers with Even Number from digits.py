#!/usr/bin/env python
# coding: utf-8

# Given an array nums of integers, return how many of them contain an even number of digits.

# In[5]:


def findNumbers(nums):
        even_digits=0
        for num,i in enumerate(nums):
            check=i//10
            if check<10 and  check!=0:
                even_digits+=1
            elif check>=100 and check<1000 or check==10000:
                even_digits+=1
        return even_digits


# In[ ]:




