package com.p280ss.android.ugc.aweme.following.p1265ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.FollowAndInviteUserBtn */
public class FollowAndInviteUserBtn extends FollowUserBtn {
    /* renamed from: a */
    public final void mo75745a() {
        setVisibility(0);
        this.f78313a.setTextColor(getResources().getColor(R.color.lt));
        this.f78313a.setText(getResources().getString(R.string.bv8));
        this.f78313a.setBackground(getResources().getDrawable(R.drawable.r3));
        this.f78314b = 1000;
    }

    /* renamed from: b */
    public final void mo75746b() {
        setVisibility(0);
        this.f78313a.setTextColor(getResources().getColor(R.color.a4z));
        this.f78313a.setText(getResources().getString(R.string.bvf));
        this.f78313a.setBackground(getResources().getDrawable(R.drawable.bg_followed));
        this.f78314b = 1001;
    }

    public FollowAndInviteUserBtn(Context context) {
        super(context);
    }

    public FollowAndInviteUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowAndInviteUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
