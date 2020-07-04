package com.p280ss.android.ugc.aweme.discover.api;

import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchFeedbackApi */
public final class SearchFeedbackApi {

    /* renamed from: a */
    public static final String f70076a = Api.f60502b;

    /* renamed from: b */
    public static final C26564a f70077b = new C26564a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchFeedbackApi$FeedbackMessage */
    public interface FeedbackMessage {
        @C6456g
        @C6468s(mo15750a = "/feedback/2/post_message/")
        C18253l<String> postMessage(@C6455f Map<String, String> map);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchFeedbackApi$a */
    public static final class C26564a {
        private C26564a() {
        }

        public /* synthetic */ C26564a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m87318a(Map<String, String> map) {
            C7573i.m23587b(map, "map");
            String str = (String) ((FeedbackMessage) C22838j.m75276a(SearchFeedbackApi.f70076a, null).create(FeedbackMessage.class)).postMessage(map).get();
            C7573i.m23582a((Object) str, "response");
            return str;
        }
    }
}
