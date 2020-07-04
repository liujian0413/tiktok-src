package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.arch.lifecycle.C0049m;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.account.p816b.C18894a;
import com.p280ss.android.common.applog.GlobalContext;
import com.p280ss.android.ugc.aweme.C21669bb;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.C21765p;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b.C21369a;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.ActionResultModel;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.C21900a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BaseBindService;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.a */
public final class C21913a {

    /* renamed from: a */
    public static final C21913a f58632a = new C21913a();

    /* renamed from: b */
    private static final boolean f58633b = C7163a.m22363a();

    private C21913a() {
    }

    /* renamed from: a */
    public final void mo58367a(BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, JSONObject jSONObject, C12898b bVar) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C7573i.m23587b(bVar, "userInfo");
        C21671bd.m72526a(bVar);
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C7573i.m23582a((Object) arguments, "fragment.arguments ?: Bundle()");
        m73130a(arguments);
        FragmentActivity activity = baseAccountFlowFragment.getActivity();
        if (activity != null) {
            C0049m<Bundle> mVar = ((ActionResultModel) C0069x.m159a(activity).mo147a(ActionResultModel.class)).f58598c;
            if (bVar.f34081d) {
                if (C21886a.f58594a.mo58325d()) {
                    Bundle arguments2 = baseAccountFlowFragment.getArguments();
                    if (arguments2 == null) {
                        C7573i.m23580a();
                    }
                    arguments2.putBoolean("new_user_need_set_username", true);
                }
                if (step == Step.EMAIL_SMS_SIGN_UP || step == Step.CREATE_PASSWORD_FOR_EMAIL) {
                    Bundle arguments3 = baseAccountFlowFragment.getArguments();
                    if (arguments3 == null) {
                        C7573i.m23580a();
                    }
                    arguments3.putBoolean("new_user_need_get_recommend_username", true);
                    Bundle arguments4 = baseAccountFlowFragment.getArguments();
                    if (arguments4 == null) {
                        C7573i.m23580a();
                    }
                    arguments4.putString("set_username_platform", "email");
                } else {
                    Bundle arguments5 = baseAccountFlowFragment.getArguments();
                    if (arguments5 == null) {
                        C7573i.m23580a();
                    }
                    arguments5.putBoolean("new_user_need_set_pass_word", true);
                    Bundle arguments6 = baseAccountFlowFragment.getArguments();
                    if (arguments6 == null) {
                        C7573i.m23580a();
                    }
                    arguments6.putString("set_username_platform", "phone");
                }
            } else if (baseAccountFlowFragment.getActivity() instanceof SignUpOrLoginActivity) {
                FragmentActivity activity2 = baseAccountFlowFragment.getActivity();
                if (activity2 != null) {
                    ((SignUpOrLoginActivity) activity2).f58958a = null;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                }
            }
            String a = m73129a(step);
            if (!TextUtils.isEmpty(a)) {
                arguments.putString("platform", a);
            }
            String b = m73134b(step);
            if (!TextUtils.isEmpty(b)) {
                arguments.putString("login_path", b);
            }
            mVar.postValue(arguments);
        }
    }

    /* renamed from: a */
    private static String m73129a(Step step) {
        switch (C21914b.f58636c[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "mobile";
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "email";
            default:
                if (C7163a.m22363a()) {
                    Context context = GlobalContext.getContext();
                    StringBuilder sb = new StringBuilder("Debug Toast: Step (");
                    sb.append(step.getValue());
                    sb.append(") 不会导致转换platform成功诶");
                    C10761a.m31396b(context, sb.toString(), 1).mo25750a();
                }
                return "";
        }
    }

    /* renamed from: b */
    private static String m73134b(Step step) {
        switch (C21914b.f58637d[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "phone_sms";
            case 4:
                return "phone_password";
            case 5:
            case 6:
            case 7:
            case 8:
                return "email_or_username";
            case 9:
                return "reset_password_for_phone";
            default:
                if (C7163a.m22363a()) {
                    Context context = GlobalContext.getContext();
                    StringBuilder sb = new StringBuilder("Debug Toast: Step (");
                    sb.append(step.getValue());
                    sb.append(") 不会导致转换路径成功诶");
                    C10761a.m31396b(context, sb.toString(), 1).mo25750a();
                }
                return "";
        }
    }

    /* renamed from: a */
    private static void m73130a(Bundle bundle) {
        BaseLoginMethod baseLoginMethod;
        LoginMethodName loginMethodName;
        switch (C21914b.f58635b[C21900a.m73110a(bundle.getInt("current_page")).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                PhoneNumber b = C21903c.m73116b(bundle);
                if (b == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                    break;
                } else {
                    String d = C21671bd.m72536d();
                    C7573i.m23582a((Object) d, "ModuleStore.getCurUserId()");
                    PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(d, LoginMethodName.PHONE_SMS, b, null, 8, null);
                    baseLoginMethod = phoneLoginMethod;
                    break;
                }
            case 5:
            case 6:
                PhoneNumber b2 = C21903c.m73116b(bundle);
                if (b2 == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                    break;
                } else {
                    String d2 = C21671bd.m72536d();
                    C7573i.m23582a((Object) d2, "ModuleStore.getCurUserId()");
                    PhoneLoginMethod phoneLoginMethod2 = new PhoneLoginMethod(d2, LoginMethodName.PHONE_NUMBER_PASS, b2, null, 8, null);
                    baseLoginMethod = phoneLoginMethod2;
                    break;
                }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                String a = C21903c.m73113a(bundle);
                if (C21369a.m71856a(a)) {
                    loginMethodName = LoginMethodName.EMAIL_PASS;
                } else {
                    loginMethodName = LoginMethodName.USER_NAME_PASS;
                }
                LoginMethodName loginMethodName2 = loginMethodName;
                String d3 = C21671bd.m72536d();
                C7573i.m23582a((Object) d3, "ModuleStore.getCurUserId()");
                AccountPassLoginMethod accountPassLoginMethod = new AccountPassLoginMethod(d3, loginMethodName2, a, null, 8, null);
                baseLoginMethod = accountPassLoginMethod;
                break;
            default:
                baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                break;
        }
        C21579s.m72313b(baseLoginMethod);
    }

    /* renamed from: a */
    public static void m73132a(BaseAccountFlowFragment baseAccountFlowFragment, C12819b bVar) {
        String str;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        FragmentActivity activity = baseAccountFlowFragment.getActivity();
        if (activity != null) {
            C0049m<Bundle> mVar = ((ActionResultModel) C0069x.m159a(activity).mo147a(ActionResultModel.class)).f58598c;
            Bundle arguments = baseAccountFlowFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            User k = C21671bd.m72543k();
            if (!(k == null || bVar == null)) {
                C12898b bVar2 = bVar.f33924f;
                C7573i.m23582a((Object) bVar2, "mobileObj.mUserInfo");
                C18894a aVar = (C18894a) bVar2.mo31366b().get("mobile");
                if (aVar != null) {
                    str = aVar.f50929e;
                } else {
                    str = "";
                }
                k.setPhoneBinded(true);
                k.setBindPhone(str);
                C21671bd.m72520a().updateUserInfo(bVar.f33924f);
                if (str == null) {
                    C7573i.m23580a();
                }
                C12898b bVar3 = bVar.f33924f;
                C7573i.m23582a((Object) bVar3, "mobileObj.mUserInfo");
                String jSONObject = bVar3.f34083f.toString();
                C7573i.m23582a((Object) jSONObject, "mobileObj.mUserInfo.rawData.toString()");
                C21671bd.m72522a(7, 1, (Object) new C21765p(str, jSONObject));
            }
            mVar.postValue(arguments);
        }
    }

    /* renamed from: a */
    public static void m73133a(BaseAccountFlowFragment baseAccountFlowFragment, C12820c cVar) {
        JSONObject jSONObject;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        FragmentActivity activity = baseAccountFlowFragment.getActivity();
        if (activity != null) {
            C0049m<Bundle> mVar = ((ActionResultModel) C0069x.m159a(activity).mo147a(ActionResultModel.class)).f58598c;
            Bundle arguments = baseAccountFlowFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            User k = C21671bd.m72543k();
            if (!(k == null || cVar == null)) {
                try {
                    JSONObject jSONObject2 = cVar.f33964l;
                    if (jSONObject2 != null) {
                        jSONObject = jSONObject2.optJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("mobile");
                        k.setPhoneBinded(true);
                        k.setBindPhone(optString);
                        IAccountUserService a = C21671bd.m72520a();
                        new C18893a();
                        a.updateUserInfo(C18893a.m61663b(jSONObject2));
                        C7573i.m23582a((Object) optString, "phone");
                        String jSONObject3 = jSONObject.toString();
                        C7573i.m23582a((Object) jSONObject3, "data.toString()");
                        C21671bd.m72522a(7, 1, (Object) new C21765p(optString, jSONObject3));
                    }
                } catch (Exception unused) {
                }
            }
            BaseBindService n = C21671bd.m72546n();
            C7573i.m23582a((Object) n, "ModuleStore.getBindService()");
            C21669bb verificationService = n.getVerificationService();
            C7573i.m23582a((Object) verificationService, "ModuleStore.getBindService().verificationService");
            if (verificationService.isDangerZone()) {
                BaseBindService n2 = C21671bd.m72546n();
                C7573i.m23582a((Object) n2, "ModuleStore.getBindService()");
                C21669bb verificationService2 = n2.getVerificationService();
                FragmentActivity activity2 = baseAccountFlowFragment.getActivity();
                if (activity2 == null) {
                    C7573i.m23580a();
                }
                verificationService2.showRebindView(activity2, "phone_bundling");
            }
            mVar.postValue(arguments);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019c, code lost:
        if (r8 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01b2, code lost:
        if (r8 == null) goto L_0x01b4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m73131a(com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment r6, int r7, java.lang.String r8, com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene r9, com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step r10, org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r0 = "errorMsg"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = "step"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            android.support.v4.util.a<java.lang.Integer> r0 = com.p280ss.android.ugc.aweme.account.login.C21578r.f57916d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0242
            android.support.v4.util.a<java.lang.Integer> r0 = com.p280ss.android.ugc.aweme.account.login.C21578r.f57918f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002e
            goto L_0x0242
        L_0x002e:
            r0 = 2131821961(0x7f110589, float:1.927668E38)
            r1 = 2131826603(0x7f1117ab, float:1.9286095E38)
            switch(r7) {
                case 1001: goto L_0x0217;
                case 1002: goto L_0x0202;
                case 1003: goto L_0x0202;
                case 1009: goto L_0x01be;
                case 1011: goto L_0x0151;
                case 1024: goto L_0x013b;
                case 1027: goto L_0x0125;
                case 1028: goto L_0x013b;
                case 1033: goto L_0x011c;
                case 1034: goto L_0x011c;
                case 1039: goto L_0x010c;
                case 1051: goto L_0x00f6;
                case 1054: goto L_0x00e0;
                case 1092: goto L_0x0217;
                case 1202: goto L_0x00ca;
                case 1203: goto L_0x00b4;
                case 2002: goto L_0x00aa;
                case 2003: goto L_0x007c;
                case 2004: goto L_0x007c;
                case 2005: goto L_0x0072;
                case 2013: goto L_0x0068;
                case 2015: goto L_0x005e;
                case 2027: goto L_0x0040;
                case 2028: goto L_0x0040;
                default: goto L_0x0037;
            }
        L_0x0037:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9.<init>(r6, r7, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0040:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r10 = r8
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0052
            r8 = 2131824515(0x7f110f83, float:1.928186E38)
            java.lang.String r8 = r6.getString(r8)
        L_0x0052:
            java.lang.String r10 = "if (TextUtils.isEmpty(er…_page_lock) else errorMsg"
            kotlin.jvm.internal.C7573i.m23582a(r8, r10)
            r9.<init>(r6, r7, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x005e:
            com.ss.android.ugc.aweme.account.login.v2.network.a.d r7 = new com.ss.android.ugc.aweme.account.login.v2.network.a.d
            r7.<init>(r6, r9, r10, r11)
            r9 = r7
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0068:
            com.ss.android.ugc.aweme.account.login.v2.network.a.c r7 = new com.ss.android.ugc.aweme.account.login.v2.network.a.c
            r7.<init>(r6, r11)
            r9 = r7
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0072:
            com.ss.android.ugc.aweme.account.login.v2.network.a.e r7 = new com.ss.android.ugc.aweme.account.login.v2.network.a.e
            r7.<init>(r6, r11)
            r9 = r7
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x007c:
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r9 = r6.mo58344j()
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.BIND_PHONE
            if (r9 == r10) goto L_0x0097
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r9 = r6.mo58344j()
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.MODIFY_PHONE
            if (r9 != r10) goto L_0x008d
            goto L_0x0097
        L_0x008d:
            com.ss.android.ugc.aweme.account.login.v2.network.a.i r7 = new com.ss.android.ugc.aweme.account.login.v2.network.a.i
            r7.<init>(r6, r8)
            r9 = r7
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0097:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            java.lang.String r9 = r6.getString(r1)
            java.lang.String r10 = "fragment.getString(R.str…ssword_phone_input_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x00aa:
            com.ss.android.ugc.aweme.account.login.v2.network.a.k r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.k
            r8.<init>(r6, r7, r11)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x00b4:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131824770(0x7f111082, float:1.9282377E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.string.mus_error_code)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x00ca:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822071(0x7f1105f7, float:1.9276903E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…stration_phone_sms_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x00e0:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822012(0x7f1105bc, float:1.9276783E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…_reset_phone_input_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x00f6:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822061(0x7f1105ed, float:1.9276883E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…istration_password_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x010c:
            com.ss.android.ugc.aweme.account.login.v2.network.a.j r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.j
            r0 = r8
            r1 = r6
            r2 = r7
            r3 = r11
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x011c:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9.<init>(r6, r7, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0125:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822083(0x7f110603, float:1.9276927E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…on_username_error_format)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x013b:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822082(0x7f110602, float:1.9276925E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…istration_username_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0151:
            com.ss.android.ugc.aweme.account.login.v2.base.Step r9 = r6.mo58339d()
            int[] r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a.C21914b.f58634a
            int r9 = r9.ordinal()
            r9 = r10[r9]
            switch(r9) {
                case 1: goto L_0x01a8;
                case 2: goto L_0x0192;
                case 3: goto L_0x017f;
                case 4: goto L_0x017f;
                case 5: goto L_0x017f;
                case 6: goto L_0x0169;
                default: goto L_0x0160;
            }
        L_0x0160:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9.<init>(r6, r7, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0169:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822004(0x7f1105b4, float:1.9276767E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…_reset_email_input_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x017f:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            java.lang.String r9 = r6.getString(r0)
            java.lang.String r10 = "fragment.getString(R.str…common_login_email_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0192:
            com.ss.android.ugc.aweme.account.login.v2.network.a.f r7 = new com.ss.android.ugc.aweme.account.login.v2.network.a.f
            if (r11 == 0) goto L_0x019e
            java.lang.String r8 = "sms_code_key"
            java.lang.String r8 = r11.optString(r8)
            if (r8 != 0) goto L_0x01a0
        L_0x019e:
            java.lang.String r8 = ""
        L_0x01a0:
            r7.<init>(r6, r8)
            r9 = r7
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x01a8:
            com.ss.android.ugc.aweme.account.login.v2.network.a.g r7 = new com.ss.android.ugc.aweme.account.login.v2.network.a.g
            if (r11 == 0) goto L_0x01b4
            java.lang.String r8 = "sms_code_key"
            java.lang.String r8 = r11.optString(r8)
            if (r8 != 0) goto L_0x01b6
        L_0x01b4:
            java.lang.String r8 = ""
        L_0x01b6:
            r7.<init>(r6, r8)
            r9 = r7
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x01be:
            com.ss.android.ugc.aweme.account.login.v2.base.Step r9 = r6.mo58339d()
            com.ss.android.ugc.aweme.account.login.v2.base.Step r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.PHONE_PASSWORD_LOGIN
            if (r9 != r10) goto L_0x01d8
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131821998(0x7f1105ae, float:1.9276755E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…mon_login_password_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            goto L_0x01fe
        L_0x01d8:
            com.ss.android.ugc.aweme.account.login.v2.base.Step r9 = r6.mo58339d()
            com.ss.android.ugc.aweme.account.login.v2.base.Step r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.EMAIL_PASSWORD_LOGIN
            if (r9 == r10) goto L_0x01f0
            com.ss.android.ugc.aweme.account.login.v2.base.Step r9 = r6.mo58339d()
            com.ss.android.ugc.aweme.account.login.v2.base.Step r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.INPUT_EMAIL_LOGIN
            if (r9 != r10) goto L_0x01e9
            goto L_0x01f0
        L_0x01e9:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9.<init>(r6, r7, r8)
            r8 = r9
            goto L_0x01fe
        L_0x01f0:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            java.lang.String r9 = r6.getString(r0)
            java.lang.String r10 = "fragment.getString(R.str…common_login_email_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
        L_0x01fe:
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0202:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r8 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9 = 2131822066(0x7f1105f2, float:1.9276893E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…ration_phone_input_error)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            r8.<init>(r6, r7, r9)
            r9 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
            goto L_0x023e
        L_0x0217:
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r9 = r6.mo58344j()
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.BIND_PHONE
            if (r9 == r10) goto L_0x022e
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r9 = r6.mo58344j()
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r10 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.MODIFY_PHONE
            if (r9 != r10) goto L_0x0228
            goto L_0x022e
        L_0x0228:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            r9.<init>(r6, r7, r8)
            goto L_0x023c
        L_0x022e:
            com.ss.android.ugc.aweme.account.login.v2.network.a.h r9 = new com.ss.android.ugc.aweme.account.login.v2.network.a.h
            java.lang.String r8 = r6.getString(r1)
            java.lang.String r10 = "fragment.getString(R.str…ssword_phone_input_error)"
            kotlin.jvm.internal.C7573i.m23582a(r8, r10)
            r9.<init>(r6, r7, r8)
        L_0x023c:
            com.ss.android.ugc.aweme.account.login.v2.base.b r9 = (com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b) r9
        L_0x023e:
            r9.mo58351a()
            return
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a.C21913a.m73131a(com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, int, java.lang.String, com.ss.android.ugc.aweme.account.login.v2.base.Scene, com.ss.android.ugc.aweme.account.login.v2.base.Step, org.json.JSONObject):void");
    }
}
