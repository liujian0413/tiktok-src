package com.p280ss.android.ugc.trill.setting;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.net.C34037b;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;
import com.p280ss.android.ugc.trill.setting.p1766a.C45066a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.b */
public final class C45067b extends C43668a<PushSettingActivity> {

    /* renamed from: b */
    public int f115816b;

    /* renamed from: c */
    private C34065d<String> f115817c = new C34065d<String>() {
        /* renamed from: a */
        public final void mo58715a(Exception exc) {
            C22814a.m75244a(C6399b.m19921a(), (Throwable) exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo58716a(String str, String str2) {
            if (C45067b.this.f113020a != null) {
                switch (C45067b.this.f115816b) {
                    case 1:
                        ((PushSettingActivity) C45067b.this.f113020a).mo107596c();
                        return;
                    case 2:
                        ((PushSettingActivity) C45067b.this.f113020a).mo107595b();
                        return;
                    case 3:
                        ((PushSettingActivity) C45067b.this.f113020a).mo107597d();
                        break;
                }
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107600a(int i, boolean z) {
        if (i == R.id.blx) {
            this.f115816b = 2;
        } else if (i == R.id.anu) {
            this.f115816b = 1;
        } else if (i == R.id.zi) {
            this.f115816b = 3;
        }
        if (this.f113020a != null) {
            C34037b a = C45066a.m142136a(this.f115816b, z ? 1 : 0);
            a.mo86728a((C34065d) this.f115817c);
            a.mo86727a();
        }
    }
}
