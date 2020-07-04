package com.p280ss.android.ugc.aweme.music.p1409c;

import android.app.ProgressDialog;
import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33929af;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.c.a */
public final class C33775a {

    /* renamed from: a */
    public ProgressDialog f88132a;

    /* renamed from: b */
    public Context f88133b;

    /* renamed from: com.ss.android.ugc.aweme.music.c.a$a */
    public interface C33780a {
        /* renamed from: a */
        void mo67056a(Exception exc);

        /* renamed from: a */
        void mo67057a(String str);
    }

    public C33775a(Context context, ProgressDialog progressDialog) {
        this.f88133b = context.getApplicationContext();
        this.f88132a = progressDialog;
    }

    /* renamed from: a */
    public final void mo86190a(MusicModel musicModel, final C33780a aVar) {
        if (musicModel == null) {
            aVar.mo67056a(new Exception("musicModel is null"));
            return;
        }
        C33929af afVar = new C33929af(C33785e.m108938a(musicModel), C34018y.f88721o);
        afVar.mo86590a(new C33788d() {
            /* renamed from: a */
            public final void mo67058a(String str, int i, String str2, final int i2) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        if (C33775a.this.f88132a != null && C33775a.this.f88132a.isShowing()) {
                            C33775a.this.f88132a.setProgress(i2);
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo67059a(String str, int i, String str2, final Exception exc) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        if (exc != null && exc.getMessage() != null && exc.getMessage().startsWith("android storage memory size is too low")) {
                            C10761a.m31399c(C33775a.this.f88133b, (int) R.string.at0).mo25750a();
                        } else if (exc == null || exc.getMessage().startsWith("cancel by user")) {
                            C10761a.m31399c(C33775a.this.f88133b, (int) R.string.ch7).mo25750a();
                        }
                        if (C33775a.this.f88132a != null) {
                            C33775a.this.f88132a.dismiss();
                            C33775a.this.f88132a = null;
                        }
                        aVar.mo67056a(exc);
                    }
                });
            }

            /* renamed from: a */
            public final void mo67060a(final String str, int i, String str2, float[] fArr) {
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        if (C33775a.this.f88132a != null) {
                            try {
                                C33775a.this.f88132a.dismiss();
                            } catch (Exception unused) {
                            }
                            C33775a.this.f88132a = null;
                        }
                        if (!C42973bg.m136427a(str)) {
                            C10761a.m31399c(C33775a.this.f88133b, (int) R.string.ch7).mo25750a();
                        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str) < 0) {
                            C10761a.m31399c(C33775a.this.f88133b, (int) R.string.ch7).mo25750a();
                        } else {
                            aVar.mo67057a(str);
                        }
                    }
                });
            }
        });
        C43656b bVar = new C43656b();
        if (C6399b.m19944t()) {
            bVar.f112966a = C33915a.m109328b();
        }
        bVar.mo105599a((C43651a) afVar);
        C43657a aVar2 = new C43657a();
        aVar2.f112969b = 4;
        if (musicModel.getPath() == null) {
            aVar.mo67056a(new Exception("the music's download path is null"));
            return;
        }
        aVar2.f112968a = musicModel.getPath();
        bVar.mo105609b(aVar2);
    }
}
