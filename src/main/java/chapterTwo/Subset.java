package chapterTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Subset {


    /**
     * return all subsets of a set exponential time
     *
     * @param set the set
     * @return the array list
     */
    public ArrayList<ArrayList<Integer>> subsetRec(int[] set) {
        if (set.length == 0) {
            ArrayList<ArrayList<Integer>> x = new ArrayList<>();
            x.add(new ArrayList<>());
            return x;
        }
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>(subsetRec(Arrays.copyOfRange(set, 0, set.length-1)));
        subsets.addAll(subsetRec(Arrays.copyOfRange(set, 0, set.length-1)));

        for (int i = (int) Math.ceil((double) subsets.size() / 2); i < subsets.size(); i++) {
            subsets.get(i).add(set.length-1);
        }

        return subsets;
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        int[] set = {0, 1, 2, 3};
        for (int i = 0; i < subset.subsetRec(set).size(); i++) {
            System.out.println(subset.subsetRec(set).get(i).toString());
        }
    }
}
