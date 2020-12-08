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
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    for (int i = 0; i<otherseq.length(); i++) {
      if (otherseq.hasNext()) {
        data[i] = otherseq.next();
      }
    }
    otherseq.reset();
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    currentIndex = 0;
  }

  public boolean hasNext() {
    return currentIndex < this.data.length;
  }

  public int next() {
    if (hasNext()) {
      int temp = currentIndex;
      currentIndex++;
      return data[temp];
    } else {
      throw new NoSuchElementException();
    }
  }

}
