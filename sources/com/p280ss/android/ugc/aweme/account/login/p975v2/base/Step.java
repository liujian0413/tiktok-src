package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.Step */
public enum Step {
    FINISH(-2),
    NONE(-1),
    AGE_GATE(0),
    CREATE_ACCOUNT(1),
    PHONE_EMAIL_SIGN_UP(2),
    PHONE_SMS_SIGN_UP(3),
    CREATE_PASSWORD_FOR_PHONE(4),
    CREATE_USERNAME(5),
    PHONE_EMAIL_LOGIN(6),
    PHONE_SMS_LOGIN(7),
    PHONE_PASSWORD_LOGIN(8),
    INPUT_PHONE_FIND_PASSWORD(9),
    INPUT_EMAIL_FIND_PASSWORD(10),
    PHONE_SMS_FIND_PASSWORD(11),
    EMAIL_SMS_FIND_PASSWORD(12),
    RESET_PASSWORD_FOR_EMAIL(13),
    CREATE_PASSWORD_FOR_EMAIL(14),
    THIRD_PARTY_FTC_AGE_GATE(15),
    THIRD_PARTY_AGE_GATE(16),
    EMAIL_PASSWORD_LOGIN(17),
    INPUT_PHONE_SIGN_UP(18),
    INPUT_EMAIL_SIGN_UP(19),
    INPUT_PHONE_LOGIN(20),
    INPUT_EMAIL_LOGIN(21),
    RESET_PASSWORD_FOR_PHONE(22),
    AGE_GATE_LOGIN(23),
    AGE_GATE_SIGN_UP(24),
    EMAIL_SMS_SIGN_UP(25),
    INPUT_PHONE_BIND(26),
    PHONE_SMS_BIND(27),
    PHONE_SMS_VERIFY(28),
    INPUT_PHONE_MODIFY(29),
    PHONE_SMS_MODIFY(30);
    
    public static final C21900a Companion = null;
    public static final Map<Integer, Step> MAP = null;
    private final int value;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.Step$a */
    public static final class C21900a {
        private C21900a() {
        }

        public /* synthetic */ C21900a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Step m73110a(int i) {
            Step step = (Step) Step.MAP.get(Integer.valueOf(i));
            if (step == null) {
                return Step.PHONE_SMS_LOGIN;
            }
            return step;
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        int i;
        Companion = new C21900a(null);
        Step[] values = values();
        Map<Integer, Step> linkedHashMap = new LinkedHashMap<>(C7551d.m23566c(C7507ae.m23386a(values.length), 16));
        for (Step step : values) {
            linkedHashMap.put(Integer.valueOf(step.value), step);
        }
        MAP = linkedHashMap;
    }

    private Step(int i) {
        this.value = i;
    }
}
