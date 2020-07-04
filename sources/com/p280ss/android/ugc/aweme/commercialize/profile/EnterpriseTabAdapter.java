package com.p280ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter */
public final class EnterpriseTabAdapter extends C1262a<HomeView> {

    /* renamed from: a */
    public CrossPlatformWebView f66056a;

    /* renamed from: b */
    private final Activity f66057b;

    /* renamed from: c */
    private C25965c f66058c;

    /* renamed from: d */
    private final Fragment f66059d;

    /* renamed from: e */
    private String f66060e = null;

    /* renamed from: f */
    private boolean f66061f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter$HomeView */
    public static final class HomeView extends C1293v {
        public HomeView(CrossPlatformWebView crossPlatformWebView) {
            C7573i.m23587b(crossPlatformWebView, "itemView");
            super(crossPlatformWebView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter$a */
    public static final class C25035a implements C25965c {
        C25035a() {
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
        }

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            return false;
        }
    }

    public final int getItemCount() {
        return 1;
    }

    /* renamed from: a */
    public final void mo65513a(String str) {
        C7573i.m23587b(str, "url");
        this.f66060e = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public HomeView onCreateViewHolder(ViewGroup viewGroup, int i) {
        Bundle bundle;
        C7573i.m23587b(viewGroup, "parent");
        CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(this.f66057b, null, 0, 6, null);
        this.f66056a = crossPlatformWebView;
        if (this.f66059d instanceof EnterpriseTabFragment) {
            bundle = ((EnterpriseTabFragment) this.f66059d).mo65516i();
        } else {
            bundle = new Bundle();
        }
        String str = "url";
        String str2 = this.f66060e;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString(str, str2);
        CrossPlatformWebView crossPlatformWebView2 = this.f66056a;
        if (crossPlatformWebView2 == null) {
            C7573i.m23580a();
        }
        CommercializeWebViewHelper.m82757a(crossPlatformWebView2, this.f66058c, this.f66059d, this.f66057b, bundle);
        CrossPlatformWebView crossPlatformWebView3 = this.f66056a;
        if (crossPlatformWebView3 == null) {
            C7573i.m23580a();
        }
        return new HomeView(crossPlatformWebView3);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter.HomeView r9, int r10) {
        /*
            r8 = this;
            java.lang.String r10 = "holder"
            kotlin.jvm.internal.C7573i.m23587b(r9, r10)
            android.view.View r10 = r9.itemView
            if (r10 == 0) goto L_0x00a2
            boolean r10 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r0 = 0
            if (r10 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.framework.services.ServiceManager r10 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r10 = r10.getService(r1)
            java.lang.String r1 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r10 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r10
            boolean r10 = r10.isHaveLatestTab()
            if (r10 == 0) goto L_0x0031
            r1 = 4631530004285489152(0x4046800000000000, double:45.0)
            int r10 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r1)
            goto L_0x0032
        L_0x0031:
            r10 = 0
        L_0x0032:
            android.app.Activity r1 = r8.f66057b
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.p280ss.android.ugc.aweme.base.utils.C23482j.m77105f(r1)
            int r2 = com.p280ss.android.ugc.aweme.base.utils.C23482j.m77101d()
            int r1 = r1 - r2
            android.app.Activity r2 = r8.f66057b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131166066(0x7f070372, float:1.7946367E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            int r1 = r1 - r2
            int r1 = r1 - r10
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            int r10 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r2)
            int r1 = r1 - r10
            boolean r10 = r8.f66061f
            if (r10 == 0) goto L_0x0069
            android.app.Activity r10 = r8.f66057b
            android.content.res.Resources r10 = r10.getResources()
            r2 = 2131165690(0x7f0701fa, float:1.7945604E38)
            float r10 = r10.getDimension(r2)
            int r10 = (int) r10
            int r1 = r1 - r10
        L_0x0069:
            android.view.View r10 = r9.itemView
            java.lang.String r2 = "holder.itemView"
            kotlin.jvm.internal.C7573i.m23582a(r10, r2)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r10 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r10
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            android.app.Activity r3 = r8.f66057b
            android.content.Context r3 = (android.content.Context) r3
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23482j.m77098b(r3)
            r2.<init>(r3, r1)
            r10.setLayoutParams(r2)
            java.lang.String r10 = r8.f66060e
            if (r10 == 0) goto L_0x00a1
            android.view.View r1 = r9.itemView
            r2 = r1
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r2
            r3 = 1
            r4 = 0
            r5 = 4635329916471083008(0x4054000000000000, double:80.0)
            int r5 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r5)
            r6 = 0
            r7 = 0
            r2.mo67464a(r3, r4, r5, r6, r7)
            android.view.View r9 = r9.itemView
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r9 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r9
            r1 = 1
            r9.mo67475a(r10, r0, r1)
            return
        L_0x00a1:
            return
        L_0x00a2:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            java.lang.String r10 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter.onBindViewHolder(com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter$HomeView, int):void");
    }

    public EnterpriseTabAdapter(Fragment fragment, String str, boolean z) {
        C7573i.m23587b(fragment, "fragment");
        this.f66059d = fragment;
        this.f66061f = z;
        FragmentActivity activity = this.f66059d.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        this.f66057b = activity;
        this.f66058c = new C25035a();
    }
}
