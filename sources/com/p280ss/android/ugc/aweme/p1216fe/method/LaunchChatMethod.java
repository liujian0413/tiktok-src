package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod */
public final class LaunchChatMethod extends BaseCommonJavaMethod {

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod$a */
    static final class C27891a implements C23305g {

        /* renamed from: a */
        final /* synthetic */ LaunchChatMethod f73477a;

        /* renamed from: b */
        final /* synthetic */ String f73478b;

        /* renamed from: c */
        final /* synthetic */ IMUser f73479c;

        /* renamed from: d */
        final /* synthetic */ int f73480d;

        /* renamed from: e */
        final /* synthetic */ C27876a f73481e;

        C27891a(LaunchChatMethod launchChatMethod, String str, IMUser iMUser, int i, C27876a aVar) {
            this.f73477a = launchChatMethod;
            this.f73478b = str;
            this.f73479c = iMUser;
            this.f73480d = i;
            this.f73481e = aVar;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            Context context;
            WeakReference weakReference = this.f73477a.f73443f;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (LaunchChatMethod.m91373a(context, this.f73479c, this.f73480d)) {
                C27876a aVar = this.f73481e;
                if (aVar != null) {
                    aVar.mo71363a((Object) Integer.valueOf(1));
                }
                return;
            }
            C27876a aVar2 = this.f73481e;
            if (aVar2 != null) {
                aVar2.mo71362a(0, "open chat fail");
            }
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        int i;
        if (jSONObject == null) {
            aVar.mo71362a(0, "no params found");
            return;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        boolean optBoolean = jSONObject.optBoolean("is_author_service");
        if (optBoolean) {
            str = "message";
        } else {
            str = "poi_page";
        }
        String str2 = str;
        if (optBoolean) {
            i = 12;
        } else {
            i = 0;
        }
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        Context context = null;
        if (!a.isLogin()) {
            WeakReference weakReference = this.f73443f;
            if (weakReference != null) {
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    if (!(context2 instanceof Activity)) {
                        context2 = null;
                    }
                    if (context2 != null) {
                        if (context2 != null) {
                            C27891a aVar2 = new C27891a(this, str2, iMUser, i, aVar);
                            C32656f.m105745a((Activity) context2, str2, "click_chat_button", (C23305g) aVar2);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            }
            return;
        }
        WeakReference weakReference2 = this.f73443f;
        if (weakReference2 != null) {
            context = (Context) weakReference2.get();
        }
        if (m91373a(context, iMUser, i)) {
            aVar.mo71363a((Object) Integer.valueOf(1));
        } else {
            aVar.mo71362a(0, "open chat fail");
        }
    }

    /* renamed from: a */
    public static boolean m91373a(Context context, IMUser iMUser, int i) {
        if (context == null) {
            return false;
        }
        IIMService a = C30553b.m99808a(false);
        if (!C30553b.m99785a() || a == null) {
            return false;
        }
        a.startChat(context, iMUser, i);
        return true;
    }
}
