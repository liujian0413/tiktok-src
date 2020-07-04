package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.share.C37998c;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40232d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.PublishDialogFragment */
public class PublishDialogFragment extends Fragment implements C40023l<CreateAwemeResponse> {

    /* renamed from: a */
    protected CircularProgressView f99680a;

    /* renamed from: b */
    protected TextView f99681b;

    /* renamed from: c */
    public C40232d f99682c;

    /* renamed from: d */
    private int f99683d;

    /* renamed from: e */
    private boolean f99684e;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void onSynthetiseSuccess(String str) {
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public void onDestroy() {
        m122663c();
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo96122a() {
        this.mFragmentManager.mo2645a().mo2605c(this).mo2606d();
    }

    /* renamed from: b */
    public final void mo96124b() {
        this.mFragmentManager.mo2645a().mo2601b(this).mo2606d();
    }

    public void dismiss() {
        this.mFragmentManager.mo2645a().mo2587a((Fragment) this).mo2604c();
    }

    /* renamed from: c */
    private void m122663c() {
        if (this.mFragmentManager != null) {
            this.mFragmentManager.mo2645a().mo2587a((Fragment) this).mo2606d();
        }
    }

    /* renamed from: d */
    private void m122664d() {
        if (getContext() != null) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showPoiRateUploadVideoSuccessDialog(getContext());
        }
    }

    /* renamed from: a */
    private void m122660a(int i) {
        this.f99683d = i;
        m122662b(i);
    }

    public void onError(VideoPublishException videoPublishException) {
        this.f99684e = false;
        m122663c();
    }

    /* renamed from: b */
    private void m122662b(int i) {
        if (this.f99680a != null) {
            this.f99680a.setProgress((float) i);
            TextView textView = this.f99681b;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
        }
    }

    public void onProgressUpdate(int i, boolean z) {
        m122660a(i);
        if (z && !this.f99684e) {
            this.f99684e = true;
            m122664d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(CreateAwemeResponse createAwemeResponse, boolean z) {
        this.f99684e = false;
        new C37998c().mo95579a(createAwemeResponse.aweme);
        m122663c();
    }

    /* renamed from: a */
    public final void mo96123a(C0608j jVar, String str) {
        jVar.mo2645a().mo2586a(R.id.dce, this, str).mo2606d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f99680a = (CircularProgressView) view.findViewById(R.id.b_w);
        this.f99680a.setIndeterminate(false);
        this.f99681b = (TextView) view.findViewById(R.id.cky);
        m122662b(this.f99683d);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.a5_, viewGroup, false);
    }
}
