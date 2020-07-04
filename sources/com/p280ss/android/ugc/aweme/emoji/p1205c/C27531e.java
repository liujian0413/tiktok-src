package com.p280ss.android.ugc.aweme.emoji.p1205c;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.common.utility.C6312h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27524h;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.e */
public final class C27531e implements C27524h {

    /* renamed from: a */
    private final EditText f72575a;

    /* renamed from: b */
    private final int f72576b;

    /* renamed from: c */
    private final String f72577c;

    /* renamed from: d */
    private final C27525a f72578d;

    /* renamed from: a */
    public final void mo63239a() {
    }

    /* renamed from: a */
    public final void mo63240a(int i) {
    }

    /* renamed from: a */
    public final void mo63241a(View view, C27517a aVar, int i, int i2) {
    }

    /* renamed from: a */
    public final void mo63242a(C27517a aVar, int i, int i2) {
    }

    /* renamed from: a */
    public final void mo63243a(String str, int i) {
        C27531e eVar;
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            eVar = this;
        } else {
            eVar = null;
        }
        C27531e eVar2 = eVar;
        if (eVar2 != null) {
            if (!C6312h.m19578b()) {
                eVar2 = null;
            }
            if (eVar2 != null) {
                throw new RuntimeException("emoji text is empty");
            }
            return;
        }
        C27532f fVar = C27532f.f72580b;
        if (str == null) {
            C7573i.m23580a();
        }
        fVar.mo70751a(str);
        C27525a aVar = this.f72578d;
        if (aVar != null) {
            aVar.mo70744a(str);
        }
        if (this.f72575a.getText().length() + str.length() > this.f72576b) {
            C10761a.m31403c(C6399b.m19921a(), this.f72577c).mo25750a();
            return;
        }
        int max = Math.max(0, this.f72575a.getSelectionStart());
        int max2 = Math.max(0, this.f72575a.getSelectionEnd());
        if (max == max2) {
            this.f72575a.getText().insert(max, charSequence);
            C27608b.m90502a((TextView) this.f72575a);
        } else {
            try {
                this.f72575a.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        int length = max + str.length();
        int length2 = this.f72575a.length();
        if (length >= length2) {
            this.f72575a.setSelection(length2);
        } else {
            this.f72575a.setSelection(length);
        }
    }

    public C27531e(EditText editText, int i, String str, C27525a aVar) {
        C7573i.m23587b(editText, "editText");
        this.f72575a = editText;
        this.f72576b = i;
        this.f72577c = str;
        this.f72578d = aVar;
    }
}
