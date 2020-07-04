package com.p280ss.android.ugc.aweme.poi.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.poi.model.PoiQuestionInfo;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.UpdateQAResponse */
public final class UpdateQAResponse extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "question_info")
    private PoiQuestionInfo questionInfo;

    public final PoiQuestionInfo getQuestionInfo() {
        return this.questionInfo;
    }

    public final void setQuestionInfo(PoiQuestionInfo poiQuestionInfo) {
        this.questionInfo = poiQuestionInfo;
    }

    public UpdateQAResponse(PoiQuestionInfo poiQuestionInfo) {
        this.questionInfo = poiQuestionInfo;
    }
}
