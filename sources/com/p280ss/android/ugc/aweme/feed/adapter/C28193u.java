package com.p280ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.u */
final class C28193u {

    /* renamed from: a */
    public Aweme f74296a;

    /* renamed from: b */
    private final DataCenter f74297b;

    /* renamed from: c */
    private final TagLayout f74298c;

    /* renamed from: a */
    static boolean m92669a(int i) {
        return i == 7;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo71787a() {
        m92671c();
    }

    /* renamed from: c */
    private void m92671c() {
        if (m92670b()) {
            new C28194v(this);
            if (this.f74298c != null && !RelationLabelHelper.hasDuoShanLabel(this.f74296a.getForwardItem()) && !RelationLabelHelper.hasNewRelationLabel(this.f74296a)) {
                this.f74296a.getForwardItem();
                this.f74296a.getRelationLabel().getLabelInfo();
                new C23440a(7, 20);
            }
        }
    }

    /* renamed from: b */
    private boolean m92670b() {
        if (this.f74296a == null) {
            return false;
        }
        if (this.f74296a.getRelationLabel() != null && this.f74296a.getRelationLabel().getType() == 1 && !TextUtils.isEmpty(this.f74296a.getRelationLabel().getLabelInfo())) {
            return true;
        }
        if (this.f74296a.getFeedRelationLabel() == null || this.f74296a.getFeedRelationLabel().getType().intValue() != 3 || C6307b.m19566a((Collection<T>) this.f74296a.getFeedRelationLabel().getUserList())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71788a(View view) {
        if (this.f74297b != null) {
            C24217a.m79549a().setShouldSetTopWhenOpen(true);
            this.f74297b.mo60134a("video_open_comment_dialog", (Object) Boolean.valueOf(true));
        }
    }

    C28193u(DataCenter dataCenter, TagLayout tagLayout) {
        this.f74297b = dataCenter;
        this.f74298c = tagLayout;
    }
}
