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
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem */
public final class I18nShopPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem$a */
    static final class C41141a implements OnClickListener {

        /* renamed from: a */
        public static final C41141a f107069a = new C41141a();

        C41141a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem$b */
    static final class C41142b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nShopPublishSettingItem f107070a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107071b;

        C41142b(I18nShopPublishSettingItem i18nShopPublishSettingItem, C7561a aVar) {
            this.f107070a = i18nShopPublishSettingItem;
            this.f107071b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f107070a.f107118j) {
                this.f107071b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo101618a() {
        setDrawableLeft((int) R.drawable.a21);
        setTitle((int) R.string.f9);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        setRightIconListener(C41141a.f107069a);
    }

    public I18nShopPublishSettingItem(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        mo101618a();
    }

    /* renamed from: a */
    public final void mo101619a(UrlModel urlModel, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C41142b(this, aVar));
        setTitle(str);
    }

    public /* synthetic */ I18nShopPublishSettingItem(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
