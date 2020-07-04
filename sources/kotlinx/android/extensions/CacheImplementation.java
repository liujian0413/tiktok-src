package kotlinx.android.extensions;

import kotlin.jvm.internal.C7571f;

public enum CacheImplementation {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;
    
    public static final C48046a Companion = null;
    public static final CacheImplementation DEFAULT = null;

    /* renamed from: kotlinx.android.extensions.CacheImplementation$a */
    public static final class C48046a {
        private C48046a() {
        }

        public /* synthetic */ C48046a(C7571f fVar) {
            this();
        }
    }

    static {
        Companion = new C48046a(null);
        DEFAULT = HASH_MAP;
    }
}
