package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout */
public final class AVDmtHorizontalImageTextLayout extends LinearLayout {

    /* renamed from: a */
    private AVDmtTextView f109529a;

    /* renamed from: b */
    private AVDmtImageView f109530b;

    /* renamed from: c */
    private String f109531c;

    /* renamed from: d */
    private Drawable f109532d;

    /* renamed from: e */
    private int f109533e;

    /* renamed from: f */
    private boolean f109534f;

    /* renamed from: g */
    private boolean f109535g;

    /* renamed from: h */
    private boolean f109536h;

    public AVDmtHorizontalImageTextLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo103489a() {
        AVDmtTextView aVDmtTextView = this.f109529a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView.mo103533b();
    }

    /* renamed from: b */
    private final void m133986b() {
        setPadding(this.f109533e, this.f109533e, this.f109533e, this.f109533e);
        setGravity(17);
        AVDmtTextView aVDmtTextView = this.f109529a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView.setTextSize(13.0f);
        AVDmtTextView aVDmtTextView2 = this.f109529a;
        if (aVDmtTextView2 == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView2.setMaxLines(1);
        AVDmtTextView aVDmtTextView3 = this.f109529a;
        if (aVDmtTextView3 == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView3.setEllipsize(TruncateAt.END);
        AVDmtTextView aVDmtTextView4 = this.f109529a;
        if (aVDmtTextView4 == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView4.setVisibility(8);
        if (!TextUtils.isEmpty(this.f109531c)) {
            AVDmtTextView aVDmtTextView5 = this.f109529a;
            if (aVDmtTextView5 == null) {
                C7573i.m23583a("avDmtTextView");
            }
            aVDmtTextView5.setText(this.f109531c);
        }
        AVDmtImageView aVDmtImageView = this.f109530b;
        if (aVDmtImageView == null) {
            C7573i.m23583a("avDmtImageView");
        }
        aVDmtImageView.setSelected(this.f109534f);
        if (this.f109532d != null) {
            AVDmtImageView aVDmtImageView2 = this.f109530b;
            if (aVDmtImageView2 == null) {
                C7573i.m23583a("avDmtImageView");
            }
            aVDmtImageView2.setImageDrawable(this.f109532d);
        }
        if (this.f109536h) {
            AVDmtTextView aVDmtTextView6 = this.f109529a;
            if (aVDmtTextView6 == null) {
                C7573i.m23583a("avDmtTextView");
            }
            aVDmtTextView6.setVisibility(0);
        }
    }

    public final void setTextSize(int i) {
        AVDmtTextView aVDmtTextView = this.f109529a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView.setTextSize((float) i);
    }

    public final void setImageRes(int i) {
        AVDmtImageView aVDmtImageView = this.f109530b;
        if (aVDmtImageView == null) {
            C7573i.m23583a("avDmtImageView");
        }
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        aVDmtImageView.setImageDrawable(context.getResources().getDrawable(i));
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f109529a;
            if (aVDmtTextView == null) {
                C7573i.m23583a("avDmtTextView");
            }
            aVDmtTextView.setText(charSequence);
        }
    }

    /* renamed from: a */
    private final void m133984a(Context context) {
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context, null, 0, 6, null);
        this.f109529a = aVDmtTextView;
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) C9738o.m28708b(context, 8.0f);
        layoutParams.gravity = 16;
        AVDmtTextView aVDmtTextView2 = this.f109529a;
        if (aVDmtTextView2 == null) {
            C7573i.m23583a("avDmtTextView");
        }
        aVDmtTextView2.setLayoutParams(layoutParams);
        AVDmtImageView aVDmtImageView = new AVDmtImageView(context, null, 0, 6, null);
        this.f109530b = aVDmtImageView;
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (!this.f109536h) {
            layoutParams2.rightMargin = (int) C9738o.m28708b(getContext(), 12.0f);
            layoutParams2.leftMargin = layoutParams2.rightMargin;
        }
        AVDmtImageView aVDmtImageView2 = this.f109530b;
        if (aVDmtImageView2 == null) {
            C7573i.m23583a("avDmtImageView");
        }
        aVDmtImageView2.setLayoutParams(layoutParams2);
        AVDmtImageView aVDmtImageView3 = this.f109530b;
        if (aVDmtImageView3 == null) {
            C7573i.m23583a("avDmtImageView");
        }
        addView(aVDmtImageView3);
        AVDmtTextView aVDmtTextView3 = this.f109529a;
        if (aVDmtTextView3 == null) {
            C7573i.m23583a("avDmtTextView");
        }
        addView(aVDmtTextView3);
    }

    /* renamed from: a */
    private final void m133985a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f109531c = obtainStyledAttributes.getString(39);
            this.f109532d = obtainStyledAttributes.getDrawable(23);
            this.f109533e = (int) obtainStyledAttributes.getDimension(27, 0.0f);
            this.f109534f = obtainStyledAttributes.getBoolean(10, false);
            this.f109535g = obtainStyledAttributes.getBoolean(16, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f109535g) {
            this.f109536h = !C6399b.m19944t();
        }
        m133984a(context);
        m133986b();
    }

    public AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109536h = true;
        Drawable a = C42111b.f109618a.mo103544a(context, attributeSet);
        if (a != null) {
            setBackground(a);
        }
        m133985a(context, attributeSet);
    }

    public /* synthetic */ AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
