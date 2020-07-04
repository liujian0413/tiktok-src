package com.p280ss.android.ugc.aweme.effectplatform;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43845j;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.o */
public final class C27495o {

    /* renamed from: a */
    public static final C27495o f72524a = new C27495o();

    /* renamed from: b */
    private static final String[] f72525b = {"faceDetect", "handDetect", "matting", "hairColor"};

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.o$a */
    public static final class C27496a implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ int f72526a;

        C27496a(int i) {
            this.f72526a = i;
        }

        public final void onFailed(Exception exc) {
            C27495o.f72524a.mo70699a(this.f72526a + 1);
        }

        public final void onSuccess(String[] strArr) {
            C27495o.f72524a.mo70699a(this.f72526a + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.o$b */
    public static final class C27497b implements C43845j {

        /* renamed from: a */
        final /* synthetic */ long f72527a;

        /* renamed from: b */
        final /* synthetic */ String f72528b;

        /* renamed from: c */
        final /* synthetic */ IFetchResourcesListener f72529c;

        /* renamed from: a */
        public final void mo70700a(Exception exc) {
            C7573i.m23587b(exc, "e");
            if (C6399b.m19928c()) {
                System.currentTimeMillis();
            }
            IFetchResourcesListener iFetchResourcesListener = this.f72529c;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        /* renamed from: a */
        public final void mo70701a(String[] strArr) {
            C7573i.m23587b(strArr, "requirements");
            if (C6399b.m19928c()) {
                System.currentTimeMillis();
            }
            IFetchResourcesListener iFetchResourcesListener = this.f72529c;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }

        C27497b(long j, String str, IFetchResourcesListener iFetchResourcesListener) {
            this.f72527a = j;
            this.f72528b = str;
            this.f72529c = iFetchResourcesListener;
        }
    }

    private C27495o() {
    }

    /* renamed from: a */
    public static final void m90135a() {
        C35563c.m114838e();
        f72524a.mo70699a(0);
    }

    /* renamed from: a */
    public final void mo70699a(int i) {
        m90136a(new C27496a(i), f72525b[i]);
    }

    /* renamed from: a */
    private static void m90136a(IFetchResourcesListener iFetchResourcesListener, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C43681b.m138407b().mo105677a(new String[]{str}, (C43845j) new C27497b(currentTimeMillis, str, iFetchResourcesListener));
    }
}
