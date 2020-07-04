package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.webkit.CookieManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.example.p266a.C6490c;
import com.google.gson.C18373n;
import com.google.gson.C6600e;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.newmedia.p891a.C19924d;
import com.p280ss.android.newmedia.p897ui.webview.C19996a;
import com.p280ss.android.sdk.activity.model.AdLandingPageConfig;
import com.p280ss.android.sdk.webview.C20123a;
import com.p280ss.android.sdk.webview.C20136d;
import com.p280ss.android.sdk.webview.C20139g;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.sdk.webview.DMTJsBridge.BridgeAccess;
import com.p280ss.android.sdk.webview.DMTJsBridge.C20116a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25368l;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26026d;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k;
import com.p280ss.android.ugc.aweme.hybrid.monitor.p1297a.C30365a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.utils.C35450i;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.web.C43436b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C48018g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView */
public final class SingleWebView extends TryCatchWebView implements C0042h {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SingleWebView.class), "gson", "getGson()Lcom/google/gson/Gson;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SingleWebView.class), "chromeVersion", "getChromeVersion()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SingleWebView.class), "lastClickDetector", "getLastClickDetector()Landroid/view/GestureDetector;"))};
    private HashMap _$_findViewCache;
    private C43436b baseJsMessageHandler;
    private boolean canScrollVertically;
    private final C7541d chromeVersion$delegate;
    private C20136d contextProviderFactory;
    private boolean disableIntercept;
    private C25950c[] disableInterceptRegionList;
    private boolean enableScrollControl;
    private final C7541d gson$delegate;
    public C25822g iCrossPlatformActivityContainer;
    private DMTJsBridge iesJsBridge;
    private boolean isVastAd;
    private final C7541d lastClickDetector$delegate;
    public long lastClickTime;
    private C25977i mTTNetInterceptorWrapper;
    private C30388i monitorSession;
    private boolean monitorSessionCreatedBySelf;
    private List<String> pauseList;
    private C26026d scrollListener;
    private SingleWebChromeClient singleWebChromeClient;
    private C25968f singleWebViewClient;
    private Set<String> visitedUrls;
    private OnTouchListener webviewTouchListener;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$a */
    public static final class C25948a implements C20139g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68639a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public AbsActivityContainer mo53898a() {
            C25822g gVar = this.f68639a.iCrossPlatformActivityContainer;
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

        C25948a(SingleWebView singleWebView) {
            this.f68639a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$b */
    public static final class C25949b implements C20139g<C30388i> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68640a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C30388i mo53898a() {
            return this.f68640a.getMonitorSession();
        }

        C25949b(SingleWebView singleWebView) {
            this.f68640a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c */
    public static final class C25950c {
        @C6593c(mo15949a = "x")

        /* renamed from: a */
        public final double f68641a;
        @C6593c(mo15949a = "y")

        /* renamed from: b */
        public final double f68642b;
        @C6593c(mo15949a = "width")

        /* renamed from: c */
        public final double f68643c;
        @C6593c(mo15949a = "height")

        /* renamed from: d */
        public final double f68644d;

        public C25950c() {
            this(0.0d, 0.0d, 0.0d, 0.0d, 15, null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (java.lang.Double.compare(r4.f68644d, r5.f68644d) == 0) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                if (r4 == r5) goto L_0x0033
                boolean r0 = r5 instanceof com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C25950c
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c r5 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C25950c) r5
                double r0 = r4.f68641a
                double r2 = r5.f68641a
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f68642b
                double r2 = r5.f68642b
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f68643c
                double r2 = r5.f68643c
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f68644d
                double r2 = r5.f68644d
                int r5 = java.lang.Double.compare(r0, r2)
                if (r5 != 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r5 = 0
                return r5
            L_0x0033:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C25950c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((Double.hashCode(this.f68641a) * 31) + Double.hashCode(this.f68642b)) * 31) + Double.hashCode(this.f68643c)) * 31) + Double.hashCode(this.f68644d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisableInterceptRegion(x=");
            sb.append(this.f68641a);
            sb.append(", y=");
            sb.append(this.f68642b);
            sb.append(", width=");
            sb.append(this.f68643c);
            sb.append(", height=");
            sb.append(this.f68644d);
            sb.append(")");
            return sb.toString();
        }

        private C25950c(double d, double d2, double d3, double d4) {
            this.f68641a = d;
            this.f68642b = d2;
            this.f68643c = d3;
            this.f68644d = d4;
        }

        private /* synthetic */ C25950c(double d, double d2, double d3, double d4, int i, C7571f fVar) {
            this(C48018g.m148959a(), C48018g.m148959a(), C48018g.m148960b(), C48018g.m148960b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$d */
    static final class C25951d extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68645a;

        C25951d(SingleWebView singleWebView) {
            this.f68645a = singleWebView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            return C25871a.m85133a().mo67240a((WebView) this.f68645a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$e */
    static final class C25952e extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C25952e f68646a = new C25952e();

        C25952e() {
            super(0);
        }

        /* renamed from: a */
        private static C6600e m85263a() {
            return new C6600e();
        }

        public final /* synthetic */ Object invoke() {
            return m85263a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$f */
    public static final class C25953f implements C20139g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68647a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public AbsActivityContainer mo53898a() {
            C25822g gVar = this.f68647a.iCrossPlatformActivityContainer;
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

        C25953f(SingleWebView singleWebView) {
            this.f68647a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$g */
    public static final class C25954g implements C20139g<C30388i> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68648a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C30388i mo53898a() {
            return this.f68648a.getMonitorSession();
        }

        C25954g(SingleWebView singleWebView) {
            this.f68648a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$h */
    public static final class C25955h implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68649a;

        C25955h(SingleWebView singleWebView) {
            this.f68649a = singleWebView;
        }

        public final void onViewAttachedToWindow(View view) {
            C7573i.m23587b(view, "v");
            C30388i monitorSession = this.f68649a.getMonitorSession();
            if (monitorSession != null) {
                C30391k kVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                if (kVar != null) {
                    kVar.mo79989a(null);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            C7573i.m23587b(view, "v");
            C30388i monitorSession = this.f68649a.getMonitorSession();
            if (monitorSession != null) {
                C30391k kVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                if (kVar != null) {
                    kVar.mo80000b(null);
                }
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$i */
    static final class C25956i extends Lambda implements C7561a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f68650a;

        /* renamed from: b */
        final /* synthetic */ Context f68651b;

        C25956i(SingleWebView singleWebView, Context context) {
            this.f68650a = singleWebView;
            this.f68651b = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GestureDetector invoke() {
            GestureDetector gestureDetector = new GestureDetector(this.f68651b, new SimpleOnGestureListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25956i f68652a;

                {
                    this.f68652a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f68652a.f68650a.lastClickTime = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    public SingleWebView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SingleWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C6600e getGson() {
        return (C6600e) this.gson$delegate.getValue();
    }

    private final GestureDetector getLastClickDetector() {
        return (GestureDetector) this.lastClickDetector$delegate.getValue();
    }

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C43436b getBaseJsMessageHandler() {
        return this.baseJsMessageHandler;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final String getChromeVersion() {
        return (String) this.chromeVersion$delegate.getValue();
    }

    public final boolean getEnableScrollControl() {
        return this.enableScrollControl;
    }

    public final long getLastClickTime() {
        return this.lastClickTime;
    }

    public final C30388i getMonitorSession() {
        return this.monitorSession;
    }

    public final boolean getMonitorSessionCreatedBySelf() {
        return this.monitorSessionCreatedBySelf;
    }

    public final SingleWebChromeClient getSingleWebChromeClient() {
        return this.singleWebChromeClient;
    }

    public final OnTouchListener getWebviewTouchListener() {
        return this.webviewTouchListener;
    }

    public final void goBack() {
        super.goBack();
    }

    public final boolean canGoBack() {
        return isGoBack();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
    }

    public final void transparentBackground() {
        setBackgroundColor(0);
    }

    public final void contextDestroy() {
        this.baseJsMessageHandler.mo53881g();
        C19924d.m65743a(this);
    }

    public final void contextResume() {
        this.baseJsMessageHandler.mo53880f();
        onResume();
        resumeTimers();
    }

    public final C11174p getJsBridge2() {
        DMTJsBridge dMTJsBridge = this.iesJsBridge;
        if (dMTJsBridge != null) {
            return dMTJsBridge.f54456c;
        }
        return null;
    }

    public final void setLoadNoCache() {
        WebSettings settings = getSettings();
        C7573i.m23582a((Object) settings, "settings");
        settings.setCacheMode(2);
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final void contextPause() {
        onPause();
        C19924d.m65742a(getContext(), this);
        if (getInPauseList() || this.isVastAd) {
            pauseTimers();
        }
    }

    public final boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastClickTime < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    public final boolean isGoBack() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        C7573i.m23582a((Object) copyBackForwardList, "copyBackForwardList()");
        if (copyBackForwardList.getCurrentIndex() >= 2) {
            return true;
        }
        return false;
    }

    private final boolean getInPauseList() {
        boolean z;
        List<String> list = this.pauseList;
        if (list != null) {
            C7604g f = C7605h.m23662f(C7525m.m23526p(list));
            if (f != null) {
                Iterator a = f.mo19416a();
                while (a.hasNext()) {
                    String str = (String) a.next();
                    String url = getUrl();
                    if (url == null || !C7634n.m23721b(url, str, false)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
        if (this.monitorSessionCreatedBySelf) {
            C30388i iVar = this.monitorSession;
            if (iVar != null) {
                if (!iVar.f79800c) {
                    iVar = null;
                }
                if (iVar != null) {
                    C25871a.m85133a().mo67251b(iVar.mo79938a());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getCacheMode() {
        /*
            r7 = this;
            android.app.Activity r0 = r7.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0012
            android.net.Uri r0 = r0.getData()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = android.net.Uri.decode(r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Throwable -> 0x0029 }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Throwable -> 0x0029 }
            java.util.List r2 = r2.getWebviewCacheUrls()     // Catch:{ Throwable -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004c
            java.util.Iterator r2 = r2.iterator()
        L_0x0032:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = 0
            r6 = 2
            boolean r3 = kotlin.text.C7634n.m23776c(r4, r3, false)
            if (r3 == 0) goto L_0x0032
            return r6
        L_0x004c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.getCacheMode():int");
    }

    private final void initConfig() {
        C19996a.m65912a(getContext()).mo53544a(true).mo53545a((WebView) this);
        setFocusableInTouchMode(true);
        setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
        WebSettings settings = getSettings();
        C7573i.m23582a((Object) settings, "settings");
        settings.setCacheMode(getCacheMode());
        AdLandingPageConfig a = C25368l.m83415a();
        if (a != null) {
            setTimeInterval(a.getAutoJumpInterval());
            this.pauseList = a.getPauseList();
        }
    }

    public final void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    public final void setEnableScrollControl(boolean z) {
        this.enableScrollControl = z;
    }

    public final void setMonitorSession(C30388i iVar) {
        this.monitorSession = iVar;
    }

    public final void setMonitorSessionCreatedBySelf(boolean z) {
        this.monitorSessionCreatedBySelf = z;
    }

    public final void setSingleWebChromeClient(SingleWebChromeClient singleWebChromeClient2) {
        this.singleWebChromeClient = singleWebChromeClient2;
    }

    public final void setWebScrollListener(C26026d dVar) {
        this.scrollListener = dVar;
    }

    public final void setWebviewTouchListener(OnTouchListener onTouchListener) {
        this.webviewTouchListener = onTouchListener;
    }

    public final void setBaseJsMessageHandler(C43436b bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.baseJsMessageHandler = bVar;
    }

    public final void addOnSingleWebViewStatus(C25965c cVar) {
        C7573i.m23587b(cVar, "onSingleWebViewStatus");
        C25968f fVar = this.singleWebViewClient;
        if (fVar != null) {
            fVar.f68670c.add(cVar);
        }
    }

    public final void addOnWebChromeStatus(C25966d dVar) {
        C7573i.m23587b(dVar, "onWebChromeStatus");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f68632f.add(dVar);
        }
    }

    public final void controlGeolocationPermissions(boolean z) {
        this.baseJsMessageHandler.f54493q = Boolean.valueOf(z);
    }

    public final boolean isVisited(String str) {
        C7573i.m23587b(str, "url");
        return this.visitedUrls.contains(str);
    }

    public final void removeOnSingleWebViewStatus(C25965c cVar) {
        C7573i.m23587b(cVar, "onSingleWebViewStatus");
        C25968f fVar = this.singleWebViewClient;
        if (fVar != null) {
            fVar.f68670c.remove(cVar);
        }
    }

    public final void removeOnWebChromeStatus(C25966d dVar) {
        C7573i.m23587b(dVar, "onWebChromeStatus");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f68632f.remove(dVar);
        }
    }

    public final void setShouldOverrideInterceptor(C7563m<? super WebView, ? super String, Boolean> mVar) {
        C7573i.m23587b(mVar, "interceptor");
        C25968f fVar = this.singleWebViewClient;
        if (fVar != null) {
            fVar.f68671d = mVar;
        }
    }

    public final void visit(String str) {
        C7573i.m23587b(str, "url");
        this.visitedUrls.add(str);
    }

    public final boolean canScrollVertically(int i) {
        if (!this.enableScrollControl) {
            return super.canScrollVertically(i);
        }
        if (!this.canScrollVertically || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    public final void loadUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (C25978j.m85332a(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            this.mTTNetInterceptorWrapper = new C25977i(sb2.toString());
            C25968f fVar = this.singleWebViewClient;
            if (fVar != null) {
                fVar.f68672e = this.mTTNetInterceptorWrapper;
            }
        }
        if (str != null) {
            beforeLoadUrl(str);
        }
        super.loadUrl(str);
    }

    @C7709l
    public final void onJsBroadcast(C27994k kVar) {
        Object obj;
        C7573i.m23587b(kVar, "event");
        C6709k a = new C18373n().mo47346a(kVar.f73730b.toString());
        C7573i.m23582a((Object) a, "JsonParser().parse(event.params.toString())");
        C6711m m = a.mo16136m();
        C6709k b = m.mo16149b("eventName");
        if (b != null) {
            obj = b.mo15998c();
        } else {
            obj = null;
        }
        if (C7573i.m23585a(obj, (Object) "disableIntercept")) {
            C6709k b2 = m.mo16149b("data");
            if (b2 != null) {
                try {
                    this.disableInterceptRegionList = (C25950c[]) getGson().mo15970a(b2, C25950c[].class);
                    return;
                } catch (JsonSyntaxException unused) {
                }
            }
            this.disableInterceptRegionList = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void beforeLoadUrl(java.lang.String r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r9.monitorSession
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r9.monitorSession
            if (r0 != 0) goto L_0x000c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000c:
            boolean r0 = r0.f79800c
            if (r0 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            r9.monitorSessionCreatedBySelf = r1
            goto L_0x0025
        L_0x0014:
            com.ss.android.ugc.aweme.crossplatform.d r0 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
            boolean r2 = r0.mo67247a(r10)
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r0.mo67239a(r2)
            r9.monitorSession = r0
            r0 = 1
            r9.monitorSessionCreatedBySelf = r0
        L_0x0025:
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r9.monitorSession
            if (r0 == 0) goto L_0x0063
            java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.k> r2 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k.class
            com.ss.android.ugc.aweme.hybrid.monitor.q r0 = r0.mo80008a(r2)
            com.ss.android.ugc.aweme.hybrid.monitor.k r0 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k) r0
            if (r0 == 0) goto L_0x0063
            com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
            com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r2 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.m85109a()
            if (r2 == 0) goto L_0x0063
            java.lang.Boolean r3 = r2.getH5StaticResourceReportEnabled()     // Catch:{ NullValueException -> 0x0046 }
            java.lang.String r4 = "it.h5StaticResourceReportEnabled"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ NullValueException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
        L_0x004a:
            boolean r1 = r3.booleanValue()
            r0.mo79998a(r1)
            java.util.List r1 = r2.getH5StaticResourceReportWhiteList()
            if (r1 != 0) goto L_0x0060
            java.util.List r1 = java.util.Collections.emptyList()
            java.lang.String r2 = "emptyList()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
        L_0x0060:
            r0.mo79997a(r1)
        L_0x0063:
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r9.monitorSession
            if (r0 == 0) goto L_0x00a3
            boolean r1 = r0.f79800c
            r2 = 0
            if (r1 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r0 = r2
        L_0x006e:
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.crossplatform.d r1 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
            com.ss.android.ugc.aweme.crossplatform.activity.g r3 = r9.iCrossPlatformActivityContainer
            if (r3 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.crossplatform.params.base.b r3 = r3.getCrossPlatformParams()
            if (r3 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.crossplatform.params.b r2 = r3.f68474b
        L_0x0080:
            java.lang.String r7 = r1.mo67249b(r2)
            org.json.JSONObject r8 = r1.mo67242a(r2)
            android.net.Uri r4 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30373ac.m99256a(r10)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            java.lang.String r6 = r9.getChromeVersion()
            r3 = r0
            r3.mo80009a(r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.f r10 = r9.singleWebViewClient
            if (r10 == 0) goto L_0x009d
            r10.f68673f = r0
        L_0x009d:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient r10 = r9.singleWebChromeClient
            if (r10 == 0) goto L_0x00a3
            r10.f68633g = r0
        L_0x00a3:
            com.ss.android.ugc.aweme.web.b r10 = r9.baseJsMessageHandler
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r9.monitorSession
            r10.mo105373a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.beforeLoadUrl(java.lang.String):void");
    }

    public final void initWeb(Activity activity) {
        C7573i.m23587b(activity, "context");
        C30365a.m99205g();
        this.lastClickTime = 0;
        this.contextProviderFactory = new C20136d();
        this.baseJsMessageHandler = new C43436b(activity);
        this.iCrossPlatformActivityContainer = null;
        this.singleWebChromeClient = null;
        this.disableInterceptRegionList = null;
        this.pauseList = null;
        this.mTTNetInterceptorWrapper = null;
        this.visitedUrls = new LinkedHashSet();
        C20136d dVar = this.contextProviderFactory;
        dVar.mo53897a(AbsActivityContainer.class, new C25953f(this));
        dVar.mo53897a(C30388i.class, new C25954g(this));
        this.singleWebViewClient = new C25968f();
        setWebViewClient(C6490c.m20171a((WebViewClient) this.singleWebViewClient));
        WebView webView = this;
        this.singleWebChromeClient = new SingleWebChromeClient(webView);
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 == null) {
            C7573i.m23580a();
        }
        singleWebChromeClient2.f68630d = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        DMTJsBridge a = C20116a.m66326a(webView);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            C7573i.m23580a();
        }
        DMTJsBridge a2 = a.mo53852a((WebChromeClient) singleWebChromeClient3);
        C25968f fVar = this.singleWebViewClient;
        if (fVar == null) {
            C7573i.m23580a();
        }
        this.iesJsBridge = DMTJsBridge.m66312a(a2.mo53853a((WebViewClient) fVar).mo53854a((C20123a) this.baseJsMessageHandler).mo53856a(C35450i.m114506b()).mo53860b(C7163a.m22363a()), null, null, 3, null);
        this.baseJsMessageHandler.mo53865a(this.iesJsBridge, this.contextProviderFactory);
        C25968f fVar2 = this.singleWebViewClient;
        if (fVar2 == null) {
            C7573i.m23580a();
        }
        fVar2.f30167b = this.iesJsBridge.f54455b;
        initConfig();
        addOnAttachStateChangeListener(new C25955h(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[LOOP:0: B:5:0x0039->B:18:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0062 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "event"
            kotlin.jvm.internal.C7573i.m23587b(r1, r2)
            int r2 = r17.getActionMasked()
            r3 = 2
            r4 = 1
            if (r2 != 0) goto L_0x006c
            r2 = 0
            r0.disableIntercept = r2
            int[] r5 = new int[r3]
            r0.getLocationInWindow(r5)
            float r6 = r17.getRawX()
            r7 = r5[r2]
            float r7 = (float) r7
            float r6 = r6 - r7
            double r6 = (double) r6
            int r6 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77125b(r6)
            float r7 = r17.getRawY()
            r5 = r5[r4]
            float r5 = (float) r5
            float r7 = r7 - r5
            double r7 = (double) r7
            int r5 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77125b(r7)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c[] r7 = r0.disableInterceptRegionList
            if (r7 == 0) goto L_0x0069
            int r8 = r7.length
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0069
            r10 = r7[r9]
            double r11 = (double) r6
            double r13 = r10.f68641a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x005f
            double r13 = r10.f68641a
            double r2 = r10.f68643c
            double r13 = r13 + r2
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x005f
            double r2 = (double) r5
            double r11 = r10.f68642b
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x005f
            double r11 = r10.f68642b
            double r13 = r10.f68644d
            double r11 = r11 + r13
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x006a
        L_0x0064:
            int r9 = r9 + 1
            r2 = 0
            r3 = 2
            goto L_0x0039
        L_0x0069:
            r2 = 0
        L_0x006a:
            r0.disableIntercept = r2
        L_0x006c:
            boolean r2 = r0.disableIntercept
            if (r2 == 0) goto L_0x0073
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x0073:
            boolean r2 = r0.canTouch
            if (r2 == 0) goto L_0x0088
            android.view.GestureDetector r2 = r16.getLastClickDetector()
            r2.onTouchEvent(r1)
            android.view.View$OnTouchListener r2 = r0.webviewTouchListener
            if (r2 == 0) goto L_0x0088
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r2.onTouch(r3, r1)
        L_0x0088:
            boolean r2 = r0.enableScrollControl
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r0.canScrollVertically
            if (r2 == 0) goto L_0x0094
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L_0x009c
        L_0x0094:
            int r2 = r17.getAction()
            r3 = 2
            if (r2 != r3) goto L_0x009c
            return r4
        L_0x009c:
            boolean r1 = super.onTouchEvent(r17)
            return r1
        L_0x00a1:
            boolean r1 = super.onTouchEvent(r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCrossPlatformActivityContainer(com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0045
            r14.iCrossPlatformActivityContainer = r15
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r2 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r1
            com.ss.android.ugc.aweme.crossplatform.activity.g r2 = r14.iCrossPlatformActivityContainer
            if (r2 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.crossplatform.params.base.b r2 = r2.getCrossPlatformParams()
            if (r2 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.crossplatform.params.b r2 = r2.f68474b
            if (r2 == 0) goto L_0x0026
            long r2 = r2.f68446a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getRawAdAwemeByAdId(r2)
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83156e(r1)
            r14.isVastAd = r1
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient r1 = r14.singleWebChromeClient
            if (r1 == 0) goto L_0x0037
            r1.f68631e = r15
        L_0x0037:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.f r1 = r14.singleWebViewClient
            if (r1 == 0) goto L_0x003e
            r1.mo67422a(r15)
        L_0x003e:
            com.ss.android.ugc.aweme.web.b r1 = r14.baseJsMessageHandler
            r2 = r15
            com.ss.android.ugc.aweme.web.b$a r2 = (com.p280ss.android.ugc.aweme.web.C43436b.C43438a) r2
            r1.f112504r = r2
        L_0x0045:
            if (r15 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.crossplatform.params.base.b r15 = r15.getCrossPlatformParams()
            if (r15 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.crossplatform.params.a r1 = r15.f68473a
            boolean r1 = r1.f68434g
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            r4 = 1
            if (r2 < r3) goto L_0x0097
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x008b }
            java.lang.Boolean r2 = r2.getEnableAudioAutoPlay()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "SettingsReader.get().enableAudioAutoPlay"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x008b }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x008b }
            if (r2 == 0) goto L_0x007e
            android.webkit.WebSettings r2 = r14.getSettings()     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "settings"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x008b }
            r1 = r1 ^ r4
            r2.setMediaPlaybackRequiresUserGesture(r1)     // Catch:{ Exception -> 0x008b }
            goto L_0x0097
        L_0x007e:
            android.webkit.WebSettings r1 = r14.getSettings()     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "settings"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Exception -> 0x008b }
            r1.setMediaPlaybackRequiresUserGesture(r4)     // Catch:{ Exception -> 0x008b }
            goto L_0x0097
        L_0x008b:
            android.webkit.WebSettings r1 = r14.getSettings()
            java.lang.String r2 = "settings"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r1.setMediaPlaybackRequiresUserGesture(r4)
        L_0x0097:
            com.ss.android.ugc.aweme.web.b r5 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            long r6 = r1.f68446a
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            java.lang.String r8 = r1.f68447b
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            int r9 = r1.f68448c
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            java.lang.String r10 = r1.f68454i
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            java.lang.String r11 = r1.f68450e
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            java.lang.String r12 = r1.f68442B
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r15.f68474b
            java.lang.String r13 = r1.f68443C
            r5.mo53864a(r6, r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.web.b r1 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.params.a r2 = r15.f68473a
            java.lang.String r2 = r2.f68432e
            if (r2 == 0) goto L_0x00cb
            java.lang.Long r2 = kotlin.text.C7634n.m23707e(r2)
            if (r2 == 0) goto L_0x00cb
            long r2 = r2.longValue()
            goto L_0x00cd
        L_0x00cb:
            r2 = 0
        L_0x00cd:
            r1.f54490n = r2
            com.ss.android.ugc.aweme.web.b r1 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.params.b r2 = r15.f68474b
            java.lang.String r2 = r2.f68452g
            r1.f54488l = r2
            com.ss.android.ugc.aweme.web.b r1 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.params.b r2 = r15.f68474b
            java.lang.String r2 = r2.f68451f
            r1.f54489m = r2
            com.ss.android.ugc.aweme.crossplatform.params.a r15 = r15.f68473a
            boolean r15 = r15.f68439l
            if (r15 == 0) goto L_0x00e8
            r14.setLayerType(r4, r0)
        L_0x00e8:
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.setCrossPlatformActivityContainer(com.ss.android.ugc.aweme.crossplatform.activity.g):void");
    }

    public final void sendEventToWebView(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "event");
        this.baseJsMessageHandler.mo53870a(str, jSONObject);
    }

    public final void loadUrl(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (C25978j.m85332a(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            this.mTTNetInterceptorWrapper = new C25977i(sb2.toString());
            C25968f fVar = this.singleWebViewClient;
            if (fVar != null) {
                fVar.f68672e = this.mTTNetInterceptorWrapper;
            }
        }
        if (str != null) {
            beforeLoadUrl(str);
        }
        super.loadUrl(str, map);
    }

    public SingleWebView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.contextProviderFactory = new C20136d();
        this.baseJsMessageHandler = new C43436b(context);
        this.gson$delegate = C7546e.m23569a(C25952e.f68646a);
        this.visitedUrls = new LinkedHashSet();
        this.chromeVersion$delegate = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C25951d(this));
        this.lastClickDetector$delegate = C7546e.m23569a(new C25956i(this, context));
        C30365a.m99205g();
        C20136d dVar = this.contextProviderFactory;
        dVar.mo53897a(AbsActivityContainer.class, new C25948a(this));
        dVar.mo53897a(C30388i.class, new C25949b(this));
        this.singleWebViewClient = new C25968f();
        setWebViewClient(C6490c.m20171a((WebViewClient) this.singleWebViewClient));
        WebView webView = this;
        this.singleWebChromeClient = new SingleWebChromeClient(webView);
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 == null) {
            C7573i.m23580a();
        }
        singleWebChromeClient2.f68630d = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        DMTJsBridge a = C20116a.m66326a(webView);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            C7573i.m23580a();
        }
        DMTJsBridge a2 = a.mo53852a((WebChromeClient) singleWebChromeClient3);
        C25968f fVar = this.singleWebViewClient;
        if (fVar == null) {
            C7573i.m23580a();
        }
        this.iesJsBridge = DMTJsBridge.m66312a(a2.mo53853a((WebViewClient) fVar).mo53854a((C20123a) this.baseJsMessageHandler).mo53856a(C35450i.m114506b()).mo53860b(C7163a.m22363a()), new C7563m<String, BridgeAccess, C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ SingleWebView f68637a;

            {
                this.f68637a = r1;
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m85257a((String) obj, (BridgeAccess) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m85257a(String str, BridgeAccess bridgeAccess) {
                C7573i.m23587b(str, "methodName");
                C7573i.m23587b(bridgeAccess, "bridgeAccess");
                C30388i monitorSession = this.f68637a.getMonitorSession();
                if (monitorSession != null) {
                    C30391k kVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                    if (kVar != null) {
                        String str2 = "hybrid_app_monitor_bridge_invoke_event";
                        String str3 = "bridge_invoke";
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("bridge_name", str);
                        switch (C25967e.f68667a[bridgeAccess.ordinal()]) {
                            case 1:
                                jSONObject.put("bridge_access", "public");
                                break;
                            case 2:
                                jSONObject.put("bridge_access", "private");
                                break;
                        }
                        kVar.mo79996a(str2, str3, jSONObject, null, null);
                    }
                }
            }
        }, null, 2, null);
        this.baseJsMessageHandler.mo53865a(this.iesJsBridge, this.contextProviderFactory);
        C25968f fVar2 = this.singleWebViewClient;
        if (fVar2 == null) {
            C7573i.m23580a();
        }
        fVar2.f30167b = this.iesJsBridge.f54455b;
        initConfig();
        addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ SingleWebView f68638a;

            {
                this.f68638a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C7573i.m23587b(view, "v");
                C30388i monitorSession = this.f68638a.getMonitorSession();
                if (monitorSession != null) {
                    C30391k kVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                    if (kVar != null) {
                        kVar.mo79989a(null);
                    }
                }
            }

            public final void onViewDetachedFromWindow(View view) {
                C7573i.m23587b(view, "v");
                C30388i monitorSession = this.f68638a.getMonitorSession();
                if (monitorSession != null) {
                    C30391k kVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                    if (kVar != null) {
                        kVar.mo80000b(null);
                    }
                }
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.canScrollVertically = true;
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C26026d dVar = this.scrollListener;
        if (dVar != null) {
            dVar.mo66425a(i, i2, i3, i4);
        }
    }

    public /* synthetic */ SingleWebView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
