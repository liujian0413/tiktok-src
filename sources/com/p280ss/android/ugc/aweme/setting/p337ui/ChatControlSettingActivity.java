package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.api.BlackApiManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity */
public class ChatControlSettingActivity extends BaseControlSettingActivity implements C6310a {

    /* renamed from: d */
    private int f98374d;

    /* renamed from: e */
    private boolean f98375e;

    /* renamed from: f */
    private boolean f98376f;

    /* renamed from: g */
    private String f98377g;

    /* renamed from: h */
    private C6309f f98378h;

    /* renamed from: e */
    public final String mo95114e() {
        return "";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: f */
    public final void mo95115f() {
        this.mEveryoneItem.setTag(Integer.valueOf(1));
        this.mFriendsItem.setTag(Integer.valueOf(2));
        this.mOffItem.setTag(Integer.valueOf(3));
    }

    /* renamed from: c */
    public final void mo95111c() {
        int i;
        Intent intent = getIntent();
        String str = "chat_set";
        int i2 = 1;
        if (C6399b.m19946v()) {
            i = 2;
        } else {
            i = 1;
        }
        this.f98374d = intent.getIntExtra(str, i);
        if (-1 == this.f98374d || this.f98374d == 0) {
            if (C6399b.m19946v()) {
                i2 = 2;
            }
            this.f98374d = i2;
        }
        if (C6399b.m19946v()) {
            this.f98375e = getIntent().getBooleanExtra("chat_setting_open_everyone", false);
        }
        this.f98361a = this.f98374d;
        this.f98376f = getIntent().getBooleanExtra("from_parental_platform", false);
        this.f98377g = getIntent().getStringExtra("user_id");
        this.f98378h = new C6309f(this);
    }

    /* renamed from: d */
    public final void mo95113d() {
        int i;
        if (this.f98376f) {
            this.mTitle.setText(getString(R.string.b3b));
        } else {
            this.mTitle.setText(getString(R.string.fse));
        }
        this.mEveryoneItem.setVisibility(0);
        if (1 == this.f98374d) {
            m120668a(this.mEveryoneItem);
        }
        if (C6399b.m19946v()) {
            try {
                if (!this.f98375e && !C30199h.m98861a().getEnableTImChatEveryone().booleanValue()) {
                    if (this.f98374d == 1) {
                        i = 2;
                    } else {
                        i = this.f98374d;
                    }
                    this.f98374d = i;
                    this.mEveryoneItem.setVisibility(8);
                }
            } catch (NullValueException unused) {
            }
        }
        if (3 == this.f98374d) {
            m120668a(this.mOffItem);
        } else if (2 == this.f98374d) {
            m120668a(this.mFriendsItem);
        }
        if (C30553b.m99786b() && !this.f98376f) {
            mo95108a((CharSequence) getString(R.string.dmu));
        }
        if (C6399b.m19944t()) {
            mo95108a((CharSequence) getString(R.string.at8));
        }
    }

    public void handleMsg(Message message) {
        Object obj = message.obj;
        if (obj instanceof ApiServerException) {
            bJ_();
        } else if (obj instanceof Exception) {
            bJ_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo95109b(int i) {
        if (this.f98376f) {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_set", String.valueOf(i));
            C18253l a = ParentalPlatformApi.m74659a(this.f98377g, hashMap);
            if (a != null) {
                C18246h.m60213a(a, new C18245g<BaseResponse>() {
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    }

                    public final void onFailure(Throwable th) {
                        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                ChatControlSettingActivity.this.bJ_();
                                return null;
                            }
                        }, C1592h.f5958b);
                    }
                });
            }
            return;
        }
        BlackApiManager.m120339a(this.f98378h, i);
    }

    /* renamed from: a */
    public final void mo95107a(int i) {
        switch (i) {
            case 1:
                m120668a(this.mEveryoneItem);
                return;
            case 2:
                m120668a(this.mFriendsItem);
                return;
            case 3:
                m120668a(this.mOffItem);
                break;
        }
    }

    /* renamed from: a */
    public static final void m120692a(Activity activity, int i, boolean z, int i2) {
        Intent intent = new Intent(activity, ChatControlSettingActivity.class);
        intent.putExtra("chat_set", i);
        intent.putExtra("chat_setting_open_everyone", z);
        activity.startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public static final void m120693a(Context context, int i, boolean z, String str) {
        Intent intent = new Intent(context, ChatControlSettingActivity.class);
        intent.putExtra("chat_set", i);
        intent.putExtra("chat_setting_open_everyone", z);
        intent.putExtra("from_parental_platform", true);
        intent.putExtra("user_id", str);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
