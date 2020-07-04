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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.CouponPublishSettingItem */
public final class CouponPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.CouponPublishSettingItem$a */
    static final class C41139a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CouponPublishSettingItem f107061a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107062b;

        C41139a(CouponPublishSettingItem couponPublishSettingItem, C7561a aVar) {
            this.f107061a = couponPublishSettingItem;
            this.f107062b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f107061a.f107118j) {
                this.f107062b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo101611a() {
        setDrawableLeft((int) R.drawable.aox);
        setTagText("");
        setTitle((int) R.string.air);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public CouponPublishSettingItem(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        mo101611a();
    }

    /* renamed from: a */
    public final void mo101612a(UrlModel urlModel, String str, String str2, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C41139a(this, aVar));
        setTagText(str2);
        setTitle(str);
        setSubtitle("");
    }
}
