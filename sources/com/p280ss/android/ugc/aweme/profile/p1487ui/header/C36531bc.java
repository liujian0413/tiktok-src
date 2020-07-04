package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p280ss.android.ugc.aweme.commercialize.views.AvatarBackgroundImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseDTProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseChallengeLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.bc */
public final class C36531bc extends AbsMyCommonHeaderLayout {

    /* renamed from: aA */
    private View f95906aA;

    /* renamed from: aB */
    private View f95907aB;

    /* renamed from: aC */
    private View f95908aC;

    /* renamed from: aw */
    private AvatarBackgroundImageView f95909aw;

    /* renamed from: ax */
    private View f95910ax;

    /* renamed from: ay */
    private EnterpriseTransformLayout f95911ay;

    /* renamed from: az */
    private EnterpriseChallengeLayout f95912az;

    public final int getLayout() {
        return R.layout.afh;
    }

    /* renamed from: b */
    public final void mo92534b() {
        super.mo92534b();
        if (this.f95909aw != null) {
            this.f95909aw.mo66091c();
        }
    }

    /* renamed from: x */
    public final void mo92721x() {
        if (this.f95909aw != null) {
            this.f95909aw.performClick();
        }
    }

    /* renamed from: y */
    private void m117957y() {
        int m = BaseDTProfileFragment.m116450m();
        ((MarginLayoutParams) this.f95906aA.getLayoutParams()).topMargin = m;
        ((MarginLayoutParams) this.f95907aB.getLayoutParams()).topMargin = m;
        this.f95908aC.getLayoutParams().height = m;
        this.f95909aw.getLayoutParams().height = m;
        this.f95910ax.getLayoutParams().height = m;
        ((MarginLayoutParams) this.f95713L.getLayoutParams()).topMargin = m - ((int) C9738o.m28708b(getContext(), 20.0f));
    }

    /* renamed from: i */
    public final void mo92749i(boolean z) {
        if (!z) {
            if (this.f95911ay != null) {
                this.f95911ay.mo92004b();
            }
            if (this.f95912az != null) {
                this.f95912az.mo91990a();
            }
        }
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
        Aweme aweme;
        if (this.f95718Q.isViewValid()) {
            super.mo91717d(user);
            if (C43122ff.m136783n(user) && this.f95909aw != null) {
                if (C43122ff.m136784o(user)) {
                    CommerceInfo commerceInfo = user.getCommerceInfo();
                    if (commerceInfo != null) {
                        UrlModel headImageUrl = commerceInfo.getHeadImageUrl();
                        if (headImageUrl != null) {
                            C23323e.m76524b(this.f95909aw, headImageUrl);
                        }
                    }
                } else if (!C6307b.m19566a((Collection<T>) user.getCoverUrls())) {
                    UrlModel urlModel = (UrlModel) user.getCoverUrls().get(0);
                    if (urlModel != null) {
                        C23323e.m76524b(this.f95909aw, urlModel);
                    }
                }
                if (this.f95719R != null) {
                    aweme = this.f95719R.getmAweme();
                } else {
                    aweme = null;
                }
                this.f95911ay.mo92000a(user, aweme);
                this.f95912az.mo91991a(getActivity(), user, true);
            }
        }
    }

    /* renamed from: j */
    public final void mo92750j(boolean z) {
        if (z) {
            if (this.f95909aw != null) {
                this.f95909aw.setVisibility(8);
            }
            if (this.f95910ax != null) {
                this.f95910ax.setVisibility(8);
            }
            if (this.f95766v != null) {
                this.f95766v.setVisibility(0);
            }
            this.f95763s = (float) BaseDTProfileFragment.m116450m();
            return;
        }
        if (this.f95909aw != null) {
            this.f95909aw.setVisibility(0);
        }
        if (this.f95910ax != null) {
            this.f95910ax.setVisibility(0);
        }
        if (this.f95766v != null) {
            this.f95766v.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo92531a(View view) {
        super.mo92531a(view);
        this.f95909aw = (AvatarBackgroundImageView) view.findViewById(R.id.lr);
        this.f95910ax = view.findViewById(R.id.ls);
        this.f95911ay = (EnterpriseTransformLayout) view.findViewById(R.id.dnb);
        this.f95912az = (EnterpriseChallengeLayout) view.findViewById(R.id.afb);
        this.f95711J.setVisibility(8);
        this.f95909aw.mo66084a(getActivity(), (Fragment) this.f95718Q);
        this.f95909aw.mo66090b();
        this.f95906aA = view.findViewById(R.id.le);
        this.f95907aB = view.findViewById(R.id.ckf);
        this.f95908aC = view.findViewById(R.id.ahq);
        C23323e.m76503a((RemoteImageView) this.f95909aw, (int) R.drawable.lb);
        this.f95678ap.setVisibility(8);
        this.f95703B.setVisibility(8);
        this.f95707F.setVisibility(8);
        if (!C6399b.m19944t()) {
            m117957y();
            if (this.f95705D instanceof TextView) {
                ((TextView) this.f95705D).setText(getResources().getString(R.string.axb));
            }
        }
    }

    public C36531bc(Context context, BaseProfileFragment baseProfileFragment, ProfileViewModel profileViewModel) {
        super(context, baseProfileFragment, profileViewModel);
    }

    /* renamed from: a */
    public final void mo92529a(int i, int i2, Intent intent) {
        super.mo92529a(i, i2, intent);
        if (this.f95909aw != null) {
            this.f95909aw.mo66083a(i, i2, intent);
        }
    }
}
