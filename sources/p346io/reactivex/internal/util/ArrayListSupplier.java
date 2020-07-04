package p346io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.util.ArrayListSupplier */
public enum ArrayListSupplier implements C7327h<Object, List<Object>>, Callable<List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> C7327h<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public final List<Object> call() throws Exception {
        return new ArrayList();
    }

    public final List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }
}
