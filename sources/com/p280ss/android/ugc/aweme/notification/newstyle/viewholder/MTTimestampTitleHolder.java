package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTimestampTitleHolder */
public final class MTTimestampTitleHolder extends MTNewBaseNotificationHolder {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f90256d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MTTimestampTitleHolder.class), "mText", "getMText()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: e */
    private final C7541d f90257e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTimestampTitleHolder$a */
    static final class C34578a extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f90258a;

        C34578a(View view) {
            this.f90258a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f90258a.findViewById(R.id.text);
        }
    }

    /* renamed from: d */
    private final DmtTextView m111791d() {
        return (DmtTextView) this.f90257e.getValue();
    }

    public MTTimestampTitleHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f90257e = C7546e.m23569a(new C34578a(view));
    }

    /* renamed from: a */
    public final void mo87877a(MusTimestampTitleItem musTimestampTitleItem) {
        C7573i.m23587b(musTimestampTitleItem, "item");
        switch (musTimestampTitleItem.getType()) {
            case 0:
                DmtTextView d = m111791d();
                C7573i.m23582a((Object) d, "mText");
                d.setText(this.f89761c.getString(R.string.cpx));
                return;
            case 1:
                DmtTextView d2 = m111791d();
                C7573i.m23582a((Object) d2, "mText");
                d2.setText(this.f89761c.getString(R.string.cpy));
                break;
        }
    }
}
