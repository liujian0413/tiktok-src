package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bx */
public final class C38550bx implements C40023l<C38455ap> {

    /* renamed from: a */
    private Handler f100187a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private C40023l<C38455ap> f100188b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96537a(VideoPublishException videoPublishException) {
        this.f100188b.onError(videoPublishException);
    }

    public final void onError(VideoPublishException videoPublishException) {
        this.f100187a.post(new C38569ca(this, videoPublishException));
    }

    public final void onSynthetiseSuccess(String str) {
        this.f100187a.post(new C38570cb(this, str));
    }

    public C38550bx(C40023l<C38455ap> lVar) {
        this.f100188b = lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96539a(String str) {
        this.f100188b.onSynthetiseSuccess(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96536a(int i, boolean z) {
        this.f100188b.onProgressUpdate(i, z);
    }

    public final void onSuccess(C38455ap apVar, boolean z) {
        this.f100187a.post(new C38552bz(this, apVar, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96538a(C38455ap apVar, boolean z) {
        this.f100188b.onSuccess(apVar, z);
    }

    public final void onProgressUpdate(int i, boolean z) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f100188b.onProgressUpdate(i, z);
        } else {
            this.f100187a.post(new C38551by(this, i, z));
        }
    }
}
