package com.p280ss.android.ugc.aweme.digg;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.digg.p1171a.C26350a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.digg.b */
public final class C26351b extends C25673a<User, C26350a> {

    /* renamed from: a */
    public static final C26352a f69370a = new C26352a(null);

    /* renamed from: com.ss.android.ugc.aweme.digg.b$a */
    public static final class C26352a {
        private C26352a() {
        }

        public /* synthetic */ C26352a(C7571f fVar) {
            this();
        }
    }

    public final List<User> getItems() {
        C26350a aVar = (C26350a) this.mData;
        if (aVar != null) {
            return aVar.f69369d;
        }
        return null;
    }

    public final boolean isHasMore() {
        C26350a aVar = (C26350a) this.mData;
        if (aVar == null || !aVar.f69366a) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m86679a(objArr);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m86679a(objArr);
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length != 8 || !(objArr[1] instanceof String) || !(objArr[2] instanceof Integer) || !(objArr[3] instanceof Long) || !(objArr[4] instanceof Long) || !(objArr[5] instanceof Integer) || !(objArr[6] instanceof String) || !(objArr[7] instanceof Integer)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m86679a(Object[] objArr) {
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            Integer num = objArr[2];
            if (num != null) {
                int intValue = num.intValue();
                Long l = objArr[3];
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = objArr[4];
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        Integer num2 = objArr[5];
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            Object obj2 = objArr[6];
                            if (obj2 != null) {
                                String str2 = (String) obj2;
                                Integer num3 = objArr[7];
                                if (num3 != null) {
                                    C1592h a = C26349a.m86678a(str, intValue, longValue, longValue2, intValue2, str2, num3.intValue());
                                    if (a != null) {
                                        a.mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
                                        return;
                                    }
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
