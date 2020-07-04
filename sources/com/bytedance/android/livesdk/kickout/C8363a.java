package com.bytedance.android.livesdk.kickout;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.kickout.api.BannedApiV2;
import com.bytedance.android.livesdk.kickout.p399b.C8371a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.kickout.a */
public final class C8363a implements C6310a {

    /* renamed from: a */
    public C8370b f22924a;

    /* renamed from: b */
    public C6309f f22925b = new C6309f(this);

    /* renamed from: c */
    private boolean f22926c = true;

    public final void handleMsg(Message message) {
        switch (message.what) {
            case 1:
                if (message.obj instanceof Exception) {
                    this.f22924a.mo21519a(true, (Exception) message.obj);
                    return;
                } else {
                    this.f22924a.mo21521b(true);
                    return;
                }
            case 2:
                if (message.obj instanceof Exception) {
                    this.f22924a.mo21519a(false, (Exception) message.obj);
                    return;
                } else {
                    this.f22924a.mo21521b(false);
                    return;
                }
            case 3:
                if (this.f22924a != null) {
                    this.f22924a.mo21520b();
                }
                if (!(message.obj instanceof Exception)) {
                    C8371a aVar = (C8371a) message.obj;
                    if (aVar != null) {
                        if (this.f22924a != null) {
                            this.f22924a.mo21518a(aVar, (Exception) null);
                        }
                        this.f22926c = aVar.f10297c.hasMore;
                        break;
                    }
                } else {
                    Exception exc = (Exception) message.obj;
                    if (this.f22924a != null) {
                        this.f22924a.mo21518a((C8371a) null, exc);
                    }
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo21512a(boolean z, long j, long j2) {
        C7492s sVar;
        final int i;
        if (z) {
            sVar = ((BannedApiV2) C9178j.m27302j().mo22373b().mo10440a(BannedApiV2.class)).kickOut(j, j2);
        } else {
            sVar = ((BannedApiV2) C9178j.m27302j().mo22373b().mo10440a(BannedApiV2.class)).unKickOut(j, j2);
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        sVar.mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C3479d<Void>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3479d<Void> dVar) {
                if (C8363a.this.f22925b != null) {
                    C8363a.this.f22925b.sendMessage(C8363a.this.f22925b.obtainMessage(i));
                }
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) {
                if ((th instanceof Exception) && C8363a.this.f22925b != null) {
                    Message obtainMessage = C8363a.this.f22925b.obtainMessage(i);
                    obtainMessage.obj = th;
                    C8363a.this.f22925b.sendMessage(obtainMessage);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo21511a(long j, String str, int i, int i2) {
        C7492s sVar;
        if (this.f22926c) {
            if (this.f22924a != null) {
                this.f22924a.mo21517a();
            }
            if (TextUtils.equals("activity_kick_out", str)) {
                sVar = ((BannedApiV2) C9178j.m27302j().mo22373b().mo10440a(BannedApiV2.class)).getKickedOutList(j, 20, i, TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid());
            } else {
                sVar = ((BannedApiV2) C9178j.m27302j().mo22373b().mo10440a(BannedApiV2.class)).getBannedTalkList(j, 20, i, TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid());
            }
            sVar.mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C8371a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C8371a aVar) {
                    if (C8363a.this.f22925b != null) {
                        Message obtainMessage = C8363a.this.f22925b.obtainMessage(3);
                        obtainMessage.obj = aVar;
                        C8363a.this.f22925b.sendMessage(obtainMessage);
                    }
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) {
                    if ((th instanceof Exception) && C8363a.this.f22925b != null) {
                        Message obtainMessage = C8363a.this.f22925b.obtainMessage(3);
                        obtainMessage.obj = th;
                        C8363a.this.f22925b.sendMessage(obtainMessage);
                    }
                }
            });
        }
    }
}
