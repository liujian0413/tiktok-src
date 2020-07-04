package com.p280ss.android.ugc.aweme.imported;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.imported.e */
public final class C32069e {

    /* renamed from: a */
    private List<String> f83870a = new ArrayList();

    /* renamed from: b */
    private String f83871b;

    /* renamed from: c */
    private C6600e f83872c = C35563c.f93239b;

    /* renamed from: d */
    private boolean f83873d = true;

    /* renamed from: c */
    private void m104100c() {
        this.f83873d = true;
    }

    /* renamed from: a */
    private void m104098a() {
        this.f83873d = false;
        m104099b();
    }

    /* renamed from: b */
    private void m104099b() {
        this.f83871b = null;
        this.f83870a.clear();
    }

    /* renamed from: a */
    public final void mo83034a(EditText editText) {
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    C32069e.this.mo83035a(editable.toString());
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo83036b(String str) {
        if (!this.f83870a.isEmpty() && this.f83873d) {
            C6907h.m21524a("input_word_cut", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("input_content", this.f83871b).mo59973a("input_content_cut", this.f83872c.mo15979b((Object) this.f83870a)).f60753a);
            m104098a();
        }
    }

    /* renamed from: a */
    public final void mo83035a(String str) {
        if (TextUtils.isEmpty(str)) {
            m104100c();
        } else if (this.f83873d) {
            if (TextUtils.isEmpty(this.f83871b)) {
                this.f83870a.add(str);
                this.f83871b = str;
                return;
            }
            int length = this.f83871b.length();
            int length2 = str.length();
            if (length != length2) {
                if (length > length2) {
                    m104098a();
                } else if (!str.startsWith(this.f83871b)) {
                    m104098a();
                } else {
                    this.f83870a.add(str.substring(length));
                    this.f83871b = str;
                }
            }
        }
    }
}
