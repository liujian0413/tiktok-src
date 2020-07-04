package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class PreviewBroadcastHelpWidget extends LiveWidget {

    /* renamed from: a */
    public static final C2996a f9368a = new C2996a(null);

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBroadcastHelpWidget$a */
    public static final class C2996a {
        private C2996a() {
        }

        public /* synthetic */ C2996a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewBroadcastHelpWidget$b */
    static final class C2997b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBroadcastHelpWidget f9369a;

        C2997b(PreviewBroadcastHelpWidget previewBroadcastHelpWidget) {
            this.f9369a = previewBroadcastHelpWidget;
        }

        public final void onClick(View view) {
            this.f9369a.mo9812a();
        }
    }

    public final int getLayoutId() {
        return R.layout.alt;
    }

    public final void onCreate() {
        super.onCreate();
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ((ImageView) view.findViewById(R.id.bp2)).setOnClickListener(new C2997b(this));
    }

    /* renamed from: a */
    public final void mo9812a() {
        C2324b a = C3596c.m13172a(C3141a.class);
        if (a == null) {
            C7573i.m23580a();
        }
        ((C3141a) a).webViewManager().mo11535a(getContext(), C3979c.m13952b("https://webcast.amemv.com/falcon/webcast_douyin/page/obs_intro/index.html").mo11550a(C3358ac.m12515a((int) R.string.eyl)));
        C8443c.m25663a().mo21607a("game_take_guide", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
    }
}
