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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.MediumPublishSettingItem */
public final class MediumPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.MediumPublishSettingItem$a */
    static final class C41145a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediumPublishSettingItem f107082a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107083b;

        C41145a(MediumPublishSettingItem mediumPublishSettingItem, C7561a aVar) {
            this.f107082a = mediumPublishSettingItem;
            this.f107083b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f107082a.f107118j) {
                this.f107083b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo101634a() {
        setDrawableLeft((int) R.drawable.a2g);
        setTagText("");
        setTitle("添加影视综艺");
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public MediumPublishSettingItem(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        mo101634a();
    }

    /* renamed from: a */
    public final void mo101635a(UrlModel urlModel, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C41145a(this, aVar));
        setTitle(str);
        setSubtitle("");
        setTagText("影视综艺");
    }
}
