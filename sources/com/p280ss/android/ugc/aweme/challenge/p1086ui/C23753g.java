package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.g */
final /* synthetic */ class C23753g extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f62665a = new C23753g();

    C23753g() {
    }

    public final String getName() {
        return "challengeDetail";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ChallengeDetailState.class);
    }

    public final String getSignature() {
        return "getChallengeDetail()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((ChallengeDetailState) obj).getChallengeDetail();
    }
}
