package com.p280ss.android.ugc.aweme.discover.alading;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardForChallenge */
public final class SearchAwemeCardForChallenge extends SearchAwemeCardViewHolder {

    /* renamed from: d */
    public static final C26546a f70031d = new C26546a(null);

    /* renamed from: c */
    public SearchChallenge f70032c;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardForChallenge$a */
    public static final class C26546a {
        private C26546a() {
        }

        public /* synthetic */ C26546a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchAwemeCardForChallenge m87276a(ViewGroup viewGroup, SearchChallenge searchChallenge) {
            C7573i.m23587b(viewGroup, "viewGroup");
            C7573i.m23587b(searchChallenge, "cardlist");
            return new SearchAwemeCardForChallenge(viewGroup, searchChallenge);
        }
    }

    /* renamed from: a */
    public static final SearchAwemeCardForChallenge m87268a(ViewGroup viewGroup, SearchChallenge searchChallenge) {
        return C26546a.m87276a(viewGroup, searchChallenge);
    }

    /* renamed from: e */
    public final String mo68180e() {
        return "hot_challenge";
    }

    /* renamed from: f */
    public final int mo68181f() {
        return 65456;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo68176b() {
        /*
            r4 = this;
            java.util.Map r0 = super.mo68176b()
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = "list_result_type"
            java.lang.String r3 = "video"
            r0.put(r2, r3)
            java.lang.String r2 = "search_result_id"
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r3 = r4.f70032c
            if (r3 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r3.getChallenge()
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = r3.getCid()
            goto L_0x0020
        L_0x001f:
            r3 = r1
        L_0x0020:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "hashtags_name"
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r3 = r4.f70032c
            if (r3 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r3.getChallenge()
            if (r3 == 0) goto L_0x0037
            java.lang.String r1 = r3.getChallengeName()
        L_0x0037:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r1 = r4.f70032c
            boolean r1 = r1.hasAwemeList()
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r4.mo68180e()
            r0.put(r1, r2)
        L_0x004f:
            return r0
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.alading.SearchAwemeCardForChallenge.mo68176b():java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo68178c() {
        /*
            r4 = this;
            java.util.Map r0 = super.mo68178c()
            r1 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.String r2 = "list_result_type"
            java.lang.String r3 = "video"
            r0.put(r2, r3)
            java.lang.String r2 = "aladin_button_type"
            java.lang.String r3 = "click_video"
            r0.put(r2, r3)
            java.lang.String r2 = "search_result_id"
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r3 = r4.f70032c
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r3.getChallenge()
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.getCid()
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "hashtags_name"
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r3 = r4.f70032c
            if (r3 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r3.getChallenge()
            if (r3 == 0) goto L_0x003e
            java.lang.String r1 = r3.getChallengeName()
        L_0x003e:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r1 = r4.f70032c
            boolean r1 = r1.hasAwemeList()
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r4.mo68180e()
            r0.put(r1, r2)
        L_0x0056:
            return r0
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.alading.SearchAwemeCardForChallenge.mo68178c():java.util.Map");
    }

    /* renamed from: d */
    public final void mo68179d() {
        String str;
        String uuid = UUID.randomUUID().toString();
        C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        sb.append(this.f70032c.getChallenge().getCid());
        C7203u a2 = C7203u.m22460a(sb.toString()).mo18694a("enter_from", mo68174a().mo68130c()).mo18694a("process_id", uuid);
        String str2 = "is_commerce";
        if (C25242ao.m82976b(this.f70032c.getChallenge())) {
            str = "1";
        } else {
            str = "0";
        }
        a.mo18682a(a2.mo18694a(str2, str).mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", this.f70032c.getChallenge().getSubType()).mo18695a());
        if (C6399b.m19944t()) {
            Map c = mo68178c();
            if (c != null) {
                c.put("aladin_button_type", "click_see_all");
                c.remove("list_result_type");
            } else {
                c = null;
            }
            mo68177b(c);
        }
    }

    /* renamed from: a */
    public final void mo68175a(Map<String, String> map) {
        if (this.f70032c.hasAwemeList()) {
            super.mo68175a(map);
        }
    }

    /* renamed from: b */
    public final void mo68177b(Map<String, String> map) {
        if (this.f70032c.hasAwemeList()) {
            super.mo68177b(map);
        }
    }

    public SearchAwemeCardForChallenge(View view, SearchChallenge searchChallenge) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(searchChallenge, "card");
        List awemes = searchChallenge.getAwemes();
        C7573i.m23582a((Object) awemes, "card.getAwemes()");
        super(view, awemes);
        this.f70032c = searchChallenge;
    }
}
