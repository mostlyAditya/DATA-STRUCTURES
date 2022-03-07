#!/usr/bin/env python
# coding: utf-8

# Given a binary array, find the maximum number of consecutive 1s in this array.

# In[3]:


def findMaxConsecutiveOnes(nums):
        flag_val=False
        check_ones=0
        max_ones=0
        for i in range(0,len(nums)):

            
            if nums[i]==0:
                if flag_val==True:
                    flag_val=False
                    if check_ones>max_ones:
                        max_ones=check_ones

                check_ones=0

            else:
                if flag_val==True:
                    check_ones+=1
                else:
                    flag_val=True
                    check_ones+=1
        if check_ones>max_ones:
            max_ones=check_ones

        
        return max_ones


# In[ ]:




