package com.p280ss.android.ugc.aweme.profile.p1487ui;

import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.profile.presenter.C36041o;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.TempBaseProfileFragment */
public abstract class TempBaseProfileFragment extends AmeBaseFragment implements C36041o {

    /* renamed from: e */
    private HashMap f95251e;

    /* renamed from: R */
    public void mo92342R() {
        if (this.f95251e != null) {
            this.f95251e.clear();
        }
    }

    /* renamed from: k */
    public abstract List<Integer> mo91879k();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92342R();
    }
}
