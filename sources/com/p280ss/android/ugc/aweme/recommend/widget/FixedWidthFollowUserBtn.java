package com.p280ss.android.ugc.aweme.recommend.widget;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.C29778b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.FixedWidthFollowUserBtn */
public final class FixedWidthFollowUserBtn extends DmtTextView implements C29778b {

    /* renamed from: b */
    private int f97300b;

    public FixedWidthFollowUserBtn(Context context) {
        this(context, null, 0, 6, null);
    }

    public FixedWidthFollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final int getFollowedTextColorResId() {
        return R.color.a4z;
    }

    /* access modifiers changed from: protected */
    public final int getUnFollowBgResId() {
        return R.drawable.lv;
    }

    /* access modifiers changed from: protected */
    public final int getUnFollowTextColorResId() {
        return R.color.lt;
    }

    /* access modifiers changed from: protected */
    public final int getFollowedBgResId() {
        if (C6399b.m19946v()) {
            return R.drawable.ma;
        }
        return R.drawable.bg_followed;
    }

    public final C0043i getLifeCycleOwner() {
        Activity e = C23487o.m77158e(this);
        if (e != null) {
            return (FragmentActivity) e;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void setFollowStatus(int i) {
        if (this.f97300b != i) {
            this.f97300b = i;
            int followedBgResId = getFollowedBgResId();
            setVisibility(0);
            switch (i) {
                case 0:
                    setText(getResources().getText(R.string.b7r));
                    setTextColor(getResources().getColor(getUnFollowTextColorResId()));
                    setBackground(getResources().getDrawable(getUnFollowBgResId()));
                    return;
                case 1:
                    setText(getResources().getText(R.string.b92));
                    setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    setBackground(getResources().getDrawable(followedBgResId));
                    return;
                case 2:
                    setText(getResources().getText(R.string.aua));
                    setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    setBackground(getResources().getDrawable(followedBgResId));
                    return;
                case 3:
                    setVisibility(8);
                    break;
                case 4:
                    setText(getResources().getText(R.string.b8v));
                    setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    setBackground(getResources().getDrawable(followedBgResId));
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo75747a(int i, int i2) {
        int followedBgResId = getFollowedBgResId();
        setVisibility(0);
        switch (i) {
            case 0:
                setText(getResources().getText(R.string.b7r));
                setTextColor(getResources().getColor(getUnFollowTextColorResId()));
                setBackground(getResources().getDrawable(getUnFollowBgResId()));
                break;
            case 1:
                setText(getResources().getText(R.string.b92));
                setTextColor(getResources().getColor(getFollowedTextColorResId()));
                setBackground(getResources().getDrawable(followedBgResId));
                break;
            case 2:
                setText(getResources().getText(R.string.aua));
                setTextColor(getResources().getColor(getFollowedTextColorResId()));
                setBackground(getResources().getDrawable(followedBgResId));
                break;
            case 3:
                setVisibility(8);
                break;
            case 4:
                setText(getResources().getText(R.string.b8v));
                setTextColor(getResources().getColor(getFollowedTextColorResId()));
                setBackground(getResources().getDrawable(followedBgResId));
                break;
        }
        this.f97300b = i;
    }

    public FixedWidthFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ FixedWidthFollowUserBtn(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
