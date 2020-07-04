package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.tools.C42135ab;
import com.p280ss.android.ugc.aweme.tools.C42152as;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fs */
public final class C39903fs implements C42161ba {

    /* renamed from: a */
    public static final long f103670a = C35563c.f93230L.mo93344c(Property.LongVideoThreshold);

    /* renamed from: b */
    C39382ed f103671b;

    /* renamed from: c */
    public RecordToolbarViewModel f103672c;

    /* renamed from: a */
    public static void m127662a() {
        C35622l lVar = (C35622l) C25682d.m84426a(C29960a.m98230a(), C35622l.class);
        if (lVar != null && !lVar.mo60364b(false)) {
            lVar.mo60367c(true);
        }
    }

    /* renamed from: b */
    public final long mo99316b() {
        BackgroundVideo backgroundVideo = this.f103671b.mo97964Q().f99791a.f99782r;
        if (backgroundVideo != null) {
            return backgroundVideo.getMaxDuration();
        }
        return 0;
    }

    public C39903fs(C39382ed edVar) {
        this.f103671b = edVar;
    }

    /* renamed from: a */
    public final void mo99315a(boolean z) {
        if ((this.f103671b instanceof C39336dd) && !z) {
            ((RecordChooseMusicViewModel) C36113b.m116288a(this.f103671b.mo97962O()).mo91871a(RecordChooseMusicViewModel.class)).f114733e.setValue(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42152as.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                long j;
                long j2;
                long j3;
                String str;
                C42152as asVar = (C42152as) t;
                if (C39903fs.this.f103672c == null) {
                    C39903fs.this.f103672c = (RecordToolbarViewModel) C36113b.m116288a(C39903fs.this.f103671b.mo97962O()).mo91871a(RecordToolbarViewModel.class);
                }
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a(C39903fs.this.f103671b.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
                if (asVar.f109679a) {
                    AVMusic b = C39360dw.m125725a().mo97931b();
                    String str2 = shortVideoContext.f99769e;
                    if (asVar.f109680b) {
                        j = C40413c.f105051b;
                    } else {
                        j = C39903fs.f103670a;
                    }
                    if (b == null || TextUtils.isEmpty(str2)) {
                        j2 = j;
                        j3 = 0;
                    } else {
                        j3 = C38580ci.m123273a(b, str2);
                        if (j > j3) {
                            C39903fs.this.f103672c.mo107187d(false);
                        } else {
                            C39903fs.this.f103672c.mo107187d(true);
                        }
                        j2 = Math.min(j3, j);
                    }
                    long b2 = C39903fs.this.mo99316b();
                    if (b2 > 0) {
                        j2 = Math.min(j2, b2);
                    }
                    MaxDurationTip a = new C38573cd().mo96553a(j, j3);
                    if (!shortVideoContext.mo96141c() || C38579ch.m123272a()) {
                        C39903fs.this.f103672c.mo107178a(asVar);
                        C39903fs.this.f103671b.mo97964Q().f99791a.f99745af = !asVar.f109680b;
                        C39903fs.this.f103671b.mo97964Q().f99791a.f99767c = j2;
                        C42135ab abVar = new C42135ab(j2);
                        C39903fs.this.f103671b.mo97963P().mo103594a((Object) this, (C42155av) abVar);
                        C39903fs.this.f103671b.mo97896J().mo103594a((Object) this, (C42155av) abVar);
                        if (a == MaxDurationTip.MUSIC) {
                            C39903fs.this.mo99315a(asVar.f109682d);
                        }
                        C39903fs.this.mo99314a(b, j);
                        C35563c.f93230L.mo93341a(Property.DurationMode, shortVideoContext.f99745af);
                        C39903fs.m127662a();
                        if (!asVar.mo103588a()) {
                            String str3 = "video_duration_select";
                            C22984d a2 = C22984d.m75611a();
                            String str4 = "to_status";
                            if (asVar.f109680b) {
                                str = "15s";
                            } else {
                                str = "60s";
                            }
                            C6907h.m21524a(str3, (Map) a2.mo59973a(str4, str).mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("shoot_way", shortVideoContext.f99788x).mo59970a("draft_id", shortVideoContext.f99790z).f60753a);
                        }
                    } else {
                        if (asVar.mo103588a()) {
                            C39903fs.this.f103671b.mo97964Q().f99791a.f99745af = !asVar.f109680b;
                            C35563c.f93230L.mo93341a(Property.DurationMode, shortVideoContext.f99745af);
                            C39903fs.m127662a();
                            if (a == MaxDurationTip.MUSIC) {
                                C39903fs.this.mo99315a(asVar.f109682d);
                            }
                        }
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo99314a(AVMusic aVMusic, long j) {
        if ((this.f103671b.mo97962O() instanceof VideoRecordNewActivity) && aVMusic != null) {
            if (C35563c.f93231M.mo93305a(AVAB.Property.EnableRemove15sCapMusic)) {
                if (((long) aVMusic.shootDuration) > j || Math.abs(aVMusic.shootDuration - aVMusic.duration) >= 1000) {
                    ((RecordToolbarViewModel) C36113b.m116288a(this.f103671b.mo97962O()).mo91871a(RecordToolbarViewModel.class)).mo107187d(true);
                } else {
                    ((RecordToolbarViewModel) C36113b.m116288a(this.f103671b.mo97962O()).mo91871a(RecordToolbarViewModel.class)).mo107187d(false);
                }
            } else if (((long) aVMusic.duration) > j) {
                ((RecordToolbarViewModel) C36113b.m116288a(this.f103671b.mo97962O()).mo91871a(RecordToolbarViewModel.class)).mo107187d(true);
            } else {
                ((RecordToolbarViewModel) C36113b.m116288a(this.f103671b.mo97962O()).mo91871a(RecordToolbarViewModel.class)).mo107187d(false);
            }
        }
    }
}
