package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard */
public final class SymphonyCard extends FrameLayout {

    /* renamed from: a */
    public boolean f66287a;

    /* renamed from: b */
    public boolean f66288b;

    /* renamed from: c */
    private HashMap f66289c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$a */
    static final class C25114a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f66290a;

        C25114a(C7561a aVar) {
            this.f66290a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66290a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$b */
    static final class C25115b implements OnClickListener {

        /* renamed from: a */
        public static final C25115b f66291a = new C25115b();

        C25115b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$c */
    static final class C25116c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f66292a;

        C25116c(SymphonyCard symphonyCard) {
            this.f66292a = symphonyCard;
        }

        public final void run() {
            this.f66292a.f66287a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$d */
    static final class C25117d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f66293a;

        C25117d(SymphonyCard symphonyCard) {
            this.f66293a = symphonyCard;
        }

        public final void run() {
            this.f66293a.f66287a = false;
            this.f66293a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$e */
    static final class C25118e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f66294a;

        C25118e(SymphonyCard symphonyCard) {
            this.f66294a = symphonyCard;
        }

        public final void run() {
            this.f66294a.setVisibility(0);
            this.f66294a.f66287a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$f */
    static final class C25119f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f66295a;

        C25119f(SymphonyCard symphonyCard) {
            this.f66295a = symphonyCard;
        }

        public final void run() {
            this.f66295a.f66287a = false;
        }
    }

    public SymphonyCard(Context context) {
        this(context, null, 0, 6, null);
    }

    public SymphonyCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m82690a(int i) {
        if (this.f66289c == null) {
            this.f66289c = new HashMap();
        }
        View view = (View) this.f66289c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66289c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo65659b() {
        setVisibility(8);
        this.f66288b = false;
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public final ViewGroup getAddOtherLayout() {
        FrameLayout frameLayout = (FrameLayout) m82690a((int) R.id.t_);
        C7573i.m23582a((Object) frameLayout, "cardOthersTagLayout");
        return frameLayout;
    }

    /* renamed from: c */
    public final void mo65660c() {
        this.f66288b = false;
        animate().alpha(0.0f).withStartAction(new C25116c(this)).setDuration(200).withEndAction(new C25117d(this)).start();
    }

    /* renamed from: a */
    public final void mo65657a() {
        this.f66288b = true;
        setTranslationY((float) C23486n.m77122a(17.0d));
        animate().alpha(1.0f).translationY(0.0f).withStartAction(new C25118e(this)).setInterpolator(new LinearInterpolator()).setDuration(280).withEndAction(new C25119f(this)).start();
    }

    public final void setShowing(boolean z) {
        this.f66288b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r4 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r4 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011b, code lost:
        if (r4 == null) goto L_0x011d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m82691a(com.bytedance.p073ad.symphony.p074a.p075a.C2087d r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0008
            java.lang.String r1 = r8.mo7764c()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0018
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r1 = 0
            goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            if (r1 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            if (r8 == 0) goto L_0x0031
            com.bytedance.ad.symphony.e.b r4 = r8.mo7751b()
            if (r4 == 0) goto L_0x0031
            org.json.JSONObject r4 = r4.f7303e
            if (r4 == 0) goto L_0x0031
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0033
        L_0x0031:
            java.lang.String r4 = ""
        L_0x0033:
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65286h(r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65268a(r3)
            java.lang.String r4 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65266a(r4)
            java.lang.String r4 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65276b(r4)
            if (r8 == 0) goto L_0x0069
            com.bytedance.ad.symphony.e.b r4 = r8.mo7751b()
            if (r4 == 0) goto L_0x0069
            java.util.concurrent.ConcurrentHashMap r4 = r4.mo7829a()
            if (r4 == 0) goto L_0x0069
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "error_message"
            java.lang.String r7 = "card_name_missing"
            r5.put(r6, r7)
            com.google.gson.e r5 = new com.google.gson.e
            r5.<init>()
            java.lang.String r4 = r5.mo15979b(r4)
            goto L_0x006a
        L_0x0069:
            r4 = r0
        L_0x006a:
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65265a(r4)
            java.lang.String r4 = "card"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65283e(r4)
            r1.mo65278b()
            r1 = 0
            goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            if (r8 == 0) goto L_0x0081
            java.lang.String r4 = r8.mo7765d()
            goto L_0x0082
        L_0x0081:
            r4 = r0
        L_0x0082:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x008f
            int r4 = r4.length()
            if (r4 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r4 = 0
            goto L_0x0090
        L_0x008f:
            r4 = 1
        L_0x0090:
            if (r4 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            if (r8 == 0) goto L_0x00a8
            com.bytedance.ad.symphony.e.b r4 = r8.mo7751b()
            if (r4 == 0) goto L_0x00a8
            org.json.JSONObject r4 = r4.f7303e
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x00aa
        L_0x00a8:
            java.lang.String r4 = ""
        L_0x00aa:
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65286h(r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65268a(r3)
            java.lang.String r4 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65266a(r4)
            java.lang.String r4 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65276b(r4)
            if (r8 == 0) goto L_0x00e0
            com.bytedance.ad.symphony.e.b r4 = r8.mo7751b()
            if (r4 == 0) goto L_0x00e0
            java.util.concurrent.ConcurrentHashMap r4 = r4.mo7829a()
            if (r4 == 0) goto L_0x00e0
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "error_message"
            java.lang.String r7 = "card_title_missing"
            r5.put(r6, r7)
            com.google.gson.e r5 = new com.google.gson.e
            r5.<init>()
            java.lang.String r4 = r5.mo15979b(r4)
            goto L_0x00e1
        L_0x00e0:
            r4 = r0
        L_0x00e1:
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65265a(r4)
            java.lang.String r4 = "card"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65283e(r4)
            r1.mo65278b()
            r1 = 0
        L_0x00ef:
            if (r8 == 0) goto L_0x00f6
            java.lang.String r4 = r8.mo7769i()
            goto L_0x00f7
        L_0x00f6:
            r4 = r0
        L_0x00f7:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0104
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r4 = 0
            goto L_0x0105
        L_0x0104:
            r4 = 1
        L_0x0105:
            if (r4 == 0) goto L_0x0162
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            if (r8 == 0) goto L_0x011d
            com.bytedance.ad.symphony.e.b r4 = r8.mo7751b()
            if (r4 == 0) goto L_0x011d
            org.json.JSONObject r4 = r4.f7303e
            if (r4 == 0) goto L_0x011d
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x011f
        L_0x011d:
            java.lang.String r4 = ""
        L_0x011f:
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65286h(r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65268a(r3)
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65266a(r3)
            java.lang.String r3 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65276b(r3)
            if (r8 == 0) goto L_0x0154
            com.bytedance.ad.symphony.e.b r8 = r8.mo7751b()
            if (r8 == 0) goto L_0x0154
            java.util.concurrent.ConcurrentHashMap r8 = r8.mo7829a()
            if (r8 == 0) goto L_0x0154
            r0 = r8
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r3 = "error_message"
            java.lang.String r4 = "card_download_button_missing"
            r0.put(r3, r4)
            com.google.gson.e r0 = new com.google.gson.e
            r0.<init>()
            java.lang.String r0 = r0.mo15979b(r8)
        L_0x0154:
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r1.mo65265a(r0)
            java.lang.String r0 = "card"
            com.ss.android.ugc.aweme.commercialize.log.f$b r8 = r8.mo65283e(r0)
            r8.mo65278b()
            r1 = 0
        L_0x0162:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.m82691a(com.bytedance.ad.symphony.a.a.d):boolean");
    }

    public SymphonyCard(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.abf, this, true);
    }

    /* renamed from: a */
    public final void mo65658a(C2087d dVar, String str, C7561a<C7581n> aVar) {
        String str2;
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        boolean z2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        C7573i.m23587b(str, "sponsor");
        C7573i.m23587b(aVar, "closeAction");
        RemoteImageView remoteImageView = (RemoteImageView) m82690a((int) R.id.t7);
        UrlModel urlModel = new UrlModel();
        boolean z3 = true;
        String[] strArr = new String[1];
        String str3 = null;
        if (dVar != null) {
            str2 = dVar.mo7767g();
        } else {
            str2 = null;
        }
        strArr[0] = str2;
        urlModel.setUrlList(C7525m.m23466c(strArr));
        C23323e.m76524b(remoteImageView, urlModel);
        if (dVar != null) {
            charSequence = dVar.mo7764c();
        } else {
            charSequence = null;
        }
        CharSequence charSequence6 = charSequence;
        if (charSequence6 == null || charSequence6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TextView textView = (TextView) m82690a((int) R.id.t8);
            C7573i.m23582a((Object) textView, "cardAdTitle");
            if (dVar != null) {
                charSequence5 = dVar.mo7764c();
            } else {
                charSequence5 = null;
            }
            textView.setText(charSequence5);
        }
        if (dVar != null) {
            charSequence2 = dVar.mo7765d();
        } else {
            charSequence2 = null;
        }
        CharSequence charSequence7 = charSequence2;
        if (charSequence7 == null || charSequence7.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            TextView textView2 = (TextView) m82690a((int) R.id.t5);
            C7573i.m23582a((Object) textView2, "cardAdDesc");
            if (dVar != null) {
                charSequence4 = dVar.mo7765d();
            } else {
                charSequence4 = null;
            }
            textView2.setText(charSequence4);
        }
        if (dVar != null) {
            charSequence3 = dVar.mo7769i();
        } else {
            charSequence3 = null;
        }
        CharSequence charSequence8 = charSequence3;
        if (!(charSequence8 == null || charSequence8.length() == 0)) {
            z3 = false;
        }
        if (!z3) {
            TextView textView3 = (TextView) m82690a((int) R.id.t6);
            C7573i.m23582a((Object) textView3, "cardAdDownload");
            if (dVar != null) {
                str3 = dVar.mo7769i();
            }
            textView3.setText(str3);
        }
        TextView textView4 = (TextView) m82690a((int) R.id.ta);
        C7573i.m23582a((Object) textView4, "cardSponsorText");
        textView4.setText(str);
        ((ImageView) m82690a((int) R.id.t9)).setOnClickListener(new C25114a(aVar));
        FrameLayout frameLayout = (FrameLayout) m82690a((int) R.id.t_);
        C7573i.m23582a((Object) frameLayout, "cardOthersTagLayout");
        if (frameLayout.getChildCount() == 0) {
            FrameLayout frameLayout2 = (FrameLayout) m82690a((int) R.id.t_);
            C7573i.m23582a((Object) frameLayout2, "cardOthersTagLayout");
            frameLayout2.setVisibility(8);
        }
        setOnClickListener(C25115b.f66291a);
    }

    public /* synthetic */ SymphonyCard(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
