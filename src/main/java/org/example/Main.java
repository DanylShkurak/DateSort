package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> dates =  new ArrayList<>();
                dates.add(LocalDate.of(2005, 7, 1));
                dates.add(  LocalDate.of(2005, 1, 2));
                dates.add (LocalDate.of(2005, 1, 1));
                dates.add( LocalDate.of(2005, 5, 3));
        IDateSorterImpl iDateSorter = new IDateSorterImpl();
        iDateSorter.sortDates(dates).forEach(System.out::println);
    }
}