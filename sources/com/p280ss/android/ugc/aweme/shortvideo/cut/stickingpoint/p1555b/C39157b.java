package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1555b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.shortvideo.StickPointMusicAlg;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39194h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.C39141a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.util.ArrayList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b */
public final class C39157b {

    /* renamed from: d */
    public static final C39158a f101517d = new C39158a(null);

    /* renamed from: a */
    public int f101518a;

    /* renamed from: b */
    public boolean f101519b;

    /* renamed from: c */
    public final C39161d f101520c = new C39161d(this, Looper.getMainLooper());

    /* renamed from: e */
    private Context f101521e;

    /* renamed from: f */
    private final ArrayList<String> f101522f = new ArrayList<>();

    /* renamed from: g */
    private final ArrayList<String> f101523g = new ArrayList<>();

    /* renamed from: h */
    private C39159b f101524h;

    /* renamed from: i */
    private StickPointMusicAlg f101525i;

    /* renamed from: j */
    private final ArrayList<String> f101526j = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$a */
    public static final class C39158a {
        private C39158a() {
        }

        public /* synthetic */ C39158a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$b */
    public interface C39159b {
        /* renamed from: a */
        void mo97437a(StickPointMusicAlg stickPointMusicAlg, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$c */
    public static final class C39160c extends C39141a {

        /* renamed from: a */
        final /* synthetic */ C39157b f101527a;

        /* renamed from: b */
        final /* synthetic */ String f101528b;

        /* renamed from: c */
        final /* synthetic */ String f101529c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            this.f101527a.f101520c.sendEmptyMessage(1);
            this.f101527a.f101519b = true;
            C39194h.m125152a(true, this.f101528b, this.f101529c, null);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f101527a.f101520c.sendEmptyMessage(1);
            C39194h.m125152a(false, this.f101528b, this.f101529c, baseException);
        }

        C39160c(C39157b bVar, String str, String str2) {
            this.f101527a = bVar;
            this.f101528b = str;
            this.f101529c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$d */
    public static final class C39161d extends Handler {

        /* renamed from: a */
        final /* synthetic */ C39157b f101530a;

        public final void handleMessage(Message message) {
            C7573i.m23587b(message, "msg");
            if (message.what == 1) {
                this.f101530a.f101518a++;
                this.f101530a.mo97440a();
            }
        }

        C39161d(C39157b bVar, Looper looper) {
            this.f101530a = bVar;
            super(looper);
        }
    }

    /* renamed from: a */
    public final void mo97440a() {
        if (this.f101518a >= this.f101522f.size()) {
            C39159b bVar = this.f101524h;
            if (bVar != null) {
                bVar.mo97437a(this.f101525i, this.f101519b);
            }
            this.f101520c.removeCallbacksAndMessages(null);
            return;
        }
        String str = (String) this.f101522f.get(this.f101518a);
        String str2 = (String) this.f101523g.get(this.f101518a);
        Object obj = this.f101526j.get(this.f101518a);
        C7573i.m23582a(obj, "algNameList[downloadFileIndex]");
        String str3 = (String) obj;
        if (TextUtils.isEmpty(str)) {
            this.f101520c.sendEmptyMessage(1);
        } else if (C7276d.m22812b(str2)) {
            this.f101519b |= true;
            this.f101520c.sendEmptyMessage(1);
        } else {
            C39147a.m124994a(this.f101521e, (String) this.f101522f.get(this.f101518a), (String) this.f101523g.get(this.f101518a), new C39160c(this, str, str3));
        }
    }

    /* renamed from: a */
    public final C39157b mo97439a(C39159b bVar) {
        this.f101524h = bVar;
        return this;
    }

    /* renamed from: a */
    public final void mo97441a(Context context, StickPointMusicAlg stickPointMusicAlg) {
        C7573i.m23587b(context, "context");
        if (stickPointMusicAlg == null) {
            C39159b bVar = this.f101524h;
            if (bVar != null) {
                bVar.mo97437a(stickPointMusicAlg, this.f101519b);
                return;
            }
            return;
        }
        this.f101525i = stickPointMusicAlg;
        this.f101521e = context;
        this.f101519b = false;
        this.f101522f.clear();
        this.f101523g.clear();
        this.f101518a = 0;
        if (!TextUtils.isEmpty(stickPointMusicAlg.getVeBeatsUrl())) {
            this.f101522f.add(stickPointMusicAlg.getVeBeatsUrl());
            this.f101523g.add(stickPointMusicAlg.getVeBeatsPath());
            this.f101526j.add("ve-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getDownBeatsUrl())) {
            this.f101522f.add(stickPointMusicAlg.getDownBeatsUrl());
            this.f101523g.add(stickPointMusicAlg.getDownBeatsPath());
            this.f101526j.add("down-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getNoStrengthBeatsUrl())) {
            this.f101522f.add(stickPointMusicAlg.getNoStrengthBeatsUrl());
            this.f101523g.add(stickPointMusicAlg.getNoStrengthBeatsPath());
            this.f101526j.add("no-strength-beats");
        }
        if (!TextUtils.isEmpty(stickPointMusicAlg.getManModeBeatsUrl())) {
            this.f101522f.add(stickPointMusicAlg.getManModeBeatsUrl());
            this.f101523g.add(stickPointMusicAlg.getManModeBeatsPath());
            this.f101526j.add("man_mode");
        }
        if (this.f101522f.size() == 0) {
            C39159b bVar2 = this.f101524h;
            if (bVar2 != null) {
                bVar2.mo97437a(stickPointMusicAlg, this.f101519b);
                return;
            }
            return;
        }
        mo97440a();
    }
}
