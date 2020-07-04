package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bj */
public abstract class C25271bj implements C23254a {

    /* renamed from: a */
    public final Activity f66621a;

    /* renamed from: a */
    private final void m83051a() {
        Activity activity = this.f66621a;
        if (activity instanceof MainActivity) {
            ((MainActivity) this.f66621a).registerActivityOnKeyDownListener(this);
            return;
        }
        if (activity instanceof UserProfileActivity) {
            ((UserProfileActivity) this.f66621a).mo92365a((C23254a) this);
        }
    }

    /* renamed from: b */
    private final void m83052b() {
        Activity activity = this.f66621a;
        if (activity instanceof MainActivity) {
            ((MainActivity) this.f66621a).unRegisterActivityOnKeyDownListener(this);
            return;
        }
        if (activity instanceof UserProfileActivity) {
            ((UserProfileActivity) this.f66621a).mo92366b(this);
        }
    }

    public C25271bj(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f66621a = activity;
    }

    /* renamed from: a */
    public final void mo65885a(boolean z) {
        if (z) {
            m83051a();
        } else {
            m83052b();
        }
    }
}
