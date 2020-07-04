package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.an */
final /* synthetic */ class C37887an implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f98727a;

    /* renamed from: b */
    private final EditText f98728b;

    C37887an(TestSettingFragment testSettingFragment, EditText editText) {
        this.f98727a = testSettingFragment;
        this.f98728b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f98727a.mo95275a(this.f98728b, dialogInterface, i);
    }
}
