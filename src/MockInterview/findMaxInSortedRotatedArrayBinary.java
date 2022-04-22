package MockInterview;

public class findMaxInSortedRotatedArrayBinary {
    public static int find_roatation(int[] array, int n) {

        // search space is nums[start…end]
        int start = 0, end = n - 1;

        // loop till the search space is exhausted
        while (start <= end) {

            // Case 1
            // if the search space is already sorted, we have
            // found the minimum element (at index `start`)
            if (array[start] <= array[end]) return start;

            int mid = (start + end) / 2;

            // find the next and previous element of the `mid` element
            // (in a circular manner)
            int next = (mid + 1) % n;   // if current mid is the last element than %n gives the first element.
            int prev = (mid + n - 1) % n;   // if current mid is the first element than %n gives the last element.

            // Case 2
            // if the `mid` element is less than both its next and previous
            // neighbor, it is the array's minimum element.
            if (array[mid] <= array[prev] && array[mid] <= array[next]) return mid;

            // Case 3
            // if array[mid…right] is sorted, and `mid` is not the minimum element,
            // then the pivot element cannot be present in array[mid…right],
            // discard array[mid…right] and search in the left half.
            if (array[mid] <= array[end]) end = mid - 1;

            // Case 4
            // if array[left…mid] is sorted, then the pivot element cannot be present
            // in it; discard array[left…mid] and search in the right half.
            if (array[mid] >= array[start]) start = mid + 1;
        }

        // invalid input
        return -1;
    }
    public static void main(String[] args) {

    }
}
