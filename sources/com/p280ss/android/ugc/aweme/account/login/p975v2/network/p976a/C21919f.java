package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.f */
public final class C21919f extends C21902b {

    /* renamed from: b */
    public final BaseAccountFlowFragment f58645b;

    /* renamed from: c */
    public final String f58646c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.f$a */
    static final class C21920a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21919f f58647a;

        C21920a(C21919f fVar) {
            this.f58647a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (TextUtils.isEmpty(this.f58647a.f58646c)) {
                BaseAccountFlowFragment baseAccountFlowFragment = this.f58647a.f58623a;
                String string = this.f58647a.f58623a.getString(R.string.cjs);
                C7573i.m23582a((Object) string, "fragment.getString(R.string.network_unavailable)");
                baseAccountFlowFragment.mo58335a(0, string);
                return;
            }
            C6907h.m21524a("click_sign_up", (Map) C21102b.m71165a().mo56946a("enter_method", "login").f56672a);
            if (!C21297b.m71679b()) {
                BaseAccountFlowFragment baseAccountFlowFragment2 = this.f58647a.f58645b;
                Bundle arguments = this.f58647a.f58623a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", Step.AGE_GATE_LOGIN.getValue());
                arguments.putString("sms_code_key", this.f58647a.f58646c);
                C7573i.m23582a((Object) arguments, "(fragment.arguments ?: B…                        }");
                baseAccountFlowFragment2.mo58336a(arguments);
                return;
            }
            C21931e.m73158a(this.f58647a.f58623a, C21903c.f58624a.mo58353b((Fragment) this.f58647a.f58645b), this.f58647a.f58646c, Scene.SIGN_UP, this.f58647a.f58645b.mo58339d()).mo19273b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.f$b */
    static final class C21921b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21919f f58648a;

        C21921b(C21919f fVar) {
            this.f58648a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            FragmentActivity activity = this.f58648a.f58623a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo58351a() {
        C10741a b = new C10741a(this.f58645b.getActivity()).mo25660b(this.f58645b.getString(R.string.acb)).mo25654a(this.f58645b.getString(R.string.ac_), (OnClickListener) new C21920a(this)).mo25661b(this.f58645b.getString(R.string.aca), (OnClickListener) new C21921b(this));
        C7573i.m23582a((Object) b, "DmtDialog.Builder(frag.a…essed()\n                }");
        m73111a(b);
        return true;
    }

    public C21919f(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "frag");
        C7573i.m23587b(str, "smsCodeKey");
        super(baseAccountFlowFragment);
        this.f58645b = baseAccountFlowFragment;
        this.f58646c = str;
    }
}
