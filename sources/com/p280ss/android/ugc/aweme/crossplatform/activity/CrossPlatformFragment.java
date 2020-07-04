package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25832a;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment */
public class CrossPlatformFragment extends AbsFragment {

    /* renamed from: e */
    public MixActivityContainer f68252e;

    /* renamed from: f */
    private C25886b f68253f;

    /* renamed from: g */
    private C25965c f68254g;

    /* renamed from: h */
    private C25821f f68255h;

    /* renamed from: a */
    private int m84851a() {
        return R.layout.b5;
    }

    /* renamed from: a */
    public final void mo67107a(C25821f fVar) {
        this.f68255h = fVar;
        if (this.f68252e != null) {
            this.f68252e.mo67086a(fVar);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.putBoolean("webview_progress_bar", C25832a.m84960a(arguments));
        this.f68253f = C25887a.m85153a(arguments);
        m84852a(this.f68253f);
    }

    /* renamed from: a */
    private void m84852a(C25886b bVar) {
        this.f68252e = new MixActivityContainer(getActivity(), bVar);
        this.f68252e.mo67086a(this.f68255h);
        this.f68252e.mo67087a(this.f68254g);
        getLifecycle().mo55a(this.f68252e);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f68252e.mo67094k();
        super.onViewCreated(view, bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(m84851a(), viewGroup, false);
    }
}
