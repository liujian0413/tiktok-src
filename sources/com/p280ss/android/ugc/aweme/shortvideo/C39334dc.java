package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42138ae;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dc */
public final class C39334dc implements C42161ba {

    /* renamed from: a */
    public C39382ed f102181a;

    public C39334dc(C39382ed edVar) {
        this.f102181a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42138ae.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C39334dc.this.f102181a.f33526d_;
                videoRecordNewActivity.f107327m.mo100075a(0.0f);
                C42138ae aeVar = (C42138ae) t;
                C6869c a = C6869c.m21381a();
                switch (aeVar.f109661c) {
                    case 0:
                        if (aeVar.f109659a && TextUtils.equals((CharSequence) aeVar.f109660b, videoRecordNewActivity.getResources().getString(R.string.dcg))) {
                            a.mo16887a("enter_from", "click");
                            a.mo16887a("zoom_method", "pinch");
                            break;
                        } else {
                            return;
                        }
                        break;
                    case 1:
                    case 2:
                        if (TextUtils.equals((CharSequence) aeVar.f109660b, videoRecordNewActivity.getResources().getString(R.string.dct))) {
                            a.mo16887a("enter_from", "long_press");
                            a.mo16887a("zoom_method", "pinch");
                            break;
                        }
                        break;
                }
                C6907h.onEvent(MobClick.obtain().setEventName("zoom").setLabelName("shoot_page").setJsonObject(a.mo16888b()));
            }
        };
    }
}
