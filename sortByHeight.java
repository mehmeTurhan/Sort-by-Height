int[] solution(int[] a) {
    int b[] = a;
    int min=0;
    for(int i=0; i<a.length; i++){
        for(int j=i+1; j<b.length; j++){
            if(a[i]!=-1){
                if(b[j]!=-1){
                    min = a[i];
                    if(min>b[j]){
                        a[i]=b[j];
                        b[j]=min;
                    }
                }    
            }
        }
    } 
    return b;
}
