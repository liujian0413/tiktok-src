package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget.TimeLockDesc;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockAboutFragmentV2_ViewBinding */
public class TeenagerLockAboutFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TeenagerLockAboutFragmentV2 f60273a;

    public void unbind() {
        TeenagerLockAboutFragmentV2 teenagerLockAboutFragmentV2 = this.f60273a;
        if (teenagerLockAboutFragmentV2 != null) {
            this.f60273a = null;
            teenagerLockAboutFragmentV2.desc1 = null;
            teenagerLockAboutFragmentV2.desc2 = null;
            teenagerLockAboutFragmentV2.desc3 = null;
            teenagerLockAboutFragmentV2.autoOpenTimelock = null;
            teenagerLockAboutFragmentV2.mBetaDes = null;
            teenagerLockAboutFragmentV2.mTeenagePolicy = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TeenagerLockAboutFragmentV2_ViewBinding(TeenagerLockAboutFragmentV2 teenagerLockAboutFragmentV2, View view) {
        this.f60273a = teenagerLockAboutFragmentV2;
        teenagerLockAboutFragmentV2.desc1 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.dgr, "field 'desc1'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.desc2 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.dgs, "field 'desc2'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.desc3 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.dgt, "field 'desc3'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.autoOpenTimelock = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.dgu, "field 'autoOpenTimelock'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.mBetaDes = Utils.findRequiredView(view, R.id.lb, "field 'mBetaDes'");
        teenagerLockAboutFragmentV2.mTeenagePolicy = (TextView) Utils.findRequiredViewAsType(view, R.id.dgq, "field 'mTeenagePolicy'", TextView.class);
    }
}
