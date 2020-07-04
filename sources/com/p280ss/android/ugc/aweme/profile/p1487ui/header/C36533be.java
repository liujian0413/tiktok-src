package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.content.Context;
import android.net.Uri.Builder;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseDTProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseChallengeLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.be */
public class C36533be extends C36492ag {

    /* renamed from: bb */
    private RemoteImageView f95914bb;

    /* renamed from: bc */
    private View f95915bc;

    /* renamed from: bd */
    private EnterpriseTransformLayout f95916bd;

    /* renamed from: be */
    private EnterpriseTransformLayout f95917be;

    /* renamed from: bf */
    private EnterpriseChallengeLayout f95918bf;

    /* renamed from: bg */
    private View f95919bg;

    /* renamed from: bh */
    private View f95920bh;

    /* renamed from: bi */
    private View f95921bi;

    /* renamed from: a */
    public final void mo92528a() {
        super.mo92528a();
    }

    public final boolean bE_() {
        return false;
    }

    public final boolean bF_() {
        return true;
    }

    public int getLayout() {
        return R.layout.mb;
    }

    /* renamed from: t */
    public final void mo92560t() {
        super.mo92560t();
        this.f95914bb.setImageURI(new Builder().scheme("res").path("2131231165").build());
    }

    /* renamed from: C */
    private void m117969C() {
        int m = BaseDTProfileFragment.m116450m();
        this.f95919bg.getLayoutParams().height = m;
        this.f95914bb.getLayoutParams().height = m;
        this.f95915bc.getLayoutParams().height = m;
        ((MarginLayoutParams) this.f95920bh.getLayoutParams()).topMargin = m;
        ((MarginLayoutParams) this.f95921bi.getLayoutParams()).topMargin = m;
        ((MarginLayoutParams) this.f95713L.getLayoutParams()).topMargin = m - ((int) C9738o.m28708b(getContext(), 15.0f));
    }

    /* renamed from: a */
    private void m117970a(CommerceInfo commerceInfo) {
        if (commerceInfo != null) {
            UrlModel headImageUrl = commerceInfo.getHeadImageUrl();
            if (headImageUrl != null && !C6307b.m19566a((Collection<T>) headImageUrl.getUrlList())) {
                C23323e.m76524b(this.f95914bb, headImageUrl);
                return;
            }
        }
        this.f95914bb.setImageURI(new Builder().scheme("res").path("2131231165").build());
    }

    /* renamed from: g */
    public final void mo92752g(boolean z) {
        if (z) {
            this.f95914bb.setVisibility(8);
            if (this.f95915bc != null) {
                this.f95915bc.setVisibility(8);
            }
            if (this.f95766v != null) {
                this.f95766v.setVisibility(0);
            }
            this.f95763s = (float) BaseDTProfileFragment.m116450m();
            return;
        }
        this.f95914bb.setVisibility(0);
        if (this.f95915bc != null) {
            this.f95915bc.setVisibility(0);
        }
        if (this.f95766v != null) {
            this.f95766v.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo92531a(View view) {
        super.mo92531a(view);
        this.f95914bb = (RemoteImageView) view.findViewById(R.id.lr);
        this.f95915bc = view.findViewById(R.id.ls);
        this.f95916bd = (EnterpriseTransformLayout) view.findViewById(R.id.dnb);
        this.f95917be = (EnterpriseTransformLayout) view.findViewById(R.id.dnc);
        this.f95918bf = (EnterpriseChallengeLayout) view.findViewById(R.id.afb);
        this.f95919bg = view.findViewById(R.id.ahq);
        this.f95920bh = view.findViewById(R.id.le);
        this.f95921bi = view.findViewById(R.id.ckf);
        this.f95822av.setVisibility(8);
        this.f95711J.setVisibility(8);
        this.f95703B.setVisibility(8);
        this.f95707F.setVisibility(8);
        if (this.f95806aM != null) {
            this.f95806aM.setVisibility(8);
        }
        m117969C();
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
        Aweme aweme;
        if (this.f95718Q.isViewValid()) {
            super.mo91717d(user);
            if (C43122ff.m136783n(user)) {
                if (C6399b.m19944t()) {
                    this.f95914bb.setClickable(false);
                }
                if (C43122ff.m136784o(user)) {
                    m117970a(user.getCommerceInfo());
                } else if (!C6307b.m19566a((Collection<T>) user.getCoverUrls())) {
                    UrlModel urlModel = (UrlModel) user.getCoverUrls().get(0);
                    if (urlModel != null) {
                        C23323e.m76524b(this.f95914bb, urlModel);
                    }
                }
                if (this.f95719R != null) {
                    aweme = this.f95719R.getmAweme();
                } else {
                    aweme = null;
                }
                if (!C7213d.m22500a().mo18807g() || this.f95917be == null) {
                    if (this.f95917be != null) {
                        this.f95917be.setVisibility(8);
                    }
                    this.f95916bd.setVisibility(0);
                    this.f95916bd.mo92000a(user, aweme);
                } else {
                    this.f95916bd.setVisibility(8);
                    this.f95917be.setVisibility(0);
                    this.f95917be.mo92000a(user, aweme);
                }
                this.f95918bf.mo91991a(getActivity(), user, true);
            }
        }
    }

    public C36533be(Context context, BaseProfileFragment baseProfileFragment, UserHeaderData userHeaderData, C6309f fVar, C36527az azVar, ProfileViewModel profileViewModel) {
        super(context, baseProfileFragment, userHeaderData, fVar, azVar, profileViewModel);
    }
}
