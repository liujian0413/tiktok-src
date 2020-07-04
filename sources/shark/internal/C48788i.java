package shark.internal;

import com.C1642a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: shark.internal.i */
public final class C48788i<K, V> {

    /* renamed from: a */
    public int f124018a;

    /* renamed from: b */
    public int f124019b;

    /* renamed from: c */
    public int f124020c;

    /* renamed from: d */
    public int f124021d;

    /* renamed from: e */
    public final int f124022e = 3000;

    /* renamed from: f */
    private final LinkedHashMap<K, V> f124023f;

    public final String toString() {
        int i;
        int i2 = this.f124020c + this.f124021d;
        if (i2 != 0) {
            i = (this.f124020c * 100) / i2;
        } else {
            i = 0;
        }
        String a = C1642a.m8034a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Arrays.copyOf(new Object[]{Integer.valueOf(this.f124022e), Integer.valueOf(this.f124020c), Integer.valueOf(this.f124021d), Integer.valueOf(i)}, 4));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        return a;
    }

    /* renamed from: a */
    public final V mo123553a(K k) {
        V v = this.f124023f.get(k);
        if (v != null) {
            this.f124020c++;
            return v;
        }
        this.f124021d++;
        return null;
    }

    public C48788i(int i) {
        boolean z;
        if (this.f124022e > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f124023f = new LruCache$2(this, this.f124022e, 0.75f, true);
            return;
        }
        StringBuilder sb = new StringBuilder("maxSize=");
        sb.append(this.f124022e);
        sb.append(" <= 0");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final V mo123554a(K k, V v) {
        this.f124018a++;
        return this.f124023f.put(k, v);
    }
}
