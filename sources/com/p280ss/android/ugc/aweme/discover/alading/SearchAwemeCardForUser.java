package com.p280ss.android.ugc.aweme.discover.alading;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardForUser */
public final class SearchAwemeCardForUser extends SearchAwemeCardViewHolder {

    /* renamed from: d */
    public static final C26547a f70033d = new C26547a(null);

    /* renamed from: c */
    public SearchUser f70034c;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardForUser$a */
    public static final class C26547a {
        private C26547a() {
        }

        public /* synthetic */ C26547a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchAwemeCardForUser m87285a(ViewGroup viewGroup, SearchUser searchUser) {
            C7573i.m23587b(viewGroup, "viewGroup");
            C7573i.m23587b(searchUser, "cardlist");
            return new SearchAwemeCardForUser(viewGroup, searchUser);
        }
    }

    /* renamed from: a */
    public static final SearchAwemeCardForUser m87277a(ViewGroup viewGroup, SearchUser searchUser) {
        return C26547a.m87285a(viewGroup, searchUser);
    }

    /* renamed from: e */
    public final String mo68180e() {
        return "hot_user";
    }

    /* renamed from: f */
    public final int mo68181f() {
        return 65458;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo68176b() {
        /*
            r4 = this;
            java.util.Map r0 = super.mo68176b()
            r1 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = "list_result_type"
            java.lang.String r3 = "video"
            r0.put(r2, r3)
            java.lang.String r2 = "user_name"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f70034c
            if (r3 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x001d
            java.lang.String r3 = r3.getUniqueId()
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "search_result_id"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f70034c
            if (r3 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x0033
            java.lang.String r1 = r3.getUid()
        L_0x0033:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = r4.f70034c
            boolean r1 = r1.isAladdin()
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r4.mo68180e()
            r0.put(r1, r2)
        L_0x004b:
            return r0
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.alading.SearchAwemeCardForUser.mo68176b():java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo68178c() {
        /*
            r4 = this;
            java.util.Map r0 = super.mo68178c()
            r1 = 0
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = "list_result_type"
            java.lang.String r3 = "video"
            r0.put(r2, r3)
            java.lang.String r2 = "aladin_button_type"
            java.lang.String r3 = "click_video"
            r0.put(r2, r3)
            java.lang.String r2 = "search_result_id"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f70034c
            if (r3 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.getUid()
            goto L_0x0025
        L_0x0024:
            r3 = r1
        L_0x0025:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "user_name"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f70034c
            if (r3 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x003a
            java.lang.String r1 = r3.getUniqueId()
        L_0x003a:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = r4.f70034c
            boolean r1 = r1.isAladdin()
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r4.mo68180e()
            r0.put(r1, r2)
        L_0x0052:
            return r0
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.alading.SearchAwemeCardForUser.mo68178c():java.util.Map");
    }

    /* renamed from: d */
    public final void mo68179d() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        User user = this.f70034c.user;
        C7573i.m23582a((Object) user, "card.user");
        UserProfileActivity.m117390a(view.getContext(), this.f70034c.user, "general_search", user.getRequestId(), "main_head");
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
        if (this.f70034c.isAladdin()) {
            super.mo68175a(map);
        }
    }

    /* renamed from: b */
    public final void mo68177b(Map<String, String> map) {
        if (this.f70034c.isAladdin()) {
            super.mo68177b(map);
        }
    }

    public SearchAwemeCardForUser(View view, SearchUser searchUser) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(searchUser, "card");
        List<Aweme> list = searchUser.awemeCards;
        C7573i.m23582a((Object) list, "card.awemeCards");
        super(view, list);
        this.f70034c = searchUser;
    }
}
