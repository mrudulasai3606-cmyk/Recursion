public class TowerOfHanoi {

    public static void toi(int n,String src,String hel,String des){
      if(n==1){
          System.out.println("Disk transfer of "+n+" disk from "+src+"to "+des);
          return;
      }

        toi(n-1,src,des,hel);
        System.out.println("Disk transfer of "+n+" disk from "+src+"to "+des);
        toi(n-1,hel,src,des);
    }
    public static void main(String[] args) {
        int n= 3;
        toi(n,"S","H","D");
    }

}
