int max=0;
        int ans=0;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[j][i]==0){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=i;
            }
        }
        if(max==0){
            return -1;
        }
        return ans;
