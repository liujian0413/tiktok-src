package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.challenge.adapter.ChallengeAdapter;
import com.p280ss.android.ugc.aweme.challenge.adapter.SearchChallengeAdapter;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23659b;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23676e;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23678f;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23681h;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23684k;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40248a;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.AddChallengeFragment */
public class AddChallengeFragment extends AmeBaseFragment implements C23684k, C25675c<Challenge> {

    /* renamed from: e */
    private ChallengeAdapter f62470e;

    /* renamed from: f */
    private SearchChallengeAdapter f62471f;

    /* renamed from: g */
    private C25674b<C23676e> f62472g;

    /* renamed from: h */
    private C23681h f62473h;

    /* renamed from: i */
    private String f62474i;
    EditText mEditView;
    LinearLayout mHideChallengeLayout;
    View mLabelView;
    RecyclerView mListView;
    ImageView mLoadingView;
    TextView mSendView;
    ButtonTitleBar mTitleBar;
    int margin;

    /* renamed from: S_ */
    public final void mo59098S_() {
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final void aD_() {
    }

    public final void aE_() {
    }

    public final void ae_() {
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    /* renamed from: b */
    public final void mo59108b(List<Challenge> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Challenge> list, boolean z) {
    }

    /* renamed from: f */
    private void m77681f() {
        m77682g();
        this.mLabelView.setVisibility(4);
        this.mHideChallengeLayout.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                FragmentActivity activity = AddChallengeFragment.this.getActivity();
                activity.setResult(0, new Intent());
                activity.onBackPressed();
            }
        });
    }

    /* renamed from: i */
    private void m77683i() {
        this.mLoadingView.clearAnimation();
        this.mLoadingView.setVisibility(4);
        this.mSendView.setText(R.string.yz);
    }

    /* renamed from: j */
    private void m77684j() {
        if (isViewValid()) {
            C25713b.m84474a((Activity) getActivity(), (View) this.mEditView);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f62473h != null) {
            this.f62473h.mo59134U_();
        }
        if (this.f62472g != null) {
            this.f62472g.mo59134U_();
        }
    }

    /* renamed from: g */
    private void m77682g() {
        this.mTitleBar.setTitle((int) R.string.ek);
        this.mTitleBar.getTitleView().setTextColor(getResources().getColor(R.color.aye));
        if (!C6399b.m19944t()) {
            this.mTitleBar.getTitleView().setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.a4z, 0);
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                FragmentActivity activity = AddChallengeFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        });
        this.mTitleBar.mo25857a(false);
    }

    /* renamed from: e */
    public final void mo61614e() {
        if (isViewValid() && getActivity() != null) {
            this.mLoadingView.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.a2));
            this.mLoadingView.setVisibility(0);
            this.mSendView.setText("");
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mLabelView.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo61613d(Exception exc) {
        if (isViewValid()) {
            m77683i();
            m77684j();
        }
    }

    /* renamed from: a */
    public static AddChallengeFragment m77680a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        AddChallengeFragment addChallengeFragment = new AddChallengeFragment();
        addChallengeFragment.setArguments(bundle);
        return addChallengeFragment;
    }

    /* renamed from: a */
    public final void mo61612a(SearchChallengeList searchChallengeList) {
        List<SearchChallenge> list;
        if (isViewValid()) {
            m77683i();
            SearchChallengeAdapter searchChallengeAdapter = this.f62471f;
            if (searchChallengeList == null) {
                list = null;
            } else {
                list = searchChallengeList.items;
            }
            searchChallengeAdapter.mo58045a(list);
            this.mListView.setAdapter(this.f62471f);
            this.mLabelView.setVisibility(8);
            m77684j();
        }
    }

    public void onTextChange(CharSequence charSequence) {
        int i;
        this.mSendView.setEnabled(!TextUtils.isEmpty(charSequence));
        if (TextUtils.isEmpty(charSequence)) {
            this.mListView.setAdapter(this.f62470e);
            this.f62471f.mo58045a(null);
            View view = this.mLabelView;
            if (this.f62470e.getItemCount() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void click(View view) {
        if (view.getId() == R.id.d1i) {
            String trim = this.mEditView.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!C23746a.m77872a(getActivity())) {
                    C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                    return;
                }
                this.f62473h.mo56976a(trim, this.f62474i);
                C6907h.onEvent(MobClick.obtain().setEventName("search").setLabelName("add_challenge").setJsonObject(new C6869c().mo16887a(POIService.KEY_KEYWORD, trim).mo16888b()));
            }
        }
    }

    @C7709l
    public void onChallengeReadyEvent(C23659b bVar) {
        if (bVar.f62377b == 0) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(bVar.f62376a);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intent intent = new Intent();
                new C40248a();
                intent.putExtra("challenge", C40248a.m128593a(bVar.f62376a));
                activity.setResult(-1, intent);
                activity.onBackPressed();
            }
            C6907h.onEvent(MobClick.obtain().setEventName("add_challenge").setLabelName("publish").setValue(bVar.f62376a.getCid()).setExtValueLong(0));
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Challenge> list, boolean z) {
        if (isViewValid() && this.f62471f.getItemCount() == 0) {
            this.f62470e.mo58045a(list);
            this.mLabelView.setVisibility(0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m77681f();
        this.f62471f = new SearchChallengeAdapter();
        this.f62470e = new ChallengeAdapter();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setAdapter(this.f62470e);
        this.mListView.mo5525a((C1272h) new ChallengeItemDecoration(getActivity(), R.drawable.wl).mo61721a(this.margin, 0, this.margin, 0));
        this.f62472g = new C25674b<>();
        this.f62472g.mo66537a(this);
        this.f62472g.mo66536a(new C23676e());
        this.f62473h = new C23681h();
        this.f62473h.mo66537a(this);
        this.f62473h.mo66536a(new C23678f());
        this.f62472g.mo56976a(Integer.valueOf(1));
        m77684j();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.n5, viewGroup, false);
        this.f62474i = getArguments().getString("from");
        return inflate;
    }
}
