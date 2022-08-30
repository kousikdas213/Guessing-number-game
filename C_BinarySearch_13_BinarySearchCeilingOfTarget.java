public class C_BinarySearch_13_BinarySearchCeilingOfTarget
{
    public static void main(String[] args)
    {
        int[] arr={2,3,8,14,26,35,39,50,51,81,92,98};
        int target=52;
        System.out.println("Ceiling value: "+check(arr,target));
    }

    static int check(int[] arr,int target)
    {
        int start=0,end=arr.length-1,mid;
        boolean isasc=arr[start]<arr[end];
        if(isasc)
        {
            while(start<end)
            {
                mid=start+(end-start)/2;
                if(target<arr[mid])
                    end=mid-1;
                else if(target>arr[mid])
                    start=mid+1;
                else
                    return arr[mid];
            }
            return arr[start];
        }
        else
        {
            while(start<end)
            {
                mid=start+(end-start)/2;
                if(target<arr[mid])
                    start=mid+1;
                else if(target>arr[mid])
                    end=mid-1;
                else
                    return arr[mid];
            }
            return arr[end];
        }
    }
}
