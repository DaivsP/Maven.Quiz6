package rocks.zipcode.io.collections;

import java.util.*;

public class CollectionUtils {

    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {
        List<E> list = new ArrayList<>();
        for (Object obj : collection) {
            list.add((E)obj);
        }
        return list;
    }

    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        if (nestedCollection.contains(collection)){
            return true;
        }
        return false;
    }

    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {
        return Arrays.asList(collections);
    }

    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {
        List<Object> list = new ArrayList<>();
        for (Collection collection : collections) {
            for (Object obj : collection) {
                list.add(obj);
            }
        }
        return list;
    }
}
