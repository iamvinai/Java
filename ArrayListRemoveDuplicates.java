import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListRemoveDuplicates {
    public static void main(String args[]){
        ArrayList<Integer> duplicatesList = new ArrayList<Integer>(Arrays.asList(1,1,2,
                                                                    3,4,5,5,6,7,7,7,8,9));
        LinkedHashSet<Integer> removeDuplicates = new LinkedHashSet<>(duplicatesList);

        ArrayList<Integer> distinctElements = new ArrayList<>(removeDuplicates);

        System.out.println(distinctElements);

        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,1,2,
                                                                    3,4,5,5,6,7,7,7,8,9));
        List<Integer> updateMarksList = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(updateMarksList);

    }
}
