package com.p280ss.android.ugc.aweme.share.shareicon;

import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.shareicon.ShareIcon */
public enum ShareIcon {
    Default(1, R.drawable.a8u),
    H_THREE_POINT(2, R.drawable.a8v),
    ARROW(3, R.drawable.a8w),
    T_THREE_POINT(4, R.drawable.a8x);
    
    private int res;
    private int style;

    public final int getDrawable() {
        return this.res;
    }

    public final int getStyle() {
        return this.style;
    }

    public static ShareIcon build(int i) {
        ShareIcon shareIcon = Default;
        if (i == H_THREE_POINT.getStyle()) {
            return H_THREE_POINT;
        }
        if (i == T_THREE_POINT.getStyle()) {
            return T_THREE_POINT;
        }
        if (i == ARROW.getStyle()) {
            return ARROW;
        }
        return shareIcon;
    }

    private ShareIcon(int i, int i2) {
        this.style = i;
        this.res = i2;
    }
}
