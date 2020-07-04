package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ar */
final /* synthetic */ class C37891ar implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f98734a;

    /* renamed from: b */
    private final EditText f98735b;

    C37891ar(TestSettingFragment testSettingFragment, EditText editText) {
        this.f98734a = testSettingFragment;
        this.f98735b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f98734a.mo95281d(this.f98735b, dialogInterface, i);
    }
}
