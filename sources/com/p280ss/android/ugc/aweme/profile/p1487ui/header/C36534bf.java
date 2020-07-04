package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.bf */
public class C36534bf extends C36492ag {

    /* renamed from: bb */
    private EnterpriseTransformLayout f95922bb;

    /* renamed from: a */
    public final void mo92528a() {
        super.mo92528a();
    }

    public final boolean bF_() {
        return false;
    }

    public int getLayout() {
        return R.layout.user_profile_head_view;
    }

    public final boolean bE_() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92531a(View view) {
        super.mo92531a(view);
        this.f95922bb = (EnterpriseTransformLayout) view.findViewById(R.id.dnb);
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
        Aweme aweme;
        super.mo91717d(user);
        if (this.f95719R != null) {
            aweme = this.f95719R.getmAweme();
        } else {
            aweme = null;
        }
        this.f95922bb.mo92000a(user, aweme);
    }

    public C36534bf(Context context, BaseProfileFragment baseProfileFragment, UserHeaderData userHeaderData, C6309f fVar, C36527az azVar, ProfileViewModel profileViewModel) {
        super(context, baseProfileFragment, userHeaderData, fVar, azVar, profileViewModel);
    }
}
