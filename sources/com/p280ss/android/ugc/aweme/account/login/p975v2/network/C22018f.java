package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.f */
public final /* synthetic */ class C22018f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f58880a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f58881b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f58882c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f58883d;

    static {
        int[] iArr = new int[Step.values().length];
        f58880a = iArr;
        iArr[Step.RESET_PASSWORD_FOR_PHONE.ordinal()] = 1;
        f58880a[Step.CREATE_PASSWORD_FOR_EMAIL.ordinal()] = 2;
        int[] iArr2 = new int[Step.values().length];
        f58881b = iArr2;
        iArr2[Step.PHONE_SMS_SIGN_UP.ordinal()] = 1;
        f58881b[Step.PHONE_SMS_LOGIN.ordinal()] = 2;
        f58881b[Step.PHONE_PASSWORD_LOGIN.ordinal()] = 3;
        f58881b[Step.PHONE_SMS_FIND_PASSWORD.ordinal()] = 4;
        f58881b[Step.INPUT_PHONE_FIND_PASSWORD.ordinal()] = 5;
        f58881b[Step.INPUT_PHONE_BIND.ordinal()] = 6;
        f58881b[Step.PHONE_SMS_VERIFY.ordinal()] = 7;
        f58881b[Step.INPUT_PHONE_MODIFY.ordinal()] = 8;
        int[] iArr3 = new int[Scene.values().length];
        f58882c = iArr3;
        iArr3[Scene.SIGN_UP.ordinal()] = 1;
        f58882c[Scene.LOGIN.ordinal()] = 2;
        f58882c[Scene.BIND_PHONE.ordinal()] = 3;
        f58882c[Scene.MODIFY_PHONE.ordinal()] = 4;
        int[] iArr4 = new int[Step.values().length];
        f58883d = iArr4;
        iArr4[Step.INPUT_PHONE_BIND.ordinal()] = 1;
        f58883d[Step.PHONE_SMS_BIND.ordinal()] = 2;
        f58883d[Step.PHONE_SMS_VERIFY.ordinal()] = 3;
        f58883d[Step.INPUT_PHONE_MODIFY.ordinal()] = 4;
        f58883d[Step.PHONE_SMS_MODIFY.ordinal()] = 5;
    }
}
