package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bg */
final /* synthetic */ class C36366bg implements OnClickListener {

    /* renamed from: a */
    private final MusAbsProfileFragment f95512a;

    /* renamed from: b */
    private final User f95513b;

    C36366bg(MusAbsProfileFragment musAbsProfileFragment, User user) {
        this.f95512a = musAbsProfileFragment;
        this.f95513b = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f95512a.mo92048a(this.f95513b, dialogInterface, i);
    }
}
