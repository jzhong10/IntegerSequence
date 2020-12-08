public class Tester {
    public static void main(String[] args) {
      /*
        Range x = new Range(1, 5);
        System.out.println(x.length());
        Range y = new Range(14, 29);
        System.out.println(y.length());

        IntegerSequence r = new Range(10,15);
        while(r.hasNext()){
          System.out.print(r.next());
          if( r.hasNext() ){
             System.out.print( ", " );
          }
        }
        System.out.println();
        //System.out.println(r.next());
        r.reset();
        System.out.println(r.next());

        int[] nums = {1,3,5,0,-1,3,9};
        IntegerSequence as = new ArraySequence(nums);

        System.out.println("ArraySequence(array):");
        while(as.hasNext()){
          System.out.print(as.next()+", ");
        }

        System.out.println();

        r = new Range(10,20);
        as = new ArraySequence(r);

        System.out.println("ArraySequence(seq):");
        while(as.hasNext()){
          System.out.print(as.next()+", ");
        }
        System.out.println();
*/
        IntegerSequence r1 = new Range(-20,50);
        ArraySequence ar1 = new ArraySequence(r1);
        //System.out.println(ar1.length());
        System.out.println(r1.length());
        System.out.println();
        // /r1.reset();
        System.out.println(r1.next());
        //System.out.println(ar1.length());
        System.out.println(r1.length());
        System.out.println();

        // /ArraySequence ar1 = new ArraySequence(r1);

        IntegerSequence r = new Range(10,20);
        IntegerSequence as = new ArraySequence(r);

        System.out.println("ArraySequence(seq):");
        while(r.hasNext() == as.hasNext() && r.hasNext()!=false) {
          System.out.print(as.next() + " , " + r.next() + " ; ");
        }

    }
}
