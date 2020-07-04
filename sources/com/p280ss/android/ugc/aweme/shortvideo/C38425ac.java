package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39695d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42570p;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ac */
public final class C38425ac implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f99864a;

    public C38425ac(VideoRecordNewActivity videoRecordNewActivity) {
        this.f99864a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42570p.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C38425ac.this.f99864a.mo101850j();
                ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) C38425ac.this.f99864a).mo147a(ShortVideoContextViewModel.class);
                ShortVideoContext shortVideoContext = shortVideoContextViewModel.f99791a;
                if (shortVideoContext != null && shortVideoContext.f99766b == 1 && shortVideoContext.f99722a == 0 && !shortVideoContext.f99779o) {
                    C39360dw.m125725a().mo97934d();
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().enterDraftBox(C38425ac.this.f99864a);
                }
                if (C38425ac.this.f99864a.f107262C) {
                    try {
                        C38425ac.this.f99864a.startActivity(new Intent(C38425ac.this.f99864a, C35563c.f93240c.mo83137d()));
                    } catch (Exception unused) {
                        C6893q.m21447a("returnmain", C6869c.m21381a().mo16887a("event", "crash").mo16888b());
                    }
                }
                if (shortVideoContext != null && shortVideoContext.f99763ax) {
                    C38425ac.this.f99864a.setResult(-1);
                }
                if (shortVideoContext == null || !shortVideoContext.f99779o) {
                    C38425ac.this.f99864a.finish();
                    return;
                }
                Intent a = GoNextFactoryFactory.m122635a(shortVideoContextViewModel, C38425ac.this.f99864a.f107327m.mo100087f());
                String absolutePath = shortVideoContext.f99775k.mo96314c().getAbsolutePath();
                a.putExtra("extra_edit_preview_info", new C39695d().mo99058a(new EditVideoSegment(absolutePath, shortVideoContext.f99775k.mo96315d().getAbsolutePath(), C39692a.m127021a(absolutePath))));
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = shortVideoContext.f99781q.f99691e;
                if (multiEditVideoStatusRecordData != null) {
                    a.putExtra("extra_multi_edit_video_data", multiEditVideoStatusRecordData);
                    multiEditVideoStatusRecordData.isMultiEditRetake = true;
                }
                VEVideoPublishEditActivity.m125843a((Context) C38425ac.this.f99864a, a, 1);
            }
        };
    }
}
