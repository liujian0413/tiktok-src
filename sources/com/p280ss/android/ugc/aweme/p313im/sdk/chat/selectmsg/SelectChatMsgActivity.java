package com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.BaseChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.service.p1350c.C32006a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity */
public final class SelectChatMsgActivity extends BaseChatRoomActivity {

    /* renamed from: b */
    public static final C6950a f19652b = new C6950a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity$a */
    public static final class C6950a {
        private C6950a() {
        }

        public /* synthetic */ C6950a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m21620a(Context context, String str, int i, Bundle bundle) {
            C7573i.m23587b(context, "context");
            return BaseChatRoomActivity.m21586a(context, str, i, bundle, SelectChatMsgActivity.class);
        }
    }

    /* renamed from: a */
    public static final boolean m21618a(Context context, String str, int i, Bundle bundle) {
        return C6950a.m21620a(context, str, i, bundle);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.m, R.anim.t);
    }

    /* renamed from: a */
    public final void mo17971a() {
        super.mo17971a();
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f19639a.setSelectMsgList(C6951b.m21626c(this.f19639a.getConversationId()));
            this.f19639a.setSelectMsgType(extras.getInt("select_msg_type", 0));
        }
    }

    public final void onBackPressed() {
        boolean z;
        if (this.f19639a != null) {
            if (this.f19639a.getConversationId().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C32006a aVar = new C32006a();
                aVar.f83726b = this.f19639a.getConversationId();
                C7705c.m23799a().mo20394d(aVar);
            }
        }
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.s, R.anim.m);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.SelectChatMsgActivity", "onCreate", false);
    }
}
