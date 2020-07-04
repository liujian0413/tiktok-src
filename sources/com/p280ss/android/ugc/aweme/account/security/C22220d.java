package com.p280ss.android.ugc.aweme.account.security;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.p022v4.widget.C1056n;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.security.SafeInfoNoticeApi.C22216a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.security.d */
public final class C22220d extends PopupWindow {

    /* renamed from: h */
    public static final C22221a f59328h = new C22221a(null);

    /* renamed from: a */
    public LinearLayout f59329a;

    /* renamed from: b */
    public DmtTextView f59330b;

    /* renamed from: c */
    public int f59331c;

    /* renamed from: d */
    public String f59332d;

    /* renamed from: e */
    public List<C22218b> f59333e;

    /* renamed from: f */
    public final Context f59334f;

    /* renamed from: g */
    public final View f59335g;

    /* renamed from: i */
    private AutoRTLImageView f59336i;

    /* renamed from: j */
    private String f59337j;

    /* renamed from: k */
    private String f59338k;

    /* renamed from: l */
    private SpannableStringBuilder f59339l;

    /* renamed from: m */
    private Boolean f59340m;

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$a */
    public static final class C22221a {
        private C22221a() {
        }

        /* renamed from: a */
        public final boolean mo58600a() {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                if (!f2.isChildrenMode() && Keva.getRepo("account_security_keva_name").getBoolean(m73699a("safe_info_need_show_"), false)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ C22221a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m73699a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            sb.append(f.getCurUserId());
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$b */
    static final class C22222b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22220d f59341a;

        C22222b(C22220d dVar) {
            this.f59341a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59341a.mo58598a(this.f59341a.f59332d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$c */
    static final class C22223c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22220d f59342a;

        C22223c(C22220d dVar) {
            this.f59342a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59342a.mo58598a(this.f59342a.f59332d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$d */
    static final class C22224d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22220d f59343a;

        C22224d(C22220d dVar) {
            this.f59343a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22220d dVar = this.f59343a;
            List<C22218b> list = this.f59343a.f59333e;
            if (list == null) {
                C7573i.m23580a();
            }
            dVar.mo58598a(((C22218b) list.get(0)).f59326b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$e */
    static final class C22225e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22220d f59344a;

        C22225e(C22220d dVar) {
            this.f59344a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Keva.getRepo("account_security_keva_name").storeBoolean(C22221a.m73699a("safe_info_need_show_"), false);
            this.f59344a.mo58599b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$f */
    public static final class C22226f implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C22220d f59345a;

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f59345a.f59330b.getViewTreeObserver();
            C7573i.m23582a((Object) viewTreeObserver, "contentTV.viewTreeObserver");
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            if (this.f59345a.f59330b.getLineCount() > 3) {
                LayoutParams layoutParams = this.f59345a.f59329a.getLayoutParams();
                layoutParams.height = (int) C9738o.m28708b(this.f59345a.f59334f, 84.0f);
                this.f59345a.f59329a.setLayoutParams(layoutParams);
                this.f59345a.f59330b.getLayoutParams().height = (int) C9738o.m28708b(this.f59345a.f59334f, 68.0f);
                C1056n.m4568a((TextView) this.f59345a.f59330b, 2, 13, 1, 2);
                this.f59345a.getContentView().measure(0, 0);
                this.f59345a.f59331c = 0;
                this.f59345a.mo58599b();
                this.f59345a.mo58597a();
            }
        }

        C22226f(C22220d dVar) {
            this.f59345a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$g */
    public static final class C22227g extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C22220d f59346a;

        /* renamed from: b */
        final /* synthetic */ C22218b f59347b;

        public final void onClick(View view) {
            C7573i.m23587b(view, "textView");
            this.f59346a.mo58598a(this.f59347b.f59326b);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        C22227g(C22220d dVar, C22218b bVar) {
            this.f59346a = dVar;
            this.f59347b = bVar;
        }
    }

    /* renamed from: b */
    public final void mo58599b() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final void m73695e() {
        if (this.f59338k != null) {
            SafeInfoNoticeApi a = C22216a.m73692a();
            String str = this.f59338k;
            if (str == null) {
                C7573i.m23580a();
            }
            a.safeInfoConfirm(str, "user_safe_info").mo19128a();
            Keva.getRepo("account_security_keva_name").storeBoolean(C22221a.m73699a("safe_info_need_show_"), false);
            mo58599b();
        }
    }

    /* renamed from: a */
    public final void mo58597a() {
        if (!isShowing()) {
            if (this.f59331c == 0) {
                int[] iArr = new int[2];
                this.f59335g.getLocationOnScreen(iArr);
                getContentView().measure(0, 0);
                int i = iArr[1];
                View contentView = getContentView();
                C7573i.m23582a((Object) contentView, "contentView");
                this.f59331c = i - contentView.getMeasuredHeight();
            }
            showAtLocation(this.f59335g, 0, 0, this.f59331c);
        }
    }

    /* renamed from: c */
    private final void m73693c() {
        C22217a aVar = (C22217a) new C6600e().mo15974a(Keva.getRepo("account_security_keva_name").getString(C22221a.m73699a("safe_info_"), ""), C22217a.class);
        if (aVar != null) {
            this.f59337j = aVar.f59323f;
            this.f59338k = aVar.f59318a;
            this.f59339l = new SpannableStringBuilder(aVar.f59319b);
            this.f59332d = aVar.f59324g;
            this.f59333e = aVar.f59320c;
            this.f59340m = Boolean.valueOf(aVar.f59321d);
        }
    }

    /* renamed from: d */
    private final void m73694d() {
        if (this.f59339l != null) {
            if (TextUtils.equals(this.f59337j, "can_not_cancel")) {
                this.f59330b.setText(this.f59339l);
                this.f59330b.setOnClickListener(new C22222b(this));
                this.f59336i.setImageResource(R.drawable.adl);
                this.f59336i.setOnClickListener(new C22223c(this));
            } else if (this.f59333e != null) {
                List<C22218b> list = this.f59333e;
                if (list == null) {
                    C7573i.m23580a();
                }
                if (!list.isEmpty()) {
                    List<C22218b> list2 = this.f59333e;
                    if (list2 == null) {
                        C7573i.m23580a();
                    }
                    for (C22218b bVar : list2) {
                        String str = bVar.f59325a;
                        if (str != null) {
                            int b = C7634n.m23760b((CharSequence) String.valueOf(this.f59339l), str, 0, false, 6, (Object) null);
                            if (b != -1) {
                                SpannableStringBuilder spannableStringBuilder = this.f59339l;
                                if (spannableStringBuilder == null) {
                                    C7573i.m23580a();
                                }
                                if (b < spannableStringBuilder.length()) {
                                    int length = str.length() + b;
                                    SpannableStringBuilder spannableStringBuilder2 = this.f59339l;
                                    if (spannableStringBuilder2 == null) {
                                        C7573i.m23580a();
                                    }
                                    if (length <= spannableStringBuilder2.length()) {
                                        List<C22218b> list3 = this.f59333e;
                                        if (list3 == null) {
                                            C7573i.m23580a();
                                        }
                                        if (list3.size() != 1) {
                                            C22227g gVar = new C22227g(this, bVar);
                                            SpannableStringBuilder spannableStringBuilder3 = this.f59339l;
                                            if (spannableStringBuilder3 == null) {
                                                C7573i.m23580a();
                                            }
                                            spannableStringBuilder3.setSpan(gVar, b, str.length() + b, 33);
                                        }
                                        SpannableStringBuilder spannableStringBuilder4 = this.f59339l;
                                        if (spannableStringBuilder4 == null) {
                                            C7573i.m23580a();
                                        }
                                        spannableStringBuilder4.setSpan(new ForegroundColorSpan(this.f59334f.getResources().getColor(R.color.w)), b, str.length() + b, 33);
                                        SpannableStringBuilder spannableStringBuilder5 = this.f59339l;
                                        if (spannableStringBuilder5 == null) {
                                            C7573i.m23580a();
                                        }
                                        spannableStringBuilder5.setSpan(new StyleSpan(1), b, str.length() + b, 33);
                                    }
                                }
                            }
                        }
                    }
                    this.f59330b.setText(this.f59339l);
                    this.f59330b.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f59330b.setHighlightColor(this.f59334f.getResources().getColor(17170445));
                    List<C22218b> list4 = this.f59333e;
                    if (list4 == null) {
                        C7573i.m23580a();
                    }
                    if (list4.size() == 1) {
                        this.f59330b.setOnClickListener(new C22224d(this));
                    }
                    this.f59336i.setImageResource(R.drawable.adm);
                    this.f59336i.setOnClickListener(new C22225e(this));
                }
            }
            this.f59330b.getViewTreeObserver().addOnGlobalLayoutListener(new C22226f(this));
        }
    }

    /* renamed from: a */
    public final void mo58598a(String str) {
        m73695e();
        Activity g = C6405d.m19984g();
        if (g != null && str != null) {
            Context context = g;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&notice_id=");
            sb.append(this.f59338k);
            Intent a = C25833b.m84946a(context, sb.toString());
            C7573i.m23582a((Object) a, "CrossPlatformUtil\n      …eme&notice_id=$noticeId\")");
            a.setClass(context, CrossPlatformActivity.class);
            a.putExtra("hide_nav_bar", true);
            g.startActivity(a);
        }
    }

    public C22220d(Context context, View view) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "anchorView");
        super(context);
        this.f59334f = context;
        this.f59335g = view;
        setContentView(LayoutInflater.from(this.f59334f).inflate(R.layout.agt, null));
        View findViewById = getContentView().findViewById(R.id.bin);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.layout_notice)");
        this.f59329a = (LinearLayout) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.dyr);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.tv_notice_content)");
        this.f59330b = (DmtTextView) findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.bao);
        C7573i.m23582a((Object) findViewById3, "contentView.findViewById(R.id.iv_notice_handle)");
        this.f59336i = (AutoRTLImageView) findViewById3;
        m73693c();
        m73694d();
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
    }
}
