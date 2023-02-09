//package com.bootcoding.examque;// Java implementation for the above approach
//import java.util.*;
//
//class GFG{
//
//// Function to find the longest subarray
//// with increasing contiguous elements
//public static int maxiConsecutiveSubarray(int arr[],
//										int N)
//{
//
//	// Stores the length of
//	// required longest subarray
//	int maxi = 0;
//
//	for(int i = 0; i < N - 1; i++)
//	{
//
//		// Stores the length of length of
//		// longest such subarray from ith
//		// index
//		int cnt = 1, j;
//
//		for(j = i; j < N - 1; j++)
//		{
//
//			// If consecutive elements are
//			// increasing and differ by 1
//			if (arr[j + 1] == arr[j] + 1)
//			{
//				cnt++;
//			}
//
//			// Otherwise
//			else
//			{
//				break;
//			}
//		}
//
//		// Update the longest subarray
//		// obtained so far
//		maxi = Math.max(maxi, cnt);
//		i = j;
//	}
//
//	// Return the length obtained
//	return maxi;
//}
//
//// Driver Code
//public static void main(String args[])
//{
////	int N = ;
//	int arr[] = { 5, 6, 3, 5, 7,
//				8, 9, 1,2 };
//
//	System.out.println(maxiConsecutiveSubarray(arr, N));
//}
//}
//
//// This code is contributed by hemanth gadarla
