package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView */
public final class AVDmtTabItemView extends FrameLayout {

    /* renamed from: a */
    private RemoteImageView f109582a;

    /* renamed from: b */
    private AVDmtTextView f109583b;

    /* renamed from: c */
    private View f109584c;

    /* renamed from: d */
    private int f109585d;

    /* renamed from: e */
    private int f109586e;

    /* renamed from: f */
    private boolean f109587f;

    /* renamed from: a */
    public final void mo103521a() {
        int b = (int) C9738o.m28708b(getContext(), 4.0f);
        setPadding(b, 0, b, 0);
    }

    /* renamed from: a */
    private final void m134017a(int i) {
        AVDmtTextView aVDmtTextView = this.f109583b;
        if (aVDmtTextView == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView.setTextColor(i);
        RemoteImageView remoteImageView = this.f109582a;
        if (remoteImageView == null) {
            C7573i.m23583a("iconImgView");
        }
        remoteImageView.setImageAlpha(Color.alpha(i));
    }

    /* renamed from: b */
    public final void mo103525b(boolean z) {
        int i;
        View view = this.f109584c;
        if (view == null) {
            C7573i.m23583a("dotView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = this.f109585d;
        } else {
            i = this.f109586e;
        }
        m134017a(i);
        mo103524a(z);
    }

    public final void setText(int i) {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        setText(context.getResources().getString(i));
    }

    /* renamed from: a */
    public final void mo103524a(boolean z) {
        if (!C6399b.m19944t()) {
            if (z) {
                AVDmtTextView aVDmtTextView = this.f109583b;
                if (aVDmtTextView == null) {
                    C7573i.m23583a("textView");
                }
                aVDmtTextView.mo103533b();
                AVDmtTextView aVDmtTextView2 = this.f109583b;
                if (aVDmtTextView2 == null) {
                    C7573i.m23583a("textView");
                }
                aVDmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
                return;
            }
            AVDmtTextView aVDmtTextView3 = this.f109583b;
            if (aVDmtTextView3 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f109583b;
            if (aVDmtTextView == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView.setVisibility(0);
            RemoteImageView remoteImageView = this.f109582a;
            if (remoteImageView == null) {
                C7573i.m23583a("iconImgView");
            }
            remoteImageView.setVisibility(8);
            AVDmtTextView aVDmtTextView2 = this.f109583b;
            if (aVDmtTextView2 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView2.setText(charSequence);
        }
    }

    /* renamed from: a */
    private final void m134018a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.te, this, true);
        View findViewById = inflate.findViewById(R.id.dfk);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.tab_item_img)");
        this.f109582a = (RemoteImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.dfm);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.tab_item_text)");
        this.f109583b = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.dfj);
        C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.tab_item_dot)");
        this.f109584c = findViewById3;
        int color = context.getResources().getColor(R.color.a76);
        View view = this.f109584c;
        if (view == null) {
            C7573i.m23583a("dotView");
        }
        view.setBackground(C38501ax.m123065a(color, color, 0));
        AVDmtTextView aVDmtTextView = this.f109583b;
        if (aVDmtTextView == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (C6399b.m19944t()) {
            AVDmtTextView aVDmtTextView2 = this.f109583b;
            if (aVDmtTextView2 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView2.mo103533b();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f109583b;
            if (aVDmtTextView3 == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f109583b;
        if (aVDmtTextView4 == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView4.setSingleLine();
        AVDmtTextView aVDmtTextView5 = this.f109583b;
        if (aVDmtTextView5 == null) {
            C7573i.m23583a("textView");
        }
        aVDmtTextView5.setEllipsize(TruncateAt.END);
        setLayoutParams(new LayoutParams(-2, -1));
    }

    public AVDmtTabItemView(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        this(context, null, 0);
        this.f109587f = z;
        this.f109585d = C42111b.f109618a.mo103541a(z);
        this.f109586e = C42111b.m134049a(this.f109585d);
    }

    /* renamed from: a */
    public final void mo103522a(int i, int i2) {
        if (!C6399b.m19944t()) {
            setLayoutParams(new LayoutParams((int) (((float) C9738o.m28691a(getContext())) / 4.5f), -2));
        } else if (i == 0) {
            setPadding((int) C9738o.m28708b(getContext(), 6.0f), 0, 0, 0);
        } else {
            if (i == i2 - 1) {
                setPadding(0, 0, (int) C9738o.m28708b(getContext(), 6.0f), 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo103523a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f109583b;
            if (aVDmtTextView == null) {
                C7573i.m23583a("textView");
            }
            aVDmtTextView.setVisibility(8);
            RemoteImageView remoteImageView = this.f109582a;
            if (remoteImageView == null) {
                C7573i.m23583a("iconImgView");
            }
            remoteImageView.setVisibility(0);
            if (str == null) {
                C7573i.m23580a();
            }
            if (C7634n.m23721b(str, "res://", false)) {
                RemoteImageView remoteImageView2 = this.f109582a;
                if (remoteImageView2 == null) {
                    C7573i.m23583a("iconImgView");
                }
                remoteImageView2.setImageDrawable(C42111b.f109618a.mo103543a(getContext(), i, this.f109587f));
                return;
            }
            RemoteImageView remoteImageView3 = this.f109582a;
            if (remoteImageView3 == null) {
                C7573i.m23583a("iconImgView");
            }
            C23323e.m76514a(remoteImageView3, str);
        }
    }

    public AVDmtTabItemView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109585d = -1;
        this.f109586e = -1;
        m134018a(context);
    }
}
