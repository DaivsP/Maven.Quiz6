package rocks.zipcode.io.objectorientation;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public enum TVChannel {
    MSN(0),
    CNN(1),
    FOX(2),
    AE(3),
    MTV(4),
    BET(5),
    HBO(6),
    NBC(7),
    CBS(8);
    final int ordinal;

    private TVChannel(int ordinal){
        this.ordinal = ordinal;
    }

    static Map<Integer, TVChannel> lookup = null;
    /**
     * @param ordinal; ordinal of the expected enumeration
     * @return enumeration with respective ordinal
     */
    public static TVChannel getByOrdinal(Integer ordinal) {
        if (lookup == null) {
            lookup = Arrays.stream(TVChannel.values())
                    .collect(Collectors.toMap(s -> s.ordinal, s -> s));
        }
        return lookup.get(ordinal);
    }

    /**
     * @param name; name of the expected enumeration
     * @return enumeration with respective name
     */
    public static TVChannel getByName(String name) {
        return find(channel -> name.equals(channel.name()));
    }

    /**
     * @param predicate - clause to evaluate
     * @return the first channel which is applicable to the `predicate`
     */
    private static TVChannel find(Predicate<TVChannel> predicate) {
        return Arrays
                .stream(TVChannel.values())
                .filter(predicate)
                .findFirst()
                .get();
    }
}
