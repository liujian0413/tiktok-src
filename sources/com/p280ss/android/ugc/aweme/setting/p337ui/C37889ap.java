package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ap */
final /* synthetic */ class C37889ap implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f98730a;

    /* renamed from: b */
    private final EditText f98731b;

    C37889ap(TestSettingFragment testSettingFragment, EditText editText) {
        this.f98730a = testSettingFragment;
        this.f98731b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f98730a.mo95284f(this.f98731b, dialogInterface, i);
    }
}
