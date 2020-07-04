package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.OnAnimatedScrollListener;
import com.p280ss.android.ugc.aweme.common.p1142c.C25657a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment */
public class MTAwemeListFragment extends AwemeListFragmentImpl {

    /* renamed from: B */
    private boolean f94685B;

    /* renamed from: C */
    private boolean f94686C;

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo91897l() {
        return R.layout.fragment_aweme_list_mus;
    }

    /* renamed from: I */
    private void m116662I() {
        this.f94474p.setVisibility(0);
        if (this.f94481w != null) {
            mo91898m().setVisibility(4);
        }
        this.f94474p.mo25943g();
        if (this.f94475q != null) {
            this.f94475q.mo91881a(this.f94467i, this.f94466h);
        }
    }

    public final void aQ_() {
        if (isViewValid()) {
            if (this.f94685B || this.f94686C) {
                ae_();
            } else if (this.f94474p == null || !this.f94482x) {
                mo91887G();
            } else {
                this.f94474p.setVisibility(4);
                mo91898m().setVisibility(0);
            }
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            if (((C25673a) this.f94473o.mo66539h()).isHasMore()) {
                bd_();
            }
            this.f94474p.mo25950n();
            if (!this.f94467i || this.f94466h != 0) {
                m116662I();
                return;
            }
            if (this.f94471m.getItemCount() != 0 || this.f94471m.f93519e) {
                if (this.f94475q != null) {
                    this.f94475q.mo91882b(this.f94467i, this.f94466h);
                }
            } else if (this.f94475q != null) {
                this.f94475q.mo91881a(this.f94467i, this.f94466h);
            }
            this.f94474p.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo91908p() {
        OnAnimatedScrollListener onAnimatedScrollListener;
        this.f94470l.setOverScrollMode(2);
        mo91909q();
        this.f94470l.setLayoutManager(this.f94472n);
        this.f94470l.mo5525a(mo91884D());
        if (!C7188c.m22428a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.f94470l.mo5528a((C1281m) onAnimatedScrollListener);
        } else {
            onAnimatedScrollListener = null;
        }
        this.f94439A = new C25657a(this.f94470l, onAnimatedScrollListener);
        this.f94470l = C36074j.f94315a.buildBaseRecyclerView(this.f94470l, this);
        mo91885E();
        this.f94470l.setAdapter(this.f94471m);
        mo91886F();
        if (this.f94467i || this.f94478t) {
            mo91887G();
        }
        if (this.f94469k > 0) {
            this.f94470l.setPadding(0, 0, 0, this.f94469k);
        }
        if (C6399b.m19946v()) {
            getView().setBackgroundColor(getContext().getResources().getColor(R.color.aye));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo91899n() {
        DmtTextView dmtTextView;
        boolean z = this.f94467i;
        int i = R.string.cj0;
        if (!z) {
            i = this.f94466h == 0 ? R.string.flx : R.string.fls;
        } else if (this.f94466h == 0) {
            i = R.string.b13;
        } else if (this.f94466h == 1) {
            if (!C43122ff.m136767b()) {
                i = !((Boolean) C23060u.m75742a().mo60076f().mo59877d()).booleanValue() ? R.string.bd2 : ((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0 ? R.string.bz7 : R.string.bz8;
            }
        } else if (this.f94466h == 2) {
            i = R.string.e2w;
        }
        this.f94477s = C10803a.m31631a(getContext());
        DmtTextView d = m116664d(R.string.c48);
        m116664d(i);
        if (!this.f94467i || this.f94466h != 1) {
            if (!this.f94467i && this.f94466h == 1 && !C43122ff.m136767b()) {
                dmtTextView = mo91895b(getContext(), false);
                d.setOnClickListener(new C36349ar(this));
                this.f94477s.mo25963b((View) dmtTextView).mo25966c((View) d);
                this.f94474p.setBuilder(this.f94477s);
            }
        } else if (!C43122ff.m136767b()) {
            if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0) {
                dmtTextView = mo91888a(getContext(), false);
            } else {
                dmtTextView = mo91888a(getContext(), true);
            }
            d.setOnClickListener(new C36349ar(this));
            this.f94477s.mo25963b((View) dmtTextView).mo25966c((View) d);
            this.f94474p.setBuilder(this.f94477s);
        }
        dmtTextView = m116664d(i);
        d.setOnClickListener(new C36349ar(this));
        this.f94477s.mo25963b((View) dmtTextView).mo25966c((View) d);
        this.f94474p.setBuilder(this.f94477s);
    }

    /* renamed from: b */
    public final void mo86903b(boolean z) {
        this.f94685B = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92032c(View view) {
        mo90811A();
    }

    /* renamed from: c */
    public final void mo86904c(boolean z) {
        this.f94686C = z;
    }

    /* renamed from: d */
    private DmtTextView m116664d(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: a */
    public static MTAwemeListFragment m116663a(int i, int i2, String str, boolean z, Bundle bundle) {
        MTAwemeListFragment mTAwemeListFragment = new MTAwemeListFragment();
        bundle.putInt("type", i2);
        bundle.putString("uid", str);
        bundle.putBoolean("is_my_profile", z);
        bundle.putInt("bottom_bar_height", i);
        mTAwemeListFragment.setArguments(bundle);
        return mTAwemeListFragment;
    }
}
