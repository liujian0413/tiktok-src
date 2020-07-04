package com.bytedance.android.livesdk.p188b;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.BanTalkApi;
import com.bytedance.android.livesdk.p428w.C9178j;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.b.a */
public final class C3917a {

    /* renamed from: a */
    public C3922f f11735a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11468a(boolean z, C3479d dVar) throws Exception {
        this.f11735a.mo11472a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11470b(boolean z, C3479d dVar) throws Exception {
        this.f11735a.mo11472a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11469a(boolean z, Throwable th) throws Exception {
        this.f11735a.mo11473b(z, (Exception) th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11471b(boolean z, Throwable th) throws Exception {
        this.f11735a.mo11473b(z, (Exception) th);
    }

    /* renamed from: a */
    public final void mo11467a(boolean z, long j, long j2) {
        BanTalkApi banTalkApi = (BanTalkApi) C9178j.m27302j().mo22373b().mo10440a(BanTalkApi.class);
        if (z) {
            banTalkApi.silence(j, j2).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3918b<Object>(this, z), (C7326g<? super Throwable>) new C3919c<Object>(this, z));
        } else {
            banTalkApi.unsilence(j, j2).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3920d<Object>(this, z), (C7326g<? super Throwable>) new C3921e<Object>(this, z));
        }
    }
}
