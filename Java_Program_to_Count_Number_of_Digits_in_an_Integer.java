public class Main {

  public static void main(String[] args) {

    int count = 0, num = 123456; //entering the number whose total digits we need to check

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}
