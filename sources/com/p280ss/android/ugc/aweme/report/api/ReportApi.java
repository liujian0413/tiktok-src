package com.p280ss.android.ugc.aweme.report.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.report.model.Report;

/* renamed from: com.ss.android.ugc.aweme.report.api.ReportApi */
public interface ReportApi {
    @C6457h(mo15740a = "/aweme/v2/community/discipline/vote/")
    C18253l<Report> voteForCommunityDiscipline(@C6474y(mo15757a = "item_id") String str, @C6474y(mo15757a = "vote_type") int i);
}
