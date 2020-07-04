package com.p280ss.android.ugc.aweme.profile.survey;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.e */
public class C36080e {

    /* renamed from: b */
    private static final boolean f94324b = C7163a.m22363a();

    /* renamed from: c */
    private static volatile C36080e f94325c;

    /* renamed from: a */
    public C36081a f94326a;

    /* renamed from: com.ss.android.ugc.aweme.profile.survey.e$a */
    public interface C36081a {
        /* renamed from: a */
        void mo91816a(C23142a aVar);

        /* renamed from: a */
        void mo91817a(Exception exc);
    }

    /* renamed from: c */
    public final void mo91815c() {
        this.f94326a = null;
    }

    private C36080e() {
        if (f94325c != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: b */
    public final void mo91814b() {
        C1592h a = SurveyApi.m116201a();
        if (a != null) {
            a.mo6875a((C1591g<TResult, TContinuationResult>) new C36082f<TResult,TContinuationResult>(this));
        }
    }

    /* renamed from: a */
    public static C36080e m116209a() {
        if (f94325c == null) {
            synchronized (C36080e.class) {
                if (f94325c == null) {
                    f94325c = new C36080e();
                }
            }
        }
        return f94325c;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m116210a(C1592h hVar) throws Exception {
        if (f94324b) {
            C43173w.m136926a(hVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m116211a(C36078c cVar) {
        C1592h a = SurveyApi.m116202a(cVar);
        if (a != null) {
            a.mo6875a(C36083g.f94328a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo91813b(C1592h hVar) throws Exception {
        if (!C43173w.m136926a(hVar)) {
            if (this.f94326a != null) {
                this.f94326a.mo91817a(hVar.mo6891f());
            }
            return null;
        }
        C23142a aVar = (C23142a) hVar.mo6890e();
        if (this.f94326a != null) {
            C36081a aVar2 = this.f94326a;
            if (aVar == null || aVar.f61071a == 0) {
                aVar = null;
            }
            aVar2.mo91816a(aVar);
        }
        return null;
    }
}
