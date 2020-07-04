package com.bytedance.android.livesdk.browser.fragment;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3341a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.p161c.C3382a;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment.C4001a;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment.C4004d;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment.C4005e;
import com.bytedance.android.livesdk.browser.jsbridge.C4030a;
import com.bytedance.android.livesdk.browser.jsbridge.C4037b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4175l;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

public class FullWebDialogFragment extends BaseDialogFragment implements C4001a, C4004d, C4005e, C4030a {

    /* renamed from: e */
    protected View f11875e;

    /* renamed from: f */
    private TextView f11876f;

    /* renamed from: g */
    private TextView f11877g;

    /* renamed from: h */
    private String f11878h;

    /* renamed from: i */
    private String f11879i;

    /* renamed from: j */
    private String f11880j;

    /* renamed from: k */
    private TTLiveBrowserFragment f11881k;

    /* renamed from: l */
    private long f11882l;

    /* renamed from: m */
    private long f11883m;

    /* renamed from: com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment$a */
    public static class C3998a {

        /* renamed from: a */
        private String f11884a;

        /* renamed from: b */
        private String f11885b;

        /* renamed from: c */
        private String f11886c;

        /* renamed from: d */
        private boolean f11887d;

        /* renamed from: a */
        public final BaseDialogFragment mo11595a() {
            Bundle bundle = new Bundle();
            bundle.putString("key_url", this.f11884a);
            bundle.putString("key_from_type", this.f11886c);
            bundle.putString("key_title", this.f11885b);
            bundle.putBoolean("key_with_title_bar", this.f11887d);
            FullWebDialogFragment fullWebDialogFragment = new FullWebDialogFragment();
            fullWebDialogFragment.setArguments(bundle);
            return fullWebDialogFragment;
        }

        /* renamed from: a */
        public final C3998a mo11596a(boolean z) {
            this.f11887d = false;
            return this;
        }

        /* renamed from: b */
        public final C3998a mo11597b(String str) {
            this.f11886c = str;
            return this;
        }

        private C3998a(String str) {
            this.f11884a = str;
        }

        /* renamed from: a */
        public static C3998a m14004a(String str) {
            return new C3998a(str);
        }
    }

    /* renamed from: a */
    public final void mo11589a(int i) {
    }

    /* renamed from: c */
    public final void mo11594c() {
    }

    /* renamed from: b */
    public final void mo11593b() {
        this.f11883m = System.currentTimeMillis();
    }

    /* renamed from: f */
    private TTLiveBrowserFragment m13996f() {
        TTLiveBrowserFragment tTLiveBrowserFragment = new TTLiveBrowserFragment();
        tTLiveBrowserFragment.f11914a = this.f11879i;
        tTLiveBrowserFragment.f11926e = this;
        tTLiveBrowserFragment.f11925d = this;
        return tTLiveBrowserFragment;
    }

    /* renamed from: d */
    private Bundle m13994d() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f11878h);
        bundle.putBoolean("bundle_user_webview_title", true);
        bundle.putBoolean("hide_nav_bar", true);
        return bundle;
    }

    /* renamed from: e */
    private void m13995e() {
        C8443c.m25663a().mo21607a("click_withdraw_popup", new C8438j().mo21599b("video").mo21603f("show").mo21598a(this.f11879i).mo21600c("popup").mo21604g("close"));
    }

    public void onStart() {
        Window window;
        super.onStart();
        if (getDialog() != null) {
            window = getDialog().getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
            }
        }
        C3382a.m12570a(getDialog(), getView().findViewById(R.id.ahs));
        C3341a.m12466a(getDialog().getWindow().findViewById(16908290));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11590a(View view) {
        m13995e();
        dismiss();
    }

    /* renamed from: a */
    public final void mo11591a(C4037b bVar) {
        bVar.mo11529a().mo27204a("close", (C11155d<?, ?>) new C4175l<Object,Object>((DialogFragment) this));
    }

    /* renamed from: a */
    public final void mo11592a(String str) {
        this.f11880j = str;
        if (this.f11877g != null) {
            this.f11877g.setText(str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yq);
        this.f11878h = getArguments().getString("key_url");
        this.f11879i = getArguments().getString("key_from_type", "");
        this.f11880j = getArguments().getString("key_title", "");
        if (TextUtils.isEmpty(this.f11880j)) {
            this.f11880j = C3358ac.m12515a((int) R.string.fcy);
        }
    }

    /* renamed from: a */
    public final void mo11573a(String str, JSONObject jSONObject) {
        if (this.f11881k != null) {
            this.f11881k.mo11573a(str, jSONObject);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setWindowAnimations(R.style.yq);
        this.f11882l = System.currentTimeMillis();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.alx, viewGroup, false);
        this.f11876f = (TextView) inflate.findViewById(R.id.jn);
        this.f11877g = (TextView) inflate.findViewById(R.id.title);
        this.f11875e = inflate.findViewById(R.id.djz);
        this.f11881k = m13996f();
        this.f11881k.setArguments(m13994d());
        C0633q a = getChildFragmentManager().mo2645a();
        a.mo2599b(R.id.p4, this.f11881k);
        a.mo2606d();
        this.f11881k.f11924c = this;
        this.f11876f.setOnClickListener(new C4006a(this));
        this.f11877g.setText(this.f11880j);
        if (!getArguments().getBoolean("key_with_title_bar", true)) {
            this.f11875e.setVisibility(8);
        }
        return inflate;
    }
}
