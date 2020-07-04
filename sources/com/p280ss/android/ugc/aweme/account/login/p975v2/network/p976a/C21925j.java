package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.j */
public final class C21925j extends C21902b {

    /* renamed from: b */
    public final int f58655b;

    /* renamed from: c */
    public final JSONObject f58656c;

    /* renamed from: d */
    public final Scene f58657d;

    /* renamed from: e */
    public final Step f58658e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.j$a */
    static final class C21926a<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ C21925j f58659a;

        C21926a(C21925j jVar) {
            this.f58659a = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58659a.f58623a;
            Bundle arguments = this.f58659a.f58623a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", Step.PHONE_SMS_LOGIN.getValue());
            arguments.putBoolean("code_sent", true);
            arguments.putBoolean("bind_secure", true);
            C7573i.m23582a((Object) arguments, "(fragment.arguments ?: B…CURE, true)\n            }");
            baseAccountFlowFragment.mo58336a(arguments);
        }
    }

    /* renamed from: a */
    public final boolean mo58351a() {
        FragmentActivity activity = this.f58623a.getActivity();
        String a = PhoneNumberUtil.m73058a(C21903c.f58624a.mo58353b((Fragment) this.f58623a));
        C7573i.m23582a((Object) a, "PhoneNumberUtil.formatNu…elper.getPhone(fragment))");
        C22034b a2 = C22033a.m73316a(activity, a, Scene.LOGIN);
        if (a2 != null) {
            C21866f fVar = a2.f58908a;
            if (fVar != null && fVar.mo58295e()) {
                BaseAccountFlowFragment baseAccountFlowFragment = this.f58623a;
                Bundle arguments = this.f58623a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", Step.PHONE_SMS_LOGIN.getValue());
                arguments.putBoolean("code_sent", false);
                arguments.putBoolean("bind_secure", true);
                C7573i.m23582a((Object) arguments, "(fragment.arguments ?: B…CURE, true)\n            }");
                baseAccountFlowFragment.mo58336a(arguments);
                return true;
            }
        }
        C21931e.f58668a.mo58380a(this.f58623a, PhoneNumberUtil.m73058a(C21903c.f58624a.mo58353b((Fragment) this.f58623a)), this.f58657d, this.f58658e, "", "auto_system", null).mo19278c((C7326g<? super T>) new C21926a<Object>(this)).mo19273b();
        return true;
    }

    public C21925j(BaseAccountFlowFragment baseAccountFlowFragment, int i, JSONObject jSONObject, Scene scene, Step step) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        super(baseAccountFlowFragment);
        this.f58655b = i;
        this.f58656c = jSONObject;
        this.f58657d = scene;
        this.f58658e = step;
    }
}
