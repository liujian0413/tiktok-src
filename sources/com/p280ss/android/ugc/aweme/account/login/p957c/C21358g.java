package com.p280ss.android.ugc.aweme.account.login.p957c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b.C21369a;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.g */
public final class C21358g extends C25652b<C25640a, C21353b> {

    /* renamed from: a */
    private static final Pattern f57350a = Pattern.compile("^([\\u4e00-\\u9fa5\\w.]{1,19}[\\u4e00-\\u9fa5\\w])$");

    /* renamed from: d */
    private static final Pattern f57351d = Pattern.compile("\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b");

    /* renamed from: c */
    public final void mo57446c() {
        mo59134U_();
    }

    /* renamed from: a */
    public final void mo57444a(C21353b bVar) {
        mo66537a(bVar);
    }

    /* renamed from: b */
    private boolean m71805b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        ((C21353b) this.f67572c).mo57439b(R.string.ccg);
        return false;
    }

    /* renamed from: a */
    public final void mo57445a(String str, String str2) {
        if (m71805b(str, str2)) {
            ((C21353b) this.f67572c).mo57438a(str, str2, C21369a.m71856a(str) ^ true ? 1 : 0);
            ((C21353b) this.f67572c).mo57440h();
        }
    }
}
