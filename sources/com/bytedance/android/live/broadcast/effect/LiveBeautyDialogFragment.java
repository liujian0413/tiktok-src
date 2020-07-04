package com.bytedance.android.live.broadcast.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFragment.C2576a;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveBeautyDialogFragment extends LiveDialogFragment implements C2585a {

    /* renamed from: a */
    public OnDismissListener f8243a;

    /* renamed from: b */
    private C2576a f8244b;

    /* renamed from: c */
    private C2585a f8245c;

    /* renamed from: d */
    private boolean f8246d;

    /* renamed from: e */
    private boolean f8247e;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yh);
        setCancelable(true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8243a != null) {
            this.f8243a.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public final void mo8810a(int i) {
        LiveBeautyFragment liveBeautyFragment = (LiveBeautyFragment) getChildFragmentManager().mo2644a("beautyFragmentTag");
        if (liveBeautyFragment != null) {
            liveBeautyFragment.mo9183a(i);
        }
        this.f8245c.mo8810a(i);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (this.f8247e) {
                    window.setLayout((int) C9738o.m28708b(getContext(), 391.0f), (int) C9738o.m28708b(getContext(), 152.0f));
                    window.setGravity(85);
                } else if (this.f8246d) {
                    window.setLayout(-1, -2);
                    window.setGravity(80);
                } else {
                    window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.t9));
                    window.setGravity(80);
                }
                window.setBackgroundDrawableResource(R.color.ac4);
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        boolean z = false;
        this.f8247e = false;
        if (getArguments() != null) {
            this.f8247e = getArguments().getBoolean("bundle_broadcast_landscape", false);
        }
        if (window != null) {
            if (this.f8247e) {
                window.setLayout((int) C9738o.m28708b(getContext(), 391.0f), (int) C9738o.m28708b(getContext(), 152.0f));
                window.setGravity(85);
            } else if (this.f8246d) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.t9));
                window.setGravity(80);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (getArguments() != null) {
                z = getArguments().getBoolean("bundle_full_screen", false);
            }
            if (z && !C3387g.m12599a(getActivity())) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        C0633q qVar;
        if (this.f8247e) {
            view = layoutInflater.inflate(R.layout.anc, viewGroup, false);
        } else if (this.f8246d) {
            view = layoutInflater.inflate(R.layout.anb, viewGroup, false);
        } else {
            view = layoutInflater.inflate(R.layout.ana, viewGroup, false);
        }
        C0608j childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2644a("beautyFragmentTag");
        if (a != null) {
            qVar = childFragmentManager.mo2645a().mo2605c(a);
        } else {
            qVar = childFragmentManager.mo2645a().mo2586a(R.id.aor, LiveBeautyFragment.m10571a(this.f8244b, this.f8246d), "beautyFragmentTag");
        }
        qVar.mo2606d();
        return view;
    }

    /* renamed from: a */
    public static LiveBeautyDialogFragment m10554a(C2576a aVar, C2585a aVar2, boolean z, int i) {
        LiveBeautyDialogFragment liveBeautyDialogFragment = new LiveBeautyDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", z);
        bundle.putInt("bundle_from", i);
        liveBeautyDialogFragment.setArguments(bundle);
        liveBeautyDialogFragment.f8244b = aVar;
        liveBeautyDialogFragment.f8245c = aVar2;
        return liveBeautyDialogFragment;
    }

    /* renamed from: a */
    public static LiveBeautyDialogFragment m10555a(C2576a aVar, C2585a aVar2, boolean z, int i, boolean z2) {
        LiveBeautyDialogFragment a = m10554a(aVar, aVar2, true, 0);
        a.f8246d = z2;
        return a;
    }
}
