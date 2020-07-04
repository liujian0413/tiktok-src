package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.aq */
final /* synthetic */ class C37890aq implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f98732a;

    /* renamed from: b */
    private final EditText f98733b;

    C37890aq(TestSettingFragment testSettingFragment, EditText editText) {
        this.f98732a = testSettingFragment;
        this.f98733b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f98732a.mo95283e(this.f98733b, dialogInterface, i);
    }
}
