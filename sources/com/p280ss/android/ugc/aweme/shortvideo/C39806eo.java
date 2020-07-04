package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eo */
public final class C39806eo implements C42161ba {

    /* renamed from: a */
    C39382ed f103460a;

    /* renamed from: b */
    public RecordToolbarViewModel f103461b;

    public C39806eo(C39382ed edVar) {
        this.f103460a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42146am.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                String str;
                String str2;
                C42146am amVar = (C42146am) t;
                if (C39806eo.this.f103461b == null) {
                    C39806eo.this.f103461b = (RecordToolbarViewModel) C36113b.m116288a(C39806eo.this.f103460a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
                }
                ShortVideoContext shortVideoContext = C39806eo.this.f103460a.mo97964Q().f99791a;
                if (shortVideoContext.mo96144e()) {
                    switch (amVar.f109672a) {
                        case 1:
                            shortVideoContext.f99708M = false;
                            C10761a.m31400c((Context) C39806eo.this.f103460a.f33526d_, (int) R.string.dbj, 1).mo25750a();
                            String str3 = "mute_microphone";
                            C22984d a = C22984d.m75611a().mo59973a("content_type", "video").mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("to_status", "on").mo59973a("shoot_way", "react").mo59970a("draft_id", shortVideoContext.f99790z).mo59973a("enter_from", "video_shoot_page");
                            String str4 = "enter_method";
                            if (shortVideoContext.f99712Q) {
                                str = "click_draft";
                            } else {
                                str = "";
                            }
                            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).f60753a);
                            break;
                        case 2:
                            shortVideoContext.f99708M = true;
                            String str5 = "mute_microphone";
                            C22984d a2 = C22984d.m75611a().mo59973a("content_type", "video").mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("to_status", "off").mo59973a("shoot_way", "react").mo59970a("draft_id", shortVideoContext.f99790z).mo59973a("enter_from", "video_shoot_page");
                            String str6 = "enter_method";
                            if (shortVideoContext.f99712Q) {
                                str2 = "click_draft";
                            } else {
                                str2 = "";
                            }
                            C6907h.m21524a(str5, (Map) a2.mo59973a(str6, str2).f60753a);
                            break;
                    }
                    C39806eo.this.f103461b.mo107177a(amVar);
                }
            }
        };
    }
}
