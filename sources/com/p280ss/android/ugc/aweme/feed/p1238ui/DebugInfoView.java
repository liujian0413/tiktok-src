package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView */
public final class DebugInfoView extends LinearLayout {

    /* renamed from: c */
    public static boolean f75590c = true;

    /* renamed from: d */
    public static final C28698a f75591d = new C28698a(null);

    /* renamed from: a */
    public ScrollView f75592a;

    /* renamed from: b */
    public Switch f75593b;

    /* renamed from: e */
    private RelativeLayout f75594e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$a */
    public static final class C28698a {
        private C28698a() {
        }

        /* renamed from: a */
        public static boolean m94448a() {
            return DebugInfoView.f75590c;
        }

        /* renamed from: a */
        public static void m94447a(boolean z) {
            DebugInfoView.f75590c = z;
        }

        public /* synthetic */ C28698a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$b */
    static final class C28699b implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ DebugInfoView f75595a;

        /* renamed from: b */
        final /* synthetic */ String f75596b;

        C28699b(DebugInfoView debugInfoView, String str) {
            this.f75595a = debugInfoView;
            this.f75596b = str;
        }

        public final boolean onLongClick(View view) {
            String str;
            Object systemService = this.f75595a.getContext().getSystemService("clipboard");
            if (systemService != null) {
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                String str2 = this.f75596b;
                if (str2 == null) {
                    str = null;
                } else if (str2 != null) {
                    str = C7634n.m23762b(str2).toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                clipboardManager.setText(str);
                C10761a.m31387a(this.f75595a.getContext(), this.f75595a.getResources().getString(R.string.ahg)).mo25750a();
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$c */
    static final class C28700c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DebugInfoView f75597a;

        C28700c(DebugInfoView debugInfoView) {
            this.f75597a = debugInfoView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DebugInfoView.m94443a(this.f75597a).setVisibility(0);
                C28698a.m94447a(true);
                DebugInfoView.m94446b(this.f75597a).setChecked(C28698a.m94448a());
                return;
            }
            DebugInfoView.m94443a(this.f75597a).setVisibility(8);
            C28698a.m94447a(false);
            DebugInfoView.m94446b(this.f75597a).setChecked(C28698a.m94448a());
        }
    }

    /* renamed from: a */
    private final void m94444a() {
        LayoutInflater.from(getContext()).inflate(R.layout.b2w, this, true);
        View findViewById = findViewById(R.id.de7);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.sv_debugInfoContainer)");
        this.f75592a = (ScrollView) findViewById;
        View findViewById2 = findViewById(R.id.det);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.switch_debugInfoView)");
        this.f75593b = (Switch) findViewById2;
        View findViewById3 = findViewById(R.id.cug);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.rl_debugInfoAll)");
        this.f75594e = (RelativeLayout) findViewById3;
        Switch switchR = this.f75593b;
        if (switchR == null) {
            C7573i.m23583a("mDebugSwitch");
        }
        switchR.setOnCheckedChangeListener(new C28700c(this));
    }

    public DebugInfoView(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    /* renamed from: a */
    public static final /* synthetic */ ScrollView m94443a(DebugInfoView debugInfoView) {
        ScrollView scrollView = debugInfoView.f75592a;
        if (scrollView == null) {
            C7573i.m23583a("mDebugInfoContainer");
        }
        return scrollView;
    }

    /* renamed from: b */
    public static final /* synthetic */ Switch m94446b(DebugInfoView debugInfoView) {
        Switch switchR = debugInfoView.f75593b;
        if (switchR == null) {
            C7573i.m23583a("mDebugSwitch");
        }
        return switchR;
    }

    /* renamed from: a */
    private void m94445a(String str) {
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setText(str);
        dmtTextView.setTextColor(getResources().getColor(R.color.l8));
        dmtTextView.setGravity(getLeft());
        dmtTextView.setTextAlignment(5);
        dmtTextView.setLineSpacing(0.0f, 1.5f);
        dmtTextView.setTextDirection(5);
        ScrollView scrollView = this.f75592a;
        if (scrollView == null) {
            C7573i.m23583a("mDebugInfoContainer");
        }
        scrollView.removeAllViews();
        ScrollView scrollView2 = this.f75592a;
        if (scrollView2 == null) {
            C7573i.m23583a("mDebugInfoContainer");
        }
        scrollView2.addView(dmtTextView);
        dmtTextView.setOnLongClickListener(new C28699b(this, str));
    }

    public final void setContent(String str) {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin() && (C7163a.m22363a() || C6319n.m19594a(C6399b.m19941q(), "lark_inhouse"))) {
            if (C6399b.m19944t()) {
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                C22903bl p = a.mo60086p();
                C7573i.m23582a((Object) p, "CommonSharePrefCache.inst().openDebugText");
                Object d = p.mo59877d();
                C7573i.m23582a(d, "CommonSharePrefCache.inst().openDebugText.cache");
                if (!((Boolean) d).booleanValue()) {
                    return;
                }
            }
            m94444a();
            RelativeLayout relativeLayout = this.f75594e;
            if (relativeLayout == null) {
                C7573i.m23583a("mDebugInfoAll");
            }
            relativeLayout.setVisibility(0);
            Switch switchR = this.f75593b;
            if (switchR == null) {
                C7573i.m23583a("mDebugSwitch");
            }
            switchR.setChecked(f75590c);
            if (f75590c) {
                ScrollView scrollView = this.f75592a;
                if (scrollView == null) {
                    C7573i.m23583a("mDebugInfoContainer");
                }
                scrollView.setVisibility(0);
            } else {
                ScrollView scrollView2 = this.f75592a;
                if (scrollView2 == null) {
                    C7573i.m23583a("mDebugInfoContainer");
                }
                scrollView2.setVisibility(8);
            }
            m94445a(str);
        }
    }

    public DebugInfoView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
    }
}
