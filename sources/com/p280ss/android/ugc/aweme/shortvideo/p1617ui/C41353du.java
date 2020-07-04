package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.du */
public final class C41353du extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.du$a */
    static final class C41354a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41353du f107634a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107635b;

        C41354a(C41353du duVar, C7561a aVar) {
            this.f107634a = duVar;
            this.f107635b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f107634a.f107118j) {
                this.f107635b.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo101993a() {
        boolean z;
        List b = AnchorListManager.f64708a.mo64313b();
        C24536e eVar = null;
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C24536e eVar2 = (C24536e) next;
                if (eVar2.f64760a == AnchorBusinessType.WIKIPEDIA.getTYPE() || eVar2.f64760a == AnchorBusinessType.YELP.getTYPE() || eVar2.f64760a == AnchorBusinessType.TRIP_ADVISOR.getTYPE()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    eVar = next;
                    break;
                }
            }
            eVar = eVar;
        }
        if (eVar == null) {
            setVisibility(8);
            return;
        }
        C23323e.m76524b(getLeftDrawableView(), eVar.f64764e);
        int i = eVar.f64760a;
        if (i == AnchorBusinessType.WIKIPEDIA.getTYPE()) {
            setTitle((int) R.string.aj0);
        } else if (i == AnchorBusinessType.YELP.getTYPE()) {
            setTitle((int) R.string.aj1);
        } else if (i == AnchorBusinessType.TRIP_ADVISOR.getTYPE()) {
            setTitle((int) R.string.aiz);
        }
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.b20);
        mo101627b();
    }

    public C41353du(Context context) {
        super(context);
        mo101993a();
    }

    /* renamed from: a */
    public final void mo101994a(UrlModel urlModel, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(urlModel, "addIcon");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "clearAction");
        C23323e.m76524b(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aop);
        setRightIconListener(new C41354a(this, aVar));
        setTitle(str);
    }
}
