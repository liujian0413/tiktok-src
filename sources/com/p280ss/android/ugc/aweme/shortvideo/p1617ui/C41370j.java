package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j */
public final class C41370j extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.j$a */
    static final class C41371a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41370j f107661a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107662b;

        C41371a(C41370j jVar, C7561a aVar) {
            this.f107661a = jVar;
            this.f107662b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f107661a.f107118j) {
                this.f107662b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo102004a() {
        setDrawableLeft((int) R.drawable.aor);
        setTitle((int) R.string.ais);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public C41370j(Context context) {
        super(context);
        mo102004a();
    }

    /* renamed from: a */
    public final void mo102005a(UrlModel urlModel, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C41371a(this, aVar));
        setTitle(str);
    }
}
