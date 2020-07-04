package com.p280ss.android.ugc.aweme.account.loginsetting;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.e */
public final class C22180e {

    /* renamed from: a */
    public static final C22180e f59242a = new C22180e();

    /* renamed from: b */
    private static final boolean f59243b = C7163a.m22363a();

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.e$a */
    static final class C22181a<TTaskResult, TContinuationResult> implements C1591g<C22174b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C22173a f59244a;

        C22181a(C22173a aVar) {
            this.f59244a = aVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m73613a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m73613a(C1592h<C22174b> hVar) {
            if (!C43173w.m136926a((C1592h) hVar)) {
                C22173a aVar = this.f59244a;
                if (aVar != null) {
                    aVar.mo57562a(false);
                    return;
                }
                return;
            }
            C7573i.m23582a((Object) hVar, "task");
            C22174b bVar = (C22174b) hVar.mo6890e();
            C22173a aVar2 = this.f59244a;
            if (aVar2 != null) {
                aVar2.mo57562a(bVar.mo58529a());
            }
        }
    }

    private C22180e() {
    }

    /* renamed from: a */
    public final void mo58538a(PhoneNumber phoneNumber, C22173a aVar) {
        if (phoneNumber == null) {
            aVar.mo57562a(false);
        } else {
            m73611a(String.valueOf(phoneNumber.getCountryCode()), String.valueOf(phoneNumber.getNationalNumber()), aVar);
        }
    }

    /* renamed from: a */
    public static final void m73610a(String str, C22173a aVar) {
        if (!TextUtils.isEmpty(str)) {
            C1592h a = AccountApiInModule.m71175a(str);
            if (a != null) {
                a.mo6875a((C1591g<TResult, TContinuationResult>) new C22181a<TResult,TContinuationResult>(aVar));
            } else if (aVar != null) {
                aVar.mo57562a(false);
            }
        } else if (aVar != null) {
            aVar.mo57562a(false);
        }
    }

    /* renamed from: a */
    public static final void m73611a(String str, String str2, C22173a aVar) {
        String str3;
        CharSequence charSequence = str2;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = str;
            if (!TextUtils.isEmpty(charSequence2)) {
                if (str == null) {
                    C7573i.m23580a();
                }
                String str4 = null;
                if (C7634n.m23776c(charSequence2, (CharSequence) "+", false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C7634n.m23762b(charSequence2).toString());
                    if (str2 != null) {
                        if (str2 != null) {
                            str4 = C7634n.m23762b(charSequence).toString();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    sb.append(str4);
                    str3 = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder("+");
                    sb2.append(C7634n.m23762b(charSequence2).toString());
                    if (str2 != null) {
                        if (str2 != null) {
                            str4 = C7634n.m23762b(charSequence).toString();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    sb2.append(str4);
                    str3 = sb2.toString();
                }
                C7573i.m23582a((Object) str3, "if (countryCode!!.contai…    .toString()\n        }");
                m73610a(str3, aVar);
                return;
            }
        }
        if (aVar != null) {
            aVar.mo57562a(false);
        }
    }
}
