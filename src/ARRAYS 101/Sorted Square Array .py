#!/usr/bin/env python
# coding: utf-8

# Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

# In[5]:


def sortedSquares(nums):
        """for num,var in enumerate(nums):
                i=var**2
                nums[num]=i
                
        return sorted(nums)
        """
        size=len(nums)
        
        arr=[0]*size
        
        left_ptr=0
        
        right_ptr=size-1
        
        right_insert=size-1
        
        while left_ptr<=right_ptr:
            
            if nums[left_ptr]**2<nums[right_ptr]**2:
                
                arr[right_insert]=nums[right_ptr]**2
                right_ptr-=1
                right_insert-=1
            else:
                # nums[left_ptr]**2>nums[right_ptr]**2:
                
                arr[right_insert]=nums[left_ptr]**2
                left_ptr+=1
                right_insert-=1
        return arr


# In[ ]:




