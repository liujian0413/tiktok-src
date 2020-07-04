package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42344i;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.m */
public final class C40052m implements C42161ba {

    /* renamed from: a */
    public C39382ed f104012a;

    public C40052m(C39382ed edVar) {
        this.f104012a = edVar;
    }

    /* renamed from: a */
    public static void m128016a(VideoRecordNewActivity videoRecordNewActivity) {
        JSONObject n = videoRecordNewActivity.mo101854n();
        try {
            n.put("camera_type", videoRecordNewActivity.f107327m.mo100087f() ^ 1);
        } catch (JSONException unused) {
        }
        C42962b.f111525a.onEvent(MobClick.obtain().setEventName("camera_double_tap").setLabelName("shoot_page").setJsonObject(n));
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42344i.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C42344i iVar = (C42344i) t;
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C40052m.this.f104012a.f33526d_;
                switch (iVar.f110145d) {
                    case 0:
                        videoRecordNewActivity.mo101812a(iVar.f110143b, iVar.f110144c);
                        return;
                    case 1:
                        videoRecordNewActivity.f107327m.mo100078a(iVar.f110142a);
                        iVar.f110146e = true;
                        break;
                    case 2:
                        C40052m.m128016a(videoRecordNewActivity);
                        return;
                }
            }
        };
    }
}
