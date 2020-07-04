package com.p280ss.android.ugc.aweme.movie.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.vast.p673a.C13015c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.movie.view.FeedMvTagView */
public final class FeedMvTagView extends FrameLayout {

    /* renamed from: a */
    private ImageView f87829a;

    /* renamed from: b */
    private DmtTextView f87830b;

    /* renamed from: c */
    private ImageView f87831c;

    /* renamed from: d */
    private LinearLayout f87832d;

    /* renamed from: e */
    private TextView f87833e;

    public final TextView getMFestivalName() {
        return this.f87833e;
    }

    public final ImageView getMMvIcon() {
        return this.f87829a;
    }

    public final DmtTextView getMMvName() {
        return this.f87830b;
    }

    public final ImageView getMRightArrow() {
        return this.f87831c;
    }

    public final LinearLayout getMTagContainer() {
        return this.f87832d;
    }

    public final void setMFestivalName(TextView textView) {
        this.f87833e = textView;
    }

    public final void setMMvIcon(ImageView imageView) {
        this.f87829a = imageView;
    }

    public final void setMMvName(DmtTextView dmtTextView) {
        this.f87830b = dmtTextView;
    }

    public final void setMRightArrow(ImageView imageView) {
        this.f87831c = imageView;
    }

    public final void setMTagContainer(LinearLayout linearLayout) {
        this.f87832d = linearLayout;
    }

    public FeedMvTagView(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    public final void setBackground(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.f87832d;
            if (linearLayout != null) {
                linearLayout.setBackground(getResources().getDrawable(intValue));
            }
        }
    }

    public final void setTagName(String str) {
        C7573i.m23587b(str, "str");
        DmtTextView dmtTextView = this.f87830b;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
        ImageView imageView = this.f87831c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void setFestivalName(String str) {
        C7573i.m23587b(str, "name");
        if (!C13015c.m37973a(str)) {
            TextView textView = this.f87833e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f87833e;
            if (textView2 != null) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(str);
                textView2.setText(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m108593a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.b3n, this);
        this.f87829a = (ImageView) findViewById(R.id.bal);
        this.f87830b = (DmtTextView) findViewById(R.id.dyd);
        this.f87831c = (ImageView) findViewById(R.id.bbm);
        this.f87832d = (LinearLayout) findViewById(R.id.c2f);
        this.f87833e = (TextView) findViewById(R.id.duh);
        TextView textView = this.f87833e;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public FeedMvTagView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this(context, attributeSet, 0);
    }

    public FeedMvTagView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m108593a(context);
    }
}
