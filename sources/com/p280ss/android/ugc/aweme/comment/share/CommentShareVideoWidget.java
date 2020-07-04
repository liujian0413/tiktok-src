package com.p280ss.android.ugc.aweme.comment.share;

import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.comment.share.C24245e.C24247b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.share.CommentShareVideoWidget */
public final class CommentShareVideoWidget extends Widget implements C24247b {

    /* renamed from: a */
    public Aweme f63934a;

    /* renamed from: i */
    private View f63935i;

    /* renamed from: j */
    private C24245e f63936j;

    /* renamed from: k */
    private Aweme f63937k;

    /* renamed from: a */
    public final void mo63012a() {
        C24245e eVar = this.f63936j;
        if (eVar == null) {
            C7573i.m23583a("mCommentShareVideoViewHolder");
        }
        if (eVar != null) {
            eVar.mo63035c();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C24245e eVar = this.f63936j;
        if (eVar == null) {
            C7573i.m23583a("mCommentShareVideoViewHolder");
        }
        if (eVar != null) {
            eVar.mo63036d();
        }
    }

    public final void onPause() {
        super.onPause();
        C24245e eVar = this.f63936j;
        if (eVar == null) {
            C7573i.m23583a("mCommentShareVideoViewHolder");
        }
        if (eVar != null) {
            eVar.mo63035c();
        }
    }

    public final void onResume() {
        super.onResume();
        View view = this.f63935i;
        if (view == null) {
            C7573i.m23583a("mVideoContainer");
        }
        if (view.getVisibility() == 0) {
            C24245e eVar = this.f63936j;
            if (eVar == null) {
                C7573i.m23583a("mCommentShareVideoViewHolder");
            }
            if (eVar != null) {
                eVar.mo63034b();
            }
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        super.mo60146a(view);
        m79572b(view);
    }

    public CommentShareVideoWidget(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f63934a = aweme;
    }

    /* renamed from: b */
    private final void m79572b(View view) {
        this.f63937k = this.f63934a;
        if (view == null) {
            C7573i.m23580a();
        }
        View findViewById = view.findViewById(R.id.eac);
        C7573i.m23582a((Object) findViewById, "view!!.findViewById(R.id.video_container)");
        this.f63935i = findViewById;
        View view2 = this.f63935i;
        if (view2 == null) {
            C7573i.m23583a("mVideoContainer");
        }
        this.f63936j = new C24245e(view2, this);
        C24245e eVar = this.f63936j;
        if (eVar == null) {
            C7573i.m23583a("mCommentShareVideoViewHolder");
        }
        Aweme aweme = this.f63937k;
        if (aweme == null) {
            C7573i.m23583a("mAweme");
        }
        eVar.mo63033a(aweme);
        C24245e eVar2 = this.f63936j;
        if (eVar2 == null) {
            C7573i.m23583a("mCommentShareVideoViewHolder");
        }
        eVar2.mo63032a();
    }
}
