package com.bytedance.android.livesdk.p224e;

import com.bytedance.android.live.livepullstream.p165a.C3442b.C3445b;
import com.bytedance.android.live.livepullstream.p165a.C3442b.C3445b.C3446a;
import com.bytedance.android.live.livepullstream.p165a.C3448d;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.room.C3483b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.p280ss.optimizer.live.sdk.base.C45884b;
import com.p280ss.optimizer.live.sdk.base.C45885c.C45887a;
import com.p280ss.optimizer.live.sdk.base.C45889d;
import com.p280ss.optimizer.live.sdk.dns.C45899a;

/* renamed from: com.bytedance.android.livesdk.e.a */
public final class C5888a implements C3483b {

    /* renamed from: a */
    private C45899a f17429a;

    /* renamed from: com.bytedance.android.livesdk.e.a$a */
    public static final class C5890a implements C3445b<C3483b> {
        /* renamed from: a */
        public final C3446a<C3483b> mo10425a(C3446a<C3483b> aVar) {
            return aVar.mo10427a(new C5888a()).mo10426a();
        }
    }

    private C5888a() {
    }

    /* renamed from: a */
    public final C45899a mo10467a() {
        return this.f17429a;
    }

    /* renamed from: a */
    public final void mo10468a(C45899a aVar) {
        this.f17429a = aVar;
    }

    /* renamed from: a */
    public final void mo10469a(boolean z) {
        if (((Integer) LiveSettingKeys.DNS_OPT_METHOD.mo10240a()).intValue() == 1 && C3448d.m12769d().mo10424c().mo10467a() == null) {
            C45889d.m143985a().mo111168a(new C45887a().mo111166a("https://hotapi-va.isnssdk.com").mo111164a(((IHostContext) C3596c.m13172a(IHostContext.class)).getUpdateVersionCode()).mo111165a((C45884b) new C45884b() {
                /* renamed from: a */
                public final String mo14420a(String str) throws Exception {
                    return new String(((C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).get(str, null).mo23512a()).f25947e);
                }

                /* renamed from: a */
                public final String mo14421a(String str, byte[] bArr, String str2, String str3) throws Exception {
                    return new String(((C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).post(str, null, str3, bArr).mo23512a()).f25947e);
                }
            }).mo111167a());
            C45899a aVar = new C45899a(((IHostContext) C3596c.m13172a(IHostContext.class)).context().getApplicationContext());
            C3448d.m12769d().mo10424c().mo10468a(aVar);
            aVar.mo111182a();
        }
    }
}
