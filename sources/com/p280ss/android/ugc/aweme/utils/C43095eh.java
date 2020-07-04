package com.p280ss.android.ugc.aweme.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.eh */
public final class C43095eh {

    /* renamed from: a */
    private List<String> f111714a = new ArrayList();

    /* renamed from: b */
    private String f111715b;

    /* renamed from: c */
    private C6600e f111716c = new C6600e();

    /* renamed from: d */
    private boolean f111717d = true;

    /* renamed from: c */
    private void m136702c() {
        this.f111717d = true;
    }

    /* renamed from: a */
    private void m136700a() {
        this.f111717d = false;
        m136701b();
    }

    /* renamed from: b */
    private void m136701b() {
        this.f111715b = null;
        this.f111714a.clear();
    }

    /* renamed from: a */
    public final void mo104752a(EditText editText) {
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    C43095eh.this.mo104753a(editable.toString());
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo104754b(String str) {
        if (!this.f111714a.isEmpty() && this.f111717d) {
            C6907h.m21524a("input_word_cut", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("input_content", this.f111715b).mo59973a("input_content_cut", this.f111716c.mo15979b((Object) this.f111714a)).f60753a);
            m136700a();
        }
    }

    /* renamed from: a */
    public final void mo104753a(String str) {
        if (TextUtils.isEmpty(str)) {
            m136702c();
        } else if (this.f111717d) {
            if (TextUtils.isEmpty(this.f111715b)) {
                this.f111714a.add(str);
                this.f111715b = str;
                return;
            }
            int length = this.f111715b.length();
            int length2 = str.length();
            if (length != length2) {
                if (length > length2) {
                    m136700a();
                } else if (!str.startsWith(this.f111715b)) {
                    m136700a();
                } else {
                    this.f111714a.add(str.substring(length));
                    this.f111715b = str;
                }
            }
        }
    }
}
