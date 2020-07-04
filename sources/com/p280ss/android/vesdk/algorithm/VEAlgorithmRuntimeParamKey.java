package com.p280ss.android.vesdk.algorithm;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.vesdk.algorithm.VEAlgorithmRuntimeParamKey */
public enum VEAlgorithmRuntimeParamKey {
    FACE_PARAM_BASE_SMOOTH_LEVEL(100),
    FACE_PARAM_EXTRA_SMOOTH_LEVEL(BaseNotice.HASHTAG),
    FACE_ATTR_MALE_SCORE_RANGE(102),
    FACE_ATTR_FEMALE_SCORE_RANGE(103),
    FACE_ATTR_FORCE_DETEC(104),
    SKELETON_FORCE_DETECT(105);
    
    private int value;

    public final int getValue() {
        return this.value;
    }

    private VEAlgorithmRuntimeParamKey(int i) {
        this.value = i;
    }
}
