package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7563m;
import kotlin.p356e.C7549c;
import kotlin.p356e.C7551d;
import kotlin.sequences.C7604g;

/* renamed from: kotlin.text.e */
final class C7628e implements C7604g<C7549c> {

    /* renamed from: a */
    public final CharSequence f20916a;

    /* renamed from: b */
    public final int f20917b;

    /* renamed from: c */
    public final int f20918c;

    /* renamed from: d */
    public final C7563m<CharSequence, Integer, Pair<Integer, Integer>> f20919d;

    /* renamed from: kotlin.text.e$a */
    public static final class C7629a implements Iterator<C7549c>, C7565a {

        /* renamed from: a */
        public int f20920a = -1;

        /* renamed from: b */
        public int f20921b;

        /* renamed from: c */
        public int f20922c;

        /* renamed from: d */
        public C7549c f20923d;

        /* renamed from: e */
        public int f20924e;

        /* renamed from: f */
        final /* synthetic */ C7628e f20925f;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f20920a == -1) {
                m23680a();
            }
            if (this.f20920a == 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C7549c next() {
            if (this.f20920a == -1) {
                m23680a();
            }
            if (this.f20920a != 0) {
                C7549c cVar = this.f20923d;
                if (cVar != null) {
                    this.f20923d = null;
                    this.f20920a = -1;
                    return cVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
            if (r6.f20924e < r6.f20925f.f20918c) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m23680a() {
            /*
                r6 = this;
                int r0 = r6.f20922c
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f20920a = r1
                r0 = 0
                r6.f20923d = r0
                return
            L_0x000b:
                kotlin.text.e r0 = r6.f20925f
                int r0 = r0.f20918c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0020
                int r0 = r6.f20924e
                int r0 = r0 + r3
                r6.f20924e = r0
                int r0 = r6.f20924e
                kotlin.text.e r4 = r6.f20925f
                int r4 = r4.f20918c
                if (r0 >= r4) goto L_0x002c
            L_0x0020:
                int r0 = r6.f20922c
                kotlin.text.e r4 = r6.f20925f
                java.lang.CharSequence r4 = r4.f20916a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0040
            L_0x002c:
                int r0 = r6.f20921b
                kotlin.e.c r1 = new kotlin.e.c
                kotlin.text.e r4 = r6.f20925f
                java.lang.CharSequence r4 = r4.f20916a
                int r4 = kotlin.text.C7634n.m23780f(r4)
                r1.<init>(r0, r4)
                r6.f20923d = r1
                r6.f20922c = r2
                goto L_0x0091
            L_0x0040:
                kotlin.text.e r0 = r6.f20925f
                kotlin.jvm.a.m<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r0.f20919d
                kotlin.text.e r4 = r6.f20925f
                java.lang.CharSequence r4 = r4.f20916a
                int r5 = r6.f20922c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x006a
                int r0 = r6.f20921b
                kotlin.e.c r1 = new kotlin.e.c
                kotlin.text.e r4 = r6.f20925f
                java.lang.CharSequence r4 = r4.f20916a
                int r4 = kotlin.text.C7634n.m23780f(r4)
                r1.<init>(r0, r4)
                r6.f20923d = r1
                r6.f20922c = r2
                goto L_0x0091
            L_0x006a:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f20921b
                kotlin.e.c r4 = kotlin.p356e.C7551d.m23565b(r4, r2)
                r6.f20923d = r4
                int r2 = r2 + r0
                r6.f20921b = r2
                int r2 = r6.f20921b
                if (r0 != 0) goto L_0x008e
                r1 = 1
            L_0x008e:
                int r2 = r2 + r1
                r6.f20922c = r2
            L_0x0091:
                r6.f20920a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C7628e.C7629a.m23680a():void");
        }

        C7629a(C7628e eVar) {
            this.f20925f = eVar;
            this.f20921b = C7551d.m23560a(eVar.f20917b, 0, eVar.f20916a.length());
            this.f20922c = this.f20921b;
        }
    }

    /* renamed from: a */
    public final Iterator<C7549c> mo19416a() {
        return new C7629a<>(this);
    }

    public C7628e(CharSequence charSequence, int i, int i2, C7563m<? super CharSequence, ? super Integer, Pair<Integer, Integer>> mVar) {
        C7573i.m23587b(charSequence, "input");
        C7573i.m23587b(mVar, "getNextMatch");
        this.f20916a = charSequence;
        this.f20917b = i;
        this.f20918c = i2;
        this.f20919d = mVar;
    }
}
