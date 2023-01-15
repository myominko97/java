
public class DynamicArray {
    private static int[] orginal = new int[0];

    public static void main(String[] args) {
        DynamicArray app = new DynamicArray();
        app.addData(1);
        app.addData(9);
        app.addData(-1);
        app.addData(10);
        app.addData(4);
        app.printArray();
    }

    private void addData(int data) {
        int[] temp = new int[orginal.length + 1];
        for (int i = 0; i < orginal.length; i++) {
            temp[i] = orginal[i];

            temp[temp.length - 1] = data;
            orginal = temp;

        }
        // System.out.println(orginal); // after add data print
    }

    // private void deleteLast() {
    // if (orginal.length <= 0)
    // throw new RuntimeException("Add Data in Array");
    // int[] temp = new int[orginal.length - 1];
    // for (int i = 0; i < temp.length; i++)
    // temp[i] = orginal[i];

    // }

    // private void deleteFirst() {
    // int[] temp = new int[orginal.length - 1];

    // for (int i = 0; i < temp.length; i++)
    // temp[i] = orginal[i + 1];

    // // for (int i = 0; i < orginal.length; i++)
    // // if (i == 0)
    // // continue;
    // // temp[i - 1] = orginal[i];
    // orginal = temp;
    // }

    // private void deleteIndex() {

    // }

    private void printArray() {
        // System.out.print("Data in Array : ");
        for (int i = 0; i < orginal.length; i++) {
            System.out.println(orginal[i]);
            if (i != orginal.length - 1)
                System.out.print(orginal[i] + ",");

            else
                System.out.print(orginal[i] + ".");

        }
        System.out.println();
    }
}
