package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p313im.experiment.PersonalAddFriendsStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.bd */
public final class C36532bd extends AbsMyCommonHeaderLayout {

    /* renamed from: aw */
    private EnterpriseTransformLayout f95913aw;

    public final int getLayout() {
        return R.layout.profile_head_view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo92560t() {
        if (C6384b.m19835a().mo15287a(PersonalAddFriendsStyleExperiment.class, true, "personal_add_friends_style", C6384b.m19835a().mo15295d().personal_add_friends_style, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92531a(View view) {
        super.mo92531a(view);
        this.f95913aw = (EnterpriseTransformLayout) view.findViewById(R.id.dnb);
    }

    /* renamed from: i */
    public final void mo92751i(boolean z) {
        if (!z && this.f95913aw != null) {
            this.f95913aw.mo92004b();
        }
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
        Aweme aweme;
        if (this.f95718Q.isViewValid()) {
            super.mo91717d(user);
            if (this.f95719R != null) {
                aweme = this.f95719R.getmAweme();
            } else {
                aweme = null;
            }
            this.f95913aw.mo92000a(user, aweme);
        }
    }

    public C36532bd(Context context, BaseProfileFragment baseProfileFragment, ProfileViewModel profileViewModel) {
        super(context, baseProfileFragment, profileViewModel);
    }
}
