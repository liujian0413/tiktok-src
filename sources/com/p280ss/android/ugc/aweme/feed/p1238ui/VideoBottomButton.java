package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoBottomButton */
public final class VideoBottomButton extends FrameLayout {

    /* renamed from: a */
    private TextView f75834a;

    /* renamed from: b */
    private RemoteImageView f75835b;

    /* renamed from: a */
    private final void m94673a() {
        LayoutInflater.from(getContext()).inflate(R.layout.b4t, this, true);
        View findViewById = findViewById(R.id.e3f);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.tv_title)");
        this.f75834a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.b6t);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.iv_button_bg)");
        this.f75835b = (RemoteImageView) findViewById2;
    }

    public VideoBottomButton(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    public final void setBackgroundColor(int i) {
        setBackgroundColors(new int[]{i, i});
    }

    public final void setButtonBackground(UrlModel urlModel) {
        RemoteImageView remoteImageView = this.f75835b;
        if (remoteImageView == null) {
            C7573i.m23583a("ivBg");
        }
        C23323e.m76524b(remoteImageView, urlModel);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.f75834a;
        if (textView == null) {
            C7573i.m23583a("textView");
        }
        textView.setText(charSequence);
    }

    public final void setBackgroundColors(int[] iArr) {
        C7573i.m23587b(iArr, "colors");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C9738o.m28708b(getContext(), 4.0f));
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(Orientation.LEFT_RIGHT);
        setBackground(gradientDrawable);
    }

    public VideoBottomButton(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        m94673a();
    }
}
