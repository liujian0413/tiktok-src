package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C40116b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment */
public abstract class AVMediaChooseBaseFragment extends AmeBaseFragment {

    /* renamed from: e */
    protected MvImageChooseAdapter f104136e;

    /* renamed from: f */
    protected RecyclerView f104137f;

    /* renamed from: g */
    public C40116b f104138g;

    /* renamed from: h */
    protected View f104139h;

    /* renamed from: i */
    protected DmtTextView f104140i;

    /* renamed from: j */
    protected DmtLoadingLayout f104141j;

    /* renamed from: k */
    protected int f104142k = C40173d.f104443a.mo99941b();

    /* renamed from: l */
    protected boolean f104143l;

    /* renamed from: m */
    public boolean f104144m;

    /* renamed from: n */
    protected List<String> f104145n = new ArrayList();

    /* renamed from: a */
    public final void mo99795a() {
        if (this.f104136e != null) {
            this.f104136e.mo99849a();
        }
    }

    /* renamed from: d */
    public final void mo99800d() {
        if (this.f104136e != null) {
            this.f104136e.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo99796a(int i) {
        this.f104142k = i;
        if (this.f104136e != null) {
            this.f104136e.f104263a = i;
        }
    }

    /* renamed from: a */
    public final void mo99798a(List<String> list) {
        this.f104143l = true;
        this.f104145n.addAll(list);
    }

    /* renamed from: a */
    public final void mo99797a(int i, int i2) {
        if (this.f104136e != null) {
            this.f104136e.mo99850a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo99799a(List<MyMediaModel> list, boolean z) {
        if (z) {
            HashMap<String, MyMediaModel> hashMap = null;
            if (this.f104136e != null) {
                hashMap = this.f104136e.f104265c;
            }
            if (hashMap != null && hashMap.size() != 0) {
                for (MyMediaModel myMediaModel : list) {
                    if (myMediaModel != null) {
                        MyMediaModel myMediaModel2 = (MyMediaModel) hashMap.get(myMediaModel.f88156b);
                        if (myMediaModel2 != null) {
                            myMediaModel.f104288p = myMediaModel2.f104288p;
                        }
                    }
                }
            }
        }
    }
}
