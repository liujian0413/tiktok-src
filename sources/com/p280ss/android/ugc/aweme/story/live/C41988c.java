package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.detail.p1167ui.LiveDetailActivity;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.live.C41990e.C41991a;

/* renamed from: com.ss.android.ugc.aweme.story.live.c */
public final class C41988c implements C41987b {
    /* renamed from: b */
    public final void mo103114b() {
        C32430a.m105068e();
    }

    /* renamed from: c */
    public final String mo103115c() {
        return C32430a.m105063b();
    }

    /* renamed from: a */
    public final boolean mo103112a() {
        return C41990e.m133508b();
    }

    /* renamed from: a */
    public final void mo103108a(Context context) {
        context.startActivity(new Intent(context, LiveDetailActivity.class));
    }

    /* renamed from: a */
    public final boolean mo103113a(User user) {
        return C32430a.m105062a(user);
    }

    /* renamed from: a */
    public final void mo103110a(Context context, User user, String str) {
        C41994h.m133523a(context, user, str);
    }

    /* renamed from: a */
    public final void mo103109a(Context context, User user, Rect rect, String str, Bundle bundle) {
        C41990e.m133501a(context, user, rect, str, bundle);
    }

    /* renamed from: a */
    public final void mo103111a(Context context, User user, String str, String str2, Bundle bundle) {
        C41990e.m133503a(new C41991a(context, user).mo103124d(user.getRequestId()).mo103122b(str).mo103123c(str2).mo103119a(bundle));
    }
}
