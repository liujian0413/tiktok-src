package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.jsbridge.C4030a;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3976c;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3977d;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.example.p266a.C6490c;

public class PreloadWebViewWidget extends LiveRecyclableWidget implements C3976c {

    /* renamed from: a */
    private int f16408a;

    /* renamed from: b */
    private C3978e f16409b;

    /* renamed from: a */
    public final boolean mo11569a() {
        if (this.f16408a == 0 && this.f16409b.f11853a.getParent() == this.containerView) {
            return true;
        }
        return false;
    }

    public void onClear() {
        if (this.f16408a == 0) {
            C9178j.m27302j().mo22374c().mo11539a(this.f16409b);
        }
    }

    /* renamed from: b */
    public final C3978e mo11571b() {
        if (this.f16408a != 0 || (this.f16409b.f11853a.getParent() != this.containerView && this.f16409b.f11853a.getParent() != null)) {
            return null;
        }
        if (this.f16409b != null) {
            this.f16408a = this.f16409b.f11853a.hashCode();
            this.containerView.removeView(this.f16409b.f11853a);
        }
        return this.f16409b;
    }

    public void onUnload() {
        C9178j.m27302j().mo22374c().mo11548b((C3976c) this);
        if (this.f16409b != null && this.containerView == this.f16409b.f11853a.getParent()) {
            this.containerView.removeView(this.f16409b.f11853a);
        }
    }

    public void onInit(Object[] objArr) {
        try {
            this.f16409b = C9178j.m27302j().mo22374c().mo11534a((Activity) this.context, (C3977d) null);
            C9178j.m27302j().mo22374c().mo11549b((C4030a) this.f16409b);
        } catch (Error unused) {
        }
    }

    public void onLoad(Object[] objArr) {
        if (this.f16409b != null) {
            String str = (String) LiveConfigSettingKeys.IN_ROOM_PRELOAD_WEB_VIEW_URL.mo10240a();
            if (this.f16409b.f11853a.getParent() == null) {
                if (!TextUtils.isEmpty(str)) {
                    C9178j.m27302j().mo22374c().mo11540a(this.f16409b, str);
                }
                this.containerView.addView(this.f16409b.f11853a);
            }
            C9178j.m27302j().mo22374c().mo11538a((C3976c) this);
        }
    }

    /* renamed from: a */
    public final boolean mo11570a(WebView webView) {
        if (webView.hashCode() != this.f16408a) {
            return false;
        }
        this.f16408a = 0;
        if (this.f16409b != null) {
            this.f16409b.f11853a.setWebChromeClient(this.f16409b.f11855c);
            this.f16409b.f11853a.setWebViewClient(C6490c.m20171a(this.f16409b.f11856d));
            this.f16409b.f11853a.setBackgroundColor(Color.parseColor("#ffffff"));
            this.f16409b.f11853a.loadUrl("about:blank");
            this.f16409b.f11853a.clearHistory();
            this.f16409b.f11853a.setRadius(0.0f, 0.0f, 0.0f, 0.0f);
            this.containerView.addView(this.f16409b.f11853a);
        }
        return true;
    }
}
