package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.e */
public final class C21918e extends C21902b {

    /* renamed from: b */
    public final JSONObject f58644b;

    /* renamed from: a */
    public final boolean mo58351a() {
        Intent intent = new Intent(this.f58623a.getContext(), MusLoginActivity.class);
        intent.putExtra("init_page", 15);
        Bundle arguments = this.f58623a.getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        String str = "platform";
        JSONObject jSONObject = this.f58644b;
        if (jSONObject == null) {
            C7573i.m23580a();
        }
        Object obj = jSONObject.get("platform");
        if (obj != null) {
            arguments.putString(str, (String) obj);
            String str2 = "loginType";
            Object obj2 = this.f58644b.get("loginType");
            if (obj2 != null) {
                arguments.putString(str2, (String) obj2);
                String str3 = "pwd";
                Object obj3 = this.f58644b.get("pwd");
                if (obj3 != null) {
                    arguments.putString(str3, (String) obj3);
                    String str4 = "handle";
                    Object obj4 = this.f58644b.get("handle");
                    if (obj4 != null) {
                        arguments.putString(str4, (String) obj4);
                        Bundle arguments2 = this.f58623a.getArguments();
                        if (arguments2 == null) {
                            C7573i.m23580a();
                        }
                        intent.putExtras(arguments2);
                        this.f58623a.startActivity(intent);
                        return true;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public C21918e(BaseAccountFlowFragment baseAccountFlowFragment, JSONObject jSONObject) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        super(baseAccountFlowFragment);
        this.f58644b = jSONObject;
    }
}
