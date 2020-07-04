package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b */
public final class C40692b {

    /* renamed from: a */
    private FragmentActivity f105824a;

    /* renamed from: b */
    private String f105825b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b$1 */
    static /* synthetic */ class C406931 {

        /* renamed from: a */
        static final /* synthetic */ int[] f105826a = new int[STATUS.values().length];

        static {
            try {
                f105826a[STATUS.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo100874a(C40677a aVar) {
        C40805n.m130407a(this.f105824a).mo100818b(this.f105825b).observe(this.f105824a, new C40694c(aVar));
    }

    public C40692b(FragmentActivity fragmentActivity, String str) {
        this.f105824a = fragmentActivity;
        this.f105825b = str;
    }

    /* renamed from: a */
    static final /* synthetic */ void m130136a(C40677a aVar, LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null && C406931.f105826a[liveDataWrapper.f88768b.ordinal()] == 1) {
            aVar.mo98222a((AVChallenge) liveDataWrapper.f88767a);
        }
    }
}
