package com.p280ss.android.ugc.aweme.commercialize.p1119c;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.b */
public final class C24560b {

    /* renamed from: b */
    public static final C24561a f64801b = new C24561a(null);

    /* renamed from: a */
    public final int f64802a = 1;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.c.b$a */
    public static final class C24561a {
        private C24561a() {
        }

        public /* synthetic */ C24561a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24560b) {
                if (this.f64802a == ((C24560b) obj).f64802a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f64802a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCommentListEvent(type=");
        sb.append(this.f64802a);
        sb.append(")");
        return sb.toString();
    }

    public C24560b(int i) {
    }
}
