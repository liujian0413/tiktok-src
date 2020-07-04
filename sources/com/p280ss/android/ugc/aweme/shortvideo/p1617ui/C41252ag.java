package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ag */
public final class C41252ag {

    /* renamed from: a */
    private FaceStickerBean f107491a;

    /* renamed from: b */
    private final C39382ed f107492b;

    /* renamed from: a */
    private static boolean m131865a() {
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (b != null && b.getMusicPriority() >= 0) {
            return false;
        }
        return true;
    }

    public C41252ag(C39382ed edVar) {
        C7573i.m23587b(edVar, "plan");
        this.f107492b = edVar;
    }

    /* renamed from: a */
    private static boolean m131866a(AVMusic aVMusic) {
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (aVMusic == null) {
            if (b == null || b.getMusicPriority() >= 0) {
                return false;
            }
            return true;
        } else if (b != null && aVMusic.getMusicPriority() < b.getMusicPriority()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m131867a(C39382ed edVar) {
        if (edVar.f33526d_ != null) {
            Activity activity = edVar.f33526d_;
            if (activity != null && !activity.isFinishing()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101946a(com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r5.f107492b
            boolean r0 = m131867a(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r5.f107492b
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r0.mo97964Q()
            java.lang.String r1 = "plan.shortVideoContextViewModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f99791a
            boolean r1 = r0.mo96142d()
            if (r1 != 0) goto L_0x00c7
            boolean r1 = r0.mo96144e()
            if (r1 == 0) goto L_0x0024
            goto L_0x00c7
        L_0x0024:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments r0 = r0.f99776l
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r0 = 0
            goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            if (r6 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r5.f107492b
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.shortvideo.C39336dd
            if (r0 == 0) goto L_0x00c5
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r5.f107491a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r6, r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r6.isForceBind()
            if (r0 == 0) goto L_0x00c3
            java.util.List r0 = r6.getMusicIds()
            boolean r0 = com.bytedance.common.utility.C6311g.m19574b(r0)
            if (r0 == 0) goto L_0x00c3
            boolean r0 = m131865a()
            if (r0 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r6.getForceBindMusic()
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = r6.getForceBindMusicPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0077
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r0 = 0
            goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 2
        L_0x007e:
            com.ss.android.ugc.aweme.shortvideo.ed r3 = r5.f107492b
            com.ss.android.ugc.aweme.shortvideo.dd r3 = (com.p280ss.android.ugc.aweme.shortvideo.C39336dd) r3
            android.app.Activity r3 = r3.f33526d_
            if (r3 == 0) goto L_0x00c3
            java.lang.String r4 = "activity"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            boolean r4 = r3.isFinishing()
            if (r4 != 0) goto L_0x0096
            boolean r4 = r3 instanceof android.support.p022v4.app.FragmentActivity
            if (r4 == 0) goto L_0x0096
            r1 = 1
        L_0x0096:
            if (r1 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            if (r3 == 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00bb
            android.support.v4.app.FragmentActivity r3 = (android.support.p022v4.app.FragmentActivity) r3
            com.ss.android.ugc.gamora.a.a r1 = com.p280ss.android.ugc.gamora.p1486a.C36113b.m116288a(r3)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel> r2 = com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel.class
            com.bytedance.jedi.arch.JediViewModel r1 = r1.mo91871a(r2)
            java.lang.String r2 = "JediViewModelProviders.o…sicViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel r1 = (com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel) r1
            android.arch.lifecycle.o<java.lang.Integer> r1 = r1.f114733e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setValue(r0)
            goto L_0x00c3
        L_0x00bb:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r6.<init>(r0)
            throw r6
        L_0x00c3:
            r5.f107491a = r6
        L_0x00c5:
            return
        L_0x00c6:
            return
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41252ag.mo101946a(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101947a(com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean r13, boolean r14) {
        /*
            r12 = this;
            java.lang.String r0 = "sticker"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r12.f107492b
            boolean r0 = m131867a(r0)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r12.f107492b
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r0.mo97964Q()
            java.lang.String r1 = "plan.shortVideoContextViewModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f99791a
            boolean r1 = r0.mo96142d()
            if (r1 != 0) goto L_0x00b7
            boolean r1 = r0.mo96144e()
            if (r1 == 0) goto L_0x0029
            goto L_0x00b7
        L_0x0029:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments r0 = r0.f99776l
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r0 = 0
            goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r12.f107492b
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.shortvideo.C39336dd
            if (r0 == 0) goto L_0x00b6
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r13.getForceBindMusic()
            boolean r0 = m131866a(r0)
            if (r0 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r13)
            if (r0 != 0) goto L_0x0070
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r13.getForceBindMusic()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r13.getForceBindMusicPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r0 = 0
            goto L_0x006e
        L_0x006d:
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x0071
        L_0x0070:
            r1 = 1
        L_0x0071:
            com.ss.android.ugc.aweme.shortvideo.ed r0 = r12.f107492b
            com.ss.android.ugc.aweme.shortvideo.dd r0 = (com.p280ss.android.ugc.aweme.shortvideo.C39336dd) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r13.getForceBindMusic()
            java.lang.String r5 = r13.getForceBindMusicPath()
            r0.mo97901a(r2, r3, r4, r5)
            com.ss.android.ugc.aweme.toolsport.a.d r0 = new com.ss.android.ugc.aweme.toolsport.a.d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = ""
            com.ss.android.ugc.aweme.shortvideo.AVMusic r9 = r13.getForceBindMusic()
            java.lang.String r10 = r13.getForceBindMusicPath()
            r11 = r14 ^ 1
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r13.getForceBindMusic()
            r1.mo97928a(r2)
            com.ss.android.ugc.aweme.shortvideo.y r1 = new com.ss.android.ugc.aweme.shortvideo.y
            com.ss.android.ugc.aweme.shortvideo.ed r2 = r12.f107492b
            r1.<init>(r0, r2)
            r1.mo102482a()
        L_0x00b1:
            if (r14 != 0) goto L_0x00b6
            r12.mo101946a(r13)
        L_0x00b6:
            return
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41252ag.mo101947a(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, boolean):void");
    }
}
