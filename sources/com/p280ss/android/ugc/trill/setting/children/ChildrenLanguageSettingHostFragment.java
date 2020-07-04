package com.p280ss.android.ugc.trill.setting.children;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment */
public class ChildrenLanguageSettingHostFragment extends AmeBaseFragment {

    /* renamed from: e */
    public C45069a f115823e;
    CommonItemView mChangeLanguageItem;
    TextView mTitle;
    View mTitleLayout;

    /* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment$a */
    public interface C45069a {
        /* renamed from: a */
        void mo107601a(Bundle bundle);
    }

    public void changeLanguage() {
        Bundle bundle = new Bundle();
        if (this.f115823e != null) {
            this.f115823e.mo107601a(bundle);
        }
    }

    /* renamed from: a */
    private void m142145a() {
        this.mTitle.setText(R.string.by9);
        if (C6399b.m19946v()) {
            this.mTitleLayout.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        this.mChangeLanguageItem.setLeftText(C30476b.m99557c(getContext()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void exit(View view) {
        getActivity().finish();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m142145a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ne, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
