package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabItemView */
public class TabItemView extends ConstraintLayout {

    /* renamed from: g */
    private TextView f108411g;

    /* renamed from: h */
    private TextView f108412h;

    public TextView getTextView() {
        return this.f108411g;
    }

    public CharSequence getTagText() {
        return this.f108412h.getText();
    }

    /* renamed from: c */
    public final boolean mo20986c() {
        if (this.f108412h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m132692d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.akc, this, true);
        this.f108411g = (TextView) inflate.findViewById(R.id.dfm);
        this.f108412h = (TextView) inflate.findViewById(R.id.dfl);
    }

    /* renamed from: b */
    public final void mo20984b() {
        this.f108411g.setPadding(this.f108411g.getTotalPaddingLeft(), this.f108411g.getTotalPaddingTop(), this.f108411g.getTotalPaddingLeft(), this.f108411g.getTotalPaddingBottom());
        this.f108412h.setVisibility(8);
    }

    public TabItemView(Context context) {
        this(context, null);
    }

    public void setTextColor(int i) {
        this.f108411g.setTextColor(i);
    }

    public void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f108411g.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo102410a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f108412h.setVisibility(0);
            this.f108412h.setText(str);
            this.f108411g.setPadding(this.f108411g.getTotalPaddingLeft(), this.f108411g.getTotalPaddingTop(), (int) C9738o.m28708b(getContext(), 28.0f), this.f108411g.getTotalPaddingBottom());
        }
    }

    public TabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m132692d();
    }
}
