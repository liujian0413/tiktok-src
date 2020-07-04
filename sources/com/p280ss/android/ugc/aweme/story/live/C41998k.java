package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.story.live.C41990e.C41991a;

/* renamed from: com.ss.android.ugc.aweme.story.live.k */
public final class C41998k {

    /* renamed from: a */
    private Context f109086a;

    public C41998k(Context context) {
        this.f109086a = context;
    }

    /* renamed from: a */
    public final void mo103125a(User user) {
        C41990e.m133498a().mo103116a(this.f109086a, user, (Rect) null, "homepage_follow_button");
    }

    /* renamed from: b */
    public final void mo103129b(User user) {
        C41990e.m133503a(new C41991a(this.f109086a, user).mo103124d(user.getRequestId()).mo103122b("message").mo103123c("live_cell"));
    }

    /* renamed from: a */
    public final void mo103127a(User user, C36040n nVar) {
        C41990e.m133503a(new C41991a(this.f109086a, user).mo103124d(user.getRequestId()).mo103122b("others_homepage").mo103123c("others_photo"));
    }

    /* renamed from: a */
    public final void mo103126a(User user, Rect rect, C36040n nVar) {
        String str;
        if (C6399b.m19947w()) {
            str = "toplist_homepage_follow";
        } else {
            str = "toplist";
        }
        C41990e.m133503a(new C41991a(this.f109086a, user).mo103124d(user.getRequestId()).mo103118a(rect).mo103122b(str).mo103123c("others_photo"));
    }

    /* renamed from: a */
    public final void mo103128a(User user, String str, C36040n nVar) {
        C41990e.m133503a(new C41991a(this.f109086a, user).mo103124d(user.getRequestId()).mo103122b("search_result").mo103123c("others_photo"));
    }
}
