package shark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;

public enum PrimitiveType {
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);
    
    public static final C48709a Companion = null;
    public static final Map<Integer, Integer> byteSizeByHprofType = null;
    public static final Map<Integer, PrimitiveType> primitiveTypeByHprofType = null;
    private final int byteSize;
    private final int hprofType;

    /* renamed from: shark.PrimitiveType$a */
    public static final class C48709a {
        private C48709a() {
        }

        /* renamed from: a */
        public static Map<Integer, Integer> m150452a() {
            return PrimitiveType.byteSizeByHprofType;
        }

        /* renamed from: b */
        public static Map<Integer, PrimitiveType> m150453b() {
            return PrimitiveType.primitiveTypeByHprofType;
        }

        public /* synthetic */ C48709a(C7571f fVar) {
            this();
        }
    }

    public final int getByteSize() {
        return this.byteSize;
    }

    public final int getHprofType() {
        return this.hprofType;
    }

    static {
        int i;
        Companion = new C48709a(null);
        PrimitiveType[] values = values();
        Collection arrayList = new ArrayList(values.length);
        for (PrimitiveType primitiveType : values) {
            arrayList.add(C7579l.m23633a(Integer.valueOf(primitiveType.hprofType), Integer.valueOf(primitiveType.byteSize)));
        }
        byteSizeByHprofType = C7507ae.m23388a((Iterable<? extends Pair<? extends K, ? extends V>>) (List) arrayList);
        PrimitiveType[] values2 = values();
        Collection arrayList2 = new ArrayList(values2.length);
        for (PrimitiveType primitiveType2 : values2) {
            arrayList2.add(C7579l.m23633a(Integer.valueOf(primitiveType2.hprofType), primitiveType2));
        }
        primitiveTypeByHprofType = C7507ae.m23388a((Iterable<? extends Pair<? extends K, ? extends V>>) (List) arrayList2);
    }

    private PrimitiveType(int i, int i2) {
        this.hprofType = i;
        this.byteSize = i2;
    }
}
