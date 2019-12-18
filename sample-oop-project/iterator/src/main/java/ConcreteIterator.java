public class ConcreteIterator<T> {
    private T[] array;
    private int index;
    public ConcreteIterator(T[] array){
        this.array = array;
        index = array.length;
    }

    public Iterator<T> iterator(){
        Iterator<T> myIter = new Iterator<T>() {
            private int position;

            public boolean hasNext() {
                if(index != position && array[position] != null)
                    return true;
                return false;
            }

            public T next() {
                return array[position++];
            }
        };
        return myIter;
    }

}
