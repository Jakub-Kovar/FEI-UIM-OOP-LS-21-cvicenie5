package sk.stuba.fei.uim.oop;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.toString().compareTo(o2.toString());
    }

    @Override
    public Comparator<Animal> reversed() {
        return null;
    }

    @Override
    public Comparator<Animal> thenComparing(Comparator<? super Animal> other) {
        return null;
    }

    @Override
    public <U> Comparator<Animal> thenComparing(Function<? super Animal, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Animal> thenComparing(Function<? super Animal, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Animal> thenComparingInt(ToIntFunction<? super Animal> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Animal> thenComparingLong(ToLongFunction<? super Animal> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Animal> thenComparingDouble(ToDoubleFunction<? super Animal> keyExtractor) {
        return null;
    }
}
