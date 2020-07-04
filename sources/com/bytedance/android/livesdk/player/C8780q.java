package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.util.SparseIntArray;
import com.bytedance.android.live.core.setting.C3339m;
import com.bytedance.android.live.livepullstream.p165a.C3448d;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.p416b.C8761a;
import com.p280ss.optimizer.live.sdk.dns.C45914d;
import com.p280ss.videoarch.liveplayer.C46280a;
import com.p280ss.videoarch.liveplayer.C46285b;
import com.p280ss.videoarch.liveplayer.C46300c;
import com.p280ss.videoarch.liveplayer.C46311e;
import com.p280ss.videoarch.liveplayer.C46311e.C46317a;

/* renamed from: com.bytedance.android.livesdk.player.q */
public final class C8780q {

    /* renamed from: a */
    final Context f23844a;

    /* renamed from: b */
    boolean f23845b;

    /* renamed from: c */
    boolean f23846c = true;

    /* renamed from: d */
    SparseIntArray f23847d;

    /* renamed from: e */
    C8761a f23848e;

    /* renamed from: f */
    C46311e f23849f;

    /* renamed from: g */
    C8782r f23850g;

    /* renamed from: a */
    public final ITTLivePlayer mo21827a() {
        if (((Boolean) LiveSettingKeys.ENABLE_SINGLE_LOOPER_PLAYER_PULL_STREAM.mo10240a()).booleanValue()) {
            return new C8777o(this);
        }
        return new C8776n(this);
    }

    /* renamed from: b */
    public final C46311e mo21830b() {
        int i;
        this.f23850g = new C8782r(this.f23848e);
        C46317a b = C46311e.m145368a(this.f23844a.getApplicationContext()).mo115120b(300000).mo115117a((C46300c) new C8783s()).mo115118a(false).mo115121b(false);
        if (this.f23845b) {
            i = 2;
        } else {
            i = 1;
        }
        this.f23849f = b.mo115114a(i).mo115115a((C46280a) this.f23850g).mo115116a((C46285b) new C46285b() {
            /* renamed from: a */
            public final <T> T mo21831a(String str, T t) {
                return C3339m.m12446a("key_ttlive_sdk_setting", str, t.getClass(), t);
            }
        }).mo115119a();
        if (((Boolean) LiveSettingKeys.PLAYER_ENABLE_UPLOAD_TIME_LINE.mo10240a()).booleanValue()) {
            this.f23849f.mo115071a();
        }
        if (((Integer) LiveSettingKeys.DNS_OPT_METHOD.mo10240a()).intValue() == 1) {
            this.f23849f.mo115078a((C45914d) C3448d.m12769d().mo10424c().mo10467a());
        }
        if (((Boolean) LiveSettingKeys.ENABLE_LIVE_HTTPK_DEGRADE.mo10240a()).booleanValue()) {
            this.f23849f.mo115074a(39, 1);
        }
        return this.f23849f;
    }

    /* renamed from: a */
    public final C8780q mo21828a(C8761a aVar) {
        this.f23848e = aVar;
        return this;
    }

    /* renamed from: a */
    public final C8780q mo21829a(boolean z) {
        this.f23845b = false;
        return this;
    }

    public C8780q(Context context) {
        this.f23844a = context;
        this.f23847d = new SparseIntArray();
    }
}
