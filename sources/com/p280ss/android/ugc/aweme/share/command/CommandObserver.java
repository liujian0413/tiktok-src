package com.p280ss.android.ugc.aweme.share.command;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0055r;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.share.command.C38012e.C38018a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.share.command.CommandObserver */
public class CommandObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private static CommandObserver f98925a;

    /* renamed from: b */
    private void m121321b() {
        m121322b(AwemeApplication.m21341a());
    }

    /* renamed from: c */
    private static void m121323c() {
        C38012e.m121339a(true);
    }

    /* renamed from: a */
    public static void m121319a() {
        if (f98925a == null) {
            f98925a = new CommandObserver();
            C0055r.m126a().getLifecycle().mo55a(f98925a);
        }
    }

    /* renamed from: b */
    private void m121322b(Context context) {
        if (C38012e.m121340a()) {
            C6726a.m20842a(new C38010c(this, context));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95582a(Context context) {
        if (((Integer) C23060u.m75742a().mo60093w().mo59877d()).intValue() != 0) {
            C38012e.m121336a(context, (C38018a) new C38018a() {
                /* renamed from: a */
                public final void mo95583a(String str, int i) {
                    String str2 = "pic";
                    if (!TextUtils.isEmpty(str)) {
                        CommandObserver.m121320a(str, str2, i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        switch (event) {
            case ON_RESUME:
                m121321b();
                return;
            case ON_STOP:
                m121323c();
                break;
        }
    }

    /* renamed from: a */
    public static void m121320a(String str, String str2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38022i());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C38009b) arrayList.get(i2)).mo95652a(str, str2, i);
        }
    }
}
