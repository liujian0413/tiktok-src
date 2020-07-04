package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.qrcode.C37067d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchScanView */
public class SearchScanView extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    public boolean f71240a;

    /* renamed from: b */
    private TextView f71241b;

    /* renamed from: c */
    private ImageView f71242c;

    /* renamed from: d */
    private C26984a f71243d;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchScanView$a */
    public interface C26984a {
        /* renamed from: a */
        void mo67879a(View view);

        /* renamed from: b */
        void mo67880b(View view);
    }

    /* renamed from: b */
    public final void mo69772b() {
        this.f71242c.setVisibility(8);
        this.f71241b.setVisibility(0);
        this.f71240a = false;
    }

    /* renamed from: a */
    public final void mo69771a() {
        if (!C37067d.m119194a().mo93525b().booleanValue()) {
            this.f71242c.setVisibility(0);
            this.f71241b.setVisibility(8);
            this.f71240a = true;
        }
    }

    public void setOnInternalClickListener(C26984a aVar) {
        this.f71243d = aVar;
    }

    public SearchScanView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m88710a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.b4a, this, true);
        this.f71241b = (TextView) inflate.findViewById(R.id.e19);
        this.f71242c = (ImageView) inflate.findViewById(R.id.cyh);
        if (C6399b.m19944t()) {
            C34626j.m111876a(this.f71242c);
        }
        this.f71242c.setOnClickListener(this);
        this.f71241b.setOnClickListener(this);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f71243d != null) {
            int id = view.getId();
            if (id == R.id.e19) {
                this.f71243d.mo67879a(view);
                return;
            }
            if (id == R.id.cyh) {
                this.f71243d.mo67880b(view);
            }
        }
    }

    public SearchScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m88710a(context);
    }
}
