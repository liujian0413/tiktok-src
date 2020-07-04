package com.bytedance.android.livesdk.app.dataholder;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w;
import android.support.p022v4.util.C0893e;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.p405b.C8434f;
import com.bytedance.android.livesdkapi.depend.model.live.C9360c;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.avframework.livestreamv2.interact.model.SEI;
import java.util.Iterator;

public class LinkCrossRoomDataHolder extends DataCenter {

    /* renamed from: F */
    private static C0893e<LinkCrossRoomDataHolder> f11656F = new C0893e<>(2);

    /* renamed from: G */
    private static long f11657G;

    /* renamed from: a */
    public static final LinkCrossRoomDataHolder f11658a = new LinkCrossRoomDataHolder();

    /* renamed from: A */
    public User f11659A;

    /* renamed from: B */
    public String f11660B;

    /* renamed from: C */
    public SEI f11661C;

    /* renamed from: D */
    public PKPenalStickerState f11662D = PKPenalStickerState.HIDE;

    /* renamed from: E */
    public C3908a f11663E = new C3908a();

    /* renamed from: b */
    public boolean f11664b;

    /* renamed from: c */
    public long f11665c;

    /* renamed from: d */
    public long f11666d;

    /* renamed from: e */
    public long f11667e;

    /* renamed from: f */
    public long f11668f;

    /* renamed from: g */
    public long f11669g;

    /* renamed from: h */
    public int f11670h;

    /* renamed from: i */
    public boolean f11671i;

    /* renamed from: j */
    public int f11672j;

    /* renamed from: k */
    public String f11673k = "";

    /* renamed from: l */
    public long f11674l;

    /* renamed from: m */
    public int f11675m;

    /* renamed from: n */
    public String f11676n;

    /* renamed from: o */
    public int f11677o;

    /* renamed from: p */
    public int f11678p;

    /* renamed from: q */
    public long f11679q;

    /* renamed from: r */
    public int f11680r;

    /* renamed from: s */
    public long f11681s;

    /* renamed from: t */
    public int f11682t = ((Integer) LiveConfigSettingKeys.PK_PENALTY_TIME.mo10240a()).intValue();

    /* renamed from: u */
    public boolean f11683u;

    /* renamed from: v */
    public boolean f11684v;

    /* renamed from: w */
    public long f11685w;

    /* renamed from: x */
    public long f11686x;

    /* renamed from: y */
    public boolean f11687y;

    /* renamed from: z */
    public long f11688z;

    public enum LinkState {
        DISABLED,
        SELF_JOIN,
        SELF_JOIN_SUCCEED,
        TURN_ON_ENGINE,
        TURN_ON_ENGINE_SUCCEED,
        CONNECTION_SUCCEED,
        FINISH,
        FINISH_SUCCEED,
        TURN_OFF_ENGINE,
        TURN_OFF_ENGINE_SUCCEED,
        UNLOADED
    }

    public enum PKPenalStickerState {
        SHOW,
        HIDE
    }

    public enum PkResult {
        UNFINISHED,
        LEFT_WON,
        RIGHT_WON,
        EVEN
    }

    public enum PkState {
        DISABLED,
        PK,
        PENAL,
        FINISHED
    }

    public enum PkStealTowerState {
        DISABLED,
        READY,
        IN_PROCESS,
        ENDED
    }

    /* renamed from: com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$a */
    public static final class C3908a {

        /* renamed from: a */
        public long f11690a;

        /* renamed from: b */
        public boolean f11691b;

        /* renamed from: c */
        public int f11692c;

        /* renamed from: d */
        public int f11693d;

        /* renamed from: e */
        public int f11694e;

        /* renamed from: f */
        public boolean f11695f;

        /* renamed from: g */
        public int f11696g;

        /* renamed from: h */
        public boolean f11697h;
    }

    public void onCleared() {
        super.onCleared();
        C3166a.m11964c("DATA_CENTER", "DataCenter onCleared();");
    }

    /* renamed from: a */
    public static LinkCrossRoomDataHolder m13782a() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) f11656F.mo3327a(f11657G);
        if (linkCrossRoomDataHolder != null) {
            return linkCrossRoomDataHolder;
        }
        f11658a.mo11450c();
        return f11658a;
    }

    /* renamed from: c */
    public final void mo11450c() {
        this.f11688z = 0;
        this.f11686x = 0;
        this.f11687y = false;
        this.f11685w = 0;
        this.f11683u = false;
        this.f11684v = false;
        this.f11665c = 0;
        this.f11666d = 0;
        this.f11670h = 0;
        this.f11667e = 0;
        this.f11671i = false;
        this.f11664b = false;
        this.f11672j = 0;
        this.f11673k = "";
        this.f11674l = 0;
        this.f11676n = null;
        this.f11677o = 0;
        this.f11678p = 0;
        this.f11679q = 0;
        this.f11680r = 0;
        this.f11682t = ((Integer) LiveConfigSettingKeys.PK_PENALTY_TIME.mo10240a()).intValue();
        this.f11663E = new C3908a();
        this.f11661C = null;
        if (((Boolean) LiveConfigSettingKeys.SHOW_LINK_CROSS_ROOM_RESET_STACKTRACE.mo10240a()).booleanValue()) {
            C3166a.m11957a("ttlive_pk", "LinkCrossRoomDataHolder.reset", (Throwable) new IllegalStateException());
        }
    }

    /* renamed from: b */
    public final C8434f mo11449b() {
        String str;
        int i;
        String str2 = "";
        if (this.f11672j > 0) {
            PkState pkState = (PkState) get("data_pk_state", PkState.PK);
            if (this.f11680r == 0) {
                str2 = "manual_pk";
            } else if (this.f11680r == 1) {
                str2 = "random_pk";
            }
            if (pkState == PkState.FINISHED) {
                str = "anchor";
            }
        } else {
            if (this.f11683u) {
                str = "audience";
            } else {
                str = "anchor";
            }
            if (this.f11680r == 1) {
                str = "random_pk";
            }
        }
        if (this.f11680r == 2) {
            if (this.f11681s == 1) {
                str = "non_connection_screen_match";
            } else {
                str = "non_connection_screen";
            }
        }
        C8434f b = new C8434f().mo21583a(this.f11665c).mo21587b(this.f11667e).mo21582a(this.f11672j).mo21585a(str).mo21589c(this.f11666d).mo21588b(this.f11673k);
        if (this.f11663E != null) {
            i = this.f11663E.f11692c;
        } else {
            i = 0;
        }
        return b.mo21586b(i).mo21584a(Boolean.valueOf(this.f11684v));
    }

    /* renamed from: a */
    public static void m13784a(long j) {
        if (((LinkCrossRoomDataHolder) f11656F.mo3327a(j)) != null) {
            f11656F.mo3336c(j);
        }
    }

    /* renamed from: a */
    public final LinkCrossRoomDataHolder mo11448a(C9380q qVar, Room room) {
        boolean z;
        if (qVar == null) {
            return this;
        }
        boolean z2 = true;
        if (qVar.f25761a > 0) {
            this.f11665c = qVar.f25761a;
            this.f11664b = true;
        }
        if (qVar.f25764d != null) {
            Iterator it = qVar.f25764d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9360c cVar = (C9360c) it.next();
                if (room.getOwner().getId() != cVar.f25644a) {
                    this.f11667e = cVar.f25644a;
                    break;
                }
            }
        }
        if (qVar.f25763c != null) {
            if (qVar.f25763c.f25649a > 0) {
                this.f11665c = qVar.f25763c.f25649a;
            }
            if (qVar.f25763c.f25653e > 0) {
                this.f11666d = qVar.f25763c.f25653e;
            }
            if (qVar.f25763c.f25650b > 0) {
                this.f11672j = qVar.f25763c.f25650b;
            }
            if (qVar.f25763c.f25652d > 0) {
                this.f11674l = qVar.f25763c.f25652d;
            }
            if (!C6319n.m19593a(qVar.f25763c.f25651c)) {
                this.f11673k = qVar.f25763c.f25651c;
            }
            this.f11680r = (int) qVar.f25763c.f25654f;
            this.f11681s = (long) ((int) qVar.f25763c.f25658j);
        }
        if (!(qVar.f25765e == null || qVar.f25765e.f25633b == null)) {
            this.f11663E.f11696g = qVar.f25765e.f25633b.f25643j;
            this.f11663E.f11692c = qVar.f25765e.f25633b.f25636c;
            this.f11663E.f11693d = qVar.f25765e.f25633b.f25637d;
            this.f11663E.f11694e = qVar.f25765e.f25633b.f25638e;
            this.f11663E.f11690a = qVar.f25765e.f25633b.f25634a;
            this.f11663E.f11697h = qVar.f25765e.f25633b.f25640g;
            C3908a aVar = this.f11663E;
            if (qVar.f25765e.f25633b.f25641h != 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f11695f = z;
            C3908a aVar2 = this.f11663E;
            if (room.getOwner().getId() != qVar.f25765e.f25633b.f25639f) {
                z2 = false;
            }
            aVar2.f11691b = z2;
        }
        return this;
    }

    /* renamed from: a */
    public static LinkCrossRoomDataHolder m13783a(long j, C0065w wVar, C0043i iVar) {
        m13784a(j);
        f11657G = j;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) wVar.mo147a(LinkCrossRoomDataHolder.class);
        linkCrossRoomDataHolder.lifecycleOwner = iVar;
        f11656F.mo3333b(j, linkCrossRoomDataHolder);
        return linkCrossRoomDataHolder;
    }
}
