package com.p280ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.share.BottomShareItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.seconditem.ShareItemView */
public class ShareItemView extends BottomShareItem {
    private ShareItemView(Context context) {
        this(context, null);
    }

    public ShareItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public static ShareItemView m122195a(Context context, int i, int i2, OnClickListener onClickListener) {
        return m122196a(context, context.getString(R.string.des), context.getResources().getDrawable(R.drawable.aty), onClickListener);
    }

    /* renamed from: a */
    public static ShareItemView m122196a(Context context, String str, Drawable drawable, OnClickListener onClickListener) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int b = (int) C9738o.m28708b(context, 10.0f);
        layoutParams.leftMargin = b;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(b);
        }
        ShareItemView shareItemView = new ShareItemView(context);
        shareItemView.setLayoutParams(layoutParams);
        shareItemView.setOnClickListener(onClickListener);
        if (str != null) {
            shareItemView.setText(str);
        }
        if (drawable != null) {
            shareItemView.setIcon(drawable);
        }
        return shareItemView;
    }
}
