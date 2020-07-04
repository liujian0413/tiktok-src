package com.p280ss.android.ugc.aweme.following.p1265ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.WhiteBgFollowUserBtn */
public class WhiteBgFollowUserBtn extends FollowUserBtn {
    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        return R.drawable.m9;
    }

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        return R.color.ab1;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.b3a;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowBgResId() {
        return R.drawable.lv;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowTextColorResId() {
        return R.color.lt;
    }

    public WhiteBgFollowUserBtn(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    public WhiteBgFollowUserBtn(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public WhiteBgFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
