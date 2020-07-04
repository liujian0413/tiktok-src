package com.p280ss.android.ugc.aweme.wiki;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.view.Window;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.base.C10747b;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.router.SmartRouter;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6600e;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.p1117b.C24531a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.p1117b.C24532b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.feed.model.Anchor;
import com.p280ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity */
public final class AddWikiActivity extends AmeSSActivity implements C10747b {

    /* renamed from: h */
    public static final C43558a f112788h = new C43558a(null);

    /* renamed from: a */
    public boolean f112789a;
    public LinearLayout addBtn;

    /* renamed from: b */
    public String f112790b;
    public ImageView backBtn;

    /* renamed from: c */
    public String f112791c;
    public ImageView closeBtn;

    /* renamed from: d */
    public C18253l<CheckWikiWordResult> f112792d;

    /* renamed from: e */
    public Runnable f112793e;

    /* renamed from: f */
    public boolean f112794f;

    /* renamed from: g */
    public long f112795g;

    /* renamed from: i */
    private C7561a<C7581n> f112796i;

    /* renamed from: j */
    private boolean f112797j;
    public View statusBar;
    public DmtTextView titleView;
    public CrossPlatformWebView webView;

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$a */
    public static final class C43558a {
        private C43558a() {
        }

        public /* synthetic */ C43558a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m138080a(Aweme aweme) {
            WikipediaInfo wikipediaInfo;
            C7573i.m23587b(aweme, "aweme");
            Anchor anchor = aweme.getAnchor();
            String str = null;
            if (anchor != null) {
                wikipediaInfo = anchor.getWikipediaInfo();
            } else {
                wikipediaInfo = null;
            }
            if (wikipediaInfo != null) {
                str = wikipediaInfo.getLang();
            }
            if (str == null || wikipediaInfo.getKeyword() == null) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m138081b(Aweme aweme) {
            AnchorCommonStruct anchorCommonStruct;
            C7573i.m23587b(aweme, "aweme");
            Anchor anchor = aweme.getAnchor();
            String str = null;
            if (anchor != null) {
                anchorCommonStruct = anchor.getAnchorInfo();
            } else {
                anchorCommonStruct = null;
            }
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getUrl();
            }
            if (!(str == null || anchorCommonStruct.getKeyword() == null)) {
                Integer businessType = aweme.getAnchor().getBusinessType();
                int type = AnchorBusinessType.YELP.getTYPE();
                if (businessType != null && businessType.intValue() == type) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m138082c(Aweme aweme) {
            AnchorCommonStruct anchorCommonStruct;
            C7573i.m23587b(aweme, "aweme");
            Anchor anchor = aweme.getAnchor();
            String str = null;
            if (anchor != null) {
                anchorCommonStruct = anchor.getAnchorInfo();
            } else {
                anchorCommonStruct = null;
            }
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getUrl();
            }
            if (!(str == null || anchorCommonStruct.getKeyword() == null)) {
                Integer businessType = aweme.getAnchor().getBusinessType();
                int type = AnchorBusinessType.TRIP_ADVISOR.getTYPE();
                if (businessType != null && businessType.intValue() == type) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static void m138079a(Context context, String str, Map<String, String> map) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            String str2;
            boolean z6;
            boolean z7;
            boolean z8;
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "originUrl");
            C7573i.m23587b(map, "params");
            String str3 = (String) map.get("anchor_type");
            String str4 = (String) map.get("shoot_way");
            String str5 = (String) map.get("creation_id");
            StringBuilder sb = new StringBuilder(str);
            boolean z9 = false;
            if (str3 == null) {
                str3 = "Wiki";
                String str6 = (String) map.get("title");
                String str7 = (String) map.get("close");
                CharSequence charSequence = str7;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || C7634n.m23717a(str7, "true", true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str8 = (String) map.get("hide_nav_bar");
                CharSequence charSequence2 = str8;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || C7634n.m23717a(str8, "true", true)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean a = C7634n.m23717a((String) map.get("back"), "true", true);
                boolean a2 = C7634n.m23717a((String) map.get("addButton"), "true", true);
                Uri parse = Uri.parse(str);
                C7573i.m23582a((Object) parse, "Uri.parse(originUrl)");
                if (parse.getQuery() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append('&');
                    str2 = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append('?');
                    str2 = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(str2);
                StringBuilder sb5 = new StringBuilder("addButton=");
                sb5.append(a2);
                sb4.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder("&back=");
                sb6.append(a);
                sb4.append(sb6.toString());
                StringBuilder sb7 = new StringBuilder("&close=");
                sb7.append(z3);
                sb4.append(sb7.toString());
                C7573i.m23582a((Object) sb4, "StringBuilder(if (Uri.pa…d(\"&$CLOSE=$enableClose\")");
                CharSequence charSequence3 = str6;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    StringBuilder sb8 = new StringBuilder("&title=");
                    sb8.append(str6);
                    sb4.append(sb8.toString());
                }
                CharSequence charSequence4 = str4;
                if (charSequence4 == null || charSequence4.length() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    StringBuilder sb9 = new StringBuilder("&shoot_way=");
                    sb9.append(str4);
                    sb4.append(sb9.toString());
                }
                CharSequence charSequence5 = str5;
                if (charSequence5 == null || charSequence5.length() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    StringBuilder sb10 = new StringBuilder("&creation_id=");
                    sb10.append(str5);
                    sb4.append(sb10.toString());
                }
                if (z5) {
                    StringBuilder sb11 = new StringBuilder("&hide_nav_bar=1&status_bar_height=");
                    sb11.append(C20505c.m68013b(context, (float) C10994a.m32204a(context)));
                    sb4.append(sb11.toString());
                } else {
                    sb4.append("&hide_nav_bar=0&status_bar_height=0");
                }
                sb = sb4;
            }
            boolean a3 = C7634n.m23717a((String) map.get("show_keyboard"), "true", true);
            String str9 = "";
            String str10 = (String) map.get("host_filter");
            if (str10 != null && C7634n.m23717a(str10, "true", true)) {
                Uri parse2 = Uri.parse(str);
                C7573i.m23582a((Object) parse2, "Uri.parse(originUrl)");
                String host = parse2.getHost();
                if (host == null) {
                    host = "";
                }
                str9 = host;
            }
            CharSequence charSequence6 = (CharSequence) map.get("disable_app_link");
            if (charSequence6 == null || charSequence6.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || C7634n.m23717a((String) map.get("disable_app_link"), "true", true)) {
                z9 = true;
            }
            SmartRouter.buildRoute(context, "//wiki").withParam("url", sb.toString()).withParam("shoot_way", str4).withParam("creation_id", str5).withParam("show_keyboard", a3).withParam("anchor_type", str3).withParam("author_id", (String) map.get("author_id")).withParam("group_id", (String) map.get("group_id")).withParam("enter_from", (String) map.get("enter_from")).withParam("language", (String) map.get("language")).withParam("wiki_entry", (String) map.get("wiki_entry")).withParam("anchor_entry", (String) map.get("anchor_entry")).withParam("host_filter", str9).withParam("disable_app_link", z9).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$b */
    static final class C43559b extends Lambda implements C7563m<WebView, String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f112798a;

        C43559b(AddWikiActivity addWikiActivity) {
            this.f112798a = addWikiActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(m138083a((WebView) obj, (String) obj2));
        }

        /* renamed from: a */
        private boolean m138083a(WebView webView, String str) {
            C7573i.m23587b(webView, "view");
            C7573i.m23587b(str, "url");
            if (this.f112798a.f112789a) {
                C10761a.m31409e((Context) this.f112798a, (int) R.string.alp).mo25750a();
                return true;
            }
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "uri");
            String scheme = parse.getScheme();
            boolean booleanExtra = this.f112798a.getIntent().getBooleanExtra("disable_app_link", true);
            String stringExtra = this.f112798a.getIntent().getStringExtra("anchor_type");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String path = parse.getPath();
            if (path != null && C7634n.m23723c(path, ".apk", false)) {
                C10761a.m31409e((Context) this.f112798a, (int) R.string.ix).mo25750a();
                return true;
            } else if (C7634n.m23717a(scheme, "intent", true)) {
                if (booleanExtra) {
                    C10761a.m31409e((Context) this.f112798a, (int) R.string.ix).mo25750a();
                } else {
                    try {
                        this.f112798a.setIntent(Intent.parseUri(str, 1));
                        this.f112798a.getIntent().addFlags(268435456);
                        this.f112798a.startActivity(this.f112798a.getIntent());
                    } catch (URISyntaxException unused) {
                    }
                }
                return true;
            } else if (C7634n.m23717a(scheme, "yelp", true)) {
                if (booleanExtra) {
                    C10761a.m31409e((Context) this.f112798a, (int) R.string.ix).mo25750a();
                } else {
                    C25371n.m83489f((Context) this.f112798a, str);
                }
                return true;
            } else if (C7634n.m23717a(scheme, "tripadvisor", true)) {
                if (booleanExtra) {
                    C10761a.m31409e((Context) this.f112798a, (int) R.string.ix).mo25750a();
                } else {
                    C25371n.m83489f((Context) this.f112798a, str);
                }
                return true;
            } else if (C7634n.m23717a(scheme, "market", true)) {
                C10761a.m31409e((Context) this.f112798a, (int) R.string.ix).mo25750a();
                return true;
            } else {
                if (C7634n.m23717a(stringExtra, "Yelp", true)) {
                    CharSequence charSequence = str;
                    if (C7634n.m23776c(charSequence, (CharSequence) "&deeplink=", true)) {
                        if (booleanExtra) {
                            C10761a.m31409e((Context) this.f112798a, (int) R.string.ix).mo25750a();
                        } else {
                            String substring = str.substring(C7634n.m23730a(charSequence, "&deeplink=", 0, false, 6, (Object) null) + 10, str.length());
                            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            int a = C7634n.m23730a((CharSequence) substring, "&", 0, false, 6, (Object) null);
                            if (substring != null) {
                                String substring2 = substring.substring(0, a);
                                C7573i.m23582a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                C25371n.m83489f((Context) this.f112798a, URLDecoder.decode(substring2, "UTF-8"));
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                        return true;
                    }
                }
                this.f112798a.mo105493a(true);
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$c */
    public static final class C43560c implements C25965c {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f112799a;

        /* renamed from: b */
        private boolean f112800b;

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            return false;
        }

        C43560c(AddWikiActivity addWikiActivity) {
            this.f112799a = addWikiActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a7, code lost:
            if (r8 == null) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x026a, code lost:
            if (r3 != false) goto L_0x026c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x03e6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo64223a(android.webkit.WebView r8, java.lang.String r9) {
            /*
                r7 = this;
                boolean r0 = r7.f112800b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0181
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.widget.ImageView r8 = r8.mo105494b()
                int r8 = r8.getVisibility()
                r9 = 8
                if (r8 != r9) goto L_0x001d
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.widget.ImageView r8 = r8.mo105494b()
                r8.setVisibility(r1)
            L_0x001d:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.widget.ImageView r8 = r8.mo105495c()
                int r8 = r8.getVisibility()
                if (r8 != r9) goto L_0x0032
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.widget.ImageView r8 = r8.mo105495c()
                r8.setVisibility(r1)
            L_0x0032:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                r8.mo105493a(r1)
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.content.Intent r8 = r8.getIntent()
                java.lang.String r9 = "enter_from"
                java.lang.String r8 = r8.getStringExtra(r9)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                if (r8 == 0) goto L_0x0050
                int r8 = r8.length()
                if (r8 != 0) goto L_0x004e
                goto L_0x0050
            L_0x004e:
                r8 = 0
                goto L_0x0051
            L_0x0050:
                r8 = 1
            L_0x0051:
                if (r8 != 0) goto L_0x0180
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.content.Intent r8 = r8.getIntent()
                java.lang.String r9 = "anchor_type"
                java.lang.String r8 = r8.getStringExtra(r9)
                if (r8 != 0) goto L_0x0063
                java.lang.String r8 = ""
            L_0x0063:
                java.lang.String r9 = "Yelp"
                boolean r9 = kotlin.text.C7634n.m23717a(r8, r9, r2)
                if (r9 == 0) goto L_0x00dc
                com.ss.android.ugc.aweme.app.g.d r8 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r9 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_type"
                java.lang.String r0 = "Yelp"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "status"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59970a(r9, r1)
                java.lang.String r9 = "duration"
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r2 = r7.f112799a
                long r2 = r2.f112795g
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59971a(r9, r0)
                java.lang.String r9 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r8)
                return
            L_0x00dc:
                java.lang.String r9 = "TripAdvisor"
                boolean r8 = kotlin.text.C7634n.m23717a(r8, r9, r2)
                if (r8 == 0) goto L_0x0155
                com.ss.android.ugc.aweme.app.g.d r8 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r9 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_type"
                java.lang.String r0 = "TripAdvisor"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "status"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59970a(r9, r1)
                java.lang.String r9 = "duration"
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r2 = r7.f112799a
                long r2 = r2.f112795g
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59971a(r9, r0)
                java.lang.String r9 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r8)
                return
            L_0x0155:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                com.ss.android.ugc.aweme.app.g.d r9 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r0 = "EventMapBuilder.newBuilder()"
                kotlin.jvm.internal.C7573i.m23582a(r9, r0)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo105489a(r9)
                java.lang.String r9 = "status"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59970a(r9, r1)
                java.lang.String r9 = "duration"
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r2 = r7.f112799a
                long r2 = r2.f112795g
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59971a(r9, r0)
                java.lang.String r9 = "request_wiki_detail"
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r8)
            L_0x0180:
                return
            L_0x0181:
                android.net.Uri r9 = android.net.Uri.parse(r9)
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.C7573i.m23582a(r9, r0)
                java.lang.String r0 = "title"
                java.lang.String r0 = com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.m138062a(r9, r0)
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x019e
                int r3 = r3.length()
                if (r3 != 0) goto L_0x019c
                goto L_0x019e
            L_0x019c:
                r3 = 0
                goto L_0x019f
            L_0x019e:
                r3 = 1
            L_0x019f:
                if (r3 == 0) goto L_0x01af
                if (r8 == 0) goto L_0x01ac
                java.lang.String r8 = r8.getTitle()
                if (r8 != 0) goto L_0x01aa
                goto L_0x01ac
            L_0x01aa:
                r0 = r8
                goto L_0x01af
            L_0x01ac:
                java.lang.String r8 = ""
                goto L_0x01aa
            L_0x01af:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.content.Intent r8 = r8.getIntent()
                java.lang.String r3 = "anchor_type"
                java.lang.String r8 = r8.getStringExtra(r3)
                java.lang.String r3 = "Yelp"
                boolean r3 = kotlin.text.C7634n.m23717a(r8, r3, r2)
                if (r3 != 0) goto L_0x01d9
                java.lang.String r3 = "TripAdvisor"
                boolean r8 = kotlin.text.C7634n.m23717a(r8, r3, r2)
                if (r8 == 0) goto L_0x01cc
                goto L_0x01d9
            L_0x01cc:
                java.lang.String r8 = "addButton"
                java.lang.String r8 = com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.m138062a(r9, r8)
                java.lang.String r3 = "true"
                boolean r8 = kotlin.text.C7634n.m23717a(r8, r3, r2)
                goto L_0x01da
            L_0x01d9:
                r8 = 1
            L_0x01da:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r4 = com.p280ss.android.ugc.aweme.language.I18nManagerService.class
                java.lang.Object r3 = r3.getService(r4)
                com.ss.android.ugc.aweme.language.I18nManagerService r3 = (com.p280ss.android.ugc.aweme.language.I18nManagerService) r3
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r4 = r7.f112799a
                java.lang.String r5 = "lang"
                java.lang.String r5 = com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.m138062a(r9, r5)
                if (r5 != 0) goto L_0x01fe
                java.lang.String r5 = "service"
                kotlin.jvm.internal.C7573i.m23582a(r3, r5)
                java.lang.String r5 = r3.getAppLanguage()
                java.lang.String r3 = "service.appLanguage"
                kotlin.jvm.internal.C7573i.m23582a(r5, r3)
            L_0x01fe:
                r4.f112791c = r5
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r3 = r7.f112799a
                java.lang.String r3 = r3.mo105491a(r0)
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r4 = r7.f112799a
                r5 = 0
                if (r8 == 0) goto L_0x0224
                r8 = r3
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                int r8 = r8.length()
                if (r8 <= 0) goto L_0x0216
                r8 = 1
                goto L_0x0217
            L_0x0216:
                r8 = 0
            L_0x0217:
                if (r8 == 0) goto L_0x0224
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                java.lang.String r8 = com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.m138063a(r8)
                com.google.common.util.concurrent.l r8 = com.p280ss.android.ugc.aweme.wiki.CheckWikiWordService.C43567a.m138091a(r8, r3)
                goto L_0x0225
            L_0x0224:
                r8 = r5
            L_0x0225:
                r4.f112792d = r8
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.content.Intent r8 = r8.getIntent()
                java.lang.String r3 = "enter_from"
                java.lang.String r8 = r8.getStringExtra(r3)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x0240
                int r3 = r0.length()
                if (r3 != 0) goto L_0x023e
                goto L_0x0240
            L_0x023e:
                r3 = 0
                goto L_0x0241
            L_0x0240:
                r3 = 1
            L_0x0241:
                if (r3 != 0) goto L_0x0275
                r3 = r8
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x0251
                int r3 = r3.length()
                if (r3 != 0) goto L_0x024f
                goto L_0x0251
            L_0x024f:
                r3 = 0
                goto L_0x0252
            L_0x0251:
                r3 = 1
            L_0x0252:
                if (r3 != 0) goto L_0x026c
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r3 = r7.f112799a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r3.mo105496d()
                java.lang.CharSequence r3 = r3.getText()
                if (r3 == 0) goto L_0x0269
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0267
                goto L_0x0269
            L_0x0267:
                r3 = 0
                goto L_0x026a
            L_0x0269:
                r3 = 1
            L_0x026a:
                if (r3 == 0) goto L_0x0275
            L_0x026c:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r3 = r7.f112799a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r3.mo105496d()
                r3.setText(r0)
            L_0x0275:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                java.lang.String r3 = "keyword"
                java.lang.String r3 = com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.m138062a(r9, r3)
                r0.f112790b = r3
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                java.lang.String r3 = "noRedirect"
                java.lang.String r3 = com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.m138062a(r9, r3)
                java.lang.String r4 = "true"
                boolean r3 = kotlin.text.C7634n.m23717a(r3, r4, r2)
                r0.f112789a = r3
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                r0.mo105492a(r9)
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r9 = r7.f112799a
                r9.f112793e = r5
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r9 = r7.f112799a
                r9.mo105497e()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r9 = r7.f112799a
                r9.mo105493a(r1)
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                if (r8 == 0) goto L_0x02af
                int r8 = r8.length()
                if (r8 != 0) goto L_0x02ad
                goto L_0x02af
            L_0x02ad:
                r8 = 0
                goto L_0x02b0
            L_0x02af:
                r8 = 1
            L_0x02b0:
                if (r8 != 0) goto L_0x03e0
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                android.content.Intent r8 = r8.getIntent()
                java.lang.String r9 = "anchor_type"
                java.lang.String r8 = r8.getStringExtra(r9)
                if (r8 != 0) goto L_0x02c2
                java.lang.String r8 = ""
            L_0x02c2:
                java.lang.String r9 = "Yelp"
                boolean r9 = kotlin.text.C7634n.m23717a(r8, r9, r2)
                if (r9 == 0) goto L_0x033c
                com.ss.android.ugc.aweme.app.g.d r8 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r9 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_type"
                java.lang.String r0 = "Yelp"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "status"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59970a(r9, r2)
                java.lang.String r9 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                long r5 = r0.f112795g
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59971a(r9, r3)
                java.lang.String r9 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r8)
                goto L_0x03e0
            L_0x033c:
                java.lang.String r9 = "TripAdvisor"
                boolean r8 = kotlin.text.C7634n.m23717a(r8, r9, r2)
                if (r8 == 0) goto L_0x03b5
                com.ss.android.ugc.aweme.app.g.d r8 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r9 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_type"
                java.lang.String r0 = "TripAdvisor"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r9, r0)
                java.lang.String r9 = "status"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59970a(r9, r2)
                java.lang.String r9 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                long r5 = r0.f112795g
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59971a(r9, r3)
                java.lang.String r9 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r8)
                goto L_0x03e0
            L_0x03b5:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                com.ss.android.ugc.aweme.app.g.d r9 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r0 = "EventMapBuilder.newBuilder()"
                kotlin.jvm.internal.C7573i.m23582a(r9, r0)
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo105489a(r9)
                java.lang.String r9 = "status"
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59970a(r9, r2)
                java.lang.String r9 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r7.f112799a
                long r5 = r0.f112795g
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59971a(r9, r3)
                java.lang.String r9 = "request_wiki_detail"
                java.util.Map<java.lang.String, java.lang.String> r8 = r8.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r8)
            L_0x03e0:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                boolean r8 = r8.f112794f
                if (r8 == 0) goto L_0x0411
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                r8.f112794f = r1
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r8 = r7.f112799a
                java.lang.String r9 = "input_method"
                java.lang.Object r8 = r8.getSystemService(r9)
                if (r8 == 0) goto L_0x0409
                android.view.inputmethod.InputMethodManager r8 = (android.view.inputmethod.InputMethodManager) r8
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r9 = r7.f112799a
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r9 = r9.mo105490a()
                r0 = 2131296491(0x7f0900eb, float:1.82109E38)
                android.view.View r9 = r9.mo67462a(r0)
                com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r9 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r9
                r8.showSoftInput(r9, r2)
                goto L_0x0411
            L_0x0409:
                kotlin.TypeCastException r8 = new kotlin.TypeCastException
                java.lang.String r9 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
                r8.<init>(r9)
                throw r8
            L_0x0411:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43560c.mo64223a(android.webkit.WebView, java.lang.String):void");
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f112800b = true;
            }
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
            this.f112800b = false;
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            if (VERSION.SDK_INT < 23) {
                this.f112800b = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$d */
    static final class C43561d implements DownloadListener {

        /* renamed from: a */
        public static final C43561d f112801a = new C43561d();

        C43561d() {
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }
    }

    /* renamed from: a */
    public static final void m138064a(Context context, String str, Map<String, String> map) {
        C43558a.m138079a(context, str, map);
    }

    /* renamed from: a */
    public static final boolean m138065a(Aweme aweme) {
        return C43558a.m138080a(aweme);
    }

    /* renamed from: b */
    public static final boolean m138066b(Aweme aweme) {
        return C43558a.m138081b(aweme);
    }

    /* renamed from: c */
    public static final boolean m138067c(Aweme aweme) {
        return C43558a.m138082c(aweme);
    }

    public final void onClickClose() {
        finish();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: f */
    private final C7563m<WebView, String, Boolean> m138068f() {
        return new C43559b<>(this);
    }

    /* renamed from: g */
    private final C25965c m138069g() {
        return new C43560c(this);
    }

    /* renamed from: b */
    public final ImageView mo105494b() {
        ImageView imageView = this.backBtn;
        if (imageView == null) {
            C7573i.m23583a("backBtn");
        }
        return imageView;
    }

    /* renamed from: c */
    public final ImageView mo105495c() {
        ImageView imageView = this.closeBtn;
        if (imageView == null) {
            C7573i.m23583a("closeBtn");
        }
        return imageView;
    }

    /* renamed from: d */
    public final DmtTextView mo105496d() {
        DmtTextView dmtTextView = this.titleView;
        if (dmtTextView == null) {
            C7573i.m23583a("titleView");
        }
        return dmtTextView;
    }

    /* renamed from: a */
    public final CrossPlatformWebView mo105490a() {
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("webView");
        }
        return crossPlatformWebView;
    }

    public final void onBackPressed() {
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("webView");
        }
        if (!crossPlatformWebView.mo67482b()) {
            super.onBackPressed();
            return;
        }
        C7561a<C7581n> aVar = this.f112796i;
        if (aVar != null) {
            aVar.invoke();
        }
        CrossPlatformWebView crossPlatformWebView2 = this.webView;
        if (crossPlatformWebView2 == null) {
            C7573i.m23583a("webView");
        }
        crossPlatformWebView2.mo67477a();
    }

    public final void onClickBack() {
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("webView");
        }
        if (!crossPlatformWebView.mo67482b()) {
            finish();
            return;
        }
        C7561a<C7581n> aVar = this.f112796i;
        if (aVar != null) {
            aVar.invoke();
        }
        CrossPlatformWebView crossPlatformWebView2 = this.webView;
        if (crossPlatformWebView2 == null) {
            C7573i.m23583a("webView");
        }
        crossPlatformWebView2.mo67477a();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", true);
        super.onResume();
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("webView");
        }
        ((SingleWebView) crossPlatformWebView.mo67462a((int) R.id.fn)).setDownloadListener(C43561d.f112801a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", false);
    }

    /* renamed from: e */
    public final void mo105497e() {
        String stringExtra = getIntent().getStringExtra("anchor_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (C7634n.m23717a(stringExtra, "Yelp", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:(function extra(){");
            sb.append("[].forEach.call(document.getElementsByClassName('lemon--div__32e33__1mboc banner__32e33__39b4o border-color--default__32e33__2oFDT'), el => el.style.display = 'none');");
            sb.append("document.getElementById('smart-banner').style.display = 'none';");
            sb.append("document.getElementById('fullscreen-pitch').style.display = 'none';");
            sb.append("[].forEach.call(document.getElementsByClassName('fullscreen-pitch_close'), el => el.click());");
            sb.append("})();");
            CrossPlatformWebView crossPlatformWebView = this.webView;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("webView");
            }
            String sb2 = sb.toString();
            C7573i.m23582a((Object) sb2, "jsCode.toString()");
            CrossPlatformWebView.m85411a(crossPlatformWebView, sb2, false, (Map) null, 6, (Object) null);
            return;
        }
        if (C7634n.m23717a(stringExtra, "TripAdvisor", true)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("javascript:(function extra(){");
            sb3.append("[].forEach.call(document.getElementsByClassName('social-ugc-actions-UploaderActionButton__upload_container--1wUKt social-ugc-actions-SocialFab__overlay--31Qvx'), el => el.style.display = 'none');");
            sb3.append("[].forEach.call(document.getElementsByClassName('ppr_rup ppr_priv_daodao_mobile_open_app_smart_button_component'), el => el.style.display = 'none');");
            sb3.append("[].forEach.call(document.getElementsByClassName('cpm-ad-target-mobile-adhesion-MobileAdhesion__fixedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');");
            sb3.append("[].forEach.call(document.getElementsByClassName(' daodao-mobile-app-smartbutton-SmartButton__open_app_smartbutton--YE-xh daodao-mobile-app-smartbutton-SmartButton__is_shown--35tcaedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');");
            sb3.append("[].forEach.call(document.getElementsByClassName('hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__ui_persistent_footer--1MGGe hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__fixed--8x8LO'), el => el.style.display = 'none');");
            sb3.append("})();");
            CrossPlatformWebView crossPlatformWebView2 = this.webView;
            if (crossPlatformWebView2 == null) {
                C7573i.m23583a("webView");
            }
            String sb4 = sb3.toString();
            C7573i.m23582a((Object) sb4, "jsCode.toString()");
            CrossPlatformWebView.m85411a(crossPlatformWebView2, sb4, false, (Map) null, 6, (Object) null);
        }
    }

    public final void onDestroy() {
        boolean z;
        ImmersionBar.with((Activity) this).destroy();
        CharSequence stringExtra = getIntent().getStringExtra("enter_from");
        if (stringExtra == null || stringExtra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String stringExtra2 = getIntent().getStringExtra("anchor_type");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            if (C7634n.m23717a(stringExtra2, "Yelp", true)) {
                C6907h.m21524a("anchor_stay_time", (Map) C22984d.m75611a().mo59973a("enter_from", getIntent().getStringExtra("enter_from")).mo59973a("anchor_type", "Yelp").mo59973a("anchor_entry", getIntent().getStringExtra("anchor_entry")).mo59973a("author_id", getIntent().getStringExtra("author_id")).mo59973a("group_id", getIntent().getStringExtra("group_id")).mo59971a("duration", System.currentTimeMillis() - this.f112795g).f60753a);
            } else if (C7634n.m23717a(stringExtra2, "TripAdvisor", true)) {
                C6907h.m21524a("anchor_stay_time", (Map) C22984d.m75611a().mo59973a("enter_from", getIntent().getStringExtra("enter_from")).mo59973a("anchor_type", "TripAdvisor").mo59973a("anchor_entry", getIntent().getStringExtra("anchor_entry")).mo59973a("author_id", getIntent().getStringExtra("author_id")).mo59973a("group_id", getIntent().getStringExtra("group_id")).mo59971a("duration", System.currentTimeMillis() - this.f112795g).f60753a);
            } else {
                C22984d a = C22984d.m75611a();
                C7573i.m23582a((Object) a, "EventMapBuilder.newBuilder()");
                C6907h.m21524a("wiki_stay_time", (Map) mo105489a(a).mo59971a("duration", System.currentTimeMillis() - this.f112795g).f60753a);
            }
        }
        super.onDestroy();
    }

    public final void onClickAdd() {
        boolean z;
        boolean z2;
        if (!this.f112797j) {
            CrossPlatformWebView crossPlatformWebView = this.webView;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("webView");
            }
            Uri parse = Uri.parse(crossPlatformWebView.getCurrentUrl());
            C7573i.m23582a((Object) parse, "uri");
            String scheme = parse.getScheme();
            if (C7634n.m23717a(scheme, WebKitApi.SCHEME_HTTP, true) || C7634n.m23717a(scheme, WebKitApi.SCHEME_HTTPS, true)) {
                String stringExtra = getIntent().getStringExtra("anchor_type");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (C7634n.m23717a(stringExtra, "Yelp", true) && C23764b.m77913a(getIntent().getStringExtra("host_filter"))) {
                    String host = parse.getHost();
                    C7573i.m23582a((Object) host, "uri.host");
                    if (!C7634n.m23776c((CharSequence) host, (CharSequence) "yelp", true)) {
                        C10761a.m31409e((Context) this, (int) R.string.iy).mo25750a();
                        return;
                    }
                }
                if (C7634n.m23717a(stringExtra, "TripAdvisor", true) && C23764b.m77913a(getIntent().getStringExtra("host_filter"))) {
                    String host2 = parse.getHost();
                    C7573i.m23582a((Object) host2, "uri.host");
                    if (!C7634n.m23776c((CharSequence) host2, (CharSequence) "tripadvisor", true)) {
                        C10761a.m31409e((Context) this, (int) R.string.iy).mo25750a();
                        return;
                    }
                }
                try {
                    C18253l<CheckWikiWordResult> lVar = this.f112792d;
                    if (lVar != null) {
                        CheckWikiWordResult checkWikiWordResult = (CheckWikiWordResult) lVar.get();
                        if (checkWikiWordResult != null) {
                            DmtTextView dmtTextView = this.titleView;
                            if (dmtTextView == null) {
                                C7573i.m23583a("titleView");
                            }
                            String a = mo105491a(dmtTextView.getText().toString());
                            C22984d a2 = C22984d.m75611a().mo59973a("enter_from", "video_publish_page");
                            String stringExtra2 = getIntent().getStringExtra("shoot_way");
                            CharSequence charSequence = stringExtra2;
                            if (charSequence == null || charSequence.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                a2.mo59973a("shoot_way", stringExtra2);
                            }
                            String stringExtra3 = getIntent().getStringExtra("creation_id");
                            CharSequence charSequence2 = stringExtra3;
                            if (charSequence2 == null || charSequence2.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                a2.mo59973a("creation_id", stringExtra3);
                            }
                            if (checkWikiWordResult.getCode() != 0) {
                                C10761a.m31403c((Context) this, checkWikiWordResult.getMsg()).mo25750a();
                                if (C7634n.m23717a(stringExtra, "Yelp", true)) {
                                    C6907h.m21524a("choose_anchor", (Map) a2.mo59973a("anchor_type", "Yelp").mo59973a("anchor_entry", a).mo59970a("status", 0).f60753a);
                                } else if (C7634n.m23717a(stringExtra, "TripAdvisor", true)) {
                                    C6907h.m21524a("choose_anchor", (Map) a2.mo59973a("anchor_type", "TripAdvisor").mo59973a("anchor_entry", a).mo59970a("status", 0).f60753a);
                                } else {
                                    String str = "choose_wiki";
                                    String str2 = "language";
                                    String str3 = this.f112791c;
                                    if (str3 == null) {
                                        C7573i.m23583a("language");
                                    }
                                    C6907h.m21524a(str, (Map) a2.mo59973a(str2, str3).mo59973a("wiki_entry", a).mo59973a("key_word", this.f112790b).mo59970a("status", 0).f60753a);
                                }
                            } else if (C7634n.m23717a(stringExtra, "Yelp", true)) {
                                CrossPlatformWebView crossPlatformWebView2 = this.webView;
                                if (crossPlatformWebView2 == null) {
                                    C7573i.m23583a("webView");
                                }
                                String currentUrl = crossPlatformWebView2.getCurrentUrl();
                                if (currentUrl == null) {
                                    currentUrl = "https://www.yelp.com";
                                }
                                int type = AnchorBusinessType.YELP.getTYPE();
                                String b = new C6600e().mo15979b((Object) new C24531a(a, currentUrl));
                                C7573i.m23582a((Object) b, "Gson().toJson(CommonAnchor(title, url))");
                                AnchorTransData anchorTransData = r5;
                                AnchorTransData anchorTransData2 = new AnchorTransData(type, b, a, null, null, null, null, 120, null);
                                C42961az.m136380a(new C24522a(anchorTransData));
                                finish();
                                C6907h.m21524a("choose_anchor", (Map) a2.mo59973a("anchor_type", "Yelp").mo59973a("anchor_entry", a).mo59970a("status", 1).f60753a);
                            } else if (C7634n.m23717a(stringExtra, "TripAdvisor", true)) {
                                CrossPlatformWebView crossPlatformWebView3 = this.webView;
                                if (crossPlatformWebView3 == null) {
                                    C7573i.m23583a("webView");
                                }
                                String currentUrl2 = crossPlatformWebView3.getCurrentUrl();
                                if (currentUrl2 == null) {
                                    currentUrl2 = "https://www.tripadvisor.com";
                                }
                                int type2 = AnchorBusinessType.TRIP_ADVISOR.getTYPE();
                                String b2 = new C6600e().mo15979b((Object) new C24531a(a, currentUrl2));
                                C7573i.m23582a((Object) b2, "Gson().toJson(CommonAnchor(title, url))");
                                AnchorTransData anchorTransData3 = new AnchorTransData(type2, b2, a, null, null, null, null, 120, null);
                                C42961az.m136380a(new C24522a(anchorTransData3));
                                finish();
                                C6907h.m21524a("choose_anchor", (Map) a2.mo59973a("anchor_type", "TripAdvisor").mo59973a("anchor_entry", a).mo59970a("status", 1).f60753a);
                            } else {
                                int type3 = AnchorBusinessType.WIKIPEDIA.getTYPE();
                                C6600e eVar = new C6600e();
                                String str4 = this.f112791c;
                                if (str4 == null) {
                                    C7573i.m23583a("language");
                                }
                                String b3 = eVar.mo15979b((Object) new C24532b(a, str4));
                                C7573i.m23582a((Object) b3, "Gson().toJson(WikiAnchor(title, language))");
                                AnchorTransData anchorTransData4 = new AnchorTransData(type3, b3, a, null, null, null, null, 120, null);
                                C42961az.m136380a(new C24522a(anchorTransData4));
                                finish();
                                String str5 = "choose_wiki";
                                String str6 = "language";
                                String str7 = this.f112791c;
                                if (str7 == null) {
                                    C7573i.m23583a("language");
                                }
                                C6907h.m21524a(str5, (Map) a2.mo59973a(str6, str7).mo59973a("wiki_entry", a).mo59973a("key_word", this.f112790b).mo59970a("status", 1).f60753a);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                C10761a.m31409e((Context) this, (int) R.string.iy).mo25750a();
            }
        }
    }

    public final void setStatusBar(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.statusBar = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ String m138063a(AddWikiActivity addWikiActivity) {
        String str = addWikiActivity.f112791c;
        if (str == null) {
            C7573i.m23583a("language");
        }
        return str;
    }

    /* renamed from: a */
    public final C22984d mo105489a(C22984d dVar) {
        C22984d a = dVar.mo59973a("enter_from", getIntent().getStringExtra("enter_from")).mo59973a("wiki_entry", getIntent().getStringExtra("wiki_entry")).mo59973a("author_id", getIntent().getStringExtra("author_id")).mo59973a("group_id", getIntent().getStringExtra("group_id")).mo59973a("language", getIntent().getStringExtra("language"));
        C7573i.m23582a((Object) a, "this.appendParam(Mob.Key…ey.WIKI_ANCHOR_LANGUAGE))");
        return a;
    }

    /* renamed from: a */
    public final String mo105491a(String str) {
        String stringExtra = getIntent().getStringExtra("anchor_type");
        if (!C7634n.m23717a(stringExtra, "Yelp", true) && !C7634n.m23717a(stringExtra, "TripAdvisor", true)) {
            return str;
        }
        return (String) C7634n.m23768b((CharSequence) str, new String[]{" - "}, false, 0).get(0);
    }

    /* renamed from: a */
    public final void mo105492a(Uri uri) {
        int i;
        int i2;
        String stringExtra = getIntent().getStringExtra("anchor_type");
        int i3 = 0;
        int i4 = 8;
        if (C7634n.m23717a(stringExtra, "Yelp", true) || C7634n.m23717a(stringExtra, "TripAdvisor", true)) {
            if (getIntent().getStringExtra("enter_from") == null) {
                LinearLayout linearLayout = this.addBtn;
                if (linearLayout == null) {
                    C7573i.m23583a("addBtn");
                }
                linearLayout.setVisibility(0);
                ImageView imageView = this.closeBtn;
                if (imageView == null) {
                    C7573i.m23583a("closeBtn");
                }
                imageView.setVisibility(0);
                ImageView imageView2 = this.backBtn;
                if (imageView2 == null) {
                    C7573i.m23583a("backBtn");
                }
                CrossPlatformWebView crossPlatformWebView = this.webView;
                if (crossPlatformWebView == null) {
                    C7573i.m23583a("webView");
                }
                if (!crossPlatformWebView.mo67482b()) {
                    i3 = 8;
                }
                imageView2.setVisibility(i3);
                return;
            }
            LinearLayout linearLayout2 = this.addBtn;
            if (linearLayout2 == null) {
                C7573i.m23583a("addBtn");
            }
            linearLayout2.setVisibility(8);
            ImageView imageView3 = this.closeBtn;
            if (imageView3 == null) {
                C7573i.m23583a("closeBtn");
            }
            CrossPlatformWebView crossPlatformWebView2 = this.webView;
            if (crossPlatformWebView2 == null) {
                C7573i.m23583a("webView");
            }
            if (crossPlatformWebView2.mo67482b()) {
                i4 = 0;
            }
            imageView3.setVisibility(i4);
            ImageView imageView4 = this.backBtn;
            if (imageView4 == null) {
                C7573i.m23583a("backBtn");
            }
            imageView4.setVisibility(0);
        } else if (C7634n.m23717a(m138062a(uri, "hide_nav_bar"), "1", true)) {
            LinearLayout linearLayout3 = this.addBtn;
            if (linearLayout3 == null) {
                C7573i.m23583a("addBtn");
            }
            linearLayout3.setVisibility(8);
            ImageView imageView5 = this.backBtn;
            if (imageView5 == null) {
                C7573i.m23583a("backBtn");
            }
            imageView5.setVisibility(8);
            ImageView imageView6 = this.closeBtn;
            if (imageView6 == null) {
                C7573i.m23583a("closeBtn");
            }
            imageView6.setVisibility(8);
            DmtTextView dmtTextView = this.titleView;
            if (dmtTextView == null) {
                C7573i.m23583a("titleView");
            }
            dmtTextView.setVisibility(8);
            View view = this.statusBar;
            if (view == null) {
                C7573i.m23583a("statusBar");
            }
            view.setVisibility(8);
        } else {
            View view2 = this.statusBar;
            if (view2 == null) {
                C7573i.m23583a("statusBar");
            }
            view2.setVisibility(0);
            DmtTextView dmtTextView2 = this.titleView;
            if (dmtTextView2 == null) {
                C7573i.m23583a("titleView");
            }
            dmtTextView2.setVisibility(0);
            boolean a = C7634n.m23717a(m138062a(uri, "addButton"), "true", true);
            LinearLayout linearLayout4 = this.addBtn;
            if (linearLayout4 == null) {
                C7573i.m23583a("addBtn");
            }
            if (a) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout4.setVisibility(i);
            boolean z = !C7634n.m23717a(m138062a(uri, "close"), "false", true);
            ImageView imageView7 = this.closeBtn;
            if (imageView7 == null) {
                C7573i.m23583a("closeBtn");
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView7.setVisibility(i2);
            boolean z2 = !C7634n.m23717a(m138062a(uri, "back"), "false", true);
            ImageView imageView8 = this.backBtn;
            if (imageView8 == null) {
                C7573i.m23583a("backBtn");
            }
            if (!z2 && (z || z2)) {
                i3 = 8;
            }
            imageView8.setVisibility(i3);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.fi);
        Activity activity = this;
        ButterKnife.bind(activity);
        this.f112795g = System.currentTimeMillis();
        String stringExtra = getIntent().getStringExtra("url");
        Uri parse = Uri.parse(stringExtra);
        C7573i.m23582a((Object) parse, "Uri.parse(url)");
        mo105492a(parse);
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("webView");
        }
        crossPlatformWebView.setCustomWebViewStatus(m138069g());
        CrossPlatformWebView crossPlatformWebView2 = this.webView;
        if (crossPlatformWebView2 == null) {
            C7573i.m23583a("webView");
        }
        crossPlatformWebView2.setShouldOverrideInterceptor(m138068f());
        mo105493a(true);
        CrossPlatformWebView crossPlatformWebView3 = this.webView;
        if (crossPlatformWebView3 == null) {
            C7573i.m23583a("webView");
        }
        C7573i.m23582a((Object) stringExtra, "url");
        CrossPlatformWebView.m85411a(crossPlatformWebView3, stringExtra, false, (Map) null, 6, (Object) null);
        CrossPlatformWebView crossPlatformWebView4 = this.webView;
        if (crossPlatformWebView4 == null) {
            C7573i.m23583a("webView");
        }
        crossPlatformWebView4.requestFocus();
        CrossPlatformWebView crossPlatformWebView5 = this.webView;
        if (crossPlatformWebView5 == null) {
            C7573i.m23583a("webView");
        }
        ((SingleWebView) crossPlatformWebView5.mo67462a((int) R.id.fn)).requestFocus();
        this.f112794f = getIntent().getBooleanExtra("show_keyboard", false);
        String stringExtra2 = getIntent().getStringExtra("anchor_type");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (!C7573i.m23585a((Object) stringExtra2, (Object) "analytics") || !C6399b.m19947w() || C7212bb.m22493a()) {
            ImmersionBar.with(activity).statusBarDarkFont(true).init();
            Context context = this;
            C6394b.m19905a(context);
            Window window = getWindow();
            C7573i.m23582a((Object) window, "window");
            View decorView = window.getDecorView();
            C7573i.m23582a((Object) decorView, "window.decorView");
            decorView.setBackground(new ColorDrawable(C0683b.m2912c(context, R.color.az3)));
        } else {
            ImmersionBar.with(activity).statusBarDarkFont(false).init();
            Window window2 = getWindow();
            C7573i.m23582a((Object) window2, "window");
            View decorView2 = window2.getDecorView();
            C7573i.m23582a((Object) decorView2, "window.decorView");
            decorView2.setBackground(new ColorDrawable(C0683b.m2912c(this, R.color.a6r)));
        }
        CrossPlatformWebView crossPlatformWebView6 = this.webView;
        if (crossPlatformWebView6 == null) {
            C7573i.m23583a("webView");
        }
        ((DmtStatusView) crossPlatformWebView6.mo67462a((int) R.id.afp)).mo25766a(0);
        CrossPlatformWebView crossPlatformWebView7 = this.webView;
        if (crossPlatformWebView7 == null) {
            C7573i.m23583a("webView");
        }
        crossPlatformWebView7.mo67486c(false);
        LayoutParams layoutParams = new LayoutParams(-1, C10994a.m32204a((Context) this));
        View view = this.statusBar;
        if (view == null) {
            C7573i.m23583a("statusBar");
        }
        view.setLayoutParams(layoutParams);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo105493a(boolean z) {
        this.f112797j = z;
        String stringExtra = getIntent().getStringExtra("anchor_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (C7634n.m23717a(stringExtra, "Wiki", true)) {
            CrossPlatformWebView crossPlatformWebView = this.webView;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("webView");
            }
            crossPlatformWebView.mo67476a(z);
        }
    }

    /* renamed from: a */
    public static String m138062a(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }
}
