package com.p280ss.android.ugc.aweme.app.p1020a;

import android.os.Bundle;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.IAccountUserService.C6856a;
import com.p280ss.android.ugc.aweme.account.util.C22330i;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.base.p1058c.C23283b;
import com.p280ss.android.ugc.aweme.base.p1058c.C23284c;
import com.p280ss.android.ugc.aweme.base.p1058c.C23286e;
import com.p280ss.android.ugc.aweme.base.p1058c.C23287f;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.data.C29983a;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.user.p1688c.C42812a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43520q;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.a.d */
public class C22755d implements C6856a {
    /* renamed from: a */
    static final /* synthetic */ Object m75138a(User user, User user2) throws Exception {
        synchronized (C22755d.class) {
            C42812a aVar = new C42812a();
            if (C22345t.m73973f() == 1 && user.getUserMode() == 0) {
                int a = aVar.mo104502a(user.getUid());
                if (a == 2 || a == 1) {
                    user.setUserMode(a);
                }
            }
            boolean isFlowcardMember = user.isFlowcardMember();
            if (isFlowcardMember != user2.isFlowcardMember()) {
                AutoPlaySetting b = C29983a.m98302a().mo76180b();
                b.isOpen = isFlowcardMember;
                b.changeType = 0;
                C29983a.m98302a().mo76179a(b);
            }
            C22330i.m73930a();
            C30553b.m99810g().updateIMUser(C30553b.m99780a(user));
        }
        return null;
    }

    public void onChanged(int i, User user, User user2, Bundle bundle) {
        String str;
        switch (i) {
            case 4:
                if (C7213d.m22500a().mo18752aO()) {
                    C42812a aVar = new C42812a();
                    if (C22345t.m73973f() == 1 && user2.getUserMode() == 0) {
                        int a = aVar.mo104502a(user2.getUid());
                        if (a == 2 || a == 1) {
                            user2.setUserMode(a);
                        }
                    }
                    boolean isFlowcardMember = user2.isFlowcardMember();
                    if (isFlowcardMember != user.isFlowcardMember()) {
                        AutoPlaySetting b = C29983a.m98302a().mo76180b();
                        b.isOpen = isFlowcardMember;
                        b.changeType = 0;
                        C29983a.m98302a().mo76179a(b);
                    }
                    C22330i.m73930a();
                    C30553b.m99810g().updateIMUser(C30553b.m99780a(user2));
                    return;
                }
                C1592h.m7855a((Callable<TResult>) new C22756e<TResult>(user2, user), (Executor) C7258h.m22730c());
                return;
            case 5:
                C42961az.m136380a(new C23284c(user2));
                return;
            case 6:
                C30553b.m99810g().updateIMUser(C30553b.m99780a(user2));
                return;
            case 8:
                C42961az.m136380a(new C23286e());
                return;
            case 9:
                if (bundle != null) {
                    str = bundle.getString("message", "");
                } else {
                    str = "";
                }
                C42961az.m136380a(new C23287f(str));
                return;
            case 10:
                C42961az.m136381b(new C23283b(user2));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("user_id", user2.getUid());
                } catch (JSONException unused) {
                }
                C42961az.m136381b(new C43520q("userLogin", jSONObject));
                return;
            case 11:
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getUserSettings();
                break;
        }
    }
}
