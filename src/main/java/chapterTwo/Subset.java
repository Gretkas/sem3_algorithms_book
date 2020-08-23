package chapterTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    // cubic time complexity??
    public ArrayList<ArrayList<Integer>> subset(int[] set) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>() ;
        for (int k = set.length; k > 0; k--) {
            set = Arrays.copyOfRange(set, 0, k);
            for (int i = 0; i < set.length; i++) {
                ArrayList<Integer> subset = new ArrayList<>();
                for (int j = i; j < set.length; j++) {
                    subset.add(set[j]);
                }
                subsets.add(subset);
            }
        }
        subsets.add(new ArrayList<>());
        return subsets;
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        int[] set = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < subset.subset(set).size(); i++) {
            System.out.println(subset.subset(set).get(i).toString());
        }
    }
}
