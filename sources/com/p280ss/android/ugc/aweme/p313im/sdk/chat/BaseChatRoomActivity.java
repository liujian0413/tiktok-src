package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C7159e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31256a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatRoomActivity */
public class BaseChatRoomActivity extends AmeActivity {

    /* renamed from: a */
    protected SessionInfo f19639a;

    /* renamed from: b */
    private ChatRoomFragment f19640b;

    public void finish() {
        if (this.f19640b != null) {
            this.f19640b.mo80412d();
        }
        super.finish();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("chat");
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.t4);
    }

    public void onBackPressed() {
        if (this.f19640b != null) {
            this.f19640b.mo80410a();
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17971a() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f19639a = (SessionInfo) extras.get("key_session_info");
            if (this.f19639a == null) {
                String string = extras.getString("session_id", "");
                int i = extras.getInt("chat_type", 0);
                int i2 = extras.getInt("key_enter_from", 0);
                if (i == 3) {
                    GroupCheckMsg groupCheckMsg = (GroupCheckMsg) extras.getSerializable("key_group_create_error");
                    GroupSessionInfo groupSessionInfo = new GroupSessionInfo();
                    groupSessionInfo.setGroupCheckMessage(groupCheckMsg);
                    this.f19639a = groupSessionInfo;
                } else {
                    String string2 = extras.getString("from_user_id", "");
                    IMUser iMUser = (IMUser) extras.getSerializable("simple_uesr");
                    IMAdLog iMAdLog = (IMAdLog) extras.getSerializable("im_ad_log");
                    Serializable serializable = extras.getSerializable("chat_ext");
                    if (iMUser != null && iMUser.isFake()) {
                        IMUser a = C6961d.m21657a().mo18019a(iMUser.getUid());
                        if (a != null) {
                            iMUser = a;
                        }
                    }
                    SingleSessionInfo singleSessionInfo = new SingleSessionInfo();
                    singleSessionInfo.setFromUserId(string2);
                    singleSessionInfo.setChatExt(serializable);
                    singleSessionInfo.setImAdLog(iMAdLog);
                    singleSessionInfo.setFromUser(iMUser);
                    this.f19639a = singleSessionInfo;
                    if (TextUtils.isEmpty(string) && iMUser != null) {
                        string = C6425b.m20076a(Long.parseLong(iMUser.getUid()));
                    }
                    m21584a(iMUser, string, i2);
                }
                int i3 = 4;
                if (i2 == 12) {
                    C30733a.m100113a(string);
                } else if (!C30733a.m100118b(string)) {
                    i3 = i;
                }
                this.f19639a.setConversationId(string);
                this.f19639a.setEnterFrom(i2);
                this.f19639a.setChatType(i3);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f19639a != null) {
            bundle.putSerializable("key_session_info", this.f19639a);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f19640b != null) {
            this.f19640b.mo80411a(z);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo17971a();
        m21585a(!intent.getBooleanExtra("back_to_chat_room", false));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        setContentView((int) R.layout.ao);
        C6956a.m21633b().setupStatusBar(this);
        C6956a.m21632a().mo18010g();
        getWindow().getDecorView().setBackgroundResource(R.drawable.ie);
        mo17971a();
        m21585a(false);
    }

    /* renamed from: a */
    private void m21585a(boolean z) {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("chat_room_fragment");
        if (a == null || z) {
            a = new ChatRoomFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_session_info", this.f19639a);
            a.setArguments(bundle);
        }
        this.f19640b = (ChatRoomFragment) a;
        supportFragmentManager.mo2645a().mo2600b(R.id.aoy, a, "chat_room_fragment").mo2606d();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f19640b != null) {
            this.f19640b.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    private static void m21584a(IMUser iMUser, String str, int i) {
        if (iMUser != null && TextUtils.isEmpty(iMUser.getUid())) {
            HashMap hashMap = new HashMap();
            hashMap.put("user", iMUser.toString());
            hashMap.put("key_enter_from", Integer.valueOf(i));
            hashMap.put("conversation_id", str);
            C7074e.m22070b("empty_user", hashMap);
        }
    }

    /* renamed from: a */
    public static boolean m21586a(Context context, String str, int i, Bundle bundle, Class<? extends BaseChatRoomActivity> cls) {
        if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C7159e.m22356a((Activity) context);
            return false;
        } else if (C6956a.m21632a().mo18009f().isEnableShowTeenageTip()) {
            return false;
        } else {
            if (i != 3 || !C31256a.m101859a(str)) {
                Intent intent = new Intent(context, cls);
                intent.putExtra("session_id", str);
                intent.putExtra("chat_type", i);
                if (i != 3) {
                    String valueOf = String.valueOf(C6425b.m20074a(str));
                    IMUser b = C6961d.m21657a().mo18029b(valueOf);
                    if (b == null) {
                        C6921a.m21555a("ChatRoomActivity.start user = null");
                        return false;
                    }
                    try {
                        Long.parseLong(b.getUid());
                        intent.putExtra("simple_uesr", b);
                        intent.putExtra("from_user_id", valueOf);
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder("ChatRoomActivity.start uid is invalid: ");
                        sb.append(b.getUid());
                        C6921a.m21555a(sb.toString());
                        return false;
                    }
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            C10761a.m31399c(context, (int) R.string.bk0).mo25750a();
            return false;
        }
    }
}
