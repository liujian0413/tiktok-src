package com.p280ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.text.format.DateUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.common.utility.C9730f;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.sdk.account.utils.C12911d;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21562a;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPUserInfo.C21565a;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.p */
public final class C21572p {

    /* renamed from: a */
    public static final C21572p f57905a = new C21572p();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f57906b = C7163a.m22363a();

    /* renamed from: com.ss.android.ugc.aweme.account.login.p$a */
    static final class C21573a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21363e f57907a;

        C21573a(C21363e eVar) {
            this.f57907a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C7573i.m23587b(dialogInterface, "<anonymous parameter 0>");
            C21231d.f57039b.mo57164a(false, this.f57907a.f57370b, "", this.f57907a.f57374f);
            Runnable runnable = this.f57907a.f57375g;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.p$b */
    static final class C21574b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JSONObject f57908a;

        /* renamed from: b */
        final /* synthetic */ C21363e f57909b;

        C21574b(JSONObject jSONObject, C21363e eVar) {
            this.f57908a = jSONObject;
            this.f57909b = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C7573i.m23587b(dialogInterface, "<anonymous parameter 0>");
            C1592h b = AccountApiInModule.m71179b(C9730f.m28665a(this.f57908a, "token", ""));
            if (b == null) {
                C21231d.f57039b.mo57164a(false, this.f57909b.f57370b, "cancel_login: Error occurred when requesting AccountApiInModule.loginDuringAccountRemoval", this.f57909b.f57374f);
                C12911d.m37584a(this.f57909b.f57369a, R.string.c6c);
            } else {
                b.mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<String, Boolean>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C21574b f57910a;

                    {
                        this.f57910a = r1;
                    }

                    public final /* synthetic */ Object then(C1592h hVar) {
                        return Boolean.valueOf(m72302a(hVar));
                    }

                    /* renamed from: a */
                    private boolean m72302a(C1592h<String> hVar) {
                        LoginMethodName loginMethodName;
                        Object obj;
                        if (!C43173w.m136926a((C1592h) hVar)) {
                            return false;
                        }
                        C7573i.m23582a((Object) hVar, "it");
                        JSONObject jSONObject = new JSONObject((String) hVar.mo6890e());
                        BaseLoginMethod baseLoginMethod = null;
                        String a = C9730f.m28665a(jSONObject, "message", (String) null);
                        if (!jSONObject.has("message") || TextUtils.equals(a, "error")) {
                            return false;
                        }
                        User queryUser = C21671bd.m72520a().queryUser(null, true);
                        C21671bd.m72529a(queryUser);
                        C22345t.m73972e(true);
                        if (this.f57910a.f57909b.f57372d != null) {
                            if (C21572p.f57906b) {
                                StringBuilder sb = new StringBuilder("Login method: ");
                                BaseLoginMethod baseLoginMethod2 = this.f57910a.f57909b.f57372d;
                                if (baseLoginMethod2 != null) {
                                    obj = baseLoginMethod2.getLoginMethodName();
                                } else {
                                    obj = null;
                                }
                                sb.append(obj);
                            }
                            BaseLoginMethod baseLoginMethod3 = this.f57910a.f57909b.f57372d;
                            if (baseLoginMethod3 != null) {
                                loginMethodName = baseLoginMethod3.getLoginMethodName();
                            } else {
                                loginMethodName = null;
                            }
                            if (loginMethodName != null) {
                                switch (C21577q.f57912a[loginMethodName.ordinal()]) {
                                    case 1:
                                        BaseLoginMethod baseLoginMethod4 = this.f57910a.f57909b.f57372d;
                                        if (baseLoginMethod4 != null) {
                                            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod4;
                                            C7573i.m23582a((Object) queryUser, "user");
                                            String uid = queryUser.getUid();
                                            C7573i.m23582a((Object) uid, "user.uid");
                                            baseLoginMethod = new PhoneLoginMethod(uid, LoginMethodName.PHONE_NUMBER_PASS, phoneLoginMethod.getPhoneNumber(), C21562a.m72277a(queryUser));
                                            break;
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod");
                                        }
                                    case 2:
                                        BaseLoginMethod baseLoginMethod5 = this.f57910a.f57909b.f57372d;
                                        if (baseLoginMethod5 != null) {
                                            PhoneLoginMethod phoneLoginMethod2 = (PhoneLoginMethod) baseLoginMethod5;
                                            C7573i.m23582a((Object) queryUser, "user");
                                            String uid2 = queryUser.getUid();
                                            C7573i.m23582a((Object) uid2, "user.uid");
                                            baseLoginMethod = new PhoneLoginMethod(uid2, LoginMethodName.PHONE_SMS, phoneLoginMethod2.getPhoneNumber(), C21562a.m72277a(queryUser));
                                            break;
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod");
                                        }
                                    case 3:
                                        BaseLoginMethod baseLoginMethod6 = this.f57910a.f57909b.f57372d;
                                        if (baseLoginMethod6 != null) {
                                            TPLoginMethod tPLoginMethod = (TPLoginMethod) baseLoginMethod6;
                                            C7573i.m23582a((Object) queryUser, "user");
                                            String uid3 = queryUser.getUid();
                                            C7573i.m23582a((Object) uid3, "user.uid");
                                            TPLoginMethod tPLoginMethod2 = new TPLoginMethod(uid3, tPLoginMethod.getPlatform(), C21565a.m72284a(queryUser), false, C21562a.m72277a(queryUser));
                                            baseLoginMethod = tPLoginMethod2;
                                            break;
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.TPLoginMethod");
                                        }
                                }
                            }
                            if (baseLoginMethod != null) {
                                C21579s.m72313b(baseLoginMethod);
                            }
                        }
                        C21231d.f57039b.mo57164a(true, 0, "", this.f57910a.f57909b.f57374f);
                        this.f57910a.f57909b.f57373e.mo57193a(this.f57910a.f57909b.f57374f);
                        return true;
                    }
                }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Boolean, Void>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C21574b f57911a;

                    {
                        this.f57911a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<Boolean> hVar) {
                        Runnable runnable = this.f57911a.f57909b.f57375g;
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (C43173w.m136926a((C1592h) hVar)) {
                            C7573i.m23582a((Object) hVar, "it");
                            Object e = hVar.mo6890e();
                            C7573i.m23582a(e, "it.result");
                            if (((Boolean) e).booleanValue()) {
                                return null;
                            }
                        }
                        C21232a aVar = C21231d.f57039b;
                        int i = this.f57911a.f57909b.f57370b;
                        StringBuilder sb = new StringBuilder("cancel_login: ");
                        C7573i.m23582a((Object) hVar, "it");
                        sb.append(hVar.mo6891f());
                        aVar.mo57164a(false, i, sb.toString(), this.f57911a.f57909b.f57374f);
                        C12911d.m37584a(this.f57911a.f57909b.f57369a, R.string.c6c);
                        return null;
                    }
                }, C1592h.f5958b);
            }
            C6907h.m21524a("deleted_account_login_cancel", C7507ae.m23387a());
        }
    }

    private C21572p() {
    }

    /* renamed from: a */
    public static final void m72299a(C21363e eVar) {
        C7573i.m23587b(eVar, "info");
        if (eVar.f57370b == 1075) {
            m72301b(eVar);
        }
    }

    /* renamed from: b */
    private static final void m72301b(C21363e eVar) {
        JSONObject jSONObject;
        String str;
        if (eVar.f57369a == null || eVar.f57371c == null || eVar.f57373e == null) {
            Runnable runnable = eVar.f57375g;
            if (runnable != null) {
                runnable.run();
            }
            C12911d.m37584a(C21671bd.m72532b(), R.string.c6c);
            return;
        }
        if (eVar.f57371c.has("data")) {
            jSONObject = eVar.f57371c.optJSONObject("data");
        } else if (!eVar.f57371c.has("cancel_time") || !eVar.f57371c.has("token")) {
            jSONObject = null;
        } else {
            jSONObject = eVar.f57371c;
        }
        if (jSONObject != null) {
            long a = C9730f.m28664a(jSONObject, "cancel_time", 0);
            Locale locale = Locale.US;
            C7573i.m23582a((Object) locale, "Locale.US");
            String string = eVar.f57369a.getString(R.string.c67);
            C7573i.m23582a((Object) string, "info.context.getString(R…during_acc_removal_title)");
            Object[] objArr = new Object[1];
            if (a > 0) {
                str = m72298a(eVar.f57369a, a);
            } else {
                str = "";
            }
            objArr[0] = str;
            String a2 = C1642a.m8035a(locale, string, Arrays.copyOf(objArr, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(locale, format, *args)");
            Locale locale2 = Locale.US;
            C7573i.m23582a((Object) locale2, "Locale.US");
            String string2 = eVar.f57369a.getString(R.string.c66);
            C7573i.m23582a((Object) string2, "info.context.getString(R…_during_acc_removal_desc)");
            String a3 = C1642a.m8035a(locale2, string2, Arrays.copyOf(new Object[]{eVar.f57369a.getString(R.string.wi), eVar.f57369a.getString(R.string.fje)}, 2));
            C7573i.m23582a((Object) a3, "java.lang.String.format(locale, format, *args)");
            new C10741a(eVar.f57369a).mo25653a(a2).mo25660b(a3).mo25658b((int) R.string.fje, (OnClickListener) new C21573a(eVar)).mo25650a((int) R.string.wi, (OnClickListener) new C21574b(jSONObject, eVar)).mo25656a().mo25638b();
            C6907h.m21524a("deleted_account_login_alert", C7507ae.m23387a());
        } else if (!f57906b) {
            Runnable runnable2 = eVar.f57375g;
            if (runnable2 != null) {
                runnable2.run();
            }
            C12911d.m37584a(C21671bd.m72532b(), R.string.c6c);
        } else {
            StringBuilder sb = new StringBuilder("Invalid JSON format detected when processing ");
            sb.append("error code (1075): ");
            sb.append(eVar.f57371c);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static String m72298a(Context context, long j) {
        try {
            String formatDateTime = DateUtils.formatDateTime(context, j * 1000, 65540);
            C7573i.m23582a((Object) formatDateTime, "DateUtils.formatDateTime…teUtils.FORMAT_SHOW_YEAR)");
            return formatDateTime;
        } catch (Exception unused) {
            return "";
        }
    }
}
