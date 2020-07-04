package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10779a;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10779a.C10780a;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10782c;
import com.bytedance.ies.dmt.p262ui.common.rebranding.NiceWidthTextView;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn */
public final class FansFollowUserBtn extends FollowUserBtn {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f79118d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FansFollowUserBtn.class), "horizontalWidthForTwo", "getHorizontalWidthForTwo()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FansFollowUserBtn.class), "horizontalWidthForFour", "getHorizontalWidthForFour()I"))};

    /* renamed from: e */
    public static final C30096a f79119e = new C30096a(null);

    /* renamed from: f */
    private final C7541d f79120f = C7546e.m23569a(new C30098c(this));

    /* renamed from: g */
    private final C7541d f79121g = C7546e.m23569a(new C30097b(this));

    /* renamed from: h */
    private int f79122h;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$a */
    public static final class C30096a {
        private C30096a() {
        }

        public /* synthetic */ C30096a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$b */
    static final class C30097b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f79123a;

        C30097b(FansFollowUserBtn fansFollowUserBtn) {
            this.f79123a = fansFollowUserBtn;
            super(0);
        }

        /* renamed from: a */
        private int m98611a() {
            return this.f79123a.mo76491b(12, 4);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m98611a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$c */
    static final class C30098c extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f79124a;

        C30098c(FansFollowUserBtn fansFollowUserBtn) {
            this.f79124a = fansFollowUserBtn;
            super(0);
        }

        /* renamed from: a */
        private int m98612a() {
            return this.f79124a.mo76491b(12, 2);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m98612a());
        }
    }

    private final int getHorizontalWidthForFour() {
        return ((Number) this.f79121g.getValue()).intValue();
    }

    private final int getHorizontalWidthForTwo() {
        return ((Number) this.f79120f.getValue()).intValue();
    }

    public final int getMaxWidth() {
        return this.f79122h;
    }

    public final int getDefaultMeasureNiceWidth() {
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        return mo25768a(niceWidthTextView);
    }

    /* renamed from: a */
    public final void mo76490a() {
        Class cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        C10779a.m31458a(cls, new C10780a(mo25768a(niceWidthTextView)));
    }

    public final LayoutParams getButtonLayoutParams() {
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        LayoutParams layoutParams = niceWidthTextView.getLayoutParams();
        C7573i.m23582a((Object) layoutParams, "mMainBtn.layoutParams");
        return layoutParams;
    }

    public final void setTextSize(float f) {
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setTextSize(f);
    }

    public final void setTypeface(Typeface typeface) {
        C7573i.m23587b(typeface, "typeface");
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setTypeface(typeface);
    }

    public FansFollowUserBtn(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    public final void setButtonLayoutParams(LayoutParams layoutParams) {
        C7573i.m23587b(layoutParams, "layoutParams");
        this.f79122h = layoutParams.width;
        Class cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        C10779a.m31458a(cls, new C10780a(mo25768a(niceWidthTextView)));
        NiceWidthTextView niceWidthTextView2 = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setLayoutParams(layoutParams);
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "text");
        setVisibility(0);
        setFollowButtonStyle(-1);
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setText(str);
        this.f78313a.setTextColor(getResources().getColor(R.color.lt));
        NiceWidthTextView niceWidthTextView2 = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.lv));
    }

    /* renamed from: a */
    public final int mo25768a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.b92));
        arrayList.add(Integer.valueOf(R.string.aua));
        arrayList.add(Integer.valueOf(R.string.b8v));
        arrayList.add(Integer.valueOf(R.string.auc));
        int a = C10782c.m31460a(textView, arrayList, (int) C9738o.m28708b(getContext(), 68.0f), (int) C9738o.m28708b(getContext(), 68.0f));
        if (a > this.f79122h) {
            return a;
        }
        return this.f79122h;
    }

    public final void setFollowButtonStyle(int i) {
        if (i == -1) {
            this.f78313a.setPadding(0, 0, 0, 0);
            NiceWidthTextView niceWidthTextView = this.f78313a;
            C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
            niceWidthTextView.setGravity(17);
            this.f78313a.setCompoundDrawables(null, null, null, null);
            return;
        }
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        Drawable drawable = context.getResources().getDrawable(i);
        C7573i.m23582a((Object) drawable, "mButtonStyle");
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f78313a.setCompoundDrawables(drawable, null, null, null);
        NiceWidthTextView niceWidthTextView2 = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setGravity(16);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo76490a();
    }

    /* renamed from: b */
    public final int mo76491b(int i, int i2) {
        float b = C9738o.m28708b(getContext(), 68.0f);
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        return (int) Math.max(0.0f, ((b - niceWidthTextView.getPaint().measureText(C7634n.m23708a("一", i2))) - C9738o.m28708b(getContext(), 14.0f)) / 2.0f);
    }

    public FansFollowUserBtn(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo75747a(int i, int i2) {
        setVisibility(0);
        switch (i) {
            case 0:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
                niceWidthTextView.setText(getResources().getText(R.string.b7r));
                this.f78313a.setTextColor(getResources().getColor(R.color.lt));
                NiceWidthTextView niceWidthTextView2 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView2, "mMainBtn");
                niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.lv));
                break;
            case 1:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView3 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView3, "mMainBtn");
                niceWidthTextView3.setText(getResources().getText(R.string.b92));
                this.f78313a.setTextColor(getResources().getColor(R.color.a4z));
                NiceWidthTextView niceWidthTextView4 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView4, "mMainBtn");
                niceWidthTextView4.setBackground(getResources().getDrawable(R.drawable.bg_followed));
                break;
            case 2:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView5 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView5, "mMainBtn");
                niceWidthTextView5.setText(getResources().getText(R.string.aua));
                this.f78313a.setTextColor(getResources().getColor(R.color.a4z));
                NiceWidthTextView niceWidthTextView6 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView6, "mMainBtn");
                niceWidthTextView6.setBackground(getResources().getDrawable(R.drawable.bg_followed));
                break;
            case 3:
                setVisibility(8);
                break;
            case 4:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView7 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView7, "mMainBtn");
                niceWidthTextView7.setText(getResources().getText(R.string.b8v));
                this.f78313a.setTextColor(getResources().getColor(R.color.a4z));
                NiceWidthTextView niceWidthTextView8 = this.f78313a;
                C7573i.m23582a((Object) niceWidthTextView8, "mMainBtn");
                niceWidthTextView8.setBackground(getResources().getDrawable(R.drawable.bg_followed));
                break;
        }
        this.f78314b = i;
    }

    public FansFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo75748a(Context context, AttributeSet attributeSet, int i) {
        this.f78313a = (NiceWidthTextView) LayoutInflater.from(context).inflate(R.layout.b3d, this, true).findViewById(R.id.q7);
        this.f78313a.mo25767a(this);
        Class cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView, "mMainBtn");
        C10779a.m31458a(cls, new C10780a(mo25768a(niceWidthTextView)));
        this.f78314b = 0;
        NiceWidthTextView niceWidthTextView2 = this.f78313a;
        C7573i.m23582a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setCompoundDrawablePadding((int) C9738o.m28708b(context, 2.0f));
    }
}
