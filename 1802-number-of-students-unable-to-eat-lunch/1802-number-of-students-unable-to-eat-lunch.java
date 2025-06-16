class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
        return countUnEatStudent(students, sandwiches);
    }

    public int countUnEatStudent(int[] students, int[] sandwiches) {
        int front = 0;
        int rear = students.length - 1;
        int top = 0;
        int count = 0;

        while (front < students.length && (rear - front + 1) > count) {
            if (students[front] == sandwiches[top]) {
                front++;
                top++;
                count = 0;
            } else {
                shiftLeft(students, front, rear);
                count++;
            }
        }
        return count;
    }

    public void shiftLeft(int[] arr, int si, int ei) {
        int temp = arr[si];
        for (int i = si; i < ei; i++) {
            arr[i] = arr[i + 1];
        }
        arr[ei] = temp;
    }
}
