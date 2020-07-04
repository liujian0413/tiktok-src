package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.e */
final class C30524e implements C6905a, C25675c<User>, C30519a {

    /* renamed from: a */
    private C30518a f80213a = new C30518a();

    /* renamed from: b */
    private C30528i f80214b;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    public final void bd_() {
        this.f80214b.mo80218b();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (this.f80214b.isViewValid()) {
            this.f80214b.mo80216a(true);
        }
    }

    public final void aD_() {
        if (this.f80214b.isViewValid()) {
            this.f80213a.ag_();
        }
    }

    public final void ae_() {
        if (this.f80214b.isViewValid()) {
            this.f80214b.mo80219b(true);
            this.f80214b.mo80220c(false);
            this.f80214b.mo80216a(false);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (this.f80214b.isViewValid()) {
            this.f80213a.mo66507h();
        }
    }

    C30524e(C30528i iVar) {
        this.f80214b = iVar;
        this.f80213a.mo66504a((C6905a) this);
        iVar.mo80214a((C1262a) this.f80213a);
    }

    /* renamed from: a */
    public final void mo80227a(int i) {
        User b = this.f80213a.mo80226b(i);
        if (b != null) {
            this.f80214b.mo80215a(b.getUid(), b.getSecUid());
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (this.f80214b.isViewValid()) {
            this.f80214b.mo80219b(false);
            this.f80214b.mo80220c(true);
            this.f80214b.mo80216a(false);
        }
    }

    /* renamed from: b */
    public final void mo80228b(int i) {
        int i2;
        User b = this.f80213a.mo80226b(i);
        if (b != null) {
            if (b.getFollowStatus() != 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i3 = i2 ^ 1;
            if (this.f80214b.mo80217a(b.getUid(), i3, b.getFollowerStatus())) {
                b.setFollowStatus(i3);
                this.f80213a.notifyItemChanged(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80236a(String str, int i) {
        this.f80213a.mo80225a(str, i);
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        boolean z2;
        if (this.f80214b.isViewValid()) {
            this.f80213a.mo58045a(list);
            C30528i iVar = this.f80214b;
            if (list == null || list.size() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            iVar.mo80219b(z2);
            this.f80214b.mo80220c(false);
            this.f80214b.mo80216a(false);
            if (z) {
                this.f80213a.mo66504a((C6905a) this);
                this.f80213a.ai_();
                this.f80213a.mo66516d(true);
                return;
            }
            this.f80213a.mo66504a((C6905a) null);
            this.f80213a.ah_();
            this.f80213a.mo66516d(false);
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<User> list, boolean z) {
        if (this.f80214b.isViewValid()) {
            this.f80213a.mo58045a(list);
            this.f80213a.ai_();
            if (!z) {
                this.f80213a.mo66504a((C6905a) null);
                this.f80213a.ah_();
                this.f80213a.mo66516d(false);
            }
        }
    }
}
