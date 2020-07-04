package com.bytedance.polaris.browser;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.p636a.C12406i;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12366q;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

public class WebTabTaskFragment extends PolarisBrowserFragment {

    /* renamed from: m */
    private C12406i f32896m;

    /* renamed from: n */
    private View f32897n;

    /* renamed from: o */
    private View f32898o;

    /* renamed from: p */
    private TextView f32899p;

    /* renamed from: q */
    private TextView f32900q;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo30232d() {
        return R.layout.agh;
    }

    public WebTabTaskFragment() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_user_webview_title", false);
        bundle.putBoolean("show_toolbar", true);
        bundle.putString("bundle_url", mo30245g());
        setArguments(bundle);
    }

    /* renamed from: g */
    public final String mo30245g() {
        String str;
        Builder buildUpon = Uri.parse(C12366q.m35914a(9, null, true)).buildUpon();
        String str2 = "full_screen";
        if (C12428i.m36162l()) {
            str = "1";
        } else {
            str = "0";
        }
        return buildUpon.appendQueryParameter(str2, str).appendQueryParameter("is_tab", "1").build().toString();
    }

    public void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        this.f32897n = this.f32898o.findViewById(R.id.chx);
        this.f32900q = (TextView) this.f32898o.findViewById(R.id.title);
        this.f32899p = (TextView) this.f32898o.findViewById(R.id.dkj);
        View view = this.f32897n;
        if (C12428i.m36162l()) {
            i = 0;
        } else {
            i = 8;
        }
        C9738o.m28712b(view, i);
        this.f32900q.setText(R.string.d2y);
        this.f32899p.setText(R.string.d2u);
        this.f32899p.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C12428i.m36155e();
                WebTabTaskFragment.this.getActivity();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f32898o = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || this.f32870d == null)) {
            this.f32870d.postDelayed(new Runnable() {
                public final void run() {
                    WebTabTaskFragment.this.mo30229a(WebTabTaskFragment.this.mo30245g());
                }
            }, 200);
        }
        this.f32896m = new C12406i(new WeakReference(getActivity()), this.f32871e);
        this.f32871e.f32958b.mo30264a("internal_visible", (C12408b) this.f32896m);
        this.f32871e.f32958b.f32920a = true;
        return this.f32898o;
    }
}
