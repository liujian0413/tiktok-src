package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i */
public final class C40796i extends RelativeLayout {

    /* renamed from: a */
    private DmtTextView f106091a;

    /* renamed from: b */
    private DmtTextView f106092b;

    /* renamed from: a */
    private void m130375a(boolean z) {
        View view;
        DmtTextView dmtTextView;
        if (z) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.b51, this, false);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.b53, this, false);
        }
        DmtTextView dmtTextView2 = null;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.dsr);
        } else {
            dmtTextView = null;
        }
        this.f106091a = dmtTextView;
        if (view != null) {
            dmtTextView2 = (DmtTextView) view.findViewById(R.id.dz2);
        }
        this.f106092b = dmtTextView2;
        addView(view);
    }

    public final void setSelect(boolean z) {
        if (z) {
            DmtTextView dmtTextView = this.f106091a;
            if (dmtTextView != null) {
                dmtTextView.setTextColor(getResources().getColor(R.color.ac));
            }
            DmtTextView dmtTextView2 = this.f106092b;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextColor(getResources().getColor(R.color.ac));
            }
        } else {
            DmtTextView dmtTextView3 = this.f106091a;
            if (dmtTextView3 != null) {
                dmtTextView3.setTextColor(getResources().getColor(R.color.ae));
            }
            DmtTextView dmtTextView4 = this.f106092b;
            if (dmtTextView4 != null) {
                dmtTextView4.setTextColor(getResources().getColor(R.color.ae));
            }
        }
    }

    public C40796i(Context context, boolean z) {
        super(context);
        m130375a(z);
    }

    /* renamed from: a */
    public final void mo101061a(String str, long j) {
        C7573i.m23587b(str, "option");
        DmtTextView dmtTextView = this.f106092b;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f106091a;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(C30537o.m99738a(j));
        }
    }
}
