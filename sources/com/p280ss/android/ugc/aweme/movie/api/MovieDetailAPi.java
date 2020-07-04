package com.p280ss.android.ugc.aweme.movie.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.movie.p1402a.C33644b;
import com.p280ss.android.ugc.aweme.movie.p1402a.C33645c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.movie.api.MovieDetailAPi */
public final class MovieDetailAPi {

    /* renamed from: a */
    public static final String f87813a = Api.f60502b;

    /* renamed from: b */
    public static final C33646a f87814b = new C33646a(null);

    /* renamed from: com.ss.android.ugc.aweme.movie.api.MovieDetailAPi$MvDetail */
    public interface MvDetail {
        @C6457h(mo15740a = "/aweme/v1/mv/detail/")
        C18253l<C33645c> getMvDetail(@C6474y(mo15757a = "mv_id") String str);

        @C6457h(mo15740a = "/aweme/v1/mv/aweme/")
        C18253l<C33644b> getMvDetailList(@C6474y(mo15757a = "mv_id") String str, @C6474y(mo15757a = "cursor") long j);
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.api.MovieDetailAPi$a */
    public static final class C33646a {
        private C33646a() {
        }

        /* renamed from: a */
        private static String m108577a() {
            return MovieDetailAPi.f87813a;
        }

        public /* synthetic */ C33646a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C33645c mo86028a(String str) {
            C7573i.m23587b(str, "mvId");
            C33645c cVar = (C33645c) ((MvDetail) C22838j.m75276a(m108577a(), null).create(MvDetail.class)).getMvDetail(str).get();
            C7573i.m23582a((Object) cVar, "response");
            return cVar;
        }

        /* renamed from: a */
        public final C33644b mo86027a(String str, long j) {
            C7573i.m23587b(str, "mvId");
            C33644b bVar = (C33644b) ((MvDetail) C22838j.m75276a(m108577a(), null).create(MvDetail.class)).getMvDetailList(str, j).get();
            C7573i.m23582a((Object) bVar, "response");
            return bVar;
        }
    }
}
