package p346io.reactivex.internal.util;

import java.util.List;
import p346io.reactivex.p348d.C7324c;

/* renamed from: io.reactivex.internal.util.ListAddBiConsumer */
public enum ListAddBiConsumer implements C7324c<List, Object, List> {
    INSTANCE;

    public static <T> C7324c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    public final List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
