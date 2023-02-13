public class sortStudsMarks {
    public static void main(String[] args) {
        String [] studs= {"aman","Deepak","Karan","Suchita","Raman"};
        int [] marks= {87,34,76,94,37};
        int l= marks.length;
        int loc;
        String s= new String();
        for(int i=0;i<l;i++){
            int mks= marks[i];
            loc=i;
            for(int j=i+1;j<l;j++){

                if(mks<marks[j]){
                    mks=marks[j];
                    loc=j;
                }
            }
            int temp=marks[i];
            marks[i]=marks[loc];
            marks[loc]=temp;
            s=studs[i];
            studs[i]=studs[loc];
            studs[loc]=s;


        }
        for(String e:studs){
            System.out.println(e);
        }
    }
}
