package com.p280ss.android.ugc.aweme.homepage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p022v4.content.C0688e;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.homepage.e */
public final class C30258e {

    /* renamed from: a */
    public static boolean f79610a = true;

    /* renamed from: b */
    private C30260a f79611b;

    /* renamed from: com.ss.android.ugc.aweme.homepage.e$a */
    static final class C30260a extends BroadcastReceiver {
        C30260a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("com.msg.count.action.arrived".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("msg_count", 0);
                    int intExtra2 = intent.getIntExtra("msg_dot", -1);
                    C42961az.m136380a(new C34314g(99, intExtra));
                    C42961az.m136380a(new C34314g(BaseNotice.HASHTAG, intExtra2));
                } else if ("message_stranger_mark_read_action".equals(intent.getAction())) {
                    C42961az.m136380a(new C34314g(11, -1));
                }
            }
        }
    }

    /* renamed from: d */
    private void m98992d() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                int i;
                if (C30258e.f79610a) {
                    i = 1;
                } else {
                    i = 5;
                }
                C34315c.m110980a(false, i);
            }
        });
    }

    /* renamed from: a */
    public final void mo79768a() {
        m98991c();
        if (!f79610a) {
            m98992d();
        }
        f79610a = false;
    }

    /* renamed from: b */
    public final void mo79769b() {
        C0688e.m2941a(C6399b.m19921a()).mo2837a((BroadcastReceiver) this.f79611b);
    }

    /* renamed from: c */
    private void m98991c() {
        this.f79611b = new C30260a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.msg.count.action.arrived");
        intentFilter.addAction("message_stranger_mark_read_action");
        C0688e.m2941a(C6399b.m19921a()).mo2838a(this.f79611b, intentFilter);
    }
}
