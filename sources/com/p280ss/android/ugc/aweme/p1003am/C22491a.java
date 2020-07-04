package com.p280ss.android.ugc.aweme.p1003am;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.am.a */
public final class C22491a {
    /* renamed from: a */
    public static void m74384a(Activity activity) {
        String str;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("backurl");
                if (((Intent) intent.getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY")) == null) {
                    boolean booleanExtra = intent.getBooleanExtra("VENDOR_CLICK_BACK_FOR_INTENT_KEY", false);
                    if (!TextUtils.isEmpty(stringExtra) && !TextUtils.equals("__BACKURL__", stringExtra) && !booleanExtra) {
                        try {
                            Uri parse = Uri.parse(stringExtra);
                            Intent intent2 = new Intent();
                            intent2.setData(parse);
                            intent2.setAction("android.intent.action.VIEW");
                            intent2.addCategory("android.intent.category.BROWSABLE");
                            intent2.setComponent(null);
                            intent2.setSelector(null);
                            activity.startActivityIfNeeded(intent2, -1);
                            activity.moveTaskToBack(true);
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    String stringExtra2 = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                    int intExtra = intent.getIntExtra("extra_story_is_friend", -1);
                    boolean booleanExtra2 = intent.getBooleanExtra("is_from_push", false);
                    if (!intent.getBooleanExtra("is_have_intents", false)) {
                        if ((!C6903bc.m21492k().mo59826b() || booleanExtra2) && activity.isTaskRoot()) {
                            if (TextUtils.isEmpty(stringExtra2)) {
                                str = "aweme://main";
                            } else {
                                StringBuilder sb = new StringBuilder("aweme://main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=");
                                sb.append(stringExtra2);
                                str = sb.toString();
                            }
                            if (intExtra != -1) {
                                C7195s.m22438a().f20133a.mo93886b("extra_story_is_friend");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append("&extra_story_is_friend");
                                sb2.append("=");
                                sb2.append(intExtra);
                                str = sb2.toString();
                            }
                            C7195s.m22438a().mo18679a((Activity) null, str);
                            return;
                        }
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            C42961az.m136380a(new C22493c(stringExtra2));
                        }
                    }
                }
            }
        }
    }
}
