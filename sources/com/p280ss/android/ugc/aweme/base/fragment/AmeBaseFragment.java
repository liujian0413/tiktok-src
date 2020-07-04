package com.p280ss.android.ugc.aweme.base.fragment;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.p280ss.android.ugc.common.component.fragment.ComponentFragment;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment */
public abstract class AmeBaseFragment extends ComponentFragment implements C6863c {

    /* renamed from: I */
    public boolean f19556I;

    /* renamed from: e */
    private Unbinder f19557e;

    /* renamed from: Y_ */
    public boolean mo16933Y_() {
        return false;
    }

    public Analysis getAnalysis() {
        return null;
    }

    /* renamed from: C */
    public SparseArray<C43676b> mo16932C() {
        return new SparseArray<>();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f19557e != null) {
            this.f19557e.unbind();
        }
        C7705c a = C7705c.m23799a();
        if (mo16933Y_() && a.mo20392b((Object) this)) {
            a.mo20393c((Object) this);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder("当前页面：");
        sb.append(getClass().getSimpleName());
        C6921a.m21555a(sb.toString());
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f19557e = ButterKnife.bind((Object) this, view);
        super.onViewCreated(view, bundle);
        C7705c a = C7705c.m23799a();
        if (!a.mo20392b((Object) this) && mo16933Y_()) {
            a.mo20389a((Object) this);
        }
    }
}
