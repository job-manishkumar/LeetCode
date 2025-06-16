class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
        return countUnEatStudent_2(students, sandwiches);
    }

    //approach 1
    //tc -> O(n2) and sc -> O(1)
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

    //approach 2
    public int countUnEatStudent_2(int[] students, int[] sandwiches) {
        int[] std = new int[2];
        for (int i : students) {
            std[i]++;
        }

        for (int i=0;i<sandwiches.length;i++) {
            if (std[sandwiches[i]] == 0) {
                return sandwiches.length - i;
            }
            std[sandwiches[i]]--;
        }
        return 0;
    }
}
