package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.verify.model.C9109a;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdk.verify.model.QueryZhimaStatusResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface ZhimaVerifyApi {
    @C6457h(mo15740a = "/webcast/certification/get_certification_entrance/")
    C7492s<C3479d<GetCertificationEntranceResponse>> getCertificationEntrance();

    @C6457h(mo15740a = "/webcast/certification/get_certification_status/")
    C7492s<C3479d<ZhimaStatusResponse>> getCertificationStatus();

    @C6457h(mo15740a = "/webcast/certification/query/")
    C7492s<C3479d<ZhimaPollingResponse>> queryPollingStatus(@C6474y(mo15757a = "zhima_token") String str, @C6474y(mo15757a = "transaction_id") String str2);

    @C6457h(mo15740a = "/webcast/certification/common/query/")
    C7492s<C3479d<QueryZhimaStatusResponse>> queryZhimaVerifyStatus(@C6474y(mo15757a = "zhima_token") String str);

    @C6456g
    @C6468s(mo15750a = "/webcast/certification/common/submit/")
    C7492s<C3479d<C9109a>> zhimaVerify(@C6454e(mo15737a = "return_url") String str, @C6454e(mo15737a = "certify_type") String str2);
}
