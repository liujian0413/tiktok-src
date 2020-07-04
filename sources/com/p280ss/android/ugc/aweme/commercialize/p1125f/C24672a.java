package com.p280ss.android.ugc.aweme.commercialize.p1125f;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishSettingItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.f.a */
public final class C24672a extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.f.a$a */
    static final class C24673a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24672a f65043a;

        /* renamed from: b */
        final /* synthetic */ C7561a f65044b;

        C24673a(C24672a aVar, C7561a aVar2) {
            this.f65043a = aVar;
            this.f65044b = aVar2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f65043a.f107118j) {
                this.f65044b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo64540a() {
        setDrawableLeft((int) R.drawable.aot);
        setTitle((int) R.string.ait);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public C24672a(Context context) {
        super(context);
        mo64540a();
    }

    /* renamed from: a */
    public final void mo64541a(UrlModel urlModel, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C24673a(this, aVar));
        setTitle(str);
    }
}
