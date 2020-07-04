package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.p280ss.android.newmedia.p897ui.webview.SSWebView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView */
public class TryCatchWebView extends SSWebView {
    public void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    public TryCatchWebView(Context context) {
        super(context);
    }

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            if (!C7163a.m22363a()) {
                C6921a.m21559a(th);
                return;
            }
            throw th;
        }
    }

    public TryCatchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TryCatchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
