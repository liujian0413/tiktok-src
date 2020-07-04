package com.p280ss.android.ugc.aweme.video;

import com.toutiao.proxyserver.p1839a.C46454b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.video.ae */
public final class C43187ae {

    /* renamed from: f */
    public static final C43188a f111821f = new C43188a(null);

    /* renamed from: a */
    public String f111822a = "";

    /* renamed from: b */
    public long f111823b;

    /* renamed from: c */
    public ArrayList<C46454b> f111824c;

    /* renamed from: d */
    public long f111825d;

    /* renamed from: e */
    public long f111826e;

    /* renamed from: com.ss.android.ugc.aweme.video.ae$a */
    public static final class C43188a {
        private C43188a() {
        }

        public /* synthetic */ C43188a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo104821a() {
        if (this.f111824c != null) {
            ArrayList<C46454b> arrayList = this.f111824c;
            if (arrayList == null) {
                C7573i.m23580a();
            }
            if (arrayList.size() > 0) {
                ArrayList<C46454b> arrayList2 = this.f111824c;
                if (arrayList2 == null) {
                    C7573i.m23580a();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C46454b bVar = (C46454b) it.next();
                    this.f111825d += (long) bVar.f119703c;
                    this.f111826e += (long) bVar.f119704d;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo104823a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f111822a = str;
    }

    /* renamed from: a */
    public final void mo104822a(C46454b bVar) {
        C7573i.m23587b(bVar, "info");
        if (this.f111824c == null) {
            this.f111824c = new ArrayList<>();
        }
        ArrayList<C46454b> arrayList = this.f111824c;
        if (arrayList != null) {
            arrayList.add(bVar);
        }
    }
}
