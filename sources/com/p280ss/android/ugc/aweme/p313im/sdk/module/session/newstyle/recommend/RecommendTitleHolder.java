package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.RecommendTitleHolder */
public final class RecommendTitleHolder extends C1293v {

    /* renamed from: a */
    private final View f82490a;

    /* renamed from: b */
    private final ImageView f82491b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.RecommendTitleHolder$a */
    static final class C31501a implements OnClickListener {

        /* renamed from: a */
        public static final C31501a f82492a = new C31501a();

        C31501a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6956a a = C6956a.m21632a();
            C7573i.m23582a((Object) a, "AwemeImManager.instance()");
            C7103h f = a.mo18009f();
            C7573i.m23582a((Object) view, "it");
            f.openPrivacyReminder(view.getContext());
        }
    }

    public RecommendTitleHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        View findViewById = view.findViewById(R.id.bm2);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.line)");
        this.f82490a = findViewById;
        View findViewById2 = view.findViewById(R.id.cjg);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.privacyReminderImage)");
        this.f82491b = (ImageView) findViewById2;
    }

    /* renamed from: a */
    public final void mo82211a(int i) {
        int i2;
        View view = this.f82490a;
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        Object a = C6993a.m21773a(IIMService.class);
        C7573i.m23582a(a, "IMServiceManager.getServ…e(IIMService::class.java)");
        C7093b abInterface = ((IIMService) a).getAbInterface();
        if (abInterface == null || !abInterface.mo18357e()) {
            this.f82491b.setVisibility(8);
            return;
        }
        this.f82491b.setVisibility(0);
        this.f82491b.setOnClickListener(C31501a.f82492a);
    }
}
