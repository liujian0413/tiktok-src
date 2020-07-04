package com.p280ss.android.ugc.aweme.p313im;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.c */
public final class C30555c implements C30544a {
    /* renamed from: a */
    public final boolean mo80286a() {
        return C30553b.m99786b();
    }

    /* renamed from: b */
    public final boolean mo80287b() {
        return C30553b.m99785a();
    }

    /* renamed from: a */
    public final void mo80285a(User user) {
        C30553b.m99810g().updateIMUserFollowStatus(C30553b.m99780a(user));
    }

    /* renamed from: a */
    public final void mo80284a(Context context, RemoteImageView remoteImageView, int i) {
        C30553b.m99783a(context, remoteImageView, i);
    }

    /* renamed from: a */
    public final void mo80283a(Context context, int i, boolean z, Runnable runnable) {
        C30553b.m99810g().wrapperSyncXAlert(context, 2, z, runnable);
    }
}
