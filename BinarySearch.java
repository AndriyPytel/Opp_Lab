public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        int left = 0;
        int right = data.lenght();
        while(true){
            int pos = (right - left) / 2 + left;
            if(left > right)
                System.out.println("-1");
            else{
                if(a[pos] == numberToFind){
                    System.out.println(pos);
                    break;
                }
                else{
                    if(numberToFind < a[pos])
                        right = pos;
                    else{
                        if(numberToFind > a[pos])
                            left = pos;
                    }
                }
            }
        }
        // PUT YOUR CODE HERE
    }
}
