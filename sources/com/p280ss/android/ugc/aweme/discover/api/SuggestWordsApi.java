package com.p280ss.android.ugc.aweme.discover.api;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26569b;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi */
public interface SuggestWordsApi {

    /* renamed from: a */
    public static final C26565a f70083a = C26565a.f70085b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$a */
    public static final class C26565a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f70084a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26565a.class), "API", "getAPI()Lcom/ss/android/ugc/aweme/discover/api/SuggestWordsApi;"))};

        /* renamed from: b */
        static final /* synthetic */ C26565a f70085b = new C26565a();

        /* renamed from: c */
        private static final C7541d f70086c = C7546e.m23569a(C26566a.f70087a);

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$a$a */
        static final class C26566a extends Lambda implements C7561a<SuggestWordsApi> {

            /* renamed from: a */
            public static final C26566a f70087a = new C26566a();

            C26566a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return m87324a();
            }

            /* renamed from: a */
            private static SuggestWordsApi m87324a() {
                IRetrofit iRetrofit;
                if (C6399b.m19944t()) {
                    iRetrofit = C26569b.f70093c;
                } else {
                    iRetrofit = C26569b.f70092b;
                }
                return (SuggestWordsApi) iRetrofit.create(SuggestWordsApi.class);
            }
        }

        private C26565a() {
        }

        /* renamed from: a */
        public static SuggestWordsApi m87323a() {
            return (SuggestWordsApi) f70086c.getValue();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$b */
    public static final class C26567b {
    }

    @C7730f(mo20420a = "/api/suggest_words/")
    C1592h<SuggestWordResponse> getRecommendWords(@C7744t(mo20436a = "from_group_id") String str, @C7744t(mo20436a = "query") String str2, @C7744t(mo20436a = "business_id") String str3);

    @C7730f(mo20420a = "/api/suggest_words/")
    C1592h<SuggestWordResponse> getSuggestWords(@C7744t(mo20436a = "business_id") String str, @C7744t(mo20436a = "from_group_id") String str2, @C7744t(mo20436a = "word_in_box") String str3);

    @C7730f(mo20420a = "/api/suggest_words/")
    C1592h<String> getSuggestWordsWithRawString(@C7744t(mo20436a = "business_id") String str, @C7744t(mo20436a = "from_group_id") String str2, @C7744t(mo20436a = "word_in_box") String str3);
}
