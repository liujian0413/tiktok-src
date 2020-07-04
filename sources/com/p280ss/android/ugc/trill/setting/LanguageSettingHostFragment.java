package com.p280ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.LanguageSettingHostFragment */
public class LanguageSettingHostFragment extends AmeBaseFragment implements OnClickListener {

    /* renamed from: e */
    public C45056a f115798e;
    CommonItemView mChangeLanguageItem;
    TextView mTitle;
    View mTitleLayout;

    /* renamed from: com.ss.android.ugc.trill.setting.LanguageSettingHostFragment$a */
    public interface C45056a {
        /* renamed from: a */
        void mo107585a(Bundle bundle);
    }

    /* renamed from: d */
    private void m142120d() {
        this.mChangeLanguageItem.setOnClickListener(this);
    }

    /* renamed from: a */
    private void m142119a() {
        this.mTitle.setText(R.string.by9);
        if (C6399b.m19946v()) {
            this.mTitleLayout.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        if (C6399b.m19944t()) {
            this.mChangeLanguageItem.setRightIconRes(0);
        }
        this.mChangeLanguageItem.setLeftText(C30476b.m99557c(getContext()));
        m142120d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void exit(View view) {
        getActivity().finish();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.uw) {
            Bundle bundle = new Bundle();
            if (this.f115798e != null) {
                this.f115798e.mo107585a(bundle);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m142119a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ok, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
