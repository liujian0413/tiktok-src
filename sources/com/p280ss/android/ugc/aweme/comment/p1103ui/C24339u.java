package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27524h;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27532f;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.u */
public final class C24339u implements C27524h {

    /* renamed from: a */
    public int f64256a;

    /* renamed from: b */
    private EditText f64257b;

    /* renamed from: c */
    private InputConnection f64258c = this.f64257b.onCreateInputConnection(new EditorInfo());

    /* renamed from: d */
    private C24318aq f64259d;

    /* renamed from: a */
    public final void mo63239a() {
        this.f64259d.mo63173f();
    }

    /* renamed from: a */
    public final void mo63240a(int i) {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.f64258c != null) {
            this.f64258c.sendKeyEvent(keyEvent);
        } else {
            this.f64257b.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: a */
    public final void mo63243a(String str, int i) {
        if (C24220a.m79551a().isMiniEmojiPanelEnabled()) {
            C27532f.f72580b.mo70751a(str);
            if (i == 2) {
                this.f64259d.mo63154a(str, i);
            }
        }
        if (this.f64257b.getText().length() + str.length() > this.f64256a) {
            C10761a.m31403c((Context) C29960a.m98230a(), C29960a.m98230a().getResources().getString(R.string.dm1, new Object[]{Integer.valueOf(this.f64256a)})).mo25750a();
            return;
        }
        int selectionStart = this.f64257b.getSelectionStart();
        int selectionEnd = this.f64257b.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.f64257b.getText().insert(max, str);
        } else {
            try {
                this.f64257b.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        int length = max + str.length();
        if (length >= this.f64257b.length()) {
            this.f64257b.setSelection(this.f64257b.length());
        } else {
            this.f64257b.setSelection(length);
        }
    }

    C24339u(EditText editText, int i, C24318aq aqVar) {
        this.f64257b = editText;
        this.f64256a = i;
        this.f64259d = aqVar;
    }

    /* renamed from: a */
    public final void mo63242a(C27517a aVar, int i, int i2) {
        this.f64259d.mo63153a(aVar.f72559d, i, i2);
    }

    /* renamed from: a */
    public final void mo63241a(View view, C27517a aVar, int i, int i2) {
        this.f64259d.mo63149a(view, aVar.f72559d, i, i2);
    }
}
