package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindReversePair {

	public static void main(String[] args) {
		int i=0,j=0;
		int arr[] = {20,5,4,3,2,1};
        int n= arr.length;
        int totalCount =0;
        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        int smallestValue = list.get(0);
        //System.out.println(smallestValue);
        for(i=0;i<n;i++){
            final int currentValue = arr[i];
            if(arr[i] <= 2*smallestValue){
                    continue;
            }
            List<Integer> dynamicList = list.stream().
            filter(value -> currentValue > 2*value).collect(Collectors.toList());

            System.out.println(dynamicList);
            for(int k=0;k<=i;k++){
                if(dynamicList.contains(arr[k])){
                    dynamicList.remove(arr[k]);
                }
            }
            for(j=i+1;j<n;j++){
                if(arr[i] > 2*arr[j]){
                    totalCount+=1;
                    int va = arr[j];
                    System.out.println(va);
                    if(dynamicList.indexOf(va) != -1){
                    	int index = dynamicList.indexOf(va);
                        dynamicList.remove(index);
                    }
                }
                if(dynamicList.size() == 0){
                    break;
                }
            }
            System.out.println(totalCount);
        }

        System.out.println(totalCount);
	}

}
