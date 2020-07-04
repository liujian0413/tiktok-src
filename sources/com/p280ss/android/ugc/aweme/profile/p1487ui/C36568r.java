package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.r */
final /* synthetic */ class C36568r implements OnClickListener {

    /* renamed from: a */
    private final BindAccountView f95963a;

    /* renamed from: b */
    private final ArrayList f95964b;

    /* renamed from: c */
    private final User f95965c;

    C36568r(BindAccountView bindAccountView, ArrayList arrayList, User user) {
        this.f95963a = bindAccountView;
        this.f95964b = arrayList;
        this.f95965c = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f95963a.mo91962a(this.f95964b, this.f95965c, dialogInterface, i);
    }
}
