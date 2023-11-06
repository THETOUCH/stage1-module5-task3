package com.epam.mjc;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
//        throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().flatMap(Collection::stream).min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        if (list.stream().reduce(Integer::sum).isPresent()) {
            return list.stream().reduce(Integer::sum).get();
        } else {
            throw new RuntimeException("This list has no elements");
        }
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
