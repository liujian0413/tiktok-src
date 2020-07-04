package com.p280ss.android.ugc.trill.language.view;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30477c;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.trill.language.ChooseLanguageAdapter;
import com.p280ss.android.ugc.trill.language.ChooseLanguageAdapter.C45004a;
import com.p280ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.trill.language.view.AppLanguageListFragment */
public class AppLanguageListFragment extends AmeBaseFragment implements C0053p<ArrayList<C30477c>>, C45004a {

    /* renamed from: e */
    public int f115745e;

    /* renamed from: f */
    private AppLanguageViewModel f115746f;

    /* renamed from: g */
    private ChooseLanguageAdapter f115747g;

    /* renamed from: h */
    private int f115748h;
    TextTitleBar mBtnFinish;
    RecyclerView mListLanguage;

    /* renamed from: a */
    public final void mo107557a() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().mo2655c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(ArrayList<C30477c> arrayList) {
        if (!C6307b.m19566a((Collection<T>) arrayList)) {
            if (this.f115747g == null) {
                this.f115747g = new ChooseLanguageAdapter(getContext(), this);
                this.f115747g.f115672a = arrayList;
                this.mListLanguage.setAdapter(this.f115747g);
                return;
            }
            this.f115747g.f115672a = arrayList;
            this.f115747g.notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            this.f115746f = (AppLanguageViewModel) C0069x.m159a(getActivity()).mo147a(AppLanguageViewModel.class);
            this.f115746f.mo107560a().observe(this, this);
            this.f115748h = this.f115746f.mo107559a(getContext());
            this.f115745e = this.f115748h;
        }
    }

    /* renamed from: a */
    public final void mo107513a(int i) {
        if (i != this.f115745e) {
            if (i == this.f115748h) {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.x));
                this.mBtnFinish.getEndText().setEnabled(false);
            } else {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.w));
                this.mBtnFinish.getEndText().setEnabled(true);
            }
            this.f115746f.mo107561a(this.f115745e, i);
            this.f115745e = i;
            this.f115747g.notifyDataSetChanged();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mListLanguage.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.mListLanguage.mo5525a((C1272h) RecyclerItemDecoration.m76865a(getContext()));
        if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            this.mBtnFinish.getTitleView().setTextColor(getResources().getColor(R.color.a5e));
        } else if (C6399b.m19947w()) {
            this.mBtnFinish.getTitleView().setTextColor(getResources().getColor(R.color.ab));
        }
        this.mBtnFinish.setTitle(getText(R.string.je));
        this.mBtnFinish.getEndText().setEnabled(false);
        this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.x));
        this.mBtnFinish.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                if (AppLanguageListFragment.this.getActivity() != null) {
                    AppLanguageListFragment.this.getActivity().getSupportFragmentManager().mo2655c();
                }
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                if (AppLanguageListFragment.this.mBtnFinish == null || AppLanguageListFragment.this.mBtnFinish.getEndText() == null || AppLanguageListFragment.this.mBtnFinish.getEndText().getCurrentTextColor() == AppLanguageListFragment.this.getResources().getColor(R.color.x)) {
                    AppLanguageListFragment.this.mo107557a();
                    return;
                }
                C30468e.m99511a().mo80141a(((C7120e) ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getI18nItems().get(AppLanguageListFragment.this.f115745e)).mo18530a(), ((C7120e) ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getI18nItems().get(AppLanguageListFragment.this.f115745e)).mo18536g(), AppLanguageListFragment.this.getContext());
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74862c();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.at, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
