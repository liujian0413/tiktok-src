package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33351e;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppElementsAdapter */
public class MicroAppElementsAdapter extends ElementAdapter<MicroAppInfo, C1293v> {

    /* renamed from: c */
    public C33324b f87043c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppElementsAdapter$a */
    static class C33323a extends C1293v {

        /* renamed from: a */
        private RemoteImageView f87044a;

        /* renamed from: b */
        private DmtTextView f87045b;

        /* renamed from: c */
        private DmtTextView f87046c;

        private C33323a(View view) {
            super(view);
            m107767a(view);
        }

        /* renamed from: a */
        public final void mo85470a(MicroAppInfo microAppInfo) {
            if (microAppInfo != null) {
                C23323e.m76514a(this.f87044a, microAppInfo.getIcon());
                this.f87045b.setText(microAppInfo.getName());
                this.f87046c.setText(microAppInfo.getSummary());
            }
        }

        /* renamed from: a */
        private void m107767a(View view) {
            this.f87044a = (RemoteImageView) view.findViewById(R.id.ad1);
            this.f87045b = (DmtTextView) view.findViewById(R.id.ad5);
            this.f87046c = (DmtTextView) view.findViewById(R.id.ad7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppElementsAdapter$b */
    public interface C33324b {
        /* renamed from: a */
        void mo85471a();
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppElementsAdapter$c */
    static class C33325c extends C1293v {

        /* renamed from: a */
        private RemoteImageView f87047a;

        /* renamed from: b */
        private RemoteImageView f87048b;

        /* renamed from: c */
        private RemoteImageView f87049c;

        /* renamed from: d */
        private String f87050d;

        /* renamed from: e */
        private String f87051e;

        /* renamed from: f */
        private String f87052f;

        /* renamed from: a */
        public final void mo85473a() {
            C1592h.m7853a(C33332g.f87067a).mo6876a((C1591g<TResult, TContinuationResult>) new C33333h<TResult,TContinuationResult>(this), C1592h.f5958b);
        }

        private C33325c(View view) {
            super(view);
            m107770a(view);
        }

        /* renamed from: a */
        private void m107770a(View view) {
            this.f87047a = (RemoteImageView) view.findViewById(R.id.ad2);
            this.f87048b = (RemoteImageView) view.findViewById(R.id.ad3);
            this.f87049c = (RemoteImageView) view.findViewById(R.id.ad4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Void mo85472a(C1592h hVar) throws Exception {
            if (((C33351e) hVar.mo6890e()).status_code == 0) {
                List a = ((C33351e) hVar.mo6890e()).mo85511a();
                this.f87050d = ((MicroAppInfo) a.get(0)).getIcon();
                if (!TextUtils.isEmpty(this.f87050d)) {
                    C23323e.m76514a(this.f87047a, this.f87050d);
                }
                this.f87051e = ((MicroAppInfo) a.get(1)).getIcon();
                if (!TextUtils.isEmpty(this.f87051e)) {
                    C23323e.m76514a(this.f87048b, this.f87051e);
                }
                this.f87052f = ((MicroAppInfo) a.get(2)).getIcon();
                if (!TextUtils.isEmpty(this.f87052f)) {
                    C23323e.m76514a(this.f87049c, this.f87052f);
                }
            }
            return null;
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public int getItemCount() {
        if (this.f86998a == null) {
            return 1;
        }
        return this.f86998a.size() + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85468a(View view) {
        if (this.f87043c != null) {
            this.f87043c.mo85471a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85469a(MicroAppInfo microAppInfo, View view) {
        if (this.f86999b != null) {
            this.f86999b.mo85483a(microAppInfo);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (i >= 0 && i <= getItemCount() - 1) {
            if (vVar instanceof C33325c) {
                C33325c cVar = (C33325c) vVar;
                cVar.mo85473a();
                cVar.itemView.setOnClickListener(new C33330e(this));
                return;
            }
            if (vVar instanceof C33323a) {
                MicroAppInfo microAppInfo = (MicroAppInfo) this.f86998a.get(i - 1);
                C33323a aVar = (C33323a) vVar;
                aVar.mo85470a(microAppInfo);
                aVar.itemView.setOnClickListener(new C33331f(this, microAppInfo));
            }
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C33325c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t4, viewGroup, false));
            case 1:
                return new C33323a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t1, viewGroup, false));
            default:
                return null;
        }
    }
}
