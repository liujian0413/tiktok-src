package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12825h;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.c */
public final class C21915c extends C21902b {

    /* renamed from: b */
    public final JSONObject f58638b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.c$a */
    static final class C21916a<T> implements C7326g<C12710e<C12825h>> {

        /* renamed from: a */
        final /* synthetic */ C21915c f58639a;

        /* renamed from: b */
        final /* synthetic */ String f58640b;

        C21916a(C21915c cVar, String str) {
            this.f58639a = cVar;
            this.f58640b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12825h> eVar) {
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58639a.f58623a;
            Bundle arguments = this.f58639a.f58623a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBoolean("code_sent", true);
            arguments.putInt("next_page", Step.EMAIL_SMS_SIGN_UP.getValue());
            arguments.putString("password", this.f58640b);
            C7573i.m23582a((Object) arguments, "(fragment.arguments ?: B…                        }");
            baseAccountFlowFragment.mo58336a(arguments);
        }
    }

    /* renamed from: a */
    public final boolean mo58351a() {
        if (this.f58638b != null) {
            String string = this.f58638b.getString("email");
            String string2 = this.f58638b.getString("password");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                FragmentActivity activity = this.f58623a.getActivity();
                C7573i.m23582a((Object) string, "email");
                C22034b a = C22033a.m73316a(activity, string, Scene.SIGN_UP);
                if (a != null) {
                    C21866f fVar = a.f58908a;
                    if (fVar != null && fVar.mo58295e()) {
                        BaseAccountFlowFragment baseAccountFlowFragment = this.f58623a;
                        Bundle arguments = this.f58623a.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putBoolean("code_sent", false);
                        arguments.putInt("next_page", Step.EMAIL_SMS_SIGN_UP.getValue());
                        arguments.putString("password", string2);
                        C7573i.m23582a((Object) arguments, "(fragment.arguments ?: B…wd)\n                    }");
                        baseAccountFlowFragment.mo58336a(arguments);
                        return true;
                    }
                }
                C21931e.m73161a(this.f58623a, string, 1, false, string2).mo19278c((C7326g<? super T>) new C21916a<Object>(this, string2)).mo19273b();
            }
        }
        return true;
    }

    public C21915c(BaseAccountFlowFragment baseAccountFlowFragment, JSONObject jSONObject) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        super(baseAccountFlowFragment);
        this.f58638b = jSONObject;
    }
}
