package org.example;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IDateSorterImpl implements IDateSorter{
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        Predicate<LocalDate> predicate = date -> !date.getMonth().toString().contains("R");

        Comparator<LocalDate> comparator =
                Comparator.comparing( predicate::test)
                        .thenComparing(date -> predicate.test(date) ? -date.hashCode() : date.hashCode());
        return unsortedDates.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
