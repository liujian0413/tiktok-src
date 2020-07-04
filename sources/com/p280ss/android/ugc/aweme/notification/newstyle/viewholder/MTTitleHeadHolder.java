package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34360i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTitleHeadHolder */
public final class MTTitleHeadHolder extends MTNewBaseNotificationHolder {

    /* renamed from: d */
    private final TextView f90259d;

    public MTTitleHeadHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.e3a);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_time_head)");
        this.f90259d = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo87878a(C34360i iVar) {
        C7573i.m23587b(iVar, "notice");
        switch (iVar.timeLineType) {
            case 0:
                this.f90259d.setText(R.string.cq0);
                return;
            case 1:
                this.f90259d.setText(R.string.cq3);
                return;
            case 2:
                this.f90259d.setText(R.string.cq4);
                return;
            case 3:
                this.f90259d.setText(R.string.cq2);
                return;
            case 4:
                this.f90259d.setText(R.string.cq1);
                return;
            case 5:
                this.f90259d.setText(R.string.cpz);
                break;
        }
    }
}
