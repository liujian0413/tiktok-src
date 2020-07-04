package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui.FindPswByEmailActivity;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusPasswordLoginFragment */
public class MusPasswordLoginFragment extends BaseMusPasswordLoginFragment {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57517a() {
        Intent intent = new Intent(getActivity(), FindPswByEmailActivity.class);
        if (getArguments() != null) {
            intent.putExtras(getArguments());
        }
        intent.putExtra("forget_psw_from_tt_email", true);
        startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
    }
}
