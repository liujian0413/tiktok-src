package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.content.Context;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23755a.C23756a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.InquiryStruct;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.c */
public final class C23765c {

    /* renamed from: a */
    public static final C23766a f62714a = new C23766a(null);

    /* renamed from: b */
    private Pair<C23783h, ? extends C23755a> f62715b;

    /* renamed from: c */
    private final Context f62716c;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.c$a */
    public static final class C23766a {
        private C23766a() {
        }

        public /* synthetic */ C23766a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C23765c m77918a(Context context) {
            C7573i.m23587b(context, "context");
            return new C23765c(context);
        }
    }

    public C23765c(Context context) {
        C7573i.m23587b(context, "context");
        this.f62716c = context;
    }

    /* renamed from: a */
    private final C23755a m77914a(C23783h hVar) {
        switch (C23767d.f62717a[hVar.f62779a.ordinal()]) {
            case 1:
                C23789l lVar = new C23789l(this.f62716c, hVar, null, 4, null);
                return lVar;
            case 2:
                C23785j jVar = new C23785j(this.f62716c, hVar, null, 4, null);
                return jVar;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private static boolean m77915a(ChallengeDetail challengeDetail) {
        Challenge challenge = challengeDetail.challenge;
        if (challenge != null) {
            InquiryStruct inquiryStruct = challenge.inquiryStruct;
            if (inquiryStruct != null) {
                if ((C23764b.m77913a(inquiryStruct.getOpenUrl()) || C23764b.m77913a(inquiryStruct.getWebUrl())) && C23764b.m77913a(inquiryStruct.getDesc())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m77916b(ChallengeDetail challengeDetail, C23783h hVar) {
        HeaderType headerType;
        AttrsType attrsType;
        ButtonType buttonType;
        Challenge challenge = challengeDetail.challenge;
        if (challenge == null || challenge.getModuleType() != 1) {
            headerType = HeaderType.TYPE_NORMAL;
        } else {
            headerType = HeaderType.TYPE_LARGE;
        }
        hVar.mo61832a(headerType);
        C7573i.m23582a((Object) challenge, "challenge");
        if (challenge.getModuleType() == 1) {
            attrsType = AttrsType.TYPE_NO_LINK;
        } else {
            attrsType = AttrsType.TYPE_LINK;
        }
        hVar.mo61830a(attrsType);
        if (C23756a.m77904a(challengeDetail)) {
            buttonType = ButtonType.TYPE_TRANSFORM;
        } else if (m77915a(challengeDetail)) {
            buttonType = ButtonType.TYPE_TRANSFORM;
        } else {
            buttonType = ButtonType.TYPE_NORMAL;
        }
        hVar.mo61831a(buttonType);
    }

    /* renamed from: a */
    public final C23755a mo61801a(ChallengeDetail challengeDetail, C23783h hVar) {
        C23755a aVar;
        C7573i.m23587b(challengeDetail, "data");
        C7573i.m23587b(hVar, "headerParam");
        m77916b(challengeDetail, hVar);
        if (this.f62715b != null) {
            Pair<C23783h, ? extends C23755a> pair = this.f62715b;
            if (pair == null) {
                C7573i.m23580a();
            }
            if (C7573i.m23585a((Object) (C23783h) pair.getFirst(), (Object) hVar)) {
                Pair<C23783h, ? extends C23755a> pair2 = this.f62715b;
                if (pair2 == null) {
                    C7573i.m23580a();
                }
                aVar = (C23755a) pair2.getSecond();
                aVar.mo61770a(challengeDetail);
                return aVar;
            }
        }
        C23755a a = m77914a(hVar);
        this.f62715b = new Pair<>(hVar, a);
        aVar = a;
        aVar.mo61770a(challengeDetail);
        return aVar;
    }
}
