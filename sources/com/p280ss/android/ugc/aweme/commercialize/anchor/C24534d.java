package com.p280ss.android.ugc.aweme.commercialize.anchor;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishSettingItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.d */
public final class C24534d extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.d$a */
    static final class C24535a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24534d f64758a;

        /* renamed from: b */
        final /* synthetic */ C7561a f64759b;

        C24535a(C24534d dVar, C7561a aVar) {
            this.f64758a = dVar;
            this.f64759b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f64758a.f107118j) {
                this.f64759b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo64331a() {
        setDrawableLeft((int) R.drawable.aon);
        setTitle((int) R.string.ain);
        setTagText("");
        setSingleLine(false);
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
        List arrayList = new ArrayList();
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null && b.size() > 0 && !((C24536e) b.get(0)).f64767h) {
            arrayList.addAll(b);
        }
        if (arrayList.size() == 2) {
            if (((C24536e) arrayList.get(0)).f64760a == AnchorBusinessType.POI.getTYPE() && ((C24536e) arrayList.get(1)).f64760a == AnchorBusinessType.WIKIPEDIA.getTYPE()) {
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                setSubtitle(context.getResources().getString(R.string.aky));
                return;
            }
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            setSubtitle(context2.getResources().getString(R.string.ako, new Object[]{((C24536e) arrayList.get(0)).f64762c, ((C24536e) arrayList.get(1)).f64762c}));
        } else if (arrayList.size() >= 3) {
            Context context3 = getContext();
            C7573i.m23582a((Object) context3, "context");
            setSubtitle(context3.getResources().getString(R.string.akp, new Object[]{((C24536e) arrayList.get(0)).f64762c, ((C24536e) arrayList.get(1)).f64762c}));
        } else {
            setSubtitle("");
        }
    }

    public C24534d(Context context) {
        super(context);
        mo64331a();
    }

    /* renamed from: a */
    public final void mo64332a(UrlModel urlModel, String str, String str2, int i, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setTitle(str);
        setSubtitle("");
        setTagText(str2);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C24535a(this, aVar));
        ImageView imageView = this.f107116h;
        C7573i.m23582a((Object) imageView, "mIconRight");
        int i2 = 0;
        if (i == 0) {
            setEnable(true);
        } else {
            setEnable(false);
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }
}
