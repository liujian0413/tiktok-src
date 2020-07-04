package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Color;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel.C41121a;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.C44474a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dm */
public final class C39348dm implements C44474a {

    /* renamed from: b */
    public static final C39349a f102219b = new C39349a(null);

    /* renamed from: f */
    private static final long f102220f = C35563c.f93230L.mo93344c(Property.LongVideoThreshold);

    /* renamed from: g */
    private static final long f102221g = 15000;

    /* renamed from: a */
    public final FragmentActivity f102222a;

    /* renamed from: d */
    private ShortVideoContext f102223d;

    /* renamed from: e */
    private boolean f102224e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.dm$a */
    public static final class C39349a {
        private C39349a() {
        }

        public /* synthetic */ C39349a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    private boolean m125703c() {
        return this.f102224e;
    }

    /* renamed from: b */
    public final C10751a mo97917b() {
        String string = this.f102222a.getString(R.string.dth);
        Context context = this.f102222a;
        C7573i.m23582a((Object) string, "tipString");
        if (m125702a(context, string) && this.f102222a != null) {
            return new C10752a(this.f102222a).mo25735a(string).mo25730a(Color.parseColor("#E6FFFFFF")).mo25737a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.dmt.p262ui.bubbleview.C10751a mo97915a() {
        /*
            r6 = this;
            android.support.v4.app.FragmentActivity r0 = r6.f102222a
            r1 = 0
            if (r0 == 0) goto L_0x0019
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m159a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r2 = com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.u r0 = r0.mo147a(r2)
            java.lang.String r2 = "ViewModelProviders.of(it…extViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f99791a
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            r6.f102223d = r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r6.f102223d
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.mo96141c()
            r2 = 1
            if (r0 != r2) goto L_0x00a9
            com.ss.android.ugc.aweme.property.AVAB r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r2 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r0 = r0.mo93305a(r2)
            if (r0 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x0048
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0048:
            java.lang.String r2 = "PublishManager.inst().getCurMusic()!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            int r0 = r0.getPresenterDuration()
            if (r0 <= 0) goto L_0x006f
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 == 0) goto L_0x0062
            int r0 = r0.getPresenterDuration()
            goto L_0x007b
        L_0x0062:
            com.ss.android.ugc.aweme.toolsport.IAVMusicService r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93246i
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f102223d
            if (r2 == 0) goto L_0x006a
            java.lang.String r1 = r2.f99769e
        L_0x006a:
            int r0 = r0.mo103862b(r1)
            goto L_0x007b
        L_0x006f:
            com.ss.android.ugc.aweme.toolsport.IAVMusicService r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93246i
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f102223d
            if (r2 == 0) goto L_0x0077
            java.lang.String r1 = r2.f99769e
        L_0x0077:
            int r0 = r0.mo103862b(r1)
        L_0x007b:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.f102223d
            if (r1 == 0) goto L_0x0082
            boolean r1 = r1.f99745af
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            boolean r2 = com.p280ss.android.ugc.aweme.shortvideo.C38579ch.m123272a()
            if (r2 == 0) goto L_0x0096
            long r2 = (long) r0
            if (r1 == 0) goto L_0x008f
            long r0 = f102220f
            goto L_0x0091
        L_0x008f:
            long r0 = f102221g
        L_0x0091:
            com.bytedance.ies.dmt.ui.bubbleview.a r0 = r6.m125701a(r2, r0)
            return r0
        L_0x0096:
            long r2 = f102221g
            long r4 = (long) r0
            long r2 = java.lang.Math.min(r2, r4)
            if (r1 == 0) goto L_0x00a2
            long r0 = f102220f
            goto L_0x00a4
        L_0x00a2:
            long r0 = f102221g
        L_0x00a4:
            com.bytedance.ies.dmt.ui.bubbleview.a r0 = r6.m125701a(r2, r0)
            return r0
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.C39348dm.mo97915a():com.bytedance.ies.dmt.ui.bubbleview.a");
    }

    /* renamed from: a */
    public final void mo97916a(boolean z) {
        this.f102224e = true;
    }

    public C39348dm(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f102222a = fragmentActivity;
    }

    /* renamed from: a */
    private final boolean m125702a(Context context, String str) {
        int a = C41121a.m131298a(this.f102222a);
        if (a != 2 && a != 3) {
            return true;
        }
        C10761a.m31404c(context, str, 1).mo25750a();
        return false;
    }

    /* renamed from: a */
    private final C10751a m125701a(long j, long j2) {
        boolean z;
        String str;
        int i;
        ShortVideoContext shortVideoContext = this.f102223d;
        boolean z2 = true;
        if (shortVideoContext == null || (!C7573i.m23585a((Object) "prop_reuse", (Object) shortVideoContext.f99788x) && !C7573i.m23585a((Object) "prop_page", (Object) shortVideoContext.f99788x))) {
            z = false;
        } else {
            z = true;
        }
        if (j < j2) {
            FragmentActivity fragmentActivity = this.f102222a;
            if (!z || m125703c()) {
                i = R.string.fla;
            } else {
                i = R.string.flc;
            }
            str = fragmentActivity.getString(i, new Object[]{Long.valueOf(j / 1000)});
            C7573i.m23582a((Object) str, "activity.getString(if (i…ps, musicDuration / 1000)");
        } else {
            if (!z || m125703c()) {
                str = "";
            } else {
                str = this.f102222a.getString(R.string.fld);
            }
            C7573i.m23582a((Object) str, "if (isFromUseSameSticker…rigin_music_tips) else \"\"");
        }
        if (m125702a((Context) this.f102222a, str) && this.f102222a != null) {
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                return new C10752a(this.f102222a).mo25735a(str).mo25730a(Color.parseColor("#E6FFFFFF")).mo25737a();
            }
        }
        return null;
    }
}
