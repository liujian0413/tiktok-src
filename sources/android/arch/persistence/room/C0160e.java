package android.arch.persistence.room;

import android.arch.persistence.room.RoomDatabase.C0143a;
import android.content.Context;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: android.arch.persistence.room.e */
public final class C0160e {
    /* renamed from: a */
    public static <T extends RoomDatabase> C0143a<T> m440a(Context context, Class<T> cls) {
        return new C0143a<>(context, cls, null);
    }

    /* renamed from: a */
    static <T, C> T m442a(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName.replace('.', '_'));
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (name.isEmpty()) {
                str2 = sb2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name);
                sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                sb3.append(sb2);
                str2 = sb3.toString();
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder("cannot find implementation for ");
            sb4.append(cls.getCanonicalName());
            sb4.append(". ");
            sb4.append(sb2);
            sb4.append(" does not exist");
            throw new RuntimeException(sb4.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb5 = new StringBuilder("Cannot access the constructor");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb6 = new StringBuilder("Failed to create an instance of ");
            sb6.append(cls.getCanonicalName());
            throw new RuntimeException(sb6.toString());
        }
    }

    /* renamed from: a */
    public static <T extends RoomDatabase> C0143a<T> m441a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new C0143a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
