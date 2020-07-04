package com.p280ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28816av;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28894e;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget */
public class VideoCommentWidget extends AbsFeedWidget {
    public void onCreate() {
        super.onCreate();
        this.f60922e.mo60132a("awesome_update_data", (C0053p<C23083a>) this).mo60132a("awesome_update_backup_data", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C28894e mo61335b(View view) {
        return new C28816av(view);
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
}
