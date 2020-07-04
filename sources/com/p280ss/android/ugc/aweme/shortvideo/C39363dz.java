package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.view.View.OnClickListener;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p280ss.android.ugc.aweme.shortvideo.widget.RecordLayout.C41665a;
import com.p280ss.android.ugc.aweme.tools.C42143aj;
import com.p280ss.android.ugc.aweme.tools.C42144ak;
import com.p280ss.android.ugc.aweme.tools.C42150aq;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.utils.C43072du;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dz */
public final class C39363dz {
    public C39363dz(VideoRecordNewActivity videoRecordNewActivity, C39382ed edVar, RecordLayout recordLayout, OnClickListener onClickListener) {
        final C39382ed edVar2 = edVar;
        final VideoRecordNewActivity videoRecordNewActivity2 = videoRecordNewActivity;
        final RecordLayout recordLayout2 = recordLayout;
        final OnClickListener onClickListener2 = onClickListener;
        C393641 r0 = new C41665a() {
            /* renamed from: a */
            public final boolean mo97951a() {
                return false;
            }

            /* renamed from: d */
            public final void mo97954d() {
                onClickListener2.onClick(recordLayout2);
            }

            /* renamed from: b */
            public final void mo97952b() {
                if (C43072du.m136636a()) {
                    C43072du.m136635a(false);
                    C43072du.m136630a("record_start");
                }
                edVar2.mo97908d();
            }

            /* renamed from: c */
            public final void mo97953c() {
                C42151ar arVar = new C42151ar();
                edVar2.mo97963P().mo103594a((Object) recordLayout2, (C42155av) arVar);
                edVar2.mo97896J().mo103594a((Object) recordLayout2, (C42155av) arVar);
            }

            /* renamed from: e */
            public final void mo97955e() {
                recordLayout2.setCurrentScaleMode(0);
                edVar2.mo97896J().mo103594a((Object) recordLayout2, (C42155av) new C42143aj());
            }

            /* renamed from: a */
            public final void mo97949a(float f) {
                recordLayout2.setHasBeenMoveScaled(true);
                edVar2.mo97896J().mo103594a((Object) recordLayout2, (C42155av) C42144ak.m134105a(f, recordLayout2.getY()));
            }

            /* renamed from: a */
            public final void mo97950a(int i) {
                if (!((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) videoRecordNewActivity2).mo147a(ShortVideoContextViewModel.class)).mo96169c()) {
                    edVar2.mo97963P().mo103594a((Object) recordLayout2, (C42155av) new C42150aq(i));
                }
            }
        };
        recordLayout.setRecordListener(r0);
    }
}
