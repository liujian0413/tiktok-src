package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem */
public final class SeedingPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SeedingPublishSettingItem$a */
    static final class C41151a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SeedingPublishSettingItem f107128a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107129b;

        C41151a(SeedingPublishSettingItem seedingPublishSettingItem, C7561a aVar) {
            this.f107128a = seedingPublishSettingItem;
            this.f107129b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f107128a.f107118j) {
                this.f107129b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo101683a() {
        setDrawableLeft((int) R.drawable.aoy);
        setTagText("");
        setTitle((int) R.string.a9o);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public SeedingPublishSettingItem(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        mo101683a();
    }

    /* renamed from: a */
    public final void mo101684a(UrlModel urlModel, String str, String str2, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C41151a(this, aVar));
        setTagText(str2);
        setTitle(str);
        setSubtitle("");
    }
}
