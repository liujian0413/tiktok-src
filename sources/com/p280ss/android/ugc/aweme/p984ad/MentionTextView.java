package com.p280ss.android.ugc.aweme.p984ad;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.style.ClickableSpan;

/* renamed from: com.ss.android.ugc.aweme.ad.MentionTextView */
public class MentionTextView extends ClickSpanWorkaroundTextView {

    /* renamed from: b */
    public boolean f59699b;

    /* renamed from: c */
    public int f59700c;

    /* renamed from: d */
    private C22373b f59701d;

    /* renamed from: e */
    private int f59702e;

    /* renamed from: f */
    private float f59703f;

    /* renamed from: g */
    private int f59704g;

    /* renamed from: com.ss.android.ugc.aweme.ad.MentionTextView$a */
    public abstract class C22372a extends ClickableSpan {

        /* renamed from: a */
        public boolean f59705a;

        /* renamed from: b */
        final /* synthetic */ MentionTextView f59706b;

        /* renamed from: a */
        public final void mo58839a(boolean z) {
            this.f59705a = z;
            this.f59706b.invalidate();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.MentionTextView$b */
    public interface C22373b {
    }

    public int getSpanColor() {
        return this.f59704g;
    }

    public float getSpanSize() {
        return this.f59703f;
    }

    public int getSpanStyle() {
        return this.f59702e;
    }

    public void setOnSpanClickListener(C22373b bVar) {
        this.f59701d = bVar;
    }

    public void setShowUnderline(boolean z) {
        this.f59699b = z;
    }

    public void setSpanColor(int i) {
        this.f59700c = i;
    }

    public void setSpanSize(float f) {
        this.f59703f = f;
    }

    public void setSpanStyle(int i) {
        this.f59702e = i;
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception unused) {
        }
    }
}
