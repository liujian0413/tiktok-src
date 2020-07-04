package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.d */
public final class C39773d extends C39762b {
    /* renamed from: q */
    public final boolean mo99214q() {
        return false;
    }

    /* renamed from: b */
    public final void mo99196b(C0902i<Float, Float> iVar) {
        C7573i.m23587b(iVar, "pair");
        mo99209l().mo97624a(iVar, false);
    }

    /* renamed from: a */
    public final void mo99189a(C0902i<Float, Float> iVar) {
        C7573i.m23587b(iVar, "pair");
        mo99209l().mo97628a(true, iVar);
    }

    /* renamed from: a */
    public final void mo99186a(FragmentActivity fragmentActivity, View view) {
        if (fragmentActivity != null && view != null) {
            super.mo99186a(fragmentActivity, view);
        }
    }

    /* renamed from: a */
    public final void mo99187a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z) {
        MediaModel mediaModel;
        if (!C6292i.m19525a(list)) {
            mo99209l().setExtractFramesInRoughMode(true);
            AbstractVideoEditView l = mo99209l();
            if (list != null) {
                mediaModel = (MediaModel) list.get(0);
            } else {
                mediaModel = null;
            }
            if (mediaModel == null) {
                C7573i.m23580a();
            }
            l.mo97632a(fragmentActivity, cutMultiVideoViewModel, mediaModel.f88156b);
            if (!mo99214q()) {
                mo99212o().findViewById(R.id.aci).setBackgroundColor(0);
                View findViewById = mo99212o().findViewById(R.id.ac0);
                C7573i.m23582a((Object) findViewById, "rootView.findViewById<View>(R.id.edit_bottom_view)");
                findViewById.setVisibility(8);
                mo99213p().setVisibility(0);
                LayoutParams layoutParams = mo99209l().getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = (int) C20505c.m68010a(fragmentActivity, 70.0f);
                    mo99209l().setLayoutParams(layoutParams2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
            mo99213p().setVisibility(8);
        }
    }
}
