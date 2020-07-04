package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.a */
public class C25961a extends WebChromeClient {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68662a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25961a.class), "popupBlackList", "getPopupBlackList()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/PopupBlackList;"))};

    /* renamed from: c */
    public static final C25962a f68663c = new C25962a(null);

    /* renamed from: b */
    public boolean f68664b = true;

    /* renamed from: d */
    private final C7541d f68665d = C7546e.m23569a(C25963b.f68666a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.a$a */
    public static final class C25962a {
        private C25962a() {
        }

        public /* synthetic */ C25962a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.a$b */
    static final class C25963b extends Lambda implements C7561a<PopupBlackList> {

        /* renamed from: a */
        public static final C25963b f68666a = new C25963b();

        C25963b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m85282a();
        }

        /* renamed from: a */
        private static PopupBlackList m85282a() {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                return a.getPopupBlackList();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private final PopupBlackList m85280a() {
        return (PopupBlackList) this.f68665d.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m85281a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r1 = r7.m85280a()
            if (r1 != 0) goto L_0x000d
            boolean r8 = r7.f68664b
            return r8
        L_0x000d:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r1 = r7.m85280a()
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.lang.Integer r1 = r1.getDimensional()
            if (r1 == 0) goto L_0x001f
            int r1 = r1.intValue()
            goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r3 = r7.m85280a()
            if (r3 == 0) goto L_0x005d
            java.util.List r3 = r3.getKeywordList()
            if (r3 == 0) goto L_0x005d
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005d
        L_0x003b:
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.C7634n.m23776c(r5, r4, r0)
            if (r4 == 0) goto L_0x003f
            r8 = 1
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            boolean r3 = r7.f68664b
            if (r3 == 0) goto L_0x006d
            switch(r1) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            r8 = 0
            goto L_0x006a
        L_0x0067:
            if (r8 != 0) goto L_0x0065
            r8 = 1
        L_0x006a:
            if (r8 == 0) goto L_0x006d
            return r2
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25961a.m85281a(java.lang.String):boolean");
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (m85281a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (m85281a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (m85281a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (m85281a(str)) {
            return false;
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
        return true;
    }
}
