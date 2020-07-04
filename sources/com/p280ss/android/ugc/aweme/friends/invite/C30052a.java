package com.p280ss.android.ugc.aweme.friends.invite;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.a */
public final class C30052a {

    /* renamed from: a */
    private User f79026a;

    /* renamed from: b */
    private C30053b f79027b;

    /* renamed from: c */
    private Context f79028c;

    public C30052a(Activity activity) {
        this.f79027b = new C30053b(activity);
        this.f79028c = activity;
    }

    /* renamed from: a */
    public final void mo76326a(User user) {
        if (user != null && this.f79026a != user) {
            this.f79026a = user;
            String string = this.f79028c.getString(R.string.jf);
            this.f79027b.mo76327a(this.f79026a, this.f79028c.getString(R.string.bva, new Object[]{string}), this.f79028c.getString(R.string.bv9, new Object[]{string}));
        }
    }
}
