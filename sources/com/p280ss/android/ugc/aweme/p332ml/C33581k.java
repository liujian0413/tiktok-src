package com.p280ss.android.ugc.aweme.p332ml;

import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.net.p1417b.C34040a;
import com.p280ss.android.ugc.aweme.setting.C7217x;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import com.p280ss.android.ugc.aweme.video.C43264m;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoNetworkSpeedAlgorithmExperiment;
import com.p280ss.android.ugc.networkspeed.C44899a;
import com.p280ss.android.ugc.networkspeed.C44901c;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.networkspeed.IntelligentSpeedAlgorithm;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.k */
public final class C33581k implements C7217x {

    /* renamed from: b */
    private static C33581k f87679b = new C33581k();

    /* renamed from: a */
    public MLModel f87680a = C7173g.m22395a("speed_ml");

    /* renamed from: a */
    public static C33581k m108459a() {
        return f87679b;
    }

    private C33581k() {
        C6903bc.m21494m().mo18735a((C7217x) this);
        m108460a(this.f87680a, true);
    }

    public final void onChanged() {
        boolean z;
        MLModel a = C7173g.m22395a("speed_ml");
        if (a == null || a == this.f87680a) {
            z = false;
        } else {
            z = true;
        }
        this.f87680a = a;
        m108460a(this.f87680a, z);
    }

    /* renamed from: b */
    static final /* synthetic */ Map m108461b() {
        HashMap hashMap = new HashMap();
        hashMap.put("country", C32326h.m104886h());
        Context a = C6399b.m19921a();
        hashMap.put("access", NetworkUtils.getNetworkAccessType(a));
        hashMap.put("signal", Integer.valueOf(C43264m.m137242a(a).mo105015b(a)));
        return hashMap;
    }

    /* renamed from: a */
    private static void m108460a(MLModel mLModel, boolean z) {
        if (mLModel == null) {
            int a = C6384b.m19835a().mo15287a(VideoNetworkSpeedAlgorithmExperiment.class, true, "video_network_speed_algorithm", C6384b.m19835a().mo15295d().video_network_speed_algorithm, 0);
            if (a == 1) {
                C44903d.m141655a().f115476d = new C44899a();
            } else {
                if (a == 2) {
                    C44903d.m141655a().f115476d = new C34040a();
                }
            }
        } else if (z) {
            C44903d.m141655a().f115476d = new IntelligentSpeedAlgorithm(C33582l.f87681a);
            C44901c.m141653a().mo107374a(new C7170a(mLModel)).mo16677f();
        }
    }
}
