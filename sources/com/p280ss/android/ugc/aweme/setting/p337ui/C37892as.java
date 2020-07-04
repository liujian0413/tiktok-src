package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.EditText;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.as */
final /* synthetic */ class C37892as implements OnClickListener {

    /* renamed from: a */
    private final Editor f98736a;

    /* renamed from: b */
    private final EditText f98737b;

    /* renamed from: c */
    private final EditText f98738c;

    C37892as(Editor editor, EditText editText, EditText editText2) {
        this.f98736a = editor;
        this.f98737b = editText;
        this.f98738c = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TestSettingFragment.m121071a(this.f98736a, this.f98737b, this.f98738c, dialogInterface, i);
    }
}
