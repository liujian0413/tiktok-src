package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31345b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.ChooseVideoViewHolder */
public class ChooseVideoViewHolder extends MediaChooseViewHolder {

    /* renamed from: b */
    public static final C31410a f82264b = new C31410a(null);

    /* renamed from: k */
    private DmtTextView f82265k;

    /* renamed from: l */
    private final boolean f82266l = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.ChooseVideoViewHolder$a */
    public static final class C31410a {
        private C31410a() {
        }

        public /* synthetic */ C31410a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ChooseVideoViewHolder m102190a(ViewGroup viewGroup, MediaChooseViewModel mediaChooseViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(mediaChooseViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xo, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new ChooseVideoViewHolder(inflate, mediaChooseViewModel);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo81987e() {
        return this.f82266l;
    }

    /* renamed from: b */
    public void mo80310b() {
        super.mo80310b();
        Object a = mo80306a((int) R.id.dtp);
        C7573i.m23582a(a, "findViewById(R.id.tv_duration)");
        this.f82265k = (DmtTextView) a;
    }

    /* renamed from: a */
    private static String m102185a(long j) {
        if (j > 9) {
            return String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder("0");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m102186a(MediaModel mediaModel) {
        if (mediaModel.getDuration() >= 0) {
            long duration = mediaModel.getDuration() / 1000;
            long j = duration / 3600;
            long j2 = duration - (3600 * j);
            long j3 = j2 / 60;
            long j4 = j2 - (60 * j3);
            if (j4 <= 0) {
                j4 = 1;
            }
            String str = "";
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(m102185a(j));
                sb.append(':');
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(m102185a(j3));
            sb2.append(':');
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(m102185a(j4));
            String sb5 = sb4.toString();
            DmtTextView dmtTextView = this.f82265k;
            if (dmtTextView == null) {
                C7573i.m23583a("tvDuration");
            }
            dmtTextView.setText(sb5);
        }
    }

    public ChooseVideoViewHolder(View view, MediaChooseViewModel mediaChooseViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaChooseViewModel, "viewModel");
        super(view, mediaChooseViewModel);
    }

    /* renamed from: a */
    public void mo81985a(MediaModel mediaModel, int i, int i2) {
        C7573i.m23587b(mediaModel, "data");
        if (mediaModel.isVideo()) {
            super.mo81985a(mediaModel, i, i2);
            C31345b.f82130a.mo81919a(mo81988f(), mediaModel, i, i2, mo81987e());
            m102186a(mediaModel);
        }
    }
}
