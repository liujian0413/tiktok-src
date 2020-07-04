package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42304e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i */
public final class C39996i implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f103896a;

    public C39996i(VideoRecordNewActivity videoRecordNewActivity) {
        this.f103896a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42304e.class) {
            return null;
        }
        final ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f103896a).mo147a(ShortVideoContextViewModel.class)).f99791a;
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                int i;
                int i2;
                String str;
                C42304e eVar = (C42304e) t;
                VideoRecordNewActivity videoRecordNewActivity = C39996i.this.f103896a;
                if (eVar.f110069a) {
                    i = R.string.r_;
                } else {
                    i = R.string.r6;
                }
                C10761a.m31409e((Context) videoRecordNewActivity, i).mo25750a();
                AVSettings aVSettings = C35563c.f93230L;
                Property property = Property.BeautificationMode;
                if (eVar.f110069a) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                aVSettings.mo93338a(property, i2);
                if (eVar.f110069a) {
                    C39996i.this.f103896a.mo101840c(true);
                } else {
                    C39996i.this.f103896a.mo101840c(false);
                }
                String str2 = "click_beautify_entrance";
                C22984d a = C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("shoot_way", shortVideoContext.f99788x).mo59973a("content_source", shortVideoContext.mo96148i().getContentSource()).mo59973a("content_type", shortVideoContext.mo96148i().getContentType()).mo59973a("enter_from", "video_shoot_page");
                String str3 = "to_status";
                if (shortVideoContext.f99784t) {
                    str = "on";
                } else {
                    str = "off";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            }
        };
    }
}
