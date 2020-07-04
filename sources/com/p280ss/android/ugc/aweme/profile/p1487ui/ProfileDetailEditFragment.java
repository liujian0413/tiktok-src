package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity.C36221a;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment */
public class ProfileDetailEditFragment extends DialogFragment {

    /* renamed from: a */
    public C36221a f95016a;

    /* renamed from: b */
    private HashMap f95017b;

    /* renamed from: a */
    public void mo92207a() {
        if (this.f95017b != null) {
            this.f95017b.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92207a();
    }

    /* renamed from: a */
    public final void mo92208a(C36221a aVar) {
        C7573i.m23587b(aVar, "mProfileReturnListener");
        this.f95016a = aVar;
    }

    public void show(C0608j jVar, String str) {
        C7573i.m23587b(jVar, "manager");
        C7573i.m23587b(str, "tag");
        try {
            super.show(jVar, str);
        } catch (Exception unused) {
        }
    }
}
