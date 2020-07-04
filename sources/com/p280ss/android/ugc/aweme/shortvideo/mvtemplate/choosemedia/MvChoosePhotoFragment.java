package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoFragment */
public class MvChoosePhotoFragment extends AVMediaChooseBaseFragment {

    /* renamed from: o */
    public String f104243o;

    /* renamed from: p */
    public boolean f104244p;

    /* renamed from: q */
    private DmtTextView f104245q;

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: e */
    private void m128199e() {
        this.f104137f = (RecyclerView) this.f104139h.findViewById(R.id.aya);
        this.f104140i = (DmtTextView) this.f104139h.findViewById(R.id.avm);
        this.f104245q = (DmtTextView) this.f104139h.findViewById(R.id.c4l);
        this.f104141j = (DmtLoadingLayout) this.f104139h.findViewById(R.id.ayd);
    }

    /* renamed from: f */
    private void m128200f() {
        String a = C40173d.f104443a.mo99938a(this.f104139h.getContext());
        if (this.f104144m) {
            a = C1642a.m8034a(getString(R.string.dcy), new Object[]{Integer.valueOf(this.f104142k)});
        }
        this.f104137f.setLayoutManager(new WrapGridLayoutManager(null, 4));
        this.f104137f.mo5525a((C1272h) new GridSpacingItemDecoration(4, (int) C9738o.m28708b(getContext(), 1.0f), false));
        MvImageChooseAdapter mvImageChooseAdapter = new MvImageChooseAdapter(getContext(), 4, 1.0d, 1.5f, 0, 2);
        this.f104136e = mvImageChooseAdapter;
        this.f104136e.f104267e = this.f104138g;
        this.f104136e.mo99854a(this.f104244p);
        this.f104136e.f104266d = new C40147t(this);
        this.f104136e.f104270h = this.f104137f;
        this.f104137f.setAdapter(this.f104136e);
        if (this.f104143l) {
            this.f104136e.mo99856b(this.f104145n);
        }
        if (this.f104136e != null) {
            this.f104136e.f104263a = this.f104142k;
            this.f104136e.f104264b = a;
        }
        if (!TextUtils.isEmpty(this.f104243o)) {
            this.f104140i.setVisibility(0);
            this.f104140i.setText(this.f104243o);
        } else {
            this.f104140i.setVisibility(8);
        }
        this.f104141j.setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m128200f();
    }

    /* renamed from: a */
    public final void mo99799a(List<MyMediaModel> list, boolean z) {
        super.mo99799a(list, z);
        if (list != null) {
            this.f104141j.setVisibility(8);
            if (list.isEmpty()) {
                this.f104245q.setVisibility(0);
                this.f104245q.setText(R.string.cmc);
            } else {
                this.f104245q.setVisibility(8);
            }
            if (z) {
                this.f104136e.mo99852a((Collection<? extends MyMediaModel>) list);
            } else {
                this.f104136e.mo99853a(list);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99839a(View view, MediaModel mediaModel) {
        if (mediaModel != null) {
            if (this.f104136e.f104268f) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(mediaModel.f88156b);
                String sb2 = sb.toString();
                C35563c.f93240c.mo83126a(getActivity(), view, (((float) C9738o.m28691a(getContext())) * 1.0f) / ((float) C9738o.m28709b(getContext())), sb2);
            } else if (!C7276d.m22812b(mediaModel.f88156b)) {
                C10761a.m31403c(getContext(), getContext().getString(R.string.cu2)).mo25750a();
            } else {
                if (this.f104138g != null) {
                    this.f104138g.mo99834a(mediaModel);
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f104139h = layoutInflater.inflate(R.layout.se, viewGroup, false);
        m128199e();
        return this.f104139h;
    }
}
