package com.p280ss.android.ugc.aweme.p332ml;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ml.g */
public final class C7173g {
    /* renamed from: a */
    private static List<MLModel> m22397a() {
        try {
            MLModel[] mLModelArr = (MLModel[]) C6384b.m19835a().mo15290a(MLModelExperiment.class, false, "mscene", (Object) C6384b.m19835a().mo15295d().mscene, MLModel[].class);
            if (mLModelArr != null) {
                return Arrays.asList(mLModelArr);
            }
        } catch (Throwable unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static MLModel m22395a(String str) {
        return m22396a(m22397a(), str);
    }

    /* renamed from: a */
    private static MLModel m22396a(List<MLModel> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (MLModel mLModel : list) {
            if (str.equalsIgnoreCase(mLModel.scene)) {
                return mLModel;
            }
        }
        return null;
    }
}
