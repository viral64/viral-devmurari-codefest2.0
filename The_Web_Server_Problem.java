
import java.util.*;
public class The_Web_Server_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i][0]);
        }
        int ans[][]=new int[n][3];
        Collections.sort(list);
        for(int i=0;i<n;i++){
            int ind=0;
            for(int j=0;j<n;j++){
                if(list.get(i)==arr[j][0]){
                    ind =j;
                    ans[i][0]=list.get(i);
                    ans[i][1]=arr[j][1];
                    ans[i][2]=arr[j][2];
                    break;
                }
            }
            arr[ind][0]=-1;
        } 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ans[i][0]==ans[j][0]){
                    if(ans[i][1]<ans[j][1]){
                        int temp=ans[i][1];
                        ans[i][1]=ans[j][1];
                        ans[j][1]=temp;
                        temp=ans[i][2];
                        ans[i][2]=ans[j][2];
                        ans[j][2]=temp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
