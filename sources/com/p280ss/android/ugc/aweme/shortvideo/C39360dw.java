package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.draft.C27304c;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42608f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dw */
public class C39360dw implements C27304c, C42608f {

    /* renamed from: j */
    private static C39360dw f102245j;

    /* renamed from: a */
    public AVMusic f102246a;

    /* renamed from: b */
    public List<AVChallenge> f102247b = new ArrayList();

    /* renamed from: c */
    public AVNationalTask f102248c = null;

    /* renamed from: d */
    public String f102249d;

    /* renamed from: e */
    public int f102250e;

    /* renamed from: f */
    public String f102251f;

    /* renamed from: g */
    public long f102252g = -1;

    /* renamed from: h */
    public RecordScene f102253h;

    /* renamed from: i */
    public volatile boolean f102254i = false;

    /* renamed from: k */
    private AVMusic f102255k;

    /* renamed from: l */
    private int f102256l;

    /* renamed from: b */
    public final AVMusic mo97931b() {
        return this.f102255k;
    }

    /* renamed from: c */
    public final void mo97933c() {
        this.f102248c = null;
    }

    /* renamed from: d */
    public final void mo97934d() {
        this.f102251f = "";
    }

    /* renamed from: f */
    public final void mo97936f() {
        this.f102247b.clear();
    }

    /* renamed from: g */
    public final boolean mo97937g() {
        if (this.f102256l == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final String mo97935e() {
        if (this.f102251f != null) {
            return this.f102251f;
        }
        return "";
    }

    private C39360dw() {
        C35574k.m114859a().mo70090e().mo90401a((C27304c) this);
    }

    /* renamed from: a */
    public static C39360dw m125725a() {
        if (f102245j == null) {
            synchronized (C39360dw.class) {
                if (f102245j == null) {
                    f102245j = new C39360dw();
                }
            }
        }
        return f102245j;
    }

    /* renamed from: h */
    public final boolean mo97938h() {
        if (this.f102256l == 10 || this.f102256l == 9 || this.f102256l == 11 || this.f102256l == 12) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo97940j() {
        int i = this.f102256l;
        if (i != 0) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo97939i() {
        RecordScene b = C38505a.m123085b();
        this.f102254i = false;
        if (!b.isSegmentsNotValid()) {
            if (b.isDuetMode()) {
                C7276d.m22816c(b.duetVideoPath);
                C7276d.m22816c(b.duetAudioPath);
                m125726a(b);
                C38505a.m123073a();
            } else if (b.recordMode == 1) {
                C7276d.m22816c(b.mp4Path);
                C7276d.m22816c(b.musicPath);
                m125726a(b);
                C38505a.m123073a();
            } else if (b.isReactionMode()) {
                C7276d.m22816c(b.reactionParams.videoPath);
                C7276d.m22816c(b.reactionParams.wavPath);
                m125726a(b);
                C38505a.m123073a();
            } else if (TextUtils.isEmpty(b.mp4Path)) {
                this.f102254i = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo97928a(AVMusic aVMusic) {
        this.f102255k = aVMusic;
    }

    /* renamed from: a */
    public final void mo97929a(Collection<AVChallenge> collection) {
        if (collection != null) {
            this.f102247b.clear();
            this.f102247b.addAll(collection);
        }
    }

    /* renamed from: b */
    public final boolean mo97932b(Context context) {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (!mo97940j() || !iAVService.getPublishService().isPublishServiceRunning(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m125726a(RecordScene recordScene) {
        if (recordScene != null && recordScene.extractFramesModel != null) {
            C7276d.m22822e(recordScene.extractFramesModel.extractFramesDir);
            C7276d.m22816c(recordScene.extractFramesModel.extractFramesDir);
        }
    }

    /* renamed from: b */
    private void m125727b(int i) {
        if (i != 2) {
            if (i != 12) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        this.f102252g = -1;
                        break;
                }
            }
            this.f102251f = "";
            return;
        }
        this.f102252g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo97926a(int i) {
        if (C7163a.m22363a()) {
            if (i != 2) {
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("unknown publish status: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f102256l = i;
        } else {
            this.f102256l = i;
        }
        m125727b(i);
    }

    /* renamed from: a */
    public final void mo97927a(AVChallenge aVChallenge) {
        if (aVChallenge != null && aVChallenge.getCid() != null) {
            this.f102247b.clear();
            this.f102247b.add(aVChallenge);
        }
    }

    /* renamed from: a */
    public final boolean mo97930a(Context context) {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (!mo97940j() || !iAVService.getPublishService().isPublishServiceRunning(context)) {
            return true;
        }
        C10761a.m31409e(context.getApplicationContext(), (int) R.string.ig).mo25750a();
        return false;
    }

    /* renamed from: a */
    public final void mo70116a(C27311c cVar, boolean z) {
        if (!z) {
            mo97934d();
        }
    }
}
