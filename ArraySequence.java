import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the
    other array into the data array*/
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i<other.length; i++) {
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    for (int i = 0; i<otherseq.length(); i++) {
      if (otherseq.hasNext()) {
        data[i] = otherseq.next();
      }
    }
  }
  
}
