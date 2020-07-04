package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.d */
public final class C21917d extends C21902b {

    /* renamed from: b */
    private final Scene f58641b;

    /* renamed from: c */
    private final Step f58642c;

    /* renamed from: d */
    private final JSONObject f58643d;

    /* renamed from: a */
    public final boolean mo58351a() {
        Bundle arguments = this.f58623a.getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("phone_number");
            if (serializable != null) {
                C21931e eVar = C21931e.f58668a;
                BaseAccountFlowFragment baseAccountFlowFragment = this.f58623a;
                if (serializable != null) {
                    eVar.mo58376a(baseAccountFlowFragment, (PhoneNumber) serializable, this.f58641b, this.f58642c, "anti_spam").mo19273b();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber");
                }
            }
        }
        return true;
    }

    public C21917d(BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, JSONObject jSONObject) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        super(baseAccountFlowFragment);
        this.f58641b = scene;
        this.f58642c = step;
        this.f58643d = jSONObject;
    }
}
