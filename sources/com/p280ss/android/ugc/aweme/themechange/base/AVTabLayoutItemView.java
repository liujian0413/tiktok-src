package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVTabLayoutItemView */
public final class AVTabLayoutItemView extends FrameLayout {

    /* renamed from: a */
    private AVDmtTextView f109605a;

    /* renamed from: b */
    private int f109606b;

    /* renamed from: c */
    private int f109607c;

    /* renamed from: a */
    private final void m134037a(int i) {
        AVDmtTextView aVDmtTextView = this.f109605a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView.setTextColor(i);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = this.f109606b;
        } else {
            i = this.f109607c;
        }
        m134037a(i);
        m134039a(z);
    }

    public final void setText(int i) {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        setText(context.getResources().getString(i));
    }

    /* renamed from: a */
    private void m134039a(boolean z) {
        if (!C6399b.m19944t()) {
            if (z) {
                AVDmtTextView aVDmtTextView = this.f109605a;
                if (aVDmtTextView == null) {
                    C7573i.m23583a("textView");
                }
                aVDmtTextView.mo103533b();
                AVDmtTextView aVDmtTextView2 = this.f109605a;
                if (aVDmtTextView2 == null) {
                    C7573i.m23583a("textView");
                }
                aVDmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
                return;
            }
            AVDmtTextView aVDmtTextView3 = this.f109605a;
            if (aVDmtTextView3 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f109605a;
            if (aVDmtTextView == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView.setVisibility(0);
            AVDmtTextView aVDmtTextView2 = this.f109605a;
            if (aVDmtTextView2 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView2.setText(charSequence);
        }
    }

    /* renamed from: a */
    private final void m134038a(Context context) {
        View findViewById = LayoutInflater.from(context).inflate(R.layout.td, this, true).findViewById(R.id.dfm);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.tab_item_text)");
        this.f109605a = (AVDmtTextView) findViewById;
        AVDmtTextView aVDmtTextView = this.f109605a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (C6399b.m19944t()) {
            AVDmtTextView aVDmtTextView2 = this.f109605a;
            if (aVDmtTextView2 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView2.mo103533b();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f109605a;
            if (aVDmtTextView3 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f109605a;
        if (aVDmtTextView4 == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView4.setSingleLine();
        AVDmtTextView aVDmtTextView5 = this.f109605a;
        if (aVDmtTextView5 == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView5.setEllipsize(TruncateAt.END);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    public AVTabLayoutItemView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109606b = -1;
        this.f109607c = -1;
        m134038a(context);
        this.f109606b = C42111b.f109618a.mo103541a(false);
        this.f109607c = C42111b.m134049a(this.f109606b);
    }

    public /* synthetic */ AVTabLayoutItemView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
