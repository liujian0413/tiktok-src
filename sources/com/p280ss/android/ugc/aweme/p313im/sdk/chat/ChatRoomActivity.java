package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C7159e;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity */
public class ChatRoomActivity extends BaseChatRoomActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public static boolean m21588a(Context context) {
        Intent intent = new Intent(context, ChatRoomActivity.class);
        intent.putExtra("back_to_chat_room", true);
        intent.addFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static boolean m21589a(Context context, IMUser iMUser, int i) {
        return m21591a(context, iMUser, i, null, null);
    }

    /* renamed from: a */
    public static boolean m21594a(Context context, IMUser iMUser, IMAdLog iMAdLog) {
        return m21591a(context, iMUser, 0, iMAdLog, null);
    }

    /* renamed from: a */
    public static boolean m21595a(Context context, IMUser iMUser, Serializable serializable) {
        return m21591a(context, iMUser, 0, null, serializable);
    }

    /* renamed from: a */
    public static boolean m21592a(Context context, IMUser iMUser, int i, String str) {
        return m21593a(context, iMUser, 1, str, null, null);
    }

    /* renamed from: a */
    public static boolean m21596a(Context context, String str, int i, Bundle bundle) {
        return m21586a(context, str, 3, bundle, ChatRoomActivity.class);
    }

    /* renamed from: a */
    public static boolean m21591a(Context context, IMUser iMUser, int i, IMAdLog iMAdLog, Serializable serializable) {
        return m21593a(context, iMUser, i, "", iMAdLog, serializable);
    }

    /* renamed from: a */
    private static boolean m21593a(Context context, IMUser iMUser, int i, String str, IMAdLog iMAdLog, Serializable serializable) {
        int i2;
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            C6921a.m21555a("ChatRoomActivity.start user = null");
            return false;
        }
        if (i == 2) {
            i2 = 1;
        } else if (iMUser.getCommerceUserLevel() > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        return m21590a(context, iMUser, i2, i, str, iMAdLog, serializable);
    }

    /* renamed from: a */
    private static boolean m21590a(Context context, IMUser iMUser, int i, int i2, String str, IMAdLog iMAdLog, Serializable serializable) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            C6921a.m21555a("ChatRoomActivity.start user = null");
            return false;
        }
        try {
            Long.parseLong(iMUser.getUid());
            if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
                C7159e.m22356a((Activity) context);
                return false;
            } else if (C6956a.m21632a().mo18009f().isEnableShowTeenageTip()) {
                return false;
            } else {
                Intent intent = new Intent(context, ChatRoomActivity.class);
                intent.putExtra("simple_uesr", iMUser);
                intent.putExtra("key_enter_from", i2);
                intent.putExtra("from_user_id", str);
                intent.putExtra("chat_type", i);
                intent.putExtra("chat_ext", serializable);
                intent.putExtra("im_ad_log", iMAdLog);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("ChatRoomActivity.start uid is invalid: ");
            sb.append(iMUser.getUid());
            C6921a.m21555a(sb.toString());
            return false;
        }
    }
}
