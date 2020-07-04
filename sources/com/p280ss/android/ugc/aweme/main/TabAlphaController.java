package com.p280ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.main.TabAlphaController */
public class TabAlphaController extends Handler implements C0042h {

    /* renamed from: b */
    private static final String[] f85768b = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};

    /* renamed from: c */
    private static TabAlphaController f85769c;

    /* renamed from: a */
    public boolean f85770a;

    /* renamed from: d */
    private View f85771d;

    /* renamed from: e */
    private boolean f85772e;

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        mo84562a(false);
    }

    /* renamed from: a */
    public static TabAlphaController m106429a() {
        if (f85769c == null) {
            f85769c = new TabAlphaController();
        }
        return f85769c;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.f85771d = null;
    }

    private TabAlphaController() {
        if (TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            for (String equals : f85768b) {
                if (TextUtils.equals(equals, Build.MODEL)) {
                    this.f85772e = true;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo84561a(View view) {
        if (view != null) {
            this.f85771d = view;
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume(C0043i iVar) {
        mo84562a(true);
    }

    public void handleMessage(Message message) {
        if (message.what == 1 && this.f85771d != null && !this.f85770a) {
            this.f85771d.setAlpha(this.f85771d.getAlpha() / 2.0f);
            this.f85770a = true;
        }
    }

    /* renamed from: a */
    public final void mo84562a(boolean z) {
        if (this.f85771d != null && this.f85772e) {
            if (!z || this.f85770a) {
                if (hasMessages(1)) {
                    removeMessages(1);
                }
            } else if (!hasMessages(1)) {
                sendEmptyMessageDelayed(1, 1200000);
            }
        }
    }
}
