package com.bytedance.android.livesdk.admin.p185c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.admin.api.AdminApi2;
import com.bytedance.android.livesdk.admin.p184b.C3888a;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.admin.p186d.C3897a;
import com.bytedance.android.livesdk.p428w.C9178j;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.admin.c.a */
public final class C3892a {

    /* renamed from: a */
    private C3897a f11624a;

    /* renamed from: b */
    private AdminApi2 f11625b = ((AdminApi2) C9178j.m27302j().mo22373b().mo10440a(AdminApi2.class));

    public C3892a(C3897a aVar) {
        this.f11624a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11430a(Throwable th) throws Exception {
        this.f11624a.mo11433a((C3890c) null, (Exception) th);
    }

    /* renamed from: a */
    public final void mo11427a(long j) {
        this.f11625b.fetchAdministrators(j, TTLiveSDKContext.getHostService().mo22367h().mo22172a(j), TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3895d<Object>(this), (C7326g<? super Throwable>) new C3896e<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11429a(C3474a aVar) throws Exception {
        int i;
        int i2;
        C3890c cVar = new C3890c();
        cVar.f11618a = aVar.f10296b;
        if (aVar.f10297c == null || ((C3888a) aVar.f10297c).f11615a <= 0) {
            i = 10;
        } else {
            i = ((C3888a) aVar.f10297c).f11615a;
        }
        cVar.f11619b = i;
        if (aVar.f10296b != null) {
            i2 = aVar.f10296b.size();
        } else {
            i2 = 0;
        }
        cVar.f11620c = i2;
        this.f11624a.mo11433a(cVar, (Exception) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11432a(boolean z, Throwable th) throws Exception {
        if (this.f11624a != null) {
            this.f11624a.mo11435a(z, (Exception) th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11428a(long j, boolean z, C3479d dVar) throws Exception {
        User user = new User();
        user.setId(j);
        this.f11624a.mo11434a(z, user);
    }

    /* renamed from: a */
    public final void mo11431a(boolean z, long j, long j2, long j3) {
        int i;
        AdminApi2 adminApi2 = this.f11625b;
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        adminApi2.updateAdmin(i, j, j2, j3).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3893b<Object>(this, j, z), (C7326g<? super Throwable>) new C3894c<Object>(this, z));
    }
}
