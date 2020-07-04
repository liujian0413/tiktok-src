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
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30467d;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.trill.language.ChooseLanguageAdapter;
import com.p280ss.android.ugc.trill.language.ChooseLanguageAdapter.C45004a;
import com.p280ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.trill.language.view.LanguageListFragment */
public class LanguageListFragment extends AmeBaseFragment implements C0053p<ArrayList<C30477c>>, C45004a {

    /* renamed from: e */
    public ContentPreferenceViewModel f115751e;

    /* renamed from: f */
    public int f115752f;

    /* renamed from: g */
    private ChooseLanguageAdapter f115753g;

    /* renamed from: h */
    private int f115754h;
    TextTitleBar mBtnFinish;
    RecyclerView mListLanguage;

    public void onResume() {
        super.onResume();
        if (this.f115751e != null) {
            this.f115751e.mo107576h();
        }
    }

    /* renamed from: a */
    public final void mo107558a() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().mo2655c();
        }
    }

    /* renamed from: a */
    public static ContentLanguage m142051a(C30477c cVar) {
        if (cVar == null) {
            return null;
        }
        ContentLanguage contentLanguage = new ContentLanguage();
        if (cVar.f80072b instanceof C30467d) {
            C30467d dVar = (C30467d) cVar.f80072b;
            contentLanguage.setEnglishName(dVar.mo18531b());
            contentLanguage.setLanguageCode(dVar.f80046a);
            contentLanguage.setLocalName(cVar.mo80152a());
            return contentLanguage;
        }
        throw new IllegalStateException("请传I18nLanguageItem");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            this.f115751e = (ContentPreferenceViewModel) C0069x.m159a(getActivity()).mo147a(ContentPreferenceViewModel.class);
            this.f115751e.mo107573e().observe(this, this);
            this.f115754h = this.f115751e.mo107562a(getContext());
            this.f115752f = this.f115754h;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(ArrayList<C30477c> arrayList) {
        if (!C6307b.m19566a((Collection<T>) arrayList)) {
            if (this.f115753g == null) {
                this.f115753g = new ChooseLanguageAdapter(getContext(), this);
                this.f115753g.f115672a = arrayList;
                this.mListLanguage.setAdapter(this.f115753g);
                return;
            }
            this.f115753g.f115672a = arrayList;
            this.f115753g.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo107513a(int i) {
        if (i != this.f115752f) {
            if (i == this.f115754h) {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.x));
                this.mBtnFinish.getEndText().setEnabled(false);
            } else {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.w));
                this.mBtnFinish.getEndText().setEnabled(true);
            }
            this.f115751e.mo107564a(this.f115752f, i);
            this.f115752f = i;
            this.f115753g.notifyDataSetChanged();
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
        this.mBtnFinish.setTitle(getText(R.string.ags));
        this.mBtnFinish.getEndText().setEnabled(false);
        this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.x));
        this.mBtnFinish.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                if (LanguageListFragment.this.getActivity() != null) {
                    LanguageListFragment.this.getActivity().getSupportFragmentManager().mo2655c();
                }
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                if (LanguageListFragment.this.mBtnFinish == null || LanguageListFragment.this.mBtnFinish.getEndText() == null || LanguageListFragment.this.mBtnFinish.getEndText().getCurrentTextColor() == LanguageListFragment.this.getResources().getColor(R.color.x)) {
                    LanguageListFragment.this.mo107558a();
                    return;
                }
                if (LanguageListFragment.this.f115752f != -1) {
                    LanguageListFragment.this.f115751e.mo107565a(LanguageListFragment.m142051a((C30477c) ((ArrayList) LanguageListFragment.this.f115751e.mo107573e().getValue()).get(LanguageListFragment.this.f115752f)));
                    LanguageListFragment.this.mo107558a();
                }
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.at, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
