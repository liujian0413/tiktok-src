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

/* renamed from: com.ss.android.ugc.aweme.commercialize.f.b */
public final class C24674b extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.f.b$a */
    static final class C24675a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24674b f65045a;

        /* renamed from: b */
        final /* synthetic */ C7561a f65046b;

        C24675a(C24674b bVar, C7561a aVar) {
            this.f65045a = bVar;
            this.f65046b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f65045a.f107118j) {
                this.f65046b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo64543a() {
        setDrawableLeft((int) R.drawable.aov);
        setTitle((int) R.string.aiw);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public C24674b(Context context) {
        super(context);
        mo64543a();
    }

    /* renamed from: a */
    public final void mo64544a(UrlModel urlModel, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C24675a(this, aVar));
        setTitle(str);
    }
}
