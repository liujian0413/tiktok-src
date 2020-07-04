package com.bytedance.android.live.broadcast.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterListItemDecoration;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p136b.C2590b;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.common.utility.C9738o;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LiveFilterDialogFragment extends LiveDialogFragment {

    /* renamed from: a */
    public OnDismissListener f8275a;

    /* renamed from: b */
    private boolean f8276b;

    /* renamed from: c */
    private boolean f8277c;

    /* renamed from: d */
    private C2585a f8278d;

    /* renamed from: e */
    private List<FilterModel> f8279e;

    /* renamed from: a */
    private void m10596a() {
        int i;
        LiveFilterListItemDecoration liveFilterListItemDecoration;
        List<FilterModel> list = this.f8279e;
        if (list == null && getArguments() != null) {
            list = (List) C2317a.m9932a().mo15975a(getArguments().getString("filterModelJson"), new C6597a<List<FilterModel>>() {
            }.type);
        }
        C0633q a = getChildFragmentManager().mo2645a();
        C2585a aVar = this.f8278d;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f8276b) {
            i = R.layout.asd;
        } else {
            i = R.layout.asc;
        }
        if (this.f8276b) {
            liveFilterListItemDecoration = new LiveFilterListItemDecoration();
        } else {
            liveFilterListItemDecoration = null;
        }
        a.mo2585a((int) R.id.aor, (Fragment) LiveFilterFragment.m10597a(aVar, list, new C2590b(i, liveFilterListItemDecoration))).mo2606d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yh);
        setCancelable(true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8275a != null) {
            this.f8275a.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (this.f8277c) {
                    window.setLayout((int) C9738o.m28708b(getContext(), 391.0f), (int) C9738o.m28708b(getContext(), 148.0f));
                } else if (this.f8276b) {
                    window.setLayout(-1, -2);
                } else {
                    window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.t_));
                }
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        boolean z = false;
        this.f8277c = false;
        if (getArguments() != null) {
            this.f8277c = getArguments().getBoolean("bundle_landscape", false);
        }
        if (window != null) {
            if (this.f8277c) {
                window.setGravity(85);
                window.setLayout((int) C9738o.m28708b(getContext(), 391.0f), (int) C9738o.m28708b(getContext(), 148.0f));
            } else if (this.f8276b) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                window.setGravity(80);
                window.setLayout(-1, (int) getContext().getResources().getDimension(R.dimen.t_));
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

    /* renamed from: a */
    public static LiveFilterDialogFragment m10594a(C2585a aVar, boolean z) {
        LiveFilterDialogFragment liveFilterDialogFragment = new LiveFilterDialogFragment();
        liveFilterDialogFragment.f8278d = aVar;
        Bundle bundle = new Bundle();
        liveFilterDialogFragment.f8279e = C2624k.m10736a().f8419b;
        bundle.putBoolean("bundle_full_screen", z);
        liveFilterDialogFragment.setArguments(bundle);
        return liveFilterDialogFragment;
    }

    /* renamed from: a */
    public static LiveFilterDialogFragment m10595a(C2585a aVar, boolean z, boolean z2) {
        LiveFilterDialogFragment a = m10594a(aVar, true);
        a.f8276b = true;
        return a;
    }

    /* renamed from: a */
    private static LiveFilterDialogFragment m10591a(C2585a aVar, String str, boolean z) {
        LiveFilterDialogFragment liveFilterDialogFragment = new LiveFilterDialogFragment();
        liveFilterDialogFragment.f8278d = aVar;
        Bundle bundle = new Bundle();
        bundle.putString("filterModelJson", str);
        bundle.putBoolean("bundle_full_screen", z);
        liveFilterDialogFragment.setArguments(bundle);
        return liveFilterDialogFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f8276b) {
            i = R.layout.amt;
        } else {
            i = R.layout.ams;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        m10596a();
        return inflate;
    }

    /* renamed from: a */
    public static LiveFilterDialogFragment m10593a(C2585a aVar, List<FilterModel> list, boolean z) {
        LiveFilterDialogFragment liveFilterDialogFragment = new LiveFilterDialogFragment();
        liveFilterDialogFragment.f8278d = aVar;
        liveFilterDialogFragment.f8279e = list;
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", z);
        liveFilterDialogFragment.setArguments(bundle);
        liveFilterDialogFragment.f8276b = false;
        return liveFilterDialogFragment;
    }

    /* renamed from: a */
    public static LiveFilterDialogFragment m10592a(C2585a aVar, String str, boolean z, boolean z2) {
        LiveFilterDialogFragment a = m10591a(aVar, str, true);
        a.f8276b = true;
        return a;
    }
}
