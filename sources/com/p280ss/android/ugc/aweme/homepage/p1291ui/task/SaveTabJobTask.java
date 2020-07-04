package com.p280ss.android.ugc.aweme.homepage.p1291ui.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.task.SaveTabJobTask */
public final class SaveTabJobTask implements LegoTask {
    private int tab;

    public final int getTab() {
        return this.tab;
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void setTab(int i) {
        this.tab = i;
    }

    public SaveTabJobTask(int i) {
        this.tab = i;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin()) {
            C30296a.f79657a.mo79793a(this.tab);
        }
    }
}
