package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p280ss.android.ugc.aweme.utils.C42915ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bb */
public final class C27031bb {

    /* renamed from: a */
    Context f71329a;

    /* renamed from: b */
    ViewGroup f71330b;

    /* renamed from: c */
    public C42915ac f71331c;

    /* renamed from: d */
    private final View f71332d;

    /* renamed from: e */
    private final TextView f71333e;

    /* renamed from: f */
    private final View f71334f;

    /* renamed from: g */
    private TextView f71335g;

    /* renamed from: a */
    public final void mo69803a() {
        this.f71330b.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo69804a(final SearchPreventSuicide searchPreventSuicide) {
        this.f71330b.setVisibility(0);
        if (TextUtils.isEmpty(searchPreventSuicide.phone)) {
            this.f71332d.setVisibility(8);
        }
        this.f71333e.setText(searchPreventSuicide.phone);
        if (!TextUtils.isEmpty(searchPreventSuicide.agent)) {
            this.f71335g.setText(searchPreventSuicide.agent);
        }
        this.f71332d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                new C10741a(C27031bb.this.f71329a).mo25660b(searchPreventSuicide.phone).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.vr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                            C27031bb.this.f71331c = new C42915ac(C27031bb.this.f71329a, searchPreventSuicide.phone, C27031bb.this.f71329a.getString(R.string.vs));
                            C27031bb.this.f71331c.mo104636a();
                        }
                    }
                }).mo25656a().mo25637a();
            }
        });
        this.f71334f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                Intent intent = new Intent(C27031bb.this.f71329a, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_status_bar", true);
                if (!C6399b.m19944t()) {
                    intent.putExtra("hide_nav_bar", true);
                    intent.putExtra("title", C27031bb.this.f71329a.getString(R.string.d3t));
                } else {
                    bundle.putBoolean("use_webview_title", true);
                    intent.putExtra("title", " ");
                }
                intent.putExtras(bundle);
                intent.setData(Uri.parse(searchPreventSuicide.url));
                C27031bb.this.f71329a.startActivity(intent);
            }
        });
    }

    public C27031bb(Context context, ViewGroup viewGroup) {
        this.f71329a = context;
        this.f71330b = viewGroup;
        this.f71332d = viewGroup.findViewById(R.id.ciz);
        this.f71333e = (TextView) viewGroup.findViewById(R.id.cj0);
        this.f71334f = viewGroup.findViewById(R.id.cj1);
        this.f71335g = (TextView) viewGroup.findViewById(R.id.dtb);
    }
}
