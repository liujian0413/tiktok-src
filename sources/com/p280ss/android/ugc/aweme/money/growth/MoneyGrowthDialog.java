package com.p280ss.android.ugc.aweme.money.growth;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.p280ss.android.ugc.aweme.views.C43374j;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog */
public final class MoneyGrowthDialog extends C43374j {

    /* renamed from: c */
    public static boolean f87753c = true;

    /* renamed from: d */
    public static MoneyGrowthDialog f87754d = null;

    /* renamed from: e */
    public static final String f87755e = f87755e;

    /* renamed from: f */
    public static boolean f87756f;

    /* renamed from: g */
    public static final C33628a f87757g = new C33628a(null);

    /* renamed from: a */
    public boolean f87758a = true;

    /* renamed from: b */
    public boolean f87759b;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$FeedChannelPopupImageStyle */
    public enum FeedChannelPopupImageStyle {
        SMALL(1),
        BANNER(2);
        
        private final int style;

        public final int getStyle() {
            return this.style;
        }

        private FeedChannelPopupImageStyle(int i) {
            this.style = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$a */
    public static final class C33628a {

        /* renamed from: com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$a$a */
        static final class C33629a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f87766a;

            /* renamed from: b */
            final /* synthetic */ UgChannelPopup f87767b;

            C33629a(Context context, UgChannelPopup ugChannelPopup) {
                this.f87766a = context;
                this.f87767b = ugChannelPopup;
            }

            public final void run() {
                MoneyGrowthDialog.f87757g.mo86006a(this.f87766a, this.f87767b);
            }
        }

        private C33628a() {
        }

        /* renamed from: c */
        private static boolean m108525c() {
            return MoneyGrowthDialog.f87756f;
        }

        /* renamed from: a */
        private static boolean m108521a() {
            return MoneyGrowthDialog.f87753c;
        }

        /* renamed from: b */
        private static MoneyGrowthDialog m108522b() {
            MoneyGrowthDialog moneyGrowthDialog = MoneyGrowthDialog.f87754d;
            if (moneyGrowthDialog == null) {
                C7573i.m23583a("dialog");
            }
            return moneyGrowthDialog;
        }

        /* renamed from: a */
        private static void m108520a(boolean z) {
            MoneyGrowthDialog.f87753c = false;
        }

        /* renamed from: b */
        private static void m108524b(boolean z) {
            MoneyGrowthDialog.f87756f = true;
        }

        public /* synthetic */ C33628a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m108519a(MoneyGrowthDialog moneyGrowthDialog) {
            C7573i.m23587b(moneyGrowthDialog, "<set-?>");
            MoneyGrowthDialog.f87754d = moneyGrowthDialog;
        }

        /* renamed from: a */
        public final void mo86005a(Context context) {
            C7573i.m23587b(context, "context");
            if (m108521a()) {
                m108520a(false);
                return;
            }
            UgChannelPopup c = C33634a.m108554b().mo86019c();
            if (c != null) {
                m108523b(context, c);
            }
        }

        /* renamed from: b */
        private final void m108523b(Context context, UgChannelPopup ugChannelPopup) {
            if (!C7573i.m23585a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
                new Handler(Looper.getMainLooper()).post(new C33629a(context, ugChannelPopup));
            } else {
                mo86006a(context, ugChannelPopup);
            }
        }

        /* renamed from: a */
        public final void mo86006a(Context context, UgChannelPopup ugChannelPopup) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(ugChannelPopup, "popupInfo");
            if (!m108525c()) {
                m108524b(true);
                try {
                    m108519a(new MoneyGrowthDialog(context, ugChannelPopup));
                } catch (Exception unused) {
                }
                m108522b().show();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|4|5|(1:7)|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[Catch:{ NullValueException -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void show() {
        /*
            r4 = this;
            boolean r0 = r4.f87758a
            if (r0 == 0) goto L_0x002b
            super.show()     // Catch:{ Exception -> 0x0007 }
        L_0x0007:
            boolean r0 = r4.f87759b     // Catch:{ NullValueException -> 0x002a }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "toast_show"
            com.ss.android.ugc.aweme.app.g.d r1 = new com.ss.android.ugc.aweme.app.g.d     // Catch:{ NullValueException -> 0x002a }
            r1.<init>()     // Catch:{ NullValueException -> 0x002a }
            java.lang.String r2 = "toast_type"
            java.lang.String r3 = "coupon_fission"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)     // Catch:{ NullValueException -> 0x002a }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a     // Catch:{ NullValueException -> 0x002a }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)     // Catch:{ NullValueException -> 0x002a }
        L_0x001f:
            com.ss.android.ugc.aweme.money.growth.c r0 = com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a.m108554b()
            com.ss.android.ugc.aweme.money.growth.b r0 = r0.f87780c
            r1 = 2
            r0.mo86011a(r1)
            goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.MoneyGrowthDialog.show():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ec */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0 A[Catch:{ NullValueException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd A[Catch:{ NullValueException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f A[Catch:{ NullValueException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d A[Catch:{ NullValueException -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e A[Catch:{ NullValueException -> 0x0131 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MoneyGrowthDialog(android.content.Context r5, com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "popupInfo"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            r0 = 1
            r1 = 0
            r2 = 2131886877(0x7f12031d, float:1.9408345E38)
            r4.<init>(r5, r2, r1, r0)
            r4.f87758a = r0
            java.lang.Integer r5 = r6.getImageStyle()     // Catch:{ NullValueException -> 0x002a }
            com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$FeedChannelPopupImageStyle r2 = com.p280ss.android.ugc.aweme.money.growth.MoneyGrowthDialog.FeedChannelPopupImageStyle.BANNER     // Catch:{ NullValueException -> 0x002a }
            int r2 = r2.getStyle()     // Catch:{ NullValueException -> 0x002a }
            if (r5 != 0) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r5 = r5.intValue()     // Catch:{ NullValueException -> 0x002a }
            if (r5 != r2) goto L_0x002c
            r4.f87759b = r0     // Catch:{ NullValueException -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r4.f87759b = r1
        L_0x002c:
            boolean r5 = r4.f87759b
            if (r5 == 0) goto L_0x0037
            r5 = 2131493262(0x7f0c018e, float:1.861E38)
            r4.setContentView(r5)
            goto L_0x003d
        L_0x0037:
            r5 = 2131493290(0x7f0c01aa, float:1.8610056E38)
            r4.setContentView(r5)
        L_0x003d:
            r4.setCancelable(r1)
            r4.setCanceledOnTouchOutside(r1)
            com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$1 r5 = com.p280ss.android.ugc.aweme.money.growth.MoneyGrowthDialog.C336241.f87760a
            android.content.DialogInterface$OnKeyListener r5 = (android.content.DialogInterface.OnKeyListener) r5
            r4.setOnKeyListener(r5)
            r5 = 2131297144(0x7f090378, float:1.8212225E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$2 r0 = new com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$2
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ NullValueException -> 0x0099 }
            r0 = 24
            r2 = 2131302124(0x7f0916ec, float:1.8222325E38)
            if (r5 < r0) goto L_0x0081
            android.view.View r5 = r4.findViewById(r2)     // Catch:{ NullValueException -> 0x0099 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5     // Catch:{ NullValueException -> 0x0099 }
            java.lang.String r0 = "titleTv"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)     // Catch:{ NullValueException -> 0x0099 }
            java.lang.String r0 = r6.getTitle()     // Catch:{ NullValueException -> 0x0099 }
            r2 = 63
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r2)     // Catch:{ NullValueException -> 0x0099 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x0099 }
            r5.setText(r0)     // Catch:{ NullValueException -> 0x0099 }
            goto L_0x0099
        L_0x0081:
            android.view.View r5 = r4.findViewById(r2)     // Catch:{ NullValueException -> 0x0099 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5     // Catch:{ NullValueException -> 0x0099 }
            java.lang.String r0 = "titleTv"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)     // Catch:{ NullValueException -> 0x0099 }
            java.lang.String r0 = r6.getTitle()     // Catch:{ NullValueException -> 0x0099 }
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch:{ NullValueException -> 0x0099 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x0099 }
            r5.setText(r0)     // Catch:{ NullValueException -> 0x0099 }
        L_0x0099:
            r5 = 2131297313(0x7f090421, float:1.8212567E38)
            android.view.View r5 = r4.findViewById(r5)     // Catch:{ NullValueException -> 0x00b0 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5     // Catch:{ NullValueException -> 0x00b0 }
            java.lang.String r0 = "contentTv"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)     // Catch:{ NullValueException -> 0x00b0 }
            java.lang.String r0 = r6.getContent()     // Catch:{ NullValueException -> 0x00b0 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullValueException -> 0x00b0 }
            r5.setText(r0)     // Catch:{ NullValueException -> 0x00b0 }
        L_0x00b0:
            r5 = 2131296955(0x7f0902bb, float:1.8211841E38)
            android.view.View r0 = r4.findViewById(r5)     // Catch:{ NullValueException -> 0x00c7 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0     // Catch:{ NullValueException -> 0x00c7 }
            java.lang.String r2 = "button"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)     // Catch:{ NullValueException -> 0x00c7 }
            java.lang.String r2 = r6.getButtonText()     // Catch:{ NullValueException -> 0x00c7 }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ NullValueException -> 0x00c7 }
            r0.setText(r2)     // Catch:{ NullValueException -> 0x00c7 }
        L_0x00c7:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = new com.ss.android.ugc.aweme.base.model.UrlModel     // Catch:{ NullValueException -> 0x0131 }
            r0.<init>()     // Catch:{ NullValueException -> 0x0131 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r2 = r6.getResourceUrl()     // Catch:{ NullValueException -> 0x00ec }
            java.lang.String r3 = "popupInfo.resourceUrl"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ NullValueException -> 0x00ec }
            java.util.List r2 = r2.getUrlList()     // Catch:{ NullValueException -> 0x00ec }
            r0.setUrlList(r2)     // Catch:{ NullValueException -> 0x00ec }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r6 = r6.getResourceUrl()     // Catch:{ NullValueException -> 0x00ec }
            java.lang.String r2 = "popupInfo.resourceUrl"
            kotlin.jvm.internal.C7573i.m23582a(r6, r2)     // Catch:{ NullValueException -> 0x00ec }
            java.lang.String r6 = r6.getUri()     // Catch:{ NullValueException -> 0x00ec }
            r0.setUri(r6)     // Catch:{ NullValueException -> 0x00ec }
        L_0x00ec:
            boolean r6 = r4.f87759b     // Catch:{ NullValueException -> 0x0131 }
            if (r6 == 0) goto L_0x00fd
            r6 = 2131298513(0x7f0908d1, float:1.8215001E38)
            android.view.View r6 = r4.findViewById(r6)     // Catch:{ NullValueException -> 0x0131 }
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r6     // Catch:{ NullValueException -> 0x0131 }
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r6, r0)     // Catch:{ NullValueException -> 0x0131 }
            goto L_0x0107
        L_0x00fd:
            com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$3 r6 = new com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$3     // Catch:{ NullValueException -> 0x0131 }
            r6.<init>(r4, r0)     // Catch:{ NullValueException -> 0x0131 }
            com.ss.android.ugc.aweme.base.d.a.b r6 = (com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b) r6     // Catch:{ NullValueException -> 0x0131 }
            com.p280ss.android.ugc.aweme.base.C23323e.m76501a(r0, r1, r1, r6)     // Catch:{ NullValueException -> 0x0131 }
        L_0x0107:
            com.ss.android.ugc.aweme.money.growth.c r6 = com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a.m108554b()     // Catch:{ NullValueException -> 0x0131 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r6 = r6.f87778a     // Catch:{ NullValueException -> 0x0131 }
            if (r6 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r6 = r6.getChannelPopup()     // Catch:{ NullValueException -> 0x0131 }
            if (r6 == 0) goto L_0x011a
            java.lang.String r6 = r6.getH5Link()     // Catch:{ NullValueException -> 0x0131 }
            goto L_0x011b
        L_0x011a:
            r6 = 0
        L_0x011b:
            if (r6 == 0) goto L_0x012e
            android.view.View r5 = r4.findViewById(r5)     // Catch:{ NullValueException -> 0x0131 }
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r5     // Catch:{ NullValueException -> 0x0131 }
            com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$4 r0 = new com.ss.android.ugc.aweme.money.growth.MoneyGrowthDialog$4     // Catch:{ NullValueException -> 0x0131 }
            r0.<init>(r4, r6)     // Catch:{ NullValueException -> 0x0131 }
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0     // Catch:{ NullValueException -> 0x0131 }
            r5.setOnClickListener(r0)     // Catch:{ NullValueException -> 0x0131 }
            return
        L_0x012e:
            r4.f87758a = r1     // Catch:{ NullValueException -> 0x0131 }
            return
        L_0x0131:
            r4.f87758a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.MoneyGrowthDialog.<init>(android.content.Context, com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup):void");
    }
}
