package com.p280ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28852br;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28894e;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget */
public class VideoDiggWidget extends AbsFeedWidget {

    /* renamed from: a */
    private final String f74691a;

    /* renamed from: i */
    private final String f74692i;

    /* renamed from: j */
    private final C28350a f74693j;

    /* renamed from: k */
    private final String f74694k;

    /* renamed from: l */
    private final String f74695l;

    /* renamed from: m */
    private final String f74696m;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget$a */
    public interface C28350a {
        /* renamed from: a */
        long mo71759a();
    }

    public void onCreate() {
        super.onCreate();
        this.f60922e.mo60132a("awesome_update_data", (C0053p<C23083a>) this).mo60132a("awesome_update_backup_data", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C28894e mo61335b(View view) {
        C28852br brVar = new C28852br(view, this.f74691a, this.f74692i, this.f74694k, this.f74695l, this.f74696m, this.f74693j);
        return brVar;
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 651229933) {
                if (hashCode == 1759823748 && str.equals("awesome_update_data")) {
                    c = 0;
                }
            } else if (str.equals("awesome_update_backup_data")) {
                c = 1;
            }
            switch (c) {
                case 0:
                case 1:
                    mo72017b(aVar);
                    break;
            }
        }
    }

    public VideoDiggWidget(String str, C28350a aVar) {
        this(str, "", "", "", "", aVar);
    }

    public VideoDiggWidget(String str, String str2, String str3, String str4, String str5, C28350a aVar) {
        this.f74691a = str;
        this.f74692i = str2;
        this.f74693j = aVar;
        this.f74694k = str3;
        this.f74695l = str4;
        this.f74696m = str5;
    }
}
