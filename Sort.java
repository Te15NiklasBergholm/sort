public class Sort {
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//tar fram lägsta index
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
	}
    	
        public static void main(String a[]){  
            int[] arr1 = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};  
            System.out.println("Before");  
            for(int i:arr1){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
              
            selectionSort(arr1);//sorting array som använder selection sort  
             
            System.out.println("After");  
            for(int i:arr1){  
                System.out.print(i+" ");  
          }
            
            double[] arr2 = {0.5, 1.4, 9.2, -5.2, 2};  
            System.out.println("\nBefore");  
            for(double i:arr2){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
              
            double[] sortedArray = sorting(arr2);//sorting array som använder selection sort  
             
            System.out.println("After");  
            for(double i:arr2){  
                System.out.print(i+" ");  
          }  
            //doubleSort();
        }  
   
	public static double[] sorting(double[] arr){  
        for (int i = 0; i < arr.length; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;//tar fram största index
                }  
            }  
            double bigNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = bigNumber;  
        }
		return arr;  
    }  
    public static void doubleSort (){  
        double[] arr1 = {0.5, 1.4, 9.2, -5.2, 2};  
        System.out.println("Before");  
        for(double i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        double[] sortedArray = sorting(arr1);//sorting array som använder selection sort  
         
        System.out.println("After");  
        for(double i:arr1){  
            System.out.print(i+" ");  
      }  
    }  
  }