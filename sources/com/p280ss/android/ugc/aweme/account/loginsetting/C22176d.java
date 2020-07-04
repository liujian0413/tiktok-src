package com.p280ss.android.ugc.aweme.account.loginsetting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse.SettingInfo;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p941d.C21167b;
import com.p280ss.android.ugc.aweme.account.views.C22361a;
import com.p280ss.android.ugc.aweme.account.views.C22361a.C22363a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.d */
public final class C22176d {

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.d$a */
    public interface C22179a {
        /* renamed from: a */
        void mo58264a();
    }

    /* renamed from: a */
    public static void m73607a(C21167b bVar) {
        C21671bd.m72526a(bVar.f56900a);
        Bundle bundle = new Bundle();
        bundle.putBoolean("block_bind_phone", true);
        C21671bd.m72537e().mo56855a(bundle);
        String str = "";
        if (TextUtils.equals(bVar.f56901b, "weixin")) {
            str = "find_account_weixin";
        } else if (TextUtils.equals(bVar.f56901b, "qzone_sns")) {
            str = "find_account_qq";
        }
        C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("platform", "sms_verification").mo56946a("enter_method", str).f56672a);
        C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("platform", "sms_verification").mo56946a("enter_method", str).mo56944a("status", 1).f56672a);
    }

    /* renamed from: a */
    private static void m73606a(Activity activity, SettingInfo settingInfo, C22179a aVar, String str) {
        if (settingInfo != null) {
            C22361a a = new C22363a().mo58790b(settingInfo.getDialog_content()).mo58787a(settingInfo.getDialog_title()).mo58785a((int) R.drawable.b7m).mo58791c(settingInfo.getL_button_dialog()).mo58792d(settingInfo.getR_button_dialog()).mo58788a((Context) activity);
            final C22361a aVar2 = a;
            final SettingInfo settingInfo2 = settingInfo;
            final C22179a aVar3 = aVar;
            final Activity activity2 = activity;
            final String str2 = str;
            C221771 r1 = new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    try {
                        aVar2.dismiss();
                        C22176d.m73605a(settingInfo2.getL_jump_type(), settingInfo2.getL_jump_url(), aVar3, activity2, str2);
                    } catch (Exception unused) {
                    }
                }
            };
            a.mo58782b(r1);
            C221782 r12 = new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    try {
                        aVar2.dismiss();
                        C22176d.m73605a(settingInfo2.getR_jump_type(), settingInfo2.getR_jump_url(), aVar3, activity2, str2);
                    } catch (Exception unused) {
                    }
                }
            };
            a.mo58781a(r12);
            a.setCanceledOnTouchOutside(false);
            try {
                a.show();
                String str3 = "block_authorize_login_alert";
                C21102b a2 = new C21102b().mo56946a("enter_from", "login_page").mo56946a("enter_method", str);
                String str4 = "platform";
                if (TextUtils.equals(str, "qzone_sns")) {
                    str = "qq";
                }
                C6907h.m21524a(str3, (Map) a2.mo56946a(str4, str).f56672a);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m73605a(int i, String str, C22179a aVar, Activity activity, String str2) {
        ALogLoginPart aLogLoginPart = ALogLoginPart.THIRD_MATCH_SETTING_CLICK;
        ALogLoginMethod aLogLoginMethod = ALogLoginMethod.THIRD_PARTY;
        StringBuilder sb = new StringBuilder("jumpType=");
        sb.append(i);
        sb.append(" jumpUrl=");
        sb.append(str);
        AccountLoginAlogHelper.m71520b(aLogLoginPart, aLogLoginMethod, sb.toString());
        if (activity != null) {
            switch (i) {
                case 0:
                    if (aVar != null) {
                        aVar.mo58264a();
                    }
                    String str3 = "block_authorize_login_click";
                    C21102b a = new C21102b().mo56946a("enter_from", "login_page").mo56946a("enter_method", str2);
                    String str4 = "platform";
                    if (TextUtils.equals(str2, "qzone_sns")) {
                        str2 = "qq";
                    }
                    C6907h.m21524a(str3, (Map) a.mo56946a(str4, str2).mo56946a("target_action", "continue").f56672a);
                    return;
                case 1:
                    if (!TextUtils.isEmpty(str)) {
                        C33038x xVar = (C33038x) C21671bd.m72521a(C33038x.class);
                        if (xVar != null) {
                            xVar.mo60007a((Context) activity, str, true);
                        }
                        String str5 = "block_authorize_login_click";
                        C21102b a2 = new C21102b().mo56946a("enter_from", "login_page").mo56946a("enter_method", str2);
                        String str6 = "platform";
                        if (TextUtils.equals(str2, "qzone_sns")) {
                            str2 = "qq";
                        }
                        C6907h.m21524a(str5, (Map) a2.mo56946a(str6, str2).mo56946a("target_action", "h5").f56672a);
                        return;
                    }
                    break;
                case 2:
                    String str7 = "block_authorize_login_click";
                    C21102b a3 = new C21102b().mo56946a("enter_from", "login_page").mo56946a("enter_method", str2);
                    String str8 = "platform";
                    if (TextUtils.equals(str2, "qzone_sns")) {
                        str2 = "qq";
                    }
                    C6907h.m21524a(str7, (Map) a3.mo56946a(str8, str2).mo56946a("target_action", "close").f56672a);
                    break;
                case 3:
                    if (!TextUtils.isEmpty(str)) {
                        C7195s.m22438a().mo18682a(str);
                        String str9 = "block_authorize_login_click";
                        C21102b a4 = new C21102b().mo56946a("enter_from", "login_page").mo56946a("enter_method", str2);
                        String str10 = "platform";
                        if (TextUtils.equals(str2, "qzone_sns")) {
                            str2 = "qq";
                        }
                        C6907h.m21524a(str9, (Map) a4.mo56946a(str10, str2).mo56946a("target_action", "rn").f56672a);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static boolean m73608a(List<SettingInfo> list, String str, int i, boolean z, Activity activity, C22179a aVar) {
        int i2;
        if (TextUtils.isEmpty(str) || C6307b.m19566a((Collection<T>) list) || activity == null) {
            return false;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1530308138) {
            if (hashCode != -791575966) {
                if (hashCode == -471473230 && str.equals("sina_weibo")) {
                    c = 2;
                }
            } else if (str.equals("weixin")) {
                c = 1;
            }
        } else if (str.equals("qzone_sns")) {
            c = 0;
        }
        switch (c) {
            case 0:
                i2 = 4;
                break;
            case 1:
                i2 = 5;
                break;
            case 2:
                i2 = 6;
                break;
            default:
                i2 = 0;
                break;
        }
        SettingInfo settingInfo = null;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                SettingInfo settingInfo2 = (SettingInfo) it.next();
                if (settingInfo2.getLogin_platform() == i2) {
                    settingInfo = settingInfo2;
                }
            }
        }
        if (settingInfo == null || settingInfo.getPlan_type() != 1) {
            return false;
        }
        m73606a(activity, settingInfo, aVar, str);
        AccountLoginAlogHelper.m71520b(ALogLoginPart.THIRD_MATCH_SETTING_BEFORE_LOGIN, ALogLoginMethod.THIRD_PARTY, "");
        return true;
    }
}
