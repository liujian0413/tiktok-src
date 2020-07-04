package com.p280ss.android.ugc.asve;

import android.content.Context;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.vesdk.C45252ac;
import com.p280ss.android.vesdk.C45366s;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEListener.C45206b;
import com.p280ss.android.vesdk.VEListener.C45222r;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.d */
public final class C15439d {

    /* renamed from: a */
    public static final C15439d f39730a = new C15439d();

    /* renamed from: b */
    private static boolean f39731b;

    /* renamed from: com.ss.android.ugc.asve.d$a */
    static final class C15440a implements C45366s {

        /* renamed from: a */
        final /* synthetic */ C15395c f39732a;

        C15440a(C15395c cVar) {
            this.f39732a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo38990a(int i, String str) {
            switch (i) {
                case 0:
                    C15395c cVar = this.f39732a;
                    C7573i.m23582a((Object) str, "msg");
                    cVar.mo38742c(str);
                    return;
                case 1:
                    C15395c cVar2 = this.f39732a;
                    C7573i.m23582a((Object) str, "msg");
                    cVar2.mo38742c(str);
                    return;
                case 2:
                    C15395c cVar3 = this.f39732a;
                    C7573i.m23582a((Object) str, "msg");
                    cVar3.mo38743d(str);
                    return;
                case 3:
                    C15395c cVar4 = this.f39732a;
                    C7573i.m23582a((Object) str, "msg");
                    cVar4.mo38740a(str);
                    return;
                case 4:
                    C15395c cVar5 = this.f39732a;
                    C7573i.m23582a((Object) str, "msg");
                    cVar5.mo38741b(str);
                    break;
            }
        }
    }

    private C15439d() {
    }

    /* renamed from: a */
    public final synchronized void mo38989a() {
        if (!f39731b) {
            f39731b = true;
            C15426e a = C6855a.m21306a();
            C15395c b = C6855a.m21306a().mo38945b();
            b.mo38743d("AVEnv initVESDK start");
            C45252ac.m142767a(true);
            C1942b f = a.mo38949f();
            if (f != null) {
                C45252ac.m142761a(f);
            }
            C45206b e = a.mo38948e();
            if (e != null) {
                C45252ac.m142762a(e);
            }
            C45252ac.m142770b(a.mo38952i().ordinal());
            C45252ac.m142772b(a.mo38953j());
            C45252ac.m142774c(a.mo38954k());
            C45252ac.m142760a((Context) C6855a.m21308b(), a.mo38955l().getAbsolutePath());
            C45252ac.m142776e(a.mo38943A());
            C45252ac.m142777f(a.mo38961r());
            int m = a.mo38956m();
            if (m > 0) {
                VEEditor.m142490c(m);
            }
            if (true ^ C7573i.m23585a((Object) a.mo38969z(), (Object) "")) {
                C45252ac.m142773c(a.mo38969z());
            }
            C45252ac.m142768a(a.mo38957n(), a.mo38958o());
            C45252ac.m142775d(a.mo38959p());
            C45252ac.m142766a(a.mo38960q().getAbsolutePath());
            C45252ac.m142778g(a.mo38962s());
            C45252ac.m142765a((C45366s) new C15440a(b));
            b.mo38743d("AVEnv initVESDK end");
            C45252ac.m142764a(a.mo38967x());
            C45252ac.m142763a((C45222r) a.mo38947d());
        }
    }
}
