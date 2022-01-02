import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortIndex {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(13);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);

        System.out.println(numbers.stream().map(i -> i.toString())
                .collect(Collectors.joining(", ")));

        mergeSort(numbers, 0, numbers.size());

        System.out.println(numbers.stream().map(i -> i.toString())
                .collect(Collectors.joining(", ")));
    }

    private static void mergeSort(List<Integer> numbers, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int mid = ((endIndex - startIndex) / 2) + startIndex;

        mergeSort(numbers, startIndex, mid);
        mergeSort(numbers, mid + 1, endIndex);

        merge(numbers, startIndex, mid, endIndex);
    }

    private static void merge(List<Integer> numbers, int startIndex, int mid, int endIndex) {

        int secondIndex = mid;

        List<Integer> sortedSubList = new ArrayList<>(endIndex + 5);

        for (int index = startIndex; index < mid; index++) {

            if (numbers.get(index) < numbers.get(secondIndex)) {
                sortedSubList.add(numbers.get(index));
            } else {
                sortedSubList.add(numbers.get(secondIndex));
                secondIndex++;
            }
        }

        for (int index = secondIndex; index < endIndex; index++) {
            sortedSubList.add(numbers.get(secondIndex));
        }

        for (int index = 0; index < sortedSubList.size(); index++) {
            numbers.set(startIndex + index, sortedSubList.get(index));
        }
    }
}
