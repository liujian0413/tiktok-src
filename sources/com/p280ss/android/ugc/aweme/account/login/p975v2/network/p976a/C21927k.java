package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.k */
public final class C21927k extends C21902b {

    /* renamed from: b */
    public final int f58660b;

    /* renamed from: c */
    public final JSONObject f58661c;

    /* renamed from: a */
    public final boolean mo58351a() {
        Intent intent = new Intent(this.f58623a.getContext(), MusLoginActivity.class);
        intent.putExtra("init_page", 14);
        Bundle arguments = this.f58623a.getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        String str = "sharkTicket";
        JSONObject jSONObject = this.f58661c;
        if (jSONObject == null) {
            C7573i.m23580a();
        }
        Object obj = jSONObject.get("shark_ticket");
        if (obj != null) {
            arguments.putString(str, (String) obj);
            String str2 = "phoneNumber";
            Object obj2 = this.f58661c.get("mobile");
            if (obj2 != null) {
                arguments.putString(str2, (String) obj2);
                String str3 = "loginType";
                Object obj3 = this.f58661c.get("loginType");
                if (obj3 != null) {
                    arguments.putString(str3, (String) obj3);
                    String str4 = "pwd";
                    Object obj4 = this.f58661c.get("pwd");
                    if (obj4 != null) {
                        arguments.putString(str4, (String) obj4);
                        String str5 = "handle";
                        Object obj5 = this.f58661c.get("handle");
                        if (obj5 != null) {
                            arguments.putString(str5, (String) obj5);
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
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public C21927k(BaseAccountFlowFragment baseAccountFlowFragment, int i, JSONObject jSONObject) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        super(baseAccountFlowFragment);
        this.f58660b = i;
        this.f58661c = jSONObject;
    }
}
