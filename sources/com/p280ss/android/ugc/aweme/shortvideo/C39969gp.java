package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44820v;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.exit.RecordExitViewModel;
import java.lang.reflect.Type;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gp */
public final class C39969gp implements C42161ba {

    /* renamed from: a */
    public C39382ed f103841a;

    /* renamed from: b */
    public RecordViewModel f103842b;

    /* renamed from: c */
    public RecordControlViewModel f103843c;

    /* renamed from: d */
    public RecordStatusViewModel f103844d;

    C39969gp(C39382ed edVar) {
        this.f103841a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42137ad.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: a */
            RecordChooseMusicViewModel f103845a;

            /* renamed from: b */
            RecordExitViewModel f103846b;

            /* renamed from: c */
            ShortVideoContext f103847c;

            /* renamed from: a */
            public final void mo99401a(boolean z) {
                if (z) {
                    C39969gp.this.f103842b.mo106836b(4);
                    return;
                }
                C39969gp.this.f103841a.mo97909d(false);
                C39969gp.this.f103842b.mo106836b(4);
                C39969gp.this.f103843c.mo106954b(4);
                C39969gp.this.f103844d.mo102542m().setValue(Boolean.valueOf(true));
            }

            /* renamed from: b */
            public final void mo99402b(boolean z) {
                if (z) {
                    C39969gp.this.f103842b.mo106836b(0);
                    return;
                }
                boolean z2 = true;
                C39969gp.this.f103841a.mo97909d(true);
                if (C39969gp.this.f103841a.mo97964Q().f99791a.mo96150k() != 0) {
                    z2 = false;
                }
                if (z2 && !this.f103847c.f99779o) {
                    C39969gp.this.f103842b.mo106836b(0);
                }
                C39969gp.this.f103843c.mo106954b(0);
                C39969gp.this.f103844d.mo102542m().setValue(Boolean.valueOf(false));
            }

            /* renamed from: c */
            private void m127851c(final boolean z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new AnimationListener() {
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        C399701.this.mo99401a(z);
                    }
                });
                if (this.f103845a == null) {
                    this.f103845a = (RecordChooseMusicViewModel) C36113b.m116288a(C39969gp.this.f103841a.mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
                }
                if (this.f103846b == null) {
                    this.f103846b = (RecordExitViewModel) C36113b.m116288a(C39969gp.this.f103841a.mo97962O()).mo91871a(RecordExitViewModel.class);
                }
                C9738o.m28713b(C39969gp.this.f103841a.f102272B);
                if (C39969gp.this.f103841a.f102272B != null) {
                    C39969gp.this.f103841a.f102272B.startAnimation(alphaAnimation);
                    this.f103845a.mo106929a(new Pair<>(Float.valueOf(1.0f), Float.valueOf(0.0f)));
                    this.f103846b.mo107065a(new Pair<>(Float.valueOf(1.0f), Float.valueOf(0.0f)));
                }
                ((C44820v) C39969gp.this.f103841a.f102274D.mo30924a("RecordBottomTabScene")).mo107266a((Animation) alphaAnimation);
                C39969gp.this.f103843c.mo106951a((Animation) alphaAnimation);
            }

            /* renamed from: d */
            private void m127852d(final boolean z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new AnimationListener() {
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        C399701.this.mo99402b(z);
                    }
                });
                if (this.f103845a == null) {
                    this.f103845a = (RecordChooseMusicViewModel) C36113b.m116288a(C39969gp.this.f103841a.mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
                }
                if (this.f103846b == null) {
                    this.f103846b = (RecordExitViewModel) C36113b.m116288a(C39969gp.this.f103841a.mo97962O()).mo91871a(RecordExitViewModel.class);
                }
                C9738o.m28713b(C39969gp.this.f103841a.f102272B);
                if (C39969gp.this.f103841a.f102272B != null) {
                    C39969gp.this.f103841a.f102272B.startAnimation(alphaAnimation);
                    this.f103845a.mo106929a(new Pair<>(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                    this.f103846b.mo107065a(new Pair<>(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                }
                ((C44820v) C39969gp.this.f103841a.f102274D.mo30924a("RecordBottomTabScene")).mo107266a((Animation) alphaAnimation);
                C39969gp.this.f103843c.mo106951a((Animation) alphaAnimation);
            }

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (C39969gp.this.f103842b == null) {
                    C39969gp.this.f103842b = (RecordViewModel) C36113b.m116288a(C39969gp.this.f103841a.mo97962O()).mo91871a(RecordViewModel.class);
                }
                if (C39969gp.this.f103843c == null) {
                    C39969gp.this.f103843c = (RecordControlViewModel) C36113b.m116288a(C39969gp.this.f103841a.mo97962O()).mo91871a(RecordControlViewModel.class);
                }
                if (C39969gp.this.f103844d == null) {
                    C39969gp.this.f103844d = (RecordStatusViewModel) C0069x.m159a(C39969gp.this.f103841a.mo97962O()).mo147a(RecordStatusViewModel.class);
                }
                if (this.f103847c == null) {
                    this.f103847c = ((ShortVideoContextViewModel) C0069x.m159a(C39969gp.this.f103841a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
                }
                C42137ad adVar = (C42137ad) t;
                if (adVar.f109656a == 0 && adVar.f109658c) {
                    m127851c(adVar.f109657b);
                } else if (adVar.f109656a == 0) {
                    mo99401a(adVar.f109657b);
                } else if (adVar.f109656a != 8 || !adVar.f109658c) {
                    mo99402b(adVar.f109657b);
                } else {
                    m127852d(adVar.f109657b);
                }
            }
        };
    }
}
