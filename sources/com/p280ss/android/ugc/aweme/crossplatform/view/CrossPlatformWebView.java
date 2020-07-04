package com.p280ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.p280ss.android.sdk.webview.C20135c;
import com.p280ss.android.sdk.webview.C20136d;
import com.p280ss.android.sdk.webview.C20139g;
import com.p280ss.android.sdk.webview.C20144k;
import com.p280ss.android.sdk.webview.DMTJsBridge.C20116a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.crossplatform.C25830b;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.C25881h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25836e;
import com.p280ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i.C25863a;
import com.p280ss.android.ugc.aweme.crossplatform.business.XpathBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25895c;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25896d;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25897e;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25924g;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25924g.C25928b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25964b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25966d;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25985b;
import com.p280ss.android.ugc.aweme.crossplatform.view.ViewStatusRegistry.Status;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.p280ss.android.ugc.aweme.framework.C29959e;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.framework.p1277f.C29967a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30373ac;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27868c;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e;
import com.p280ss.android.ugc.aweme.p1216fe.registry.p1224rn.C28060b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView */
public class CrossPlatformWebView extends FrameLayout implements C26025c, C29948b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68742a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CrossPlatformWebView.class), "rnContextBuildHelper", "getRnContextBuildHelper()Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnContextBuildHelper;"))};

    /* renamed from: A */
    private long f68743A;

    /* renamed from: B */
    private long f68744B;

    /* renamed from: C */
    private HashMap f68745C;

    /* renamed from: b */
    public boolean f68746b;

    /* renamed from: c */
    public final String f68747c;

    /* renamed from: d */
    public C25822g f68748d;

    /* renamed from: e */
    public final long f68749e;

    /* renamed from: f */
    public C30388i f68750f;

    /* renamed from: g */
    public C25886b f68751g;

    /* renamed from: h */
    public String f68752h;

    /* renamed from: i */
    private final ViewStatusRegistry f68753i;

    /* renamed from: j */
    private SearchEnterParam f68754j;

    /* renamed from: k */
    private final C25830b f68755k;

    /* renamed from: l */
    private final Set<C26034h> f68756l;

    /* renamed from: m */
    private final C26035i f68757m;

    /* renamed from: n */
    private final C26039m f68758n;

    /* renamed from: o */
    private C25964b f68759o;

    /* renamed from: p */
    private int f68760p;

    /* renamed from: q */
    private C25965c f68761q;

    /* renamed from: r */
    private final C20136d f68762r;

    /* renamed from: s */
    private C26024b<ReactInstanceManager> f68763s;

    /* renamed from: t */
    private ReactRootView f68764t;

    /* renamed from: u */
    private long f68765u;

    /* renamed from: v */
    private C25862i f68766v;

    /* renamed from: w */
    private final C7541d f68767w;

    /* renamed from: x */
    private DefaultHardwareBackBtnHandler f68768x;

    /* renamed from: y */
    private C28060b f68769y;

    /* renamed from: z */
    private boolean f68770z;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$a */
    public static final class C26010a implements C20139g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68771a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public AbsActivityContainer mo53898a() {
            C25822g gVar = this.f68771a.f68748d;
            if (gVar != null) {
                if (!(gVar instanceof AbsActivityContainer)) {
                    gVar = null;
                }
                if (gVar != null) {
                    if (gVar != null) {
                        return (AbsActivityContainer) gVar;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
                }
            }
            return null;
        }

        C26010a(CrossPlatformWebView crossPlatformWebView) {
            this.f68771a = crossPlatformWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$b */
    public static final class C26011b implements C20139g<C30388i> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68772a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C30388i mo53898a() {
            return this.f68772a.f68750f;
        }

        C26011b(CrossPlatformWebView crossPlatformWebView) {
            this.f68772a = crossPlatformWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$c */
    public static final class C26012c implements C26038l {
        C26012c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$d */
    static final class C26013d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68773a;

        C26013d(CrossPlatformWebView crossPlatformWebView) {
            this.f68773a = crossPlatformWebView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((SingleWebView) this.f68773a.mo67462a((int) R.id.fn)).reload();
            C25886b crossPlatformParams = this.f68773a.getCrossPlatformParams();
            if (crossPlatformParams != null) {
                C25897e eVar = crossPlatformParams.f68476d;
                if (eVar != null && eVar.f68521p) {
                    C25822g gVar = this.f68773a.f68748d;
                    if (gVar != null) {
                        gVar.mo65875d();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$e */
    public static final class C26014e implements C25965c {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68774a;

        /* renamed from: b */
        private boolean f68775b;

        /* renamed from: a */
        private final AdWebStatBusiness m85458a() {
            C25822g gVar = this.f68774a.f68748d;
            if (gVar != null) {
                C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    return (AdWebStatBusiness) crossPlatformBusiness.mo67230a(AdWebStatBusiness.class);
                }
            }
            return null;
        }

        C26014e(CrossPlatformWebView crossPlatformWebView) {
            this.f68774a = crossPlatformWebView;
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            AdWebStatBusiness a = m85458a();
            if (a != null) {
                a.mo67174c(webView, str);
            }
            C25965c customWebViewStatus = this.f68774a.getCustomWebViewStatus();
            if (customWebViewStatus == null || !customWebViewStatus.mo64225b(webView, str)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            C25822g gVar = this.f68774a.f68748d;
            if (gVar != null) {
                C25965c e = gVar.mo65876e();
                if (e != null) {
                    e.mo64223a(webView, str);
                }
            }
            C25965c customWebViewStatus = this.f68774a.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.mo64223a(webView, str);
            }
            ((DmtStatusView) this.f68774a.mo67462a((int) R.id.bu9)).mo25938c(false);
            if (!this.f68775b) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f68774a.mo67462a((int) R.id.afp);
                C7573i.m23582a((Object) dmtStatusView, "error_view");
                dmtStatusView.setVisibility(8);
                this.f68774a.mo67470a(Integer.valueOf(0), "", str, true);
            }
            this.f68774a.f68746b = true;
            this.f68774a.getRegistry().mo67539a(Status.LOAD_FINISH);
            C25822g gVar2 = this.f68774a.f68748d;
            if (gVar2 != null) {
                C25862i crossPlatformBusiness = gVar2.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    XpathBusiness xpathBusiness = (XpathBusiness) crossPlatformBusiness.mo67230a(XpathBusiness.class);
                    if (xpathBusiness != null) {
                        xpathBusiness.xpathDirect(this.f68774a.getCrossPlatformParams(), webView);
                    }
                }
            }
            AdWebStatBusiness a = m85458a();
            if (a != null) {
                a.mo67173b(webView, str);
            }
            if (webView != null) {
                C20116a.m66327a(webView, this.f68774a.getReactId());
            }
        }

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C25822g gVar = this.f68774a.f68748d;
            if (gVar != null) {
                C25965c e = gVar.mo65876e();
                if (e != null) {
                    e.mo64220a(webView, sslErrorHandler, sslError);
                }
            }
            C25965c customWebViewStatus = this.f68774a.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.mo64220a(webView, sslErrorHandler, sslError);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
            if (r1 == null) goto L_0x007a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00c0 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo64221a(android.webkit.WebView r7, android.webkit.WebResourceRequest r8, android.webkit.WebResourceError r9) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f68774a
                com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r0.f68748d
                if (r0 == 0) goto L_0x000f
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.mo65876e()
                if (r0 == 0) goto L_0x000f
                r0.mo64221a(r7, r8, r9)
            L_0x000f:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f68774a
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.getCustomWebViewStatus()
                if (r0 == 0) goto L_0x001a
                r0.mo64221a(r7, r8, r9)
            L_0x001a:
                r0 = 0
                if (r8 == 0) goto L_0x0026
                boolean r1 = r8.isForMainFrame()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x0027
            L_0x0026:
                r1 = r0
            L_0x0027:
                r2 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
                r4 = 0
                if (r3 == 0) goto L_0x003b
                r6.f68775b = r2
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r6.f68774a
                r1.mo67489e()
                goto L_0x0072
            L_0x003b:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
                boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
                if (r1 == 0) goto L_0x0072
                android.net.Uri r1 = r8.getUrl()
                if (r1 == 0) goto L_0x0050
                java.lang.String r1 = r1.getPath()
                goto L_0x0051
            L_0x0050:
                r1 = r0
            L_0x0051:
                if (r1 == 0) goto L_0x006f
                android.net.Uri r1 = r8.getUrl()
                java.lang.String r2 = "request.url"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r1 = r1.getPath()
                if (r1 != 0) goto L_0x0065
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0065:
                java.lang.String r2 = "favicon.ico"
                r3 = 2
                boolean r1 = kotlin.text.C7634n.m23723c(r1, r2, false)
                if (r1 == 0) goto L_0x006f
                return
            L_0x006f:
                com.p280ss.android.sdk.activity.C20106b.m66294a(r8, r9)
            L_0x0072:
                if (r7 == 0) goto L_0x007a
                java.lang.String r1 = r7.getUrl()
                if (r1 != 0) goto L_0x007c
            L_0x007a:
                java.lang.String r1 = "null"
            L_0x007c:
                com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m85415b(r1)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r6.f68774a
                if (r9 == 0) goto L_0x008c
                int r2 = r9.getErrorCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x008d
            L_0x008c:
                r2 = r0
            L_0x008d:
                if (r9 == 0) goto L_0x009a
                java.lang.CharSequence r3 = r9.getDescription()
                if (r3 == 0) goto L_0x009a
                java.lang.String r3 = r3.toString()
                goto L_0x009b
            L_0x009a:
                r3 = r0
            L_0x009b:
                if (r8 == 0) goto L_0x00a2
                android.net.Uri r5 = r8.getUrl()
                goto L_0x00a3
            L_0x00a2:
                r5 = r0
            L_0x00a3:
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r1.mo67470a(r2, r3, r5, r4)
                com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r1 = r6.m85458a()
                if (r1 == 0) goto L_0x00c0
                if (r9 == 0) goto L_0x00bc
                java.lang.CharSequence r9 = r9.getDescription()
                if (r9 == 0) goto L_0x00bc
                java.lang.String r0 = r9.toString()
            L_0x00bc:
                r1.mo67167a(r7, r8, r0)
                return
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.C26014e.mo64221a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo64222a(android.webkit.WebView r3, android.webkit.WebResourceRequest r4, android.webkit.WebResourceResponse r5) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r2.f68774a
                com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r0.f68748d
                if (r0 == 0) goto L_0x000f
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.mo65876e()
                if (r0 == 0) goto L_0x000f
                r0.mo64222a(r3, r4, r5)
            L_0x000f:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r2.f68774a
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.getCustomWebViewStatus()
                if (r0 == 0) goto L_0x001a
                r0.mo64222a(r3, r4, r5)
            L_0x001a:
                com.p280ss.android.sdk.activity.C20106b.m66295a(r4, r5)
                com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r0 = r2.m85458a()
                if (r0 == 0) goto L_0x003c
                r1 = 0
                if (r4 == 0) goto L_0x0031
                android.net.Uri r4 = r4.getUrl()
                if (r4 == 0) goto L_0x0031
                java.lang.String r4 = r4.toString()
                goto L_0x0032
            L_0x0031:
                r4 = r1
            L_0x0032:
                if (r5 == 0) goto L_0x0038
                java.lang.String r1 = r5.getReasonPhrase()
            L_0x0038:
                r0.mo67169a(r3, r4, r1)
                return
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.C26014e.mo64222a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
            C25822g gVar = this.f68774a.f68748d;
            if (gVar != null) {
                C25965c e = gVar.mo65876e();
                if (e != null) {
                    e.mo64224a(webView, str, bitmap);
                }
            }
            C25965c customWebViewStatus = this.f68774a.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.mo64224a(webView, str, bitmap);
            }
            this.f68775b = false;
            this.f68774a.f68746b = false;
            this.f68774a.getRegistry().mo67539a(Status.LOAD_START);
            this.f68774a.mo67509i();
            AdWebStatBusiness a = m85458a();
            if (a != null) {
                a.mo67168a(webView, str);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (r3 == null) goto L_0x003a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo64219a(android.webkit.WebView r3, int r4, java.lang.String r5, java.lang.String r6) {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L_0x0007
                return
            L_0x0007:
                com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r0 = r2.m85458a()
                if (r0 == 0) goto L_0x0010
                r0.mo67169a(r3, r6, r5)
            L_0x0010:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r2.f68774a
                com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r0.f68748d
                if (r0 == 0) goto L_0x001f
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.mo65876e()
                if (r0 == 0) goto L_0x001f
                r0.mo64219a(r3, r4, r5, r6)
            L_0x001f:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r2.f68774a
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.getCustomWebViewStatus()
                if (r0 == 0) goto L_0x002a
                r0.mo64219a(r3, r4, r5, r6)
            L_0x002a:
                r0 = 1
                r2.f68775b = r0
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r2.f68774a
                r0.mo67489e()
                if (r3 == 0) goto L_0x003a
                java.lang.String r3 = r3.getUrl()
                if (r3 != 0) goto L_0x003c
            L_0x003a:
                java.lang.String r3 = "null"
            L_0x003c:
                com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m85415b(r3)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r2.f68774a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0 = 0
                r3.mo67470a(r4, r5, r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.C26014e.mo64219a(android.webkit.WebView, int, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$f */
    public static final class C26015f implements C25966d {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68776a;

        /* renamed from: b */
        private View f68777b;

        /* renamed from: a */
        public final void mo67355a() {
            this.f68776a.removeView(this.f68777b);
            this.f68777b = null;
            C25964b iFullScreen = this.f68776a.getIFullScreen();
            if (iFullScreen != null) {
                iFullScreen.mo67132b();
            }
        }

        C26015f(CrossPlatformWebView crossPlatformWebView) {
            this.f68776a = crossPlatformWebView;
        }

        /* renamed from: a */
        public final void mo67356a(View view, CustomViewCallback customViewCallback) {
            this.f68777b = view;
            this.f68776a.addView(this.f68777b);
            C25964b iFullScreen = this.f68776a.getIFullScreen();
            if (iFullScreen != null) {
                iFullScreen.mo67131a();
            }
        }

        /* renamed from: a */
        public final void mo67357a(WebView webView, int i) {
            if (!C7573i.m23585a((Object) this.f68776a.f68752h, (Object) "about:blank")) {
                if (i == 100) {
                    LineProgressBarView lineProgressBarView = (LineProgressBarView) this.f68776a.mo67462a((int) R.id.ca5);
                    C7573i.m23582a((Object) lineProgressBarView, "pbv_loading_bar");
                    lineProgressBarView.setVisibility(8);
                    return;
                }
                LineProgressBarView lineProgressBarView2 = (LineProgressBarView) this.f68776a.mo67462a((int) R.id.ca5);
                C7573i.m23582a((Object) lineProgressBarView2, "pbv_loading_bar");
                lineProgressBarView2.setProgress(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$g */
    public static final class C26016g implements C25928b {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68778a;

        /* renamed from: b */
        final /* synthetic */ C25886b f68779b;

        /* renamed from: a */
        public final void mo67310a(Exception exc) {
            String str;
            C7573i.m23587b(exc, "e");
            C30388i iVar = this.f68778a.f68750f;
            if (iVar != null) {
                C30395o oVar = (C30395o) iVar.mo80008a(C30395o.class);
                if (oVar != null) {
                    oVar.mo80018a(exc, "native");
                    oVar.mo80020a("on_fail", exc.getMessage());
                }
            }
            C7163a.m22363a();
            C27873e.f73441a.mo71355a("warning", exc);
            CrossPlatformWebView crossPlatformWebView = this.f68778a;
            C25886b bVar = this.f68778a.f68751g;
            if (bVar != null) {
                C25896d dVar = bVar.f68475c;
                if (dVar != null) {
                    str = dVar.f68496g;
                    crossPlatformWebView.mo67471a(str, null);
                }
            }
            str = null;
            crossPlatformWebView.mo67471a(str, null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
            if (r0 == null) goto L_0x008b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo67309a(com.p280ss.android.ugc.aweme.crossplatform.view.C26024b<com.facebook.react.ReactInstanceManager> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "managerReference"
                kotlin.jvm.internal.C7573i.m23587b(r7, r0)
                boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
                r1 = 0
                if (r0 == 0) goto L_0x0036
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "rn_schema:"
                r0.<init>(r2)
                com.ss.android.ugc.aweme.crossplatform.params.base.b r2 = r6.f68779b
                com.ss.android.ugc.aweme.crossplatform.params.d r2 = r2.f68475c
                if (r2 == 0) goto L_0x001c
                java.lang.String r2 = r2.f68499j
                goto L_0x001d
            L_0x001c:
                r2 = r1
            L_0x001d:
                r0.append(r2)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f68778a
                r2 = 2131297485(0x7f0904cd, float:1.8212916E38)
                android.view.View r0 = r0.mo67462a(r2)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
                r2 = 0
                r0.setVisibility(r2)
                java.lang.String r2 = "React Native"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r0.setText(r2)
            L_0x0036:
                com.ss.android.ugc.aweme.crossplatform.d r0 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
                java.lang.Object r2 = r7.mo67542b()
                com.facebook.react.ReactInstanceManager r2 = (com.facebook.react.ReactInstanceManager) r2
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r6.f68778a
                com.ss.android.ugc.aweme.hybrid.monitor.i r3 = r3.f68750f
                r0.mo67243a(r2, r3)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f68778a
                r0.setReactInstanceReference(r7)
                java.lang.String r0 = "time_prepare_context"
                long r2 = android.os.SystemClock.elapsedRealtime()
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r6.f68778a
                long r4 = r4.f68749e
                long r2 = r2 - r4
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r6.f68778a
                com.ss.android.ugc.aweme.crossplatform.params.base.b r4 = r4.f68751g
                if (r4 == 0) goto L_0x0060
                com.ss.android.ugc.aweme.crossplatform.params.d r4 = r4.f68475c
                goto L_0x0061
            L_0x0060:
                r4 = r1
            L_0x0061:
                com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e.m91307a(r0, r2, r4)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f68778a
                android.app.Activity r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0071
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r6.f68778a
                r2.mo67484c(r0)
            L_0x0071:
                com.ss.android.ugc.aweme.crossplatform.params.base.b r0 = r6.f68779b
                com.ss.android.ugc.aweme.crossplatform.params.d r0 = r0.f68475c
                if (r0 == 0) goto L_0x008b
                java.lang.String r0 = r0.f68499j
                if (r0 == 0) goto L_0x008b
                android.net.Uri r0 = android.net.Uri.parse(r0)
                if (r0 == 0) goto L_0x008b
                android.net.Uri r0 = com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m85407a(r0)
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L_0x008d
            L_0x008b:
                java.lang.String r0 = ""
            L_0x008d:
                java.lang.String r2 = "schemaInfo.rnInfo?.rnSch…)\n                } ?: \"\""
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r6.f68778a
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r6.f68778a
                com.ss.android.ugc.aweme.crossplatform.params.base.b r3 = r3.f68751g
                if (r3 != 0) goto L_0x009d
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x009d:
                com.ss.android.ugc.aweme.crossplatform.params.d r3 = r3.f68475c
                if (r3 == 0) goto L_0x00a3
                java.lang.String r1 = r3.f68494e
            L_0x00a3:
                if (r1 != 0) goto L_0x00a8
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00a8:
                r2.mo67468a(r7, r1, r0)
                boolean r7 = com.p280ss.android.ugc.aweme.framework.ReactInstance.isDev
                if (r7 != 0) goto L_0x00b2
                com.p280ss.android.ugc.aweme.framework.ReactInstance.rePrepareReactContext()
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.C26016g.mo67309a(com.ss.android.ugc.aweme.crossplatform.view.b):void");
        }

        C26016g(CrossPlatformWebView crossPlatformWebView, C25886b bVar) {
            this.f68778a = crossPlatformWebView;
            this.f68779b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$h */
    static final class C26017h extends Lambda implements C7561a<C25924g> {

        /* renamed from: a */
        final /* synthetic */ Context f68780a;

        C26017h(Context context) {
            this.f68780a = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C25924g invoke() {
            return new C25924g(this.f68780a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$i */
    public static final class C26018i implements C26035i {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68781a;

        C26018i(CrossPlatformWebView crossPlatformWebView) {
            this.f68781a = crossPlatformWebView;
        }

        /* renamed from: a */
        public final void mo67528a(C25886b bVar) {
            if (bVar != null) {
                this.f68781a.mo67467a(bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$j */
    public static final class C26019j implements C26039m {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f68782a;

        /* renamed from: a */
        public final C20144k mo67529a() {
            return ((SingleWebView) this.f68782a.mo67462a((int) R.id.fn)).getBaseJsMessageHandler();
        }

        /* renamed from: b */
        public final SingleWebView mo67531b() {
            SingleWebView singleWebView = (SingleWebView) this.f68782a.mo67462a((int) R.id.fn);
            C7573i.m23582a((Object) singleWebView, "this@CrossPlatformWebView.ame_rn_web_container");
            return singleWebView;
        }

        C26019j(CrossPlatformWebView crossPlatformWebView) {
            this.f68782a = crossPlatformWebView;
        }

        /* renamed from: a */
        public final void mo67530a(String str) {
            if (str != null) {
                CrossPlatformWebView.m85411a(this.f68782a, str, false, (Map) null, 6, (Object) null);
            }
        }
    }

    public CrossPlatformWebView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CrossPlatformWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C25924g getRnContextBuildHelper() {
        return (C25924g) this.f68767w.getValue();
    }

    /* renamed from: a */
    public View mo67462a(int i) {
        if (this.f68745C == null) {
            this.f68745C = new HashMap();
        }
        View view = (View) this.f68745C.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f68745C.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public void mo67490e(Activity activity) {
        C7573i.m23587b(activity, "activity");
    }

    /* renamed from: f */
    public void mo67491f(Activity activity) {
        C7573i.m23587b(activity, "activity");
    }

    public final int getCurrentMode() {
        return this.f68760p;
    }

    public final C25965c getCustomWebViewStatus() {
        return this.f68761q;
    }

    public final C25964b getIFullScreen() {
        return this.f68759o;
    }

    public final long getLoadRNViewCompleteTimestamp() {
        return this.f68743A;
    }

    /* access modifiers changed from: protected */
    public final C25830b getMDidMountHandler() {
        return this.f68755k;
    }

    public C30388i getMonitorSession() {
        return this.f68750f;
    }

    public final C26024b<ReactInstanceManager> getReactInstanceReference() {
        return this.f68763s;
    }

    public final ReactRootView getReactRootView() {
        return this.f68764t;
    }

    public final ViewStatusRegistry getRegistry() {
        return this.f68753i;
    }

    public final SearchEnterParam getSearchEnterParam() {
        return this.f68754j;
    }

    public ViewStatusRegistry getViewStatusRegistry() {
        return this.f68753i;
    }

    /* renamed from: a */
    public final void mo67466a(C23281a aVar) {
        C7573i.m23587b(aVar, "event");
        ReactRootView reactRootView = this.f68764t;
        if (reactRootView != null) {
            ReactInstanceManager reactInstanceManager = reactRootView.getReactInstanceManager();
            if (reactInstanceManager != null) {
                ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
                if (currentReactContext != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("eventName", "poi_anti_track");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("hit_content", aVar.f61317a);
                    jSONObject.put("data", jSONObject2);
                    C29959e.m98228a(currentReactContext, "notification", C27868c.m91294a(jSONObject));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67469a(C26034h hVar) {
        C7573i.m23587b(hVar, "listener");
        this.f68756l.add(hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67477a() {
        /*
            r4 = this;
            int r0 = r4.f68760p
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L_0x0041
            com.facebook.react.ReactRootView r0 = r4.f68764t
            r3 = 0
            if (r0 == 0) goto L_0x0011
            com.facebook.react.ReactInstanceManager r0 = r0.getReactInstanceManager()
            goto L_0x0012
        L_0x0011:
            r0 = r3
        L_0x0012:
            if (r0 == 0) goto L_0x002a
            com.facebook.react.ReactRootView r0 = r4.f68764t
            if (r0 == 0) goto L_0x0023
            com.facebook.react.ReactInstanceManager r0 = r0.getReactInstanceManager()
            if (r0 == 0) goto L_0x0023
            com.facebook.react.bridge.ReactContext r0 = r0.getCurrentReactContext()
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            if (r0 == 0) goto L_0x002a
            com.facebook.react.bridge.CatalystInstance r3 = r0.getCatalystInstance()
        L_0x002a:
            if (r3 == 0) goto L_0x0040
            boolean r0 = r3.isDestroyed()
            if (r0 != 0) goto L_0x0040
            com.facebook.react.ReactRootView r0 = r4.f68764t
            if (r0 == 0) goto L_0x003f
            com.facebook.react.ReactInstanceManager r0 = r0.getReactInstanceManager()
            if (r0 == 0) goto L_0x003f
            r0.onBackPressed()
        L_0x003f:
            return r2
        L_0x0040:
            return r1
        L_0x0041:
            r0 = 2131296491(0x7f0900eb, float:1.82109E38)
            android.view.View r3 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r3 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r3
            boolean r3 = r3.canGoBack()
            if (r3 == 0) goto L_0x005a
            android.view.View r0 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r0
            r0.goBack()
            return r2
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo67477a():boolean");
    }

    /* renamed from: a */
    public final void mo67476a(boolean z) {
        if (z) {
            View a = mo67462a((int) R.id.x4);
            C7573i.m23582a((Object) a, "click_mask");
            a.setVisibility(0);
            ((DmtStatusView) mo67462a((int) R.id.bu9)).mo25942f();
            return;
        }
        View a2 = mo67462a((int) R.id.x4);
        C7573i.m23582a((Object) a2, "click_mask");
        a2.setVisibility(8);
        ((DmtStatusView) mo67462a((int) R.id.bu9)).mo25938c(true);
    }

    /* renamed from: a */
    public final boolean mo67478a(String str) {
        return C7573i.m23585a((Object) getReactId(), (Object) str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67470a(java.lang.Integer r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "errorCode"
            m85413a(r0, r1, r4)
            r4 = r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0018
            java.lang.String r4 = "errorDesc"
            m85413a(r0, r4, r5)
        L_0x0018:
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0041
            android.net.Uri r4 = android.net.Uri.parse(r6)
            java.lang.String r5 = "url"
            m85413a(r0, r5, r6)
            java.lang.String r5 = "host"
            java.lang.String r6 = "url"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)
            java.lang.String r6 = r4.getHost()
            m85413a(r0, r5, r6)
            java.lang.String r5 = "path"
            java.lang.String r4 = r4.getPath()
            m85413a(r0, r5, r4)
        L_0x0041:
            com.ss.android.ugc.aweme.crossplatform.params.base.b r4 = r3.getCrossPlatformParams()
            r5 = 0
            if (r4 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.crossplatform.params.b r4 = r4.f68474b
            if (r4 == 0) goto L_0x0050
            long r1 = r4.f68446a
            goto L_0x0051
        L_0x0050:
            r1 = r5
        L_0x0051:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0092
            java.lang.String r4 = "creativeId"
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r3.getCrossPlatformParams()
            if (r1 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r1.f68474b
            if (r1 == 0) goto L_0x0068
            long r1 = r1.f68446a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            m85413a(r0, r4, r1)
            if (r7 == 0) goto L_0x0085
            long r1 = r3.f68744B
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x008b
            java.lang.String r4 = "duration"
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r1 = r3.f68744B
            long r5 = r5 - r1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            m85413a(r0, r4, r5)
            goto L_0x008b
        L_0x0085:
            java.lang.String r4 = "aweme_ad_landingpage_open_error"
            r5 = 1
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r4, r5, r0)
        L_0x008b:
            java.lang.String r4 = "aweme_ad_landingpage_open_error_rate"
            r5 = r7 ^ 1
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r4, r5, r0)
        L_0x0092:
            com.p280ss.android.sdk.activity.C20106b.m66297a(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo67470a(java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public final void mo67465a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        mo67485c("onCreate");
    }

    /* renamed from: a */
    public final void mo67472a(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "event");
        SingleWebView singleWebView = (SingleWebView) mo67462a((int) R.id.fn);
        C7573i.m23582a((Object) singleWebView, "ame_rn_web_container");
        if (singleWebView.getVisibility() == 0) {
            ((SingleWebView) mo67462a((int) R.id.fn)).sendEventToWebView(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo67473a(String str, JSONObject jSONObject, String str2) {
        C7573i.m23587b(str, "event");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        CharSequence charSequence = str2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            jSONObject2.put("reactId", str2);
        }
        jSONObject2.put("data", jSONObject);
        mo67472a("notification", jSONObject2);
        m85416b("notification", jSONObject2);
    }

    /* renamed from: a */
    public final void mo67464a(int i, int i2, int i3, int i4, int i5) {
        DmtStatusView dmtStatusView = (DmtStatusView) mo67462a((int) R.id.bu9);
        C7573i.m23582a((Object) dmtStatusView, "loading_view");
        LayoutParams layoutParams = dmtStatusView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i2;
            layoutParams2.rightMargin = i4;
            layoutParams2.topMargin = i3;
            layoutParams2.bottomMargin = i5;
            layoutParams2.gravity = i;
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo67462a((int) R.id.bu9);
            C7573i.m23582a((Object) dmtStatusView2, "loading_view");
            dmtStatusView2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo67467a(C25886b bVar) {
        C7573i.m23587b(bVar, "crossPlatformParams");
        C25870d a = C25871a.m85133a();
        this.f68750f = a.mo67239a(getParent() == null ? false : a.mo67250b(bVar));
        C25870d a2 = C25871a.m85133a();
        C30388i iVar = this.f68750f;
        a2.f68408c = iVar != null ? iVar.mo79938a() : null;
        C25896d dVar = bVar.f68475c;
        if (dVar != null) {
            String reactId = getReactId();
            if (reactId == null) {
                C7573i.m23580a();
            }
            dVar.mo67276b(reactId);
            String a3 = dVar.mo67272a();
            if (a3 == null) {
                a3 = "";
            }
            String str = dVar.f68494e;
            if (str == null) {
                str = "";
            }
            Uri a4 = C30373ac.m99257a(a3, str);
            C30388i iVar2 = this.f68750f;
            if (iVar2 != null) {
                C30388i iVar3 = iVar2.f79800c ? iVar2 : null;
                if (iVar3 != null) {
                    C25870d a5 = C25871a.m85133a();
                    iVar3.mo80009a(a4, this.f68764t, ((SingleWebView) mo67462a((int) R.id.fn)).getChromeVersion(), a5.mo67241a(bVar), a5.mo67242a(bVar.f68474b));
                }
            }
        }
        m85414b(bVar);
    }

    /* renamed from: a */
    public void mo67475a(String str, boolean z, boolean z2) {
        C7573i.m23587b(str, "url");
        Uri parse = Uri.parse(str);
        CharSequence queryParameter = parse.getQueryParameter("rn_schema");
        boolean z3 = false;
        if (!(queryParameter == null || queryParameter.length() == 0)) {
            mo67474a(str, z);
            return;
        }
        C7573i.m23582a((Object) parse, "uri");
        if (C7573i.m23585a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            m85411a(this, str, z2, (Map) null, 4, (Object) null);
            return;
        }
        CharSequence queryParameter2 = parse.getQueryParameter("url");
        if (queryParameter2 == null || queryParameter2.length() == 0) {
            z3 = true;
        }
        if (!z3) {
            String queryParameter3 = parse.getQueryParameter("url");
            if (queryParameter3 == null) {
                C7573i.m23580a();
            }
            m85411a(this, queryParameter3, z2, (Map) null, 4, (Object) null);
        } else if (C7163a.m22363a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is invalid");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo67474a(String str, boolean z) {
        C7573i.m23587b(str, "url");
        if (z || !C7573i.m23585a((Object) this.f68752h, (Object) str)) {
            this.f68752h = str;
            boolean z2 = false;
            this.f68750f = C25871a.m85133a().mo67239a(false);
            C25886b a = C25887a.m85154a(str, getReactId());
            C7573i.m23582a((Object) a, "CrossPlatformParams.Fact…eByUrlForRn(url, reactId)");
            C30388i iVar = this.f68750f;
            if (iVar != null) {
                if (getParent() != null) {
                    z2 = C25871a.m85133a().mo67250b(a);
                }
                iVar.f79799b = z2;
            }
            C25870d a2 = C25871a.m85133a();
            C30388i iVar2 = this.f68750f;
            a2.f68408c = iVar2 != null ? iVar2.mo79938a() : null;
            C25896d dVar = a.f68475c;
            if (dVar != null) {
                String a3 = dVar.mo67272a();
                if (a3 == null) {
                    a3 = "";
                }
                String str2 = dVar.f68494e;
                if (str2 == null) {
                    str2 = "";
                }
                Uri a4 = C30373ac.m99257a(a3, str2);
                C30388i iVar3 = this.f68750f;
                if (iVar3 != null) {
                    C30388i iVar4 = iVar3.f79800c ? iVar3 : null;
                    if (iVar4 != null) {
                        C25870d a5 = C25871a.m85133a();
                        iVar4.mo80009a(a4, this.f68764t, ((SingleWebView) mo67462a((int) R.id.fn)).getChromeVersion(), a5.mo67241a(a), a5.mo67242a(a.f68474b));
                    }
                }
            }
            m85414b(a);
        }
    }

    /* renamed from: a */
    public final void mo67468a(C26024b<ReactInstanceManager> bVar, String str, String str2) {
        this.f68765u = SystemClock.elapsedRealtime();
        ReactRootView reactRootView = this.f68764t;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
        }
        ((FrameLayout) mo67462a((int) R.id.cob)).removeAllViews();
        this.f68764t = new ReactRootView(getContext());
        this.f68743A = System.currentTimeMillis();
        C30388i iVar = this.f68750f;
        C25896d dVar = null;
        if (iVar != null) {
            C30395o oVar = (C30395o) iVar.mo80008a(C30395o.class);
            if (oVar != null) {
                oVar.mo79989a(null);
            }
        }
        if (bVar != null) {
            ReactInstanceManager reactInstanceManager = (ReactInstanceManager) bVar.mo67542b();
            if (reactInstanceManager != null) {
                if (reactInstanceManager.getCurrentReactContext() != null) {
                    C28060b bVar2 = this.f68769y;
                    if (bVar2 != null) {
                        bVar2.mo71503a();
                    }
                    this.f68769y = new C28060b(reactInstanceManager.getCurrentReactContext());
                    C28060b bVar3 = this.f68769y;
                    if (bVar3 != null) {
                        bVar3.mo71504a(getContext(), this.f68762r);
                    }
                    C28060b bVar4 = this.f68769y;
                    ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
                    if (currentReactContext == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) currentReactContext, "manager.currentReactContext!!");
                    C25886b bVar5 = this.f68751g;
                    if (bVar5 != null) {
                        dVar = bVar5.f68475c;
                    }
                    C25985b.m85360a(bVar4, currentReactContext, dVar);
                } else {
                    C27873e eVar = C27873e.f73441a;
                    Exception exc = new Exception("RNBridgeRegistry addMethod error due to reactContext is null");
                    C25886b bVar6 = this.f68751g;
                    C25896d dVar2 = bVar6 != null ? bVar6.f68475c : null;
                    if (dVar2 == null) {
                        C7573i.m23580a();
                    }
                    String a = dVar2.mo67272a();
                    C25886b bVar7 = this.f68751g;
                    if (bVar7 != null) {
                        dVar = bVar7.f68475c;
                    }
                    if (dVar == null) {
                        C7573i.m23580a();
                    }
                    eVar.mo71354a(exc, a, dVar.f68494e);
                }
                ((FrameLayout) mo67462a((int) R.id.cob)).addView(this.f68764t, -1, -1);
                FrameLayout frameLayout = (FrameLayout) mo67462a((int) R.id.cob);
                C7573i.m23582a((Object) frameLayout, "react_root_view");
                frameLayout.setVisibility(0);
                ReactRootView reactRootView2 = this.f68764t;
                if (reactRootView2 != null) {
                    Bundle bundle = new Bundle();
                    Uri parse = Uri.parse(str2);
                    C7573i.m23582a((Object) parse, "uri");
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    C7573i.m23582a((Object) queryParameterNames, "uri.queryParameterNames");
                    for (String str3 : queryParameterNames) {
                        bundle.putString(str3, parse.getQueryParameter(str3));
                    }
                    bundle.putString("reactId", getReactId());
                    bundle.putInt("measuredWidth", C9738o.m28714c(getContext(), (float) getMeasuredWidth()));
                    bundle.putInt("measuredHeight", C9738o.m28714c(getContext(), (float) getMeasuredHeight()));
                    C25886b crossPlatformParams = getCrossPlatformParams();
                    if (crossPlatformParams != null) {
                        C25884b bVar8 = crossPlatformParams.f68474b;
                        if (bVar8 != null) {
                            C25895c.m85169a(bVar8, bundle);
                        }
                    }
                    reactRootView2.startReactApplication(reactInstanceManager, str, bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r1.f68530y == false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67471a(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            r0 = 1
            r4.f68760p = r0
            boolean r1 = com.p280ss.android.newmedia.C19929d.m65759a(r5)
            r2 = 0
            if (r1 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r4.getCrossPlatformParams()
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.crossplatform.params.e r1 = r1.f68476d
            if (r1 == 0) goto L_0x002a
            boolean r1 = r1.f68505A
            if (r1 != r0) goto L_0x002a
            r1 = 2131300393(0x7f091029, float:1.8218814E38)
            android.view.View r1 = r4.mo67462a(r1)
            com.ss.android.ugc.aweme.feed.widget.LineProgressBarView r1 = (com.p280ss.android.ugc.aweme.feed.widget.LineProgressBarView) r1
            java.lang.String r3 = "pbv_loading_bar"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r1.setVisibility(r2)
            goto L_0x0044
        L_0x002a:
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r4.getCrossPlatformParams()
            if (r1 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.crossplatform.params.e r1 = r1.f68476d
            if (r1 == 0) goto L_0x0038
            boolean r1 = r1.f68530y
            if (r1 == 0) goto L_0x0044
        L_0x0038:
            r1 = 2131299768(0x7f090db8, float:1.8217547E38)
            android.view.View r1 = r4.mo67462a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p262ui.widget.DmtStatusView) r1
            r1.mo25942f()
        L_0x0044:
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r1 == 0) goto L_0x005d
            r1 = 2131297485(0x7f0904cd, float:1.8212916E38)
            android.view.View r1 = r4.mo67462a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r1
            r1.setVisibility(r2)
            java.lang.String r3 = "WebView"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
        L_0x005d:
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r4.getCrossPlatformParams()
            if (r1 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.crossplatform.params.a r1 = r1.f68473a
            if (r1 == 0) goto L_0x006d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.f68428a = r0
        L_0x006d:
            android.app.Activity r0 = r4.getActivity()
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.main.MainActivity
            if (r0 != 0) goto L_0x007c
            com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r4.f68748d
            if (r0 == 0) goto L_0x007c
            r0.mo65874c()
        L_0x007c:
            r0 = 2131300918(0x7f091236, float:1.821988E38)
            android.view.View r0 = r4.mo67462a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.String r1 = "react_root_view"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131296491(0x7f0900eb, float:1.82109E38)
            android.view.View r1 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r1
            java.lang.String r3 = "ame_rn_web_container"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r1.setVisibility(r2)
            android.view.View r1 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r1
            r1.transparentBackground()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4.f68744B = r1
            if (r5 == 0) goto L_0x00e8
            com.ss.android.ugc.aweme.hybrid.monitor.i r1 = r4.f68750f
            if (r1 == 0) goto L_0x00c6
            boolean r2 = r1.f79800c
            if (r2 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r1 = 0
        L_0x00bb:
            if (r1 == 0) goto L_0x00c6
            android.view.View r2 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r2 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r2
            r2.setMonitorSession(r1)
        L_0x00c6:
            if (r6 != 0) goto L_0x00d2
            android.view.View r6 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r6 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r6
            r6.loadUrl(r5)
            goto L_0x00db
        L_0x00d2:
            android.view.View r1 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r1
            r1.loadUrl(r5, r6)
        L_0x00db:
            android.view.View r6 = r4.mo67462a(r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r6 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r6
            com.bytedance.ies.web.jsbridge2.p r6 = r6.getJsBridge2()
            com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25985b.m85358a(r6, r5)
        L_0x00e8:
            com.p280ss.android.ugc.aweme.lancet.network.C32283c.m104805a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo67471a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: f */
    public final boolean mo67492f() {
        return this.f68755k.f68309a;
    }

    public String getModuleName() {
        C25886b bVar = this.f68751g;
        if (bVar != null) {
            C25896d dVar = bVar.f68475c;
            if (dVar != null) {
                return dVar.f68494e;
            }
        }
        return null;
    }

    public String getReactId() {
        C30388i iVar = this.f68750f;
        if (iVar != null) {
            return iVar.mo79938a();
        }
        return null;
    }

    /* renamed from: h */
    public final boolean mo65882h() {
        if (this.f68760p == 2) {
            return true;
        }
        return this.f68746b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f68753i.mo67538a();
    }

    /* renamed from: c */
    public final void mo67483c() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        if (context == null) {
            return;
        }
        if (context != null) {
            ((Activity) context).finish();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public C25886b getCrossPlatformParams() {
        if (this.f68748d == null) {
            return this.f68751g;
        }
        C25822g gVar = this.f68748d;
        if (gVar == null) {
            C7573i.m23580a();
        }
        return gVar.getCrossPlatformParams();
    }

    /* renamed from: k */
    private final void m85418k() {
        ((SingleWebView) mo67462a((int) R.id.fn)).addOnSingleWebViewStatus(new C26014e(this));
        ((SingleWebView) mo67462a((int) R.id.fn)).addOnWebChromeStatus(new C26015f(this));
        ((LineProgressBarView) mo67462a((int) R.id.ca5)).setColor(getResources().getColor(R.color.az2));
    }

    /* renamed from: b */
    public final boolean mo67482b() {
        if (this.f68760p != 1 || !((SingleWebView) mo67462a((int) R.id.fn)).canGoBack()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo67489e() {
        ((DmtStatusView) mo67462a((int) R.id.bu9)).mo25938c(false);
        ((DmtStatusView) mo67462a((int) R.id.afp)).mo25934a(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo67462a((int) R.id.afp);
        C7573i.m23582a((Object) dmtStatusView, "error_view");
        dmtStatusView.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo65878g() {
        if (this.f68760p == 2) {
            String str = this.f68752h;
            if (str == null) {
                C25886b bVar = this.f68751g;
                if (bVar == null) {
                    C7573i.m23580a();
                }
                mo67467a(bVar);
            }
            if (str == null) {
                C7573i.m23580a();
            }
            mo67474a(str, true);
            return;
        }
        ((SingleWebView) mo67462a((int) R.id.fn)).reload();
    }

    public Activity getActivity() {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C7573i.m23582a((Object) context, "context.baseContext");
        }
        return null;
    }

    public C25862i getCrossPlatformBusiness() {
        if (this.f68748d != null) {
            C25822g gVar = this.f68748d;
            if (gVar == null) {
                C7573i.m23580a();
            }
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            C7573i.m23582a((Object) crossPlatformBusiness, "iCrossPlatformActivityCo…r!!.crossPlatformBusiness");
            return crossPlatformBusiness;
        }
        if (this.f68766v == null) {
            this.f68766v = C25863a.m85098a(this);
        }
        C25862i iVar = this.f68766v;
        if (iVar == null) {
            C7573i.m23580a();
        }
        return iVar;
    }

    /* renamed from: i */
    public final void mo67509i() {
        C25886b crossPlatformParams = getCrossPlatformParams();
        if (crossPlatformParams != null) {
            C25897e eVar = crossPlatformParams.f68476d;
            if (eVar != null && eVar.f68505A) {
                LineProgressBarView lineProgressBarView = (LineProgressBarView) mo67462a((int) R.id.ca5);
                C7573i.m23582a((Object) lineProgressBarView, "pbv_loading_bar");
                lineProgressBarView.setVisibility(0);
            }
        }
    }

    /* renamed from: d */
    public final void mo67487d() {
        C25896d dVar;
        FrameLayout frameLayout = (FrameLayout) mo67462a((int) R.id.cob);
        C7573i.m23582a((Object) frameLayout, "react_root_view");
        frameLayout.setVisibility(0);
        SingleWebView singleWebView = (SingleWebView) mo67462a((int) R.id.fn);
        C7573i.m23582a((Object) singleWebView, "ame_rn_web_container");
        singleWebView.setVisibility(8);
        ((DmtStatusView) mo67462a((int) R.id.bu9)).mo25938c(false);
        String str = "time_js_loading";
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f68765u;
        C25886b bVar = this.f68751g;
        C25896d dVar2 = null;
        if (bVar != null) {
            dVar = bVar.f68475c;
        } else {
            dVar = null;
        }
        C27873e.m91307a(str, elapsedRealtime, dVar);
        String str2 = "time_all";
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.f68749e;
        C25886b bVar2 = this.f68751g;
        if (bVar2 != null) {
            dVar2 = bVar2.f68475c;
        }
        C27873e.m91307a(str2, elapsedRealtime2, dVar2);
        for (C26034h a : C7525m.m23514g((Iterable<? extends T>) this.f68756l)) {
            a.mo67152a();
        }
    }

    public String getCurrentUrl() {
        String str;
        String str2 = this.f68752h;
        if (str2 == null) {
            str2 = "";
        }
        if (C7634n.m23776c((CharSequence) str2, (CharSequence) "wallet/home", false)) {
            return this.f68752h;
        }
        if (this.f68760p == 2) {
            str = this.f68752h;
            if (str == null) {
                C25886b crossPlatformParams = getCrossPlatformParams();
                if (crossPlatformParams != null) {
                    C25896d dVar = crossPlatformParams.f68475c;
                    if (dVar != null) {
                        str = dVar.f68499j;
                    }
                }
                str = null;
            }
            if (str == null) {
                return "";
            }
        } else {
            SingleWebView singleWebView = (SingleWebView) mo67462a((int) R.id.fn);
            C7573i.m23582a((Object) singleWebView, "ame_rn_web_container");
            str = singleWebView.getUrl();
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    /* renamed from: j */
    private final void m85417j() {
        ((DmtStatusView) mo67462a((int) R.id.bu9)).setBuilder(C10803a.m31631a(getContext()));
        C10805b bVar = new C10806a(getContext()).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, new C26013d(this)).f29135a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(bVar);
        if (C6394b.m19907b(getContext())) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            dmtDefaultView.setBackgroundColor(context.getResources().getColor(R.color.awi));
        } else {
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            dmtDefaultView.setBackgroundColor(context2.getResources().getColor(R.color.awh));
        }
        ((DmtStatusView) mo67462a((int) R.id.afp)).setBuilder(C10803a.m31631a(getContext()).mo25966c((View) dmtDefaultView));
    }

    /* renamed from: b */
    public final void mo67479b(Activity activity) {
        this.f68770z = true;
    }

    public final void setCurrentMode(int i) {
        this.f68760p = i;
    }

    public final void setCustomWebViewStatus(C25965c cVar) {
        this.f68761q = cVar;
    }

    public final void setIFullScreen(C25964b bVar) {
        this.f68759o = bVar;
    }

    public final void setLoadRNViewCompleteTimestamp(long j) {
        this.f68743A = j;
    }

    public final void setReactInstanceReference(C26024b<ReactInstanceManager> bVar) {
        this.f68763s = bVar;
    }

    public final void setReactRootView(ReactRootView reactRootView) {
        this.f68764t = reactRootView;
    }

    public final void setSearchEnterParam(SearchEnterParam searchEnterParam) {
        this.f68754j = searchEnterParam;
    }

    public void setDefaultHardwareBackBtnHandler(DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        C7573i.m23587b(defaultHardwareBackBtnHandler, "defaultBackButtonImpl");
        this.f68768x = defaultHardwareBackBtnHandler;
    }

    public void setFullScreen(C25964b bVar) {
        C7573i.m23587b(bVar, "iFullScreen");
        this.f68759o = bVar;
    }

    /* renamed from: b */
    public final void mo67480b(C26034h hVar) {
        C7573i.m23587b(hVar, "listener");
        this.f68756l.remove(hVar);
    }

    /* renamed from: c */
    public final void mo67486c(boolean z) {
        ((SingleWebView) mo67462a((int) R.id.fn)).controlGeolocationPermissions(false);
    }

    public final void setWebViewTouchListener(OnTouchListener onTouchListener) {
        SingleWebView b = this.f68758n.mo67531b();
        if (b != null) {
            b.setWebviewTouchListener(onTouchListener);
        }
    }

    /* renamed from: b */
    public final void mo67481b(boolean z) {
        Window window;
        Context activity = getActivity();
        Activity activity2 = getActivity();
        if (activity2 != null) {
            window = activity2.getWindow();
        } else {
            window = null;
        }
        C29967a.m98251a(activity, window, z);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C27994k kVar) {
        C7573i.m23587b(kVar, "broadCastEvent");
        String str = kVar.f73729a;
        JSONObject jSONObject = kVar.f73730b;
        C7573i.m23582a((Object) str, "event");
        mo67472a(str, jSONObject);
    }

    public void setCrossPlatformActivityContainer(C25822g gVar) {
        C7573i.m23587b(gVar, "iCrossPlatformActivityContainer");
        this.f68748d = gVar;
        ((SingleWebView) mo67462a((int) R.id.fn)).setCrossPlatformActivityContainer(gVar);
    }

    public final void setShouldOverrideInterceptor(C7563m<? super WebView, ? super String, Boolean> mVar) {
        C7573i.m23587b(mVar, "interceptor");
        ((SingleWebView) mo67462a((int) R.id.fn)).setShouldOverrideInterceptor(mVar);
    }

    /* renamed from: a */
    public static Uri m85407a(Uri uri) {
        Uri uri2;
        if (uri.isHierarchical()) {
            uri2 = uri;
        } else {
            uri2 = null;
        }
        if (uri2 == null) {
            return uri;
        }
        Set queryParameterNames = uri2.getQueryParameterNames();
        if (queryParameterNames == null) {
            return uri;
        }
        if (queryParameterNames.contains("app_skin")) {
            queryParameterNames = null;
        }
        if (queryParameterNames == null) {
            return uri;
        }
        Uri build = uri.buildUpon().appendQueryParameter("app_skin", C25881h.m85148a()).build();
        if (build == null) {
            return uri;
        }
        return build;
    }

    /* renamed from: d */
    public final void mo67488d(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C26024b<ReactInstanceManager> bVar = this.f68763s;
        if (bVar != null) {
            ReactInstanceManager reactInstanceManager = (ReactInstanceManager) bVar.mo67542b();
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostPause(activity);
            }
        }
        mo67472a("viewDisappeared", (JSONObject) null);
        ((SingleWebView) mo67462a((int) R.id.fn)).contextPause();
        mo67485c("onPause");
    }

    /* renamed from: b */
    public static void m85415b(String str) {
        String str2;
        if (!C6399b.m19944t()) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence) && C7634n.m23776c(charSequence, (CharSequence) "m.mwee.cn", false)) {
                boolean c = C7634n.m23776c(charSequence, (CharSequence) "dyBook", false);
                boolean c2 = C7634n.m23776c(charSequence, (CharSequence) "dyQueue", false);
                String str3 = "service_monitor";
                C42967ba a = C42967ba.m136396a().mo104680a("service", "poi_service").mo104680a("provider_name", "meiwei");
                String str4 = "page_type";
                if (c) {
                    str2 = "reserve";
                } else if (c2) {
                    str2 = "queue";
                } else {
                    str2 = "";
                }
                C6877n.m21447a(str3, a.mo104680a(str4, str2).mo104681b());
            }
        }
    }

    /* renamed from: c */
    public final void mo67484c(Activity activity) {
        int i;
        C7573i.m23587b(activity, "activity");
        C26024b<ReactInstanceManager> bVar = this.f68763s;
        if (bVar != null) {
            ReactInstanceManager reactInstanceManager = (ReactInstanceManager) bVar.mo67542b();
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostResume(activity, this.f68768x);
            }
        }
        mo67472a("viewAppeared", (JSONObject) null);
        String str = "visible";
        JSONObject jSONObject = new JSONObject();
        String str2 = "code";
        if (this.f68770z) {
            i = 2;
        } else {
            i = 0;
        }
        jSONObject.put(str2, i);
        mo67472a(str, jSONObject);
        this.f68770z = false;
        ((SingleWebView) mo67462a((int) R.id.fn)).contextResume();
        mo67485c("onResume");
    }

    @C7709l
    public final void onEvent(C20135c cVar) {
        boolean z;
        if (cVar != null) {
            CharSequence charSequence = cVar.f54513a;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && C7634n.m23717a(cVar.f54513a, getReactId(), true)) {
                z2 = true;
            }
            if (!z2) {
                cVar = null;
            }
            if (cVar != null) {
                Activity activity = getActivity();
                if (activity != null) {
                    if (!(!activity.isFinishing())) {
                        activity = null;
                    }
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67485c(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "status"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r0 = "crossplatform_view"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "platform"
            com.ss.android.ugc.aweme.crossplatform.params.base.b r3 = r5.getCrossPlatformParams()
            r4 = 0
            if (r3 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.crossplatform.params.a r3 = r3.f68473a
            if (r3 == 0) goto L_0x0027
            java.lang.Integer r3 = r3.f68428a
            if (r3 == 0) goto L_0x0027
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84953a(r3)
            goto L_0x0028
        L_0x0027:
            r3 = r4
        L_0x0028:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "status"
            com.ss.android.ugc.aweme.app.g.d r6 = r1.mo59973a(r2, r6)
            java.lang.String r1 = "module_name"
            com.ss.android.ugc.aweme.crossplatform.params.base.b r2 = r5.getCrossPlatformParams()
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.crossplatform.params.d r2 = r2.f68475c
            if (r2 == 0) goto L_0x0041
            java.lang.String r2 = r2.f68494e
            goto L_0x0042
        L_0x0041:
            r2 = r4
        L_0x0042:
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r1, r2)
            java.lang.String r1 = "url"
            java.lang.String r2 = r5.f68752h
            if (r2 == 0) goto L_0x004f
            java.lang.String r4 = r5.f68752h
            goto L_0x005b
        L_0x004f:
            com.ss.android.ugc.aweme.crossplatform.params.base.b r2 = r5.getCrossPlatformParams()
            if (r2 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.crossplatform.params.a r2 = r2.f68473a
            if (r2 == 0) goto L_0x005b
            java.lang.String r4 = r2.f68430c
        L_0x005b:
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r1, r4)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo67485c(java.lang.String):void");
    }

    /* renamed from: g */
    public void mo67493g(Activity activity) {
        C28060b bVar = this.f68769y;
        if (bVar != null) {
            bVar.mo71503a();
        }
        C30388i iVar = this.f68750f;
        if (iVar != null) {
            C30395o oVar = (C30395o) iVar.mo80008a(C30395o.class);
            if (oVar != null) {
                oVar.mo80000b(this.f68764t);
            }
        }
        C26024b<ReactInstanceManager> bVar2 = this.f68763s;
        if (bVar2 != null) {
            ReactInstanceManager reactInstanceManager = (ReactInstanceManager) bVar2.mo67542b();
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostDestroy(activity);
                reactInstanceManager.deleteJSBundleFile();
                reactInstanceManager.detachRootView(this.f68764t);
            }
            C25886b crossPlatformParams = getCrossPlatformParams();
            if (crossPlatformParams != null) {
                C25896d dVar = crossPlatformParams.f68475c;
                if (dVar != null) {
                    String a = dVar.mo67272a();
                    if (a == null) {
                        a = "";
                    }
                    String b = dVar.mo67275b();
                    if (b == null) {
                        b = "";
                    }
                    C26033g gVar = new C26033g(a, b);
                    StringBuilder sb = new StringBuilder();
                    sb.append(gVar);
                    sb.append(" released, referenceCount: ");
                    sb.append(bVar2.mo67541a());
                }
            }
            bVar2.mo67544d();
        }
        getRnContextBuildHelper().mo67303a();
        ReactRootView reactRootView = this.f68764t;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
        }
        ReactInstance.detachReactView(this, getReactId());
        ((SingleWebView) mo67462a((int) R.id.fn)).contextDestroy();
        mo67485c("onDestroy");
        C30388i iVar2 = this.f68750f;
        if (iVar2 != null) {
            if (!iVar2.f79800c) {
                iVar2 = null;
            }
            if (iVar2 != null) {
                C25871a.m85133a().mo67251b(iVar2.mo79938a());
            }
        }
        C42961az.m136383d(this);
        this.f68755k.mo67153b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r1.f68530y == false) goto L_0x0064;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m85414b(com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b r13) {
        /*
            r12 = this;
            com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            r0 = 2
            r12.f68760p = r0
            r12.f68751g = r13
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            r2 = 0
            if (r1 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r12.f68751g
            if (r1 != 0) goto L_0x0016
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0016:
            com.ss.android.ugc.aweme.crossplatform.params.d r1 = r1.f68475c
            if (r1 != 0) goto L_0x001d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x001d:
            boolean r1 = r1.mo67278d()
            com.p280ss.android.ugc.aweme.framework.ReactInstance.isDev = r1
            goto L_0x0026
        L_0x0024:
            com.p280ss.android.ugc.aweme.framework.ReactInstance.isDev = r2
        L_0x0026:
            r1 = 2131300918(0x7f091236, float:1.821988E38)
            android.view.View r1 = r12.mo67462a(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.String r3 = "react_root_view"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r3 = 8
            r1.setVisibility(r3)
            r1 = 2131296491(0x7f0900eb, float:1.82109E38)
            android.view.View r1 = r12.mo67462a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r1
            java.lang.String r4 = "ame_rn_web_container"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            r1.setVisibility(r3)
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r12.getCrossPlatformParams()
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.crossplatform.params.e r1 = r1.f68476d
            if (r1 == 0) goto L_0x0058
            boolean r1 = r1.f68530y
            if (r1 == 0) goto L_0x0064
        L_0x0058:
            r1 = 2131299768(0x7f090db8, float:1.8217547E38)
            android.view.View r1 = r12.mo67462a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p262ui.widget.DmtStatusView) r1
            r1.mo25942f()
        L_0x0064:
            boolean r1 = com.p280ss.android.ugc.aweme.framework.ReactInstance.isDev
            r3 = 0
            if (r1 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r12.f68751g
            if (r1 != 0) goto L_0x0070
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0070:
            com.ss.android.ugc.aweme.crossplatform.params.d r1 = r1.f68475c
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = r1.f68498i
            goto L_0x0078
        L_0x0077:
            r1 = r3
        L_0x0078:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a9
            android.content.Context r1 = r12.getContext()
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = "debug_http_host"
            com.ss.android.ugc.aweme.crossplatform.params.base.b r5 = r12.f68751g
            if (r5 != 0) goto L_0x0095
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0095:
            com.ss.android.ugc.aweme.crossplatform.params.d r5 = r5.f68475c
            if (r5 != 0) goto L_0x009c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x009c:
            java.lang.String r5 = r5.f68498i
            java.lang.String r5 = android.net.Uri.decode(r5)
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r5)
            r1.apply()
        L_0x00a9:
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r12.f68751g
            if (r1 != 0) goto L_0x00b0
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b0:
            com.ss.android.ugc.aweme.crossplatform.params.d r1 = r1.f68475c
            if (r1 != 0) goto L_0x00b7
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b7:
            boolean r1 = r1.mo67277c()
            if (r1 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.hybrid.monitor.i r13 = r12.f68750f
            if (r13 == 0) goto L_0x00d0
            java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.o> r1 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o.class
            com.ss.android.ugc.aweme.hybrid.monitor.q r13 = r13.mo80008a(r1)
            com.ss.android.ugc.aweme.hybrid.monitor.o r13 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o) r13
            if (r13 == 0) goto L_0x00d0
            java.lang.String r1 = "force"
            r13.mo80020a(r1, (java.lang.String) null)
        L_0x00d0:
            com.ss.android.ugc.aweme.crossplatform.params.base.b r13 = r12.f68751g
            if (r13 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.crossplatform.params.d r13 = r13.f68475c
            if (r13 == 0) goto L_0x00db
            java.lang.String r13 = r13.f68496g
            goto L_0x00dc
        L_0x00db:
            r13 = r3
        L_0x00dc:
            r12.mo67471a(r13, null)
            return
        L_0x00e0:
            com.ss.android.ugc.aweme.crossplatform.platform.rn.g r4 = r12.getRnContextBuildHelper()
            java.lang.String r5 = r12.getReactId()
            com.ss.android.ugc.aweme.crossplatform.params.base.b r6 = r12.f68751g
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$g r0 = new com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$g
            r0.<init>(r12, r13)
            r7 = r0
            com.ss.android.ugc.aweme.crossplatform.platform.rn.g$b r7 = (com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25924g.C25928b) r7
            boolean r13 = com.p280ss.android.ugc.aweme.framework.ReactInstance.isDev
            r8 = r13 ^ 1
            r9 = 0
            com.ss.android.ugc.aweme.crossplatform.params.base.b r13 = r12.f68751g
            if (r13 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.crossplatform.params.d r13 = r13.f68475c
            if (r13 == 0) goto L_0x0104
            boolean r2 = r13.f68503n
            r11 = r2
            goto L_0x0105
        L_0x0104:
            r11 = 0
        L_0x0105:
            r4.mo67305a(r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m85414b(com.ss.android.ugc.aweme.crossplatform.params.base.b):void");
    }

    /* renamed from: a */
    public final <T extends C26038l> T mo67463a(Class<T> cls) {
        C7573i.m23587b(cls, "_cls");
        if (C7573i.m23585a((Object) cls, (Object) C26035i.class)) {
            T t = this.f68757m;
            if (t != null) {
                return (C26038l) t;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (C7573i.m23585a((Object) cls, (Object) C26039m.class)) {
            T t2 = this.f68758n;
            if (t2 != null) {
                return (C26038l) t2;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (!C7163a.m22363a()) {
            return (C26038l) new C26012c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getSimpleName());
            sb.append(" is not match any type for ViewWrap!");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m85416b(String str, JSONObject jSONObject) {
        C29959e.m98229a(str, C27868c.m91294a(jSONObject));
    }

    public CrossPlatformWebView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f68753i = new ViewStatusRegistry();
        this.f68756l = new HashSet();
        this.f68757m = new C26018i(this);
        this.f68758n = new C26019j(this);
        this.f68760p = 1;
        this.f68747c = "RN_VIEW";
        this.f68762r = new C20136d();
        this.f68749e = SystemClock.elapsedRealtime();
        this.f68767w = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C26017h(context));
        C20136d dVar = this.f68762r;
        dVar.mo53897a(AbsActivityContainer.class, new C26010a(this));
        dVar.mo53897a(C30388i.class, new C26011b(this));
        C25836e.m84972a().mo67156b();
        LayoutInflater.from(context).inflate(R.layout.ahp, this, true);
        ReactInstance.attachReactView(this);
        C42961az.m136382c(this);
        m85417j();
        m85418k();
        this.f68755k = new C25830b(this);
        this.f68743A = -1;
        this.f68744B = -1;
    }

    /* renamed from: a */
    private void m85412a(String str, boolean z, Map<String, String> map) {
        boolean z2;
        C7573i.m23587b(str, "url");
        this.f68752h = str;
        C25870d a = C25871a.m85133a();
        if (getParent() == null) {
            z2 = false;
        } else {
            z2 = a.mo67247a(str);
        }
        this.f68750f = a.mo67239a(z2);
        if (z) {
            mo67471a(Uri.parse(str).buildUpon().appendQueryParameter("reactId", getReactId()).toString(), map);
        } else {
            mo67471a(str, map);
        }
    }

    /* renamed from: a */
    private static void m85413a(JSONObject jSONObject, String str, Object obj) {
        if (!C6319n.m19593a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ CrossPlatformWebView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m85411a(CrossPlatformWebView crossPlatformWebView, String str, boolean z, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        crossPlatformWebView.m85412a(str, z, map);
    }
}
