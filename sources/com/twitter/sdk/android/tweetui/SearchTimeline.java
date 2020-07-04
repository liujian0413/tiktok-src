package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.C46957m;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.services.params.Geocode;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import retrofit2.C48475b;

public final class SearchTimeline extends C47035c implements C47007ab<C46959o> {

    /* renamed from: a */
    public static final SimpleDateFormat f120581a = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    /* renamed from: b */
    final C46969q f120582b;

    /* renamed from: c */
    final String f120583c;

    /* renamed from: d */
    final Geocode f120584d;

    /* renamed from: e */
    final String f120585e;

    /* renamed from: f */
    final String f120586f;

    /* renamed from: g */
    final Integer f120587g;

    /* renamed from: h */
    final String f120588h;

    public enum ResultType {
        RECENT("recent"),
        POPULAR("popular"),
        MIXED("mixed"),
        FILTERED("filtered");
        
        final String type;

        private ResultType(String str) {
            this.type = str;
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.SearchTimeline$a */
    class C47001a extends C46821b<C46957m> {

        /* renamed from: a */
        final C46821b<C47012ae<C46959o>> f120589a;

        /* renamed from: a */
        public final void mo29989a(TwitterException twitterException) {
            if (this.f120589a != null) {
                this.f120589a.mo29989a(twitterException);
            }
        }

        /* renamed from: a */
        public final void mo29990a(C46830i<C46957m> iVar) {
            List<C46959o> list = ((C46957m) iVar.f120123a).f120408a;
            C47012ae aeVar = new C47012ae(new C47008ac(list), list);
            if (this.f120589a != null) {
                this.f120589a.mo29990a(new C46830i<>(aeVar, iVar.f120124b));
            }
        }

        C47001a(C46821b<C47012ae<C46959o>> bVar) {
            this.f120589a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo118179a(Long l, C46821b<C47012ae<C46959o>> bVar) {
        m146938a((Long) null, m147065a(l)).mo123283a(new C47001a(bVar));
    }

    /* renamed from: a */
    private C48475b<C46957m> m146938a(Long l, Long l2) {
        return this.f120582b.mo118105d().mo118098d().tweets(this.f120583c, this.f120584d, this.f120586f, null, this.f120585e, this.f120587g, this.f120588h, null, l2, Boolean.valueOf(true));
    }
}
