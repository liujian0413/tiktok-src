package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiQuestionInfo */
public final class PoiQuestionInfo implements Serializable {
    @C6593c(mo15949a = "questions")
    private final List<PoiQuestion> questions;
    @C6593c(mo15949a = "total_question_count")
    private final long totalQuestionCount;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.poi.model.PoiQuestion>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.poi.model.PoiQuestionInfo copy$default(com.p280ss.android.ugc.aweme.poi.model.PoiQuestionInfo r0, java.util.List<com.p280ss.android.ugc.aweme.poi.model.PoiQuestion> r1, long r2, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.poi.model.PoiQuestion> r1 = r0.questions
        L_0x0006:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x000c
            long r2 = r0.totalQuestionCount
        L_0x000c:
            com.ss.android.ugc.aweme.poi.model.PoiQuestionInfo r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.PoiQuestionInfo.copy$default(com.ss.android.ugc.aweme.poi.model.PoiQuestionInfo, java.util.List, long, int, java.lang.Object):com.ss.android.ugc.aweme.poi.model.PoiQuestionInfo");
    }

    public final List<PoiQuestion> component1() {
        return this.questions;
    }

    public final long component2() {
        return this.totalQuestionCount;
    }

    public final PoiQuestionInfo copy(List<PoiQuestion> list, long j) {
        C7573i.m23587b(list, "questions");
        return new PoiQuestionInfo(list, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PoiQuestionInfo) {
                PoiQuestionInfo poiQuestionInfo = (PoiQuestionInfo) obj;
                if (C7573i.m23585a((Object) this.questions, (Object) poiQuestionInfo.questions)) {
                    if (this.totalQuestionCount == poiQuestionInfo.totalQuestionCount) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<PoiQuestion> getQuestions() {
        return this.questions;
    }

    public final long getTotalQuestionCount() {
        return this.totalQuestionCount;
    }

    public final int hashCode() {
        List<PoiQuestion> list = this.questions;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.totalQuestionCount;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiQuestionInfo(questions=");
        sb.append(this.questions);
        sb.append(", totalQuestionCount=");
        sb.append(this.totalQuestionCount);
        sb.append(")");
        return sb.toString();
    }

    public PoiQuestionInfo(List<PoiQuestion> list, long j) {
        C7573i.m23587b(list, "questions");
        this.questions = list;
        this.totalQuestionCount = j;
    }

    public /* synthetic */ PoiQuestionInfo(List list, long j, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        this(list, j);
    }
}
