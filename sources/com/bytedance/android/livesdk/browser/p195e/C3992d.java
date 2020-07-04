package com.bytedance.android.livesdk.browser.p195e;

import android.net.Uri;
import android.net.Uri.Builder;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.browser.e.d */
public class C3992d {

    /* renamed from: a */
    private List<C3990b> f11874a;

    /* renamed from: com.bytedance.android.livesdk.browser.e.d$a */
    public static final class C3994a implements C9174b<C3992d> {
        /* renamed from: a */
        public final C9175a<C3992d> mo11528a(C9175a<C3992d> aVar) {
            return aVar.mo22388a(new C3992d()).mo22387a();
        }
    }

    private C3992d() {
        this.f11874a = new LinkedList();
        this.f11874a.add(new C3995e());
        this.f11874a.add(new C3991c());
        this.f11874a.add(new C3989a());
    }

    /* renamed from: a */
    public static String m13988a(String str) {
        Builder buildUpon = Uri.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter("path", str);
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public final WebResourceResponse mo11587a(String str, WebView webView) {
        Uri parse = Uri.parse(str);
        for (C3990b a : this.f11874a) {
            WebResourceResponse a2 = a.mo11586a(parse, webView);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
