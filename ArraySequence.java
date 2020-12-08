import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;
  private int start,current,end;

  /*Construct the sequence by copying values from the
    other array into the data array*/
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i<other.length; i++) {
      data[i] = other[i];
    }
    start = 0;
    current = start;
    end = other.length;
  }

  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    for (int i = 0; i<otherseq.length(); i++) {
      if (otherseq.hasNext()) {
        data[i] = otherseq.next();
      }
    }
    start = 0;
    current = start;
    end = otherseq.length();
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    current = start;
  }

  public boolean hasNext() {
    return current<end;
  }

  public int next() {
    if (hasNext()) {
      int temp = current;
      current++;
      return data[temp];
    } else {
      throw new NoSuchElementException();
    }
  }

}
