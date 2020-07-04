package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ButterKnife {
    static final Map<Class<?>, Constructor<? extends Unbinder>> BINDINGS = new LinkedHashMap();
    private static boolean debug;

    public interface Action<T extends View> extends Action<T> {
    }

    public interface Setter<T extends View, V> extends Setter<T, V> {
    }

    @SafeVarargs
    public static <T extends View> void apply(T[] tArr, Action<? super T>... actionArr) {
        ViewCollections.run(tArr, (Action<? super T>[]) actionArr);
    }

    public static <T extends View, V> void apply(T[] tArr, Setter<? super T, V> setter, V v) {
        ViewCollections.set(tArr, (Setter<? super T, V>) setter, v);
    }

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    public static Unbinder bind(View view) {
        return bind((Object) view, view);
    }

    public static Unbinder bind(Activity activity) {
        return bind((Object) activity, activity.getWindow().getDecorView());
    }

    public static Unbinder bind(Dialog dialog) {
        return bind((Object) dialog, dialog.getWindow().getDecorView());
    }

    private static Constructor<? extends Unbinder> findBindingConstructorForClass(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Constructor<? extends Unbinder> constructor2 = (Constructor) BINDINGS.get(cls);
        if (constructor2 != null || BINDINGS.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            return null;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("_ViewBinding");
            constructor = classLoader.loadClass(sb.toString()).getConstructor(new Class[]{cls, View.class});
        } catch (ClassNotFoundException unused) {
            constructor = findBindingConstructorForClass(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            StringBuilder sb2 = new StringBuilder("Unable to find binding constructor for ");
            sb2.append(name);
            throw new RuntimeException(sb2.toString(), e);
        }
        BINDINGS.put(cls, constructor);
        return constructor;
    }

    public static <T extends View> void apply(T t, Action<? super T> action) {
        ViewCollections.run(t, (Action<? super T>) action);
    }

    @SafeVarargs
    public static <T extends View> void apply(T t, Action<? super T>... actionArr) {
        ViewCollections.run(t, (Action<? super T>[]) actionArr);
    }

    public static Unbinder bind(Object obj, Activity activity) {
        return bind(obj, activity.getWindow().getDecorView());
    }

    public static <T extends View> void apply(List<T> list, Action<? super T> action) {
        ViewCollections.run(list, (Action<? super T>) action);
    }

    public static Unbinder bind(Object obj, Dialog dialog) {
        return bind(obj, dialog.getWindow().getDecorView());
    }

    public static Unbinder bind(Object obj, View view) {
        Constructor findBindingConstructorForClass = findBindingConstructorForClass(obj.getClass());
        if (findBindingConstructorForClass == null) {
            return Unbinder.EMPTY;
        }
        try {
            return (Unbinder) findBindingConstructorForClass.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Unable to invoke ");
            sb.append(findBindingConstructorForClass);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to invoke ");
            sb2.append(findBindingConstructorForClass);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    @SafeVarargs
    public static <T extends View> void apply(List<T> list, Action<? super T>... actionArr) {
        ViewCollections.run(list, (Action<? super T>[]) actionArr);
    }

    public static <T extends View> void apply(T[] tArr, Action<? super T> action) {
        ViewCollections.run(tArr, (Action<? super T>) action);
    }

    public static <T extends View, V> void apply(T t, Property<? super T, V> property, V v) {
        ViewCollections.set(t, property, v);
    }

    public static <T extends View, V> void apply(T t, Setter<? super T, V> setter, V v) {
        ViewCollections.set(t, (Setter<? super T, V>) setter, v);
    }

    public static <T extends View, V> void apply(List<T> list, Property<? super T, V> property, V v) {
        ViewCollections.set(list, property, v);
    }

    public static <T extends View, V> void apply(List<T> list, Setter<? super T, V> setter, V v) {
        ViewCollections.set(list, (Setter<? super T, V>) setter, v);
    }

    public static <T extends View, V> void apply(T[] tArr, Property<? super T, V> property, V v) {
        ViewCollections.set(tArr, property, v);
    }
}
