package com.p280ss.android.ugc.aweme.common.p1147h;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.common.h.c */
public final class C25692c {

    /* renamed from: a */
    public static final C25692c f67619a = new C25692c();

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$a */
    static final class C25693a {

        /* renamed from: a */
        public final C25694b f67620a;

        /* renamed from: b */
        public final LinkedList<C25695c> f67621b;

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f67621b, (java.lang.Object) r3.f67621b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25693a
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.common.h.c$a r3 = (com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25693a) r3
                com.ss.android.ugc.aweme.common.h.c$b r0 = r2.f67620a
                com.ss.android.ugc.aweme.common.h.c$b r1 = r3.f67620a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.LinkedList<com.ss.android.ugc.aweme.common.h.c$c> r0 = r2.f67621b
                java.util.LinkedList<com.ss.android.ugc.aweme.common.h.c$c> r3 = r3.f67621b
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25693a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C25694b bVar = this.f67620a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            LinkedList<C25695c> linkedList = this.f67621b;
            if (linkedList != null) {
                i = linkedList.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(identifier=");
            sb.append(this.f67620a);
            sb.append(", history=");
            sb.append(this.f67621b);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo66579a() {
            for (C25695c cVar : this.f67621b) {
                cVar.f67622a = -1;
                cVar.f67624c = cVar.f67625d;
                cVar.f67625d = 0;
            }
        }

        /* renamed from: a */
        public final C25695c mo66578a(Object obj) {
            Object obj2;
            C7573i.m23587b(obj, "id");
            Iterator it = this.f67621b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C7573i.m23585a(obj, ((C25695c) obj2).f67623b)) {
                    break;
                }
            }
            C25695c cVar = (C25695c) obj2;
            if (cVar != null) {
                return cVar;
            }
            C25695c cVar2 = new C25695c(0, obj, 0, 0, 13, null);
            this.f67621b.add(cVar2);
            return cVar2;
        }

        private C25693a(C25694b bVar, LinkedList<C25695c> linkedList) {
            C7573i.m23587b(linkedList, "history");
            this.f67620a = bVar;
            this.f67621b = linkedList;
        }

        public /* synthetic */ C25693a(C25694b bVar, LinkedList linkedList, int i, C7571f fVar) {
            this(bVar, new LinkedList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$b */
    public interface C25694b {
        /* renamed from: a */
        Object mo66583a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$c */
    static final class C25695c {

        /* renamed from: a */
        public int f67622a;

        /* renamed from: b */
        public Object f67623b;

        /* renamed from: c */
        public int f67624c;

        /* renamed from: d */
        public int f67625d;

        public C25695c() {
            this(0, null, 0, 0, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C25695c) {
                    C25695c cVar = (C25695c) obj;
                    if ((this.f67622a == cVar.f67622a) && C7573i.m23585a(this.f67623b, cVar.f67623b)) {
                        if (this.f67624c == cVar.f67624c) {
                            if (this.f67625d == cVar.f67625d) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.f67622a * 31;
            Object obj = this.f67623b;
            return ((((i + (obj != null ? obj.hashCode() : 0)) * 31) + this.f67624c) * 31) + this.f67625d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(pos=");
            sb.append(this.f67622a);
            sb.append(", id=");
            sb.append(this.f67623b);
            sb.append(", status=");
            sb.append(this.f67624c);
            sb.append(", newStatus=");
            sb.append(this.f67625d);
            sb.append(")");
            return sb.toString();
        }

        private C25695c(int i, Object obj, int i2, int i3) {
            this.f67622a = i;
            this.f67623b = obj;
            this.f67624c = i2;
            this.f67625d = i3;
        }

        public /* synthetic */ C25695c(int i, Object obj, int i2, int i3, int i4, C7571f fVar) {
            if ((i4 & 1) != 0) {
                i = -1;
            }
            if ((i4 & 2) != 0) {
                obj = null;
            }
            this(i, obj, 0, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$d */
    public interface C25696d {
        /* renamed from: a */
        void mo66587a(int i, Object obj, C1293v vVar, View view, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.c$e */
    static final class C25697e extends C1281m {

        /* renamed from: a */
        public static final C25697e f67626a = new C25697e();

        private C25697e() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C7573i.m23587b(recyclerView, "rv");
            C25692c.m84439a(recyclerView);
        }
    }

    private C25692c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r8 == null) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m84439a(android.support.p029v7.widget.RecyclerView r21) {
        /*
            r0 = r21
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.support.v7.widget.RecyclerView$i r1 = r21.getLayoutManager()
            boolean r2 = r1 instanceof android.support.p029v7.widget.LinearLayoutManager
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            r2 = 2131301009(0x7f091291, float:1.8220064E38)
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25693a
            r4 = 0
            if (r3 != 0) goto L_0x001b
            r2 = r4
        L_0x001b:
            com.ss.android.ugc.aweme.common.h.c$a r2 = (com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25693a) r2
            if (r2 != 0) goto L_0x0020
            return
        L_0x0020:
            r2.mo66579a()
            r3 = r1
            android.support.v7.widget.LinearLayoutManager r3 = (android.support.p029v7.widget.LinearLayoutManager) r3
            int r5 = r3.mo5445j()
            int r6 = r3.mo5447l()
            int r7 = r3.mo5446k()
            int r3 = r3.mo5448m()
            kotlin.e.c r8 = new kotlin.e.c
            r8.<init>(r5, r6)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r5 = r8.iterator()
        L_0x0041:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x006e
            r6 = r5
            kotlin.collections.ac r6 = (kotlin.collections.C7506ac) r6
            int r6 = r6.mo19392a()
            com.ss.android.ugc.aweme.common.h.c$b r8 = r2.f67620a
            if (r8 == 0) goto L_0x0058
            java.lang.Object r8 = r8.mo66583a(r6)
            if (r8 != 0) goto L_0x005d
        L_0x0058:
            long r8 = (long) r6
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
        L_0x005d:
            com.ss.android.ugc.aweme.common.h.c$c r8 = r2.mo66578a(r8)
            r8.f67622a = r6
            if (r7 <= r6) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            if (r3 < r6) goto L_0x006a
            r6 = 2
            goto L_0x006b
        L_0x006a:
            r6 = 1
        L_0x006b:
            r8.f67625d = r6
            goto L_0x0041
        L_0x006e:
            r3 = 2131301010(0x7f091292, float:1.8220066E38)
            java.lang.Object r5 = r0.getTag(r3)
            boolean r6 = r5 instanceof com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d
            if (r6 != 0) goto L_0x007a
            r5 = r4
        L_0x007a:
            com.ss.android.ugc.aweme.common.h.c$d r5 = (com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d) r5
            java.util.LinkedList<com.ss.android.ugc.aweme.common.h.c$c> r2 = r2.f67621b
            java.util.ListIterator r2 = r2.listIterator()
            java.lang.String r6 = "data.history.listIterator()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r6)
        L_0x0087:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0120
            java.lang.Object r6 = r2.next()
            java.lang.String r7 = "iterator.next()"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            r13 = r6
            com.ss.android.ugc.aweme.common.h.c$c r13 = (com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25695c) r13
            int r6 = r13.f67622a
            r7 = -1
            if (r6 != r7) goto L_0x00a1
            r2.remove()
        L_0x00a1:
            int r6 = r13.f67625d
            int r8 = r13.f67624c
            if (r6 == r8) goto L_0x011b
            int r6 = r13.f67622a
            if (r6 != r7) goto L_0x00ae
            r11 = r4
            r12 = r11
            goto L_0x00bc
        L_0x00ae:
            int r6 = r13.f67622a
            android.support.v7.widget.RecyclerView$v r6 = r0.mo5575f(r6)
            int r7 = r13.f67622a
            android.view.View r7 = r1.mo5432c(r7)
            r11 = r6
            r12 = r7
        L_0x00bc:
            if (r12 == 0) goto L_0x00c3
            java.lang.Object r6 = r12.getTag(r3)
            goto L_0x00c4
        L_0x00c3:
            r6 = r4
        L_0x00c4:
            boolean r7 = r6 instanceof com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d
            if (r7 != 0) goto L_0x00c9
            r6 = r4
        L_0x00c9:
            r14 = r6
            com.ss.android.ugc.aweme.common.h.c$d r14 = (com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d) r14
            if (r14 == 0) goto L_0x00e3
            int r15 = r13.f67622a
            java.lang.Object r6 = r13.f67623b
            int r7 = r13.f67624c
            int r8 = r13.f67625d
            r16 = r6
            r17 = r11
            r18 = r12
            r19 = r7
            r20 = r8
            r14.mo66587a(r15, r16, r17, r18, r19, r20)
        L_0x00e3:
            if (r5 == 0) goto L_0x00f9
            int r7 = r13.f67622a
            java.lang.Object r8 = r13.f67623b
            int r14 = r13.f67624c
            int r15 = r13.f67625d
            r6 = r5
            r9 = r11
            r10 = r12
            r3 = r11
            r11 = r14
            r18 = r12
            r12 = r15
            r6.mo66587a(r7, r8, r9, r10, r11, r12)
            goto L_0x00fc
        L_0x00f9:
            r3 = r11
            r18 = r12
        L_0x00fc:
            boolean r6 = r3 instanceof com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d
            if (r6 != 0) goto L_0x0102
            r6 = r4
            goto L_0x0103
        L_0x0102:
            r6 = r3
        L_0x0103:
            r14 = r6
            com.ss.android.ugc.aweme.common.h.c$d r14 = (com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d) r14
            if (r14 == 0) goto L_0x011b
            int r15 = r13.f67622a
            java.lang.Object r6 = r13.f67623b
            int r7 = r13.f67624c
            int r8 = r13.f67625d
            r16 = r6
            r17 = r3
            r19 = r7
            r20 = r8
            r14.mo66587a(r15, r16, r17, r18, r19, r20)
        L_0x011b:
            r3 = 2131301010(0x7f091292, float:1.8220066E38)
            goto L_0x0087
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.p1147h.C25692c.m84439a(android.support.v7.widget.RecyclerView):void");
    }

    /* renamed from: a */
    public static final void m84440a(RecyclerView recyclerView, C25694b bVar) {
        if (recyclerView != null && !(recyclerView.getTag(R.id.cqt) instanceof C25693a)) {
            recyclerView.mo5528a((C1281m) C25697e.f67626a);
            recyclerView.setTag(R.id.cqt, new C25693a(bVar, null, 2, null));
        }
    }
}
