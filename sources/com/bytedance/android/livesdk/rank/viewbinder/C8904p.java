package com.bytedance.android.livesdk.rank.viewbinder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.p */
final /* synthetic */ class C8904p implements OnClickListener {

    /* renamed from: a */
    private final C8902a f24274a;

    /* renamed from: b */
    private final User f24275b;

    C8904p(C8902a aVar, User user) {
        this.f24274a = aVar;
        this.f24275b = user;
    }

    public final void onClick(View view) {
        this.f24274a.mo21991a(this.f24275b, view);
    }
}
