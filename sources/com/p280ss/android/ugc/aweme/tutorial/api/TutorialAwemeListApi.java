package com.p280ss.android.ugc.aweme.tutorial.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42669d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi */
public final class TutorialAwemeListApi {

    /* renamed from: a */
    public static final String f110931a = Api.f60502b;

    /* renamed from: b */
    public static final C42671a f110932b = new C42671a(null);

    /* renamed from: com.ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi$TutorialAwemeListRequest */
    public interface TutorialAwemeListRequest {
        @C7730f(mo20420a = "/aweme/v1/tutorial/aweme/")
        C18253l<C42669d> getTutorialAwemeList(@C7744t(mo20436a = "tutorial_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi$a */
    public static final class C42671a {
        private C42671a() {
        }

        public /* synthetic */ C42671a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C42669d m135517a(String str, long j, int i) {
            C7573i.m23587b(str, "tutorialId");
            Object obj = ((TutorialAwemeListRequest) C22838j.m75276a(TutorialAwemeListApi.f110931a, null).create(TutorialAwemeListRequest.class)).getTutorialAwemeList(str, j, i).get();
            C7573i.m23582a(obj, "api.getTutorialAwemeList…lId, cursor, count).get()");
            return (C42669d) obj;
        }
    }
}
