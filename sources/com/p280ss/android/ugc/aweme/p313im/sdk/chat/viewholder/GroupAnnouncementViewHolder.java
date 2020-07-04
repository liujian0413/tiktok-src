package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupAnnouncementContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupAnnouncementViewHolder */
public class GroupAnnouncementViewHolder extends BaseViewHolder<GroupAnnouncementContent> {

    /* renamed from: m */
    private DmtTextView f81241m;

    /* renamed from: n */
    private DmtTextView f81242n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        Object a = mo81425a((int) R.id.e3f);
        C7573i.m23582a(a, "bindView(R.id.tv_title)");
        this.f81241m = (DmtTextView) a;
        Object a2 = mo81425a((int) R.id.dsf);
        C7573i.m23582a(a2, "bindView(R.id.tv_content)");
        this.f81242n = (DmtTextView) a2;
        this.f81197e = (View) mo81425a((int) R.id.a1q);
    }

    public GroupAnnouncementViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81428a(Message message, int i) {
        int i2;
        int i3;
        int i4;
        if (message != null && C6399b.m19945u()) {
            boolean isSelf = message.isSelf();
            if (i == 1) {
                View view = this.f81197e;
                if (isSelf) {
                    i4 = R.drawable.b3a;
                } else {
                    i4 = R.drawable.b38;
                }
                view.setBackgroundResource(i4);
            } else {
                View view2 = this.f81197e;
                if (isSelf) {
                    i3 = R.drawable.b3_;
                } else {
                    i3 = R.drawable.b37;
                }
                view2.setBackgroundResource(i3);
            }
            Resources resources = C6399b.m19921a().getResources();
            if (i != 1 || message.isSelf()) {
                i2 = R.color.ua;
            } else {
                i2 = R.color.ub;
            }
            int color = resources.getColor(i2);
            DmtTextView dmtTextView = this.f81241m;
            if (dmtTextView == null) {
                C7573i.m23583a("tvTitle");
            }
            dmtTextView.setTextColor(color);
            DmtTextView dmtTextView2 = this.f81242n;
            if (dmtTextView2 == null) {
                C7573i.m23583a("tvContent");
            }
            dmtTextView2.setTextColor(color);
            View view3 = this.f81197e;
            C7573i.m23582a((Object) view3, "contentV");
            view3.setEnabled(true);
        }
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, GroupAnnouncementContent groupAnnouncementContent, int i) {
        super.mo81421a(message, message2, groupAnnouncementContent, i);
        if (groupAnnouncementContent != null) {
            DmtTextView dmtTextView = this.f81241m;
            if (dmtTextView == null) {
                C7573i.m23583a("tvTitle");
            }
            dmtTextView.setText(groupAnnouncementContent.getTitle());
            DmtTextView dmtTextView2 = this.f81242n;
            if (dmtTextView2 == null) {
                C7573i.m23583a("tvContent");
            }
            dmtTextView2.setText(groupAnnouncementContent.getAnnouncement());
        }
    }
}
