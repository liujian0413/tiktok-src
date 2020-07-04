package com.bytedance.opensdk.core.base.p628ui;

import android.webkit.WebView;
import com.bytedance.opensdk.core.grant.web.C12331b;
import com.bytedance.opensdk.core.grant.web.WebPageStatusView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.base.ui.a */
public final class C12315a {

    /* renamed from: b */
    public static final C12316a f32690b = new C12316a(null);

    /* renamed from: a */
    public final WebView f32691a;

    /* renamed from: c */
    private final WebPageStatusView f32692c;

    /* renamed from: com.bytedance.opensdk.core.base.ui.a$a */
    public static final class C12316a {
        private C12316a() {
        }

        public /* synthetic */ C12316a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo30144a() {
        C12331b.m35807a(this.f32691a);
    }

    /* renamed from: b */
    public final void mo30147b() {
        C12331b.m35809b(this.f32691a);
    }

    /* renamed from: c */
    public final void mo30148c() {
        C12331b.m35810c(this.f32691a);
    }

    /* renamed from: a */
    public final void mo30146a(String str) {
        C7573i.m23587b(str, "url");
        C12317b.m35776a(this.f32691a, str);
    }

    /* renamed from: a */
    public final void mo30145a(int i) {
        if (i != 1000) {
            switch (i) {
                case 0:
                    this.f32691a.setVisibility(8);
                    this.f32692c.mo30163a(0);
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
            }
        }
        this.f32691a.setVisibility(0);
        this.f32692c.mo30163a(1);
    }

    public C12315a(WebView webView, WebPageStatusView webPageStatusView) {
        C7573i.m23587b(webView, "webView");
        C7573i.m23587b(webPageStatusView, "webPageStatusView");
        this.f32691a = webView;
        this.f32692c = webPageStatusView;
        mo30145a(0);
    }
}
