package com.p280ss.android.ugc.aweme.i18n.musically.cut;

import android.app.Activity;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.utils.p1693b.C42964a;
import com.p280ss.android.ugc.aweme.utils.p1693b.C42964a.C42965a;
import com.p280ss.android.ugc.aweme.utils.permission.C43155b;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.b */
public final class C30514b implements C42965a {

    /* renamed from: a */
    private C30516a f80183a;

    /* renamed from: b */
    private C30517b f80184b;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.b$a */
    public interface C30516a {
        /* renamed from: a */
        void mo80213a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.b$b */
    public interface C30517b {
        /* renamed from: a */
        void mo80176a(Intent intent);
    }

    /* renamed from: b */
    public final void mo80212b(Activity activity, C30516a aVar) {
        this.f80183a = aVar;
        new C42964a(activity).mo104674a(new Intent(activity, AvatarChooseActivity.class), 2, this);
    }

    /* renamed from: a */
    public final void mo80210a(final Activity activity, final C30516a aVar) {
        if (C43162f.m136888c(activity) == 0) {
            mo80212b(activity, aVar);
            return;
        }
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (activity != null && !activity.isFinishing()) {
                    if (iArr[0] == 0) {
                        C30514b.this.mo80212b(activity, aVar);
                    } else {
                        C43155b.m136878a(R.string.cn0, R.string.cmy, activity);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57302a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 2) {
                this.f80183a.mo80213a(intent.getStringExtra("mp4"));
                return;
            }
            if (i == 3) {
                this.f80184b.mo80176a(intent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80211a(Activity activity, String str, C30517b bVar) {
        this.f80184b = bVar;
        C42964a aVar = new C42964a(activity);
        Intent intent = new Intent(activity, AvatarCutActivity.class);
        intent.putExtra("file_path", str);
        aVar.mo104674a(intent, 3, this);
    }
}
