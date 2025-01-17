public class Main {
    public static void main(String[] args) {

        class Box<E> {
            private E item;

            public void setItem(E item) {
                this.item = item;
            }

            public E getItem() {
                return item;
            }

        }

        class Box2<T> {
            private T item;

            public void setItem(T item) {
                this.item = item;
            }

            public T getItem() {
                return item;
            }

        }

         interface Pair<K, V> {
            K getKey();
            V getValue();
        }

             class OrderedPair<K, V> implements Pair<K, V> {
            private final K key;
            private final V value;

            public OrderedPair(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K getKey() { return key; }
            public V getValue() { return value; }
        }



    }
}
