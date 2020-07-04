package com.p280ss.ugc.live.sdk.player.p1832a;

import android.content.Context;
import android.util.SparseIntArray;
import com.p280ss.ttm.player.TTMediaPlayer;
import com.p280ss.ttm.player.TTPlayerConfiger;
import com.p280ss.ugc.live.sdk.player.C46256b;
import com.p280ss.ugc.live.sdk.player.ILivePlayer;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.player.a.c */
public final class C46254c {

    /* renamed from: a */
    final Context f118878a;

    /* renamed from: b */
    boolean f118879b;

    /* renamed from: c */
    C46256b f118880c;

    /* renamed from: d */
    SparseIntArray f118881d = new SparseIntArray();

    /* renamed from: b */
    private TTMediaPlayer m145250b() {
        TTPlayerConfiger.setValue(2, this.f118879b);
        TTPlayerConfiger.setValue(1, true);
        TTPlayerConfiger.setValue(11, true);
        return TTMediaPlayer.create(this.f118878a);
    }

    /* renamed from: a */
    public final ILivePlayer mo114254a() throws Exception {
        TTMediaPlayer b = m145250b();
        if (b == null) {
            b = m145250b();
            if (b == null || b.isOSPlayer()) {
                if (this.f118880c != null) {
                    new JSONObject().put("body_type", "init").put("fail_code", 1).put("error_msg", "ttplayer init failed");
                }
                throw new Exception("create ttplayer fail");
            }
        }
        if (this.f118880c != null) {
            new JSONObject().put("body_type", "init").put("fail_code", 0);
        }
        for (int i = 0; i < this.f118881d.size(); i++) {
            b.setIntOption(this.f118881d.keyAt(i), this.f118881d.valueAt(i));
        }
        return new C46253b(this, b);
    }

    /* renamed from: a */
    public final C46254c mo114256a(C46256b bVar) {
        this.f118880c = bVar;
        return this;
    }

    public C46254c(Context context) {
        this.f118878a = context;
    }

    /* renamed from: a */
    public final C46254c mo114257a(boolean z) {
        this.f118879b = false;
        return this;
    }

    /* renamed from: a */
    public final C46254c mo114255a(int i, int i2) {
        this.f118881d.append(i, i2);
        return this;
    }
}
