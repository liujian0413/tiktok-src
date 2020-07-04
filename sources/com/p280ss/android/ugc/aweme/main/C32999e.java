package com.p280ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.video.C43268o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.e */
public final class C32999e {

    /* renamed from: com.ss.android.ugc.aweme.main.e$a */
    static final class C33000a<T> implements C0053p<String> {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f85968a;

        C33000a(FragmentActivity fragmentActivity) {
            this.f85968a = fragmentActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1382453013) {
                    if (hashCode != 2614219) {
                        if (hashCode == 1055811561 && str.equals("DISCOVER")) {
                            C6903bc.m21474O().mo84347a(this.f85968a);
                        }
                    } else if (str.equals("USER")) {
                    }
                } else if (str.equals("NOTIFICATION") && C6399b.m19944t()) {
                    Context context = this.f85968a;
                    StringBuilder sb = new StringBuilder("Player Type = ");
                    sb.append(C43268o.m137252J());
                    C10761a.m31404c(context, sb.toString(), 0).mo25750a();
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m106648a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        if (C7163a.m22363a()) {
            C30246a.m98970a(fragmentActivity).mo79741i(fragmentActivity, new C33000a(fragmentActivity));
        }
    }
}
