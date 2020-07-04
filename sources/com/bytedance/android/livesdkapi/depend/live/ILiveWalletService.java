package com.bytedance.android.livesdkapi.depend.live;

import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2324b;

public interface ILiveWalletService extends C2324b {
    DialogFragment createRechargeDialogFragment(FragmentActivity fragmentActivity, C9334h hVar, Bundle bundle);

    Fragment getFirstChargeRewardFragment(int i, int i2);
}
