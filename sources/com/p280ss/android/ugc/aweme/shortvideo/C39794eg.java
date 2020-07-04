package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eg */
public final class C39794eg implements C42161ba {

    /* renamed from: a */
    C39382ed f103439a;

    /* renamed from: b */
    public RecordToolbarViewModel f103440b;

    /* renamed from: c */
    public RecordChooseMusicViewModel f103441c;

    /* renamed from: d */
    public ShortVideoContext f103442d;

    /* renamed from: e */
    public RecordViewModel f103443e;

    C39794eg(C39382ed edVar) {
        this.f103439a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42141ah.class) {
            return null;
        }
        final C42159az a = awVar.mo103592a((C42161ba) this, type);
        return new C42159az<T>() {
            /* renamed from: a */
            private void m127413a(boolean z) {
                if (C39794eg.this.f103439a.mo97964Q().f99791a.mo96142d() || C39794eg.this.f103439a.mo97964Q().f99791a.mo96144e()) {
                    C39794eg.this.f103443e.mo106847l(false);
                    return;
                }
                C39794eg.this.f103441c.f114735g.setValue(Boolean.valueOf(z));
                if (z) {
                    C39794eg.this.f103441c.mo106924a(1.0f);
                    C39794eg.this.f103441c.mo106925a((int) NormalGiftView.ALPHA_255);
                    if (C39360dw.m125725a().mo97931b() == null) {
                        C39794eg.this.f103441c.mo106927a(C39794eg.this.f103439a.mo97961N().getResources().getDrawable(R.drawable.apo));
                        C39794eg.this.f103441c.mo106928a(C39794eg.this.f103439a.mo31017x().getString(R.string.a3q));
                    }
                } else {
                    C39794eg.this.f103441c.mo106925a(127);
                    C39794eg.this.f103441c.mo106924a(0.5f);
                    if (C39360dw.m125725a().mo97931b() != null && C39794eg.this.f103439a.mo97964Q().f99791a.mo96141c()) {
                        C39794eg.this.f103441c.mo106927a(C39794eg.this.f103439a.mo31017x().getDrawable(R.drawable.app));
                        AVMusic b = C39360dw.m125725a().mo97931b();
                        if (b != null) {
                            StringBuilder sb = new StringBuilder(b.getName());
                            if (b.getSinger() != null && !b.getSinger().isEmpty()) {
                                sb.append("-");
                                sb.append(b.getSinger());
                            }
                            C39794eg.this.f103441c.mo106928a(sb.toString());
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                boolean z;
                if (a != null) {
                    a.mo96096a(obj, t);
                }
                C42141ah ahVar = (C42141ah) t;
                if (C39794eg.this.f103440b == null) {
                    C39794eg.this.f103440b = (RecordToolbarViewModel) C36113b.m116288a(C39794eg.this.f103439a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
                }
                if (C39794eg.this.f103441c == null) {
                    C39794eg.this.f103441c = (RecordChooseMusicViewModel) C36113b.m116288a(C39794eg.this.f103439a.mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
                }
                if (C39794eg.this.f103442d == null) {
                    C39794eg.this.f103442d = ((ShortVideoContextViewModel) C0069x.m159a(C39794eg.this.f103439a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
                }
                if (C39794eg.this.f103443e == null) {
                    C39794eg.this.f103443e = (RecordViewModel) C36113b.m116288a(C39794eg.this.f103439a.mo97962O()).mo91871a(RecordViewModel.class);
                }
                if (ahVar.f109665b != 0 || !ahVar.f109664a.isEmpty() || C39794eg.this.f103442d.f99779o) {
                    z = false;
                } else {
                    z = true;
                }
                m127413a(z);
                C39794eg.this.f103440b.mo107187d(z);
            }
        };
    }
}
