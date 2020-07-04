package com.p280ss.android.ugc.aweme.setting.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.verification.C37940b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.model.VerifyActionManager */
public final class VerifyActionManager {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VerifyActionManager.class), "CACHE", "getCACHE()Lcom/ss/android/ugc/aweme/setting/model/IVerifyActionCache;"))};
    private static final C7541d CACHE$delegate = C7546e.m23569a(VerifyActionManager$CACHE$2.INSTANCE);

    /* renamed from: G */
    private static final C6600e f98133G = new C6600e();
    public static final VerifyActionManager INSTANCE = new VerifyActionManager();

    private VerifyActionManager() {
    }

    private final IVerifyActionCache getCACHE() {
        return (IVerifyActionCache) CACHE$delegate.getValue();
    }

    private final Map<String, VerifyTypeAction> getVerifyAction() {
        String str;
        VerifyTypeSetting verifyTypeSetting;
        IVerifyActionCache cache = getCACHE();
        if (cache != null) {
            str = cache.getVerifyAction();
        } else {
            str = null;
        }
        try {
            verifyTypeSetting = (VerifyTypeSetting) f98133G.mo15974a(str, VerifyTypeSetting.class);
        } catch (Exception unused) {
            verifyTypeSetting = null;
        }
        if (verifyTypeSetting != null) {
            return verifyTypeSetting.action;
        }
        return null;
    }

    public final VerifyTypeAction getVerifyActionByType(String str) {
        C7573i.m23587b(str, "type");
        Map verifyAction = getVerifyAction();
        if (verifyAction != null) {
            return (VerifyTypeAction) verifyAction.get(str);
        }
        return null;
    }

    public final void saveVerifyAction(JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.toString())) {
            IVerifyActionCache cache = getCACHE();
            if (cache != null) {
                cache.setVerifyAction(jSONObject.toString());
            }
        }
    }

    private final VerificationBadgeType tryGetNewVerificationAction(String str) {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            MtcertSettings mtcertSettings = a.getMtcertSettings();
            C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
            for (VerificationBadgeType verificationBadgeType : mtcertSettings.getVerificationBadgeType()) {
                C7573i.m23582a((Object) verificationBadgeType, "typeAction");
                if (C7573i.m23585a((Object) str, (Object) String.valueOf(verificationBadgeType.getBadgeType().intValue()))) {
                    return verificationBadgeType;
                }
            }
        } catch (NullValueException unused) {
        }
        return null;
    }

    public final VerifyTypeAction getNewVerificationAction(User user) {
        if (user != null) {
            VerificationBadgeType tryGetNewVerificationAction = INSTANCE.tryGetNewVerificationAction(String.valueOf(user.getVerificationBadgeType()));
            if (tryGetNewVerificationAction != null) {
                Integer actionType = tryGetNewVerificationAction.getActionType();
                C7573i.m23582a((Object) actionType, "newType.actionType");
                return new VerifyTypeAction(actionType.intValue(), "", tryGetNewVerificationAction.getLink());
            }
        }
        return null;
    }

    private final void handleToast(boolean z, Context context) {
        if (z) {
            C10761a.m31410e(context, context.getString(R.string.e_3)).mo25750a();
        } else {
            C37940b.f98795b.mo95389b(context);
        }
    }

    private final boolean handleLink(VerifyTypeAction verifyTypeAction, boolean z) {
        C7195s a = C7195s.m22438a();
        String str = verifyTypeAction.link;
        if (str == null) {
            C7573i.m23580a();
        }
        if (z && C7634n.m23721b(str, WebKitApi.SCHEME_HTTP, false)) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(str);
            str = sb.toString();
        }
        return a.mo18682a(str);
    }

    public final void onI18nVerificationViewClick(Context context, User user, String str, String str2) {
        VerifyTypeAction verifyTypeAction;
        String str3;
        String str4;
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "type");
        if (context != null) {
            boolean z = true;
            VerifyTypeAction newVerificationAction = getNewVerificationAction(user);
            if (newVerificationAction == null) {
                verifyTypeAction = getVerifyActionByType(str);
                z = false;
            } else {
                verifyTypeAction = newVerificationAction;
            }
            if (verifyTypeAction != null) {
                switch (user.getVerificationType()) {
                    case 1:
                        str3 = "认证号";
                        break;
                    case 2:
                        str3 = "音乐人";
                        break;
                    case 3:
                        str3 = "特效师";
                        break;
                    default:
                        str3 = "";
                        break;
                }
                switch (verifyTypeAction.actionType) {
                    case 1:
                        str4 = "toast";
                        handleToast(z, context);
                        break;
                    case 2:
                        String str5 = "link";
                        if (!TextUtils.isEmpty(verifyTypeAction.link)) {
                            handleLink(verifyTypeAction, z);
                        }
                        str4 = str5;
                        break;
                    default:
                        str4 = "toast";
                        handleToast(z, context);
                        break;
                }
                C6907h.m21524a("click_varified_badge", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("landing_page", str4).mo59973a("user_type", str3).f60753a);
            }
        }
    }
}
