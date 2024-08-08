public class QuickFind {
    public int arr[];
    public int numberOfGroups=0;
    public QuickFind(int n){
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        } 
        numberOfGroups = n;
    }
    public int find(int p){
        return arr[p];
    }
    public void union(int p,int q){
        int rootp = arr[p];
        int rootq = arr[q];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==rootp){
                arr[i]=rootq;
            }
        } 
        if(rootp!=rootq){
            numberOfGroups--;
        }
    }
    public boolean isConnected(int p,int q){
        return arr[p]==arr[q];
    }
    public int count(){
        return numberOfGroups;
    }

}
