import java.util.*;

class Main {

    static class ArrayListClass {

        private int arr[];

        private int capacity;

        private int current;

        public ArrayListClass() {
            arr = new int[1];
            capacity = 1;
            current = 0;
        }


        public void push(int data) {

            if (current == capacity) {
                int temp[] = new int[2 * capacity];

                for (int i = 0; i < capacity; i++)
                    temp[i] = arr[i];

                capacity *= 2;
                arr = temp;
            }

            arr[current] = data;
            current++;
        }

        void push(int data, int index) {

            if (index == capacity)
                push(data);
            else
                arr[index] = data;
        }

        int get(int index) {

            if (index < current)
                return arr[index];

            return -1;
        }

        void pop(int idx) {

        }

        int size() {
            return current;
        }
        
        int getcapacity() {
            return capacity;
        }

        void print() {
            for (int i = 0; i < current; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner scanner  = new Scanner(System.in);
        int commandsCount = scanner.nextInt();
        ArrayListClass v
                = new ArrayListClass();

        for(int i = 0; i < commandsCount; i++){
            String cmd = scanner.next();
            switch (cmd) {
                case "add":
                    int value = scanner.nextInt();
                    v.push(value);
                    break;
                case "remove":
                    int idx  = scanner.nextInt();
                    for( int j = 0; j < v.size(); j++){
                        if (j == idx)
                    }
                    break;
                case "size":
                    System.out.println(v.size());
                    break;
                case "indexof":
                    int index = scanner.nextInt();
                    System.out.println(v.get(index));
            }
        }

    }

}
