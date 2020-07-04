package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SayHelloViewHolder */
public final class SayHelloViewHolder extends BaseViewHolder<SayHelloContent> {

    /* renamed from: m */
    private View f81253m;

    /* renamed from: n */
    private C31029h f81254n;

    /* renamed from: f */
    private static boolean m100989f() {
        Object a = C6993a.m21773a(IIMService.class);
        C7573i.m23582a(a, "IMServiceManager.getServ…e(IIMService::class.java)");
        C7093b abInterface = ((IIMService) a).getAbInterface();
        if (abInterface != null) {
            return abInterface.mo18354b();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        View findViewById = this.itemView.findViewById(R.id.cyd);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.sayHelloRv)");
        this.f81253m = findViewById;
    }

    public SayHelloViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    private final boolean m100988a(Message message, SayHelloContent sayHelloContent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (message == null || sayHelloContent == null || !m100989f()) {
            return false;
        }
        Collection emoji = sayHelloContent.getEmoji();
        if (emoji == null || emoji.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || sayHelloContent.getEmoji().size() < 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        Collection jokerEmojis = sayHelloContent.getJokerEmojis();
        if (jokerEmojis == null || jokerEmojis.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = !z3;
        if (!z2 && !z5) {
            return false;
        }
        Object a = C6993a.m21773a(IIMService.class);
        C7573i.m23582a(a, "IMServiceManager.getServ…e(IIMService::class.java)");
        C7093b abInterface = ((IIMService) a).getAbInterface();
        if (abInterface == null || abInterface.mo18361i() != 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 && !z5 && z2) {
            z4 = false;
        }
        if (!z4 && !z2 && z5) {
            z4 = true;
        }
        if (z4) {
            if (!(this.f81254n instanceof C31040k)) {
                C31029h hVar = this.f81254n;
                if (hVar != null) {
                    hVar.mo81492a(false);
                }
                this.f81254n = new C31040k(this);
            }
        } else if (!(this.f81254n instanceof C31042l)) {
            C31029h hVar2 = this.f81254n;
            if (hVar2 != null) {
                hVar2.mo81492a(false);
            }
            this.f81254n = new C31042l(this);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81421a(Message message, Message message2, SayHelloContent sayHelloContent, int i) {
        super.mo81421a(message, message2, sayHelloContent, i);
        if (!m100988a(message, sayHelloContent)) {
            View view = this.f81253m;
            if (view == null) {
                C7573i.m23583a("rootLayout");
            }
            view.setVisibility(8);
            return;
        }
        C31029h hVar = this.f81254n;
        if (hVar == null) {
            C7573i.m23580a();
        }
        if (message == null) {
            C7573i.m23580a();
        }
        if (sayHelloContent == null) {
            C7573i.m23580a();
        }
        hVar.mo81491a(message, message2, sayHelloContent, i);
    }
}
