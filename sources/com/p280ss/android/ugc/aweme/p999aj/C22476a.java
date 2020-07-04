package com.p280ss.android.ugc.aweme.p999aj;

import android.app.Fragment;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;

/* renamed from: com.ss.android.ugc.aweme.aj.a */
public final class C22476a extends Fragment {

    /* renamed from: a */
    C22480b f59924a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("permissions"), 1);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f59924a != null) {
            this.f59924a.mo53549a(strArr, iArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
