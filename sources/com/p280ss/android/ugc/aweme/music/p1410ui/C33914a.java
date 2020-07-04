package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a */
public final class C33914a extends C34018y {

    /* renamed from: a */
    public ArrayList<Integer> f88502a = new ArrayList<>();

    /* renamed from: b */
    private Toast f88503b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86578a(MusicModel musicModel) {
    }

    /* renamed from: d */
    public final void mo61976d() {
        Downloader instance = Downloader.getInstance(this.f88725e.mo62001k());
        if (!C6307b.m19566a((Collection<T>) this.f88502a)) {
            Iterator it = this.f88502a.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    instance.cancel(num.intValue());
                }
            }
        }
        super.mo61976d();
    }

    public C33914a(C33951d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo86579a(MusicModel musicModel, Context context) {
        boolean z;
        if (musicModel == null || !TextUtils.isEmpty(musicModel.getPath())) {
            try {
                z = C30199h.m98861a().getShieldMusicSdk().booleanValue();
            } catch (NullValueException unused) {
                z = false;
            }
            if ((!z || musicModel == null || musicModel.getMusicType() != MusicType.BAIDU) && (musicModel == null || musicModel.getMusicStatus() != 0)) {
                return true;
            }
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(R.string.chd);
            }
            m109322a(context, offlineDesc, 0);
            return false;
        }
        m109322a(context, context.getString(R.string.chf), 0);
        return false;
    }

    /* renamed from: a */
    private void m109322a(Context context, String str, int i) {
        if (this.f88503b != null) {
            this.f88503b.cancel();
        }
        this.f88503b = Toast.makeText(context, str, 0);
        if (this.f88503b != null) {
            this.f88503b.setGravity(17, 0, 0);
            C33943b.m109396a(this.f88503b);
        }
    }
}
