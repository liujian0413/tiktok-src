package com.p280ss.android.ugc.aweme.interest;

import android.content.Context;
import com.p280ss.android.ugc.aweme.interest.C32183c.C32184a;
import com.p280ss.android.ugc.aweme.interest.C32190g.C32191a;
import com.p280ss.android.ugc.aweme.journey.C32245i;
import com.p280ss.android.ugc.aweme.journey.C32246j;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.interest.e */
public final class C32186e implements C7152c {

    /* renamed from: a */
    public static volatile boolean f84046a;

    /* renamed from: b */
    public static final C32187a f84047b = new C32187a(null);

    /* renamed from: com.ss.android.ugc.aweme.interest.e$a */
    public static final class C32187a {

        /* renamed from: com.ss.android.ugc.aweme.interest.e$a$a */
        public static final class C32188a implements C7498y<C32189f> {

            /* renamed from: a */
            public List<C32246j> f84048a;

            /* renamed from: b */
            final /* synthetic */ Context f84049b;

            public final void onComplete() {
                m104457a();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
                if (r0.isEmpty() != false) goto L_0x0011;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m104457a() {
                /*
                    r2 = this;
                    java.util.List<com.ss.android.ugc.aweme.journey.j> r0 = r2.f84048a
                    if (r0 == 0) goto L_0x0011
                    java.util.List<com.ss.android.ugc.aweme.journey.j> r0 = r2.f84048a
                    if (r0 != 0) goto L_0x000b
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x000b:
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x0019
                L_0x0011:
                    android.content.Context r0 = r2.f84049b
                    java.util.List r0 = com.p280ss.android.ugc.aweme.interest.C32185d.m104451a(r0)
                    r2.f84048a = r0
                L_0x0019:
                    com.ss.android.ugc.aweme.interest.a r0 = new com.ss.android.ugc.aweme.interest.a
                    java.util.List<com.ss.android.ugc.aweme.journey.j> r1 = r2.f84048a
                    if (r1 != 0) goto L_0x0022
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0022:
                    r0.<init>(r1)
                    com.p280ss.android.ugc.aweme.utils.C42961az.m136381b(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.interest.C32186e.C32187a.C32188a.m104457a():void");
            }

            C32188a(Context context) {
                this.f84049b = context;
            }

            public final void onError(Throwable th) {
                C7573i.m23587b(th, "throwable");
                m104457a();
            }

            public final void onSubscribe(C7321c cVar) {
                C7573i.m23587b(cVar, "d");
                C32187a.m104455a(true);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(C32189f fVar) {
                List<C32246j> list;
                List<C32246j> list2;
                C7573i.m23587b(fVar, "response");
                C32245i iVar = fVar.f84050a;
                if (iVar != null) {
                    list = iVar.f84275a;
                } else {
                    list = null;
                }
                if (list != null) {
                    list2 = fVar.f84050a.f84275a;
                } else {
                    list2 = C32185d.m104451a(this.f84049b);
                }
                this.f84048a = list2;
            }
        }

        private C32187a() {
        }

        /* renamed from: a */
        public static boolean m104456a() {
            return C32186e.f84046a;
        }

        /* renamed from: a */
        public static void m104455a(boolean z) {
            C32186e.f84046a = true;
        }

        public /* synthetic */ C32187a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m104454a(Context context) {
            C7573i.m23587b(context, "context");
            C32184a.m104450a().getInterest("interest_page").mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C32188a<Object>(context));
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.NORMAL;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        if (C32191a.m104467c() && !C32190g.f84056f && !f84046a) {
            C32187a.m104454a(context);
        }
    }
}
