package Arrays2;
import java.util.Arrays;
public class Array {
	//Array-2 > countEvens
	public int countEvens(int[] nums) {
		  int even = 0;
		  for(int i = 0 ; i < nums.length ; i ++) {
			  if(nums[i]%2==0) {
				  even ++ ;
			  }
			  
		  }
		  return even;
	}
	//Array-2 > bigDiff
	public int bigDiff(int[] nums) {
		  int min = nums[0];
		  int max = nums[0];
		  for(int i = 0 ; i < nums.length  ; i++) {
			  if(nums[i]>max){
			    max=nums[i];
			  }else if(nums[i]<min){
			    min=nums[i];
			  }
		  }
		  return max - min;
	}
	
	//Array-2 > centeredAverage
/*	public int centeredAverage(int[] nums) {
		  int max = nums[0];
		  int min = nums[0];
		  int sum=0;
		  for(int i = 0 ; i < nums.length ; i ++) {
			  max=Math.max(max, nums[i]);
			  min=Math.min(min, nums[i]);
			  sum += nums[i];
		  }
		  return (sum - min - max)/(nums.length - 2);
	}*/
	
	public int centeredAverage(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int sum = 0;
		  for(int num : nums) {
			  max = Math.max(max, num);
			  min = Math.min(min, num);
			  sum += num;
		  }
		  return (sum - min - max)/(nums.length - 2);
		  
	}


	//Array-2 > sum13
	public int sum13(int[] nums) {
		int sum = 0;
		  for(int i = 0 ; i < nums.length ; i++) {
			  if(nums[i]==13) {
				  i++;
				  continue;
			  }
			  sum+=nums[i];
		  }
		  return sum;
	}
	
	//Array-2 > sum67
	public int sum67(int[] nums) {
		boolean count = true;
		int sum=0;
		  for(int num : nums) {
			 
			 
			  if(num == 6) {
				  count = false;
				 
			  }
			  if(count) sum+=num;
			  if(num==7) {
				  count = true;
			  }
			 
		  }
		  return sum;
	}

	
	//Array-2 > has22
	public boolean has22(int[] nums) {
		  for(int i = 0 ; i < nums.length - 1 ; i++) {
			  if(nums[i]==2 && nums[i+1] == 2) {
				  return true;
			  }
		  }
		  return false;
	}
	//Array-2 > lucky13
	public boolean lucky13(int[] nums) {
		  for(int num : nums) {
			  if(num == 1 || num == 3) {
				  return false;
			  }
		  }
		  return true;
	}

//Array-2 > sum28
	
	public boolean sum28(int[] nums) {
		int sumOfTwo=0;
		  for(int num : nums) {
			  if(num == 2) {
				  sumOfTwo+=num;
			  }
		  }
		  if(sumOfTwo==8) return true;
		  return false;
	}
	
//Array-2 > more14
	public boolean more14(int[] nums) {
		 int sum1=0;
		 int sum2=0;
		 for(int num: nums) {
			 if(num==1) {
				 sum1++;
			 }else if(num==4) {
				 sum2++;
			 }
		 }
		 if(sum1>sum2) return true;
		 return false;
	}
	//Array-2 > fizzArray
	public int[] fizzArray(int n) {
		  int[] array = new int[n];
	
		  for(int i = 0 ; i < array.length ; i++) {
			  array[i]=i;
		  }
		  return array;
	}

	//Array-2 > only14
	public boolean only14(int[] nums) {
		  for(int num : nums) {
			  if(num!=1 && num!=4) {
				  return false;
			  }
			  
		  }
		  return true;
	}
	
	//v fizzArray2
	public String[] fizzArray2(int n) {
			String[] array = new String[n];
		  for(int i = 0 ; i <array.length ; i++) {
			  array[i]=String.valueOf(i);
		  }
		  return array;
	}
	//Array-2 > no14
	public boolean no14(int[] nums) {
		int num1=0;
		int num4=0;
		  for(int num : nums) {
			  if(num == 1) {
				num1++;
			  }else if(num==4) {
				  num4++;
			  }
		  }
		  return num1==0 && num4>0 || num1>0 && num4==0 ||num4==0 && num1==0 ;
	}
	//iseverywhere
	public boolean isEverywhere(int[] nums, int val) {
		
		  for(int i = 0 ; i < nums.length-1 ; i++) {
			  if(nums[i] != val &&nums[i+1] != val) {
				  return false;
				  
			  }
			  
		  }
		  return true;
	}
	//EITHER24
	public boolean either24(int[] nums) {
		boolean help1 = false;
		boolean help2 = false;
		
		for(int i = 0 ; i < nums.length-1 ; i++) {
			if(nums[i]==2 && nums[i+1]==2) {
				help1=true;
			}else if(nums[i]==4 && nums[i+1]==4) {
				help2=true;
			}
		}
		return help1!=help2;
	}
	//Array-2 > matchUp
	public int matchUp(int[] nums1, int[] nums2) {
		int sum=0;
	  for(int i = 0 ; i < nums1.length ; i++) {
		  if(Math.abs(nums1[i]-nums2[i])<=2 && Math.abs(nums1[i]-nums2[i]) > 0) {
			  sum++;
		  }
	  }
	  return sum;
	}

//has77
	public boolean has77(int[] nums) {
		  for(int i = 0 ; i < nums.length - 1 ; i++) {
			  if(nums[i]==7 && nums[i+1]==7 || i!= nums.length - 2 && nums[i]==7 && nums[i+2]==7) {
				  return true;
			  }
		  }
		  return false;
	}
	
	//has12
	public boolean has12(int[] nums) {
		  boolean one = false;
		  for(int num : nums) {
			  if(num == 1) {
				  one = true;
			  }
			  if(one && num==2) {
				  return true;
			  }
		  }
		  return false;
	}

//modThree
	public boolean modThree(int[] nums) {
		int odd = 0 ;
		int even = 0 ;
		  for(int num : nums) {
			  if(num%2==0) {
				  even++;
				  odd=0;
			  }else{
				  even = 0;
				  odd++;
			  }
			 if(odd == 3 || even == 3 ){
			   return true;
			 }
			  
			  
		  }
		  return false;
	}
	
	//haveThree

	public boolean haveThree(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 3 || i == nums.length - 2 && nums[i + 1] == 3)
				sum++;

			if ((nums[i] == 3 && nums[i + 1] != 3 || nums[i] != 3 && nums[i + 1] == 3)) {

				continue;
			} else {
				break;
			}
		}

		return sum == 3;
	}

	// TWOTWO
	public boolean twoTwo(int[] nums) {
		boolean Two = false;
		int sumTwo = 0;
		if (nums.length == 1 && nums[0] == 2) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				sumTwo++;
				if (i == 0 && nums[i] == 2 && nums[i + 1] == 2) {
					Two = true;
				} else if (i == nums.length - 1 && nums[i] == 2 && nums[i - 1] == 2) {
					Two = true;
				} else if (i > 0 && i <= nums.length - 2 && nums[i] == 2 && (nums[i + 1] == 2 || nums[i - 1] == 2)) {
					Two = true;
				} else
					Two = false;
		}

		}
		if (sumTwo == 0) {
			return true;
		}
		return Two;

	}
	
	//same ends
	
	public boolean sameEnds(int[] nums, int n) {
		int[] array = new int[n-1];
		int[] array2 = new int[n-1];
		  for(int i = 0 ; i < nums.length ; i ++) {
			  if(i<n) {
				  array[i]=nums[i];
			  }
			  if(i>=nums.length-n) {
				  array2[i]=nums[i];
			  }
			 
			  }
		  if(Arrays.equals(array,array2)) {
			  return true;
			  }
			  return false;
		  }

			public boolean tripleUp(int[] nums) {
				for (int i = 0; i < nums.length - 2; i++) {
					if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
						return true;
					}
				}
				return false;
			}

			/*
			 * Given start and end numbers, return a new array containing the sequence of
			 * integers from start up to but not including end, so start=5 and end=10 yields
			 * {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.
			 * Note that a length-0 array is valid. (See also: FizzBuzz Code)
			 * 
			 * 
			 * fizzArray3(5, 10) → [5, 6, 7, 8, 9] fizzArray3(11, 18) → [11, 12, 13, 14, 15,
			 * 16, 17] fizzArray3(1, 3) → [1, 2]
			 */
			public int[] fizzArray3(int start, int end) {
				int[] array = new int[end - start];
				int b = end - start;
				for (int i = 0; i < b; i++) {
					array[i] = start;
					start++;
				}
				return array;
			}

			public int[] shiftLeft(int[] nums) {
				if (nums.length == 0) {
					return nums;
				}
				int[] array = new int[nums.length];
				array[nums.length - 1] = nums[0];
				for (int i = 0; i < nums.length - 1; i++) {
					array[i] = nums[i + 1];
				}
				return array;
			}

			public int[] tenRun(int[] nums) {
				boolean multiple = false;
				int value = 0;
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] % 10 == 0) {
						multiple = true;
						value = nums[i];
					}
					if (multiple) {
						nums[i] = value;
					}
				}
				return nums;
			}

			// PRE4
			public int[] pre4(int[] nums) {
				int i = 0;
				while (nums[i] != 4) {
					i++;
				}
				int[] array = new int[i];
				for (int j = 0; j < i; j++) {
					array[j] = nums[j];
				}
				return array;
			}

			// PAST 4
			public int[] post4(int[] nums) {
				  int j = 0;
				  int i = nums.length-1;
				  while(nums[i] != 4) {
					  i--;
					  j++;
				  }
				  int[] array = new int[j];
				  
					for (int k = 0; k < j; k++) {
						array[k] = nums[k + nums.length - j];
					}
					return array;
				  }

					// notAlone
					public int[] notAlone(int[] nums, int val) {
						int[] array = new int[nums.length];
						int i = 0;
						while (i < nums.length) {

							if (nums[i] == val) {
								array[i] = Math.max(nums[i - 1], nums[i + 1]);

							} else {
								array[i] = nums[i];
							}

						}
						return array;
					}

					// ZEROFRONT
					public int[] zeroFront(int[] nums) {
						// find zeros
						// put them in to beginning of the array
						// put rest in to another array
						// concat both arrays
						Arrays.sort(nums);
						return nums;
					}

					// withoutTen
					public int[] withoutTen(int[] nums) {
						int[] result = new int[nums.length];
						int tab = 0;
						for (int j = 0; j < nums.length; j++) {
							if (nums[j] != 10) {
								result[tab++] = nums[j]; // pre increment, so 1st result[tab] = nums[i] after this
															// increment tab;
							}
						}
						return result;
					}

					// ZERO MAX
					/*
					 * Return a version of the given array where each zero value in the array is
					 * replaced by the largest odd value to the right of the zero in the array. If
					 * there is no odd value to the right of the zero, leave the zero as a zero.
					 * 
					 */
					public int[] zeroMax(int[] nums) {
						int min = 0;
						for (int i = 0; i < nums.length - 1; i++) {
							if (nums[i] == 0) {
								for (int j = i + 1; j < nums.length; j++) {

									if (nums[j] % 2 == 1) {

										min = Math.max(min, nums[j]);

									}
								}
								nums[i] = min;
								min = 0;
							}
						}
						return nums;
					}

					public int[] evenOdd(int[] nums) {
						int[] array = new int[nums.length];

						int count = 0;
						for (int i = 0; i < nums.length; i++) {
							if (nums[i] % 2 == 0) {
								array[count++] = nums[i];
							}
						}
						for (int j = 0; j < nums.length; j++) {
							if (nums[j] % 2 != 0)
								array[count++] = nums[j];
						}
						return array;
					}

				}







	











