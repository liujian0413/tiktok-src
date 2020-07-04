package com.bytedance.android.live.broadcast.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.C2757g;
import com.bytedance.android.live.broadcast.p129b.C2442a;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class IllegalReviewDialog extends LiveDialogFragment implements OnClickListener {

    /* renamed from: a */
    private Context f8110a;

    /* renamed from: b */
    private View f8111b;

    /* renamed from: c */
    private RelativeLayout f8112c;

    /* renamed from: d */
    private TextView f8113d;

    /* renamed from: e */
    private TextView f8114e;

    /* renamed from: f */
    private ProgressBar f8115f;

    /* renamed from: g */
    private TextView f8116g;

    /* renamed from: h */
    private TextView f8117h;

    /* renamed from: i */
    private TextView f8118i;

    /* renamed from: k */
    private LinearLayout f8119k;

    /* renamed from: l */
    private LoadingStatusView f8120l;

    /* renamed from: m */
    private List<C2757g> f8121m;

    /* renamed from: n */
    private C2442a f8122n;

    /* renamed from: a */
    public final void mo9092a(boolean z, CharSequence charSequence) {
        if (z) {
            this.f8118i.setVisibility(0);
            this.f8118i.setText(charSequence);
            return;
        }
        this.f8118i.setVisibility(8);
    }

    /* renamed from: a */
    private void m10430a() {
        this.f8112c = (RelativeLayout) this.f8111b.findViewById(R.id.a24);
        this.f8113d = (TextView) this.f8111b.findViewById(R.id.av2);
        this.f8114e = (TextView) this.f8111b.findViewById(R.id.auz);
        this.f8115f = (ProgressBar) this.f8111b.findViewById(R.id.auy);
        this.f8116g = (TextView) this.f8111b.findViewById(R.id.efm);
        this.f8117h = (TextView) this.f8111b.findViewById(R.id.efn);
        this.f8118i = (TextView) this.f8111b.findViewById(R.id.u2);
        this.f8119k = (LinearLayout) this.f8111b.findViewById(R.id.nw);
        this.f8120l = (LoadingStatusView) this.f8111b.findViewById(R.id.btb);
        this.f8120l.setBuilder(C3555a.m13075a(getContext()).mo10834a(getResources().getDimensionPixelSize(R.dimen.oa)));
        this.f8120l.setVisibility(0);
        this.f8120l.mo10830c();
        this.f8120l.setVisibility(0);
        this.f8120l.mo10830c();
    }

    /* renamed from: a */
    public final void mo9088a(CharSequence charSequence) {
        this.f8113d.setText(charSequence);
    }

    /* renamed from: b */
    public final void mo9093b(CharSequence charSequence) {
        this.f8114e.setText(charSequence);
    }

    /* renamed from: b */
    public final void mo9094b(boolean z) {
        this.f8112c.setVisibility(0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8122n != null) {
            this.f8122n.mo8972e();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public final void mo9090a(boolean z) {
        this.f8120l.setVisibility(8);
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onClick(View view) {
        int i;
        if (view instanceof HSImageView) {
            if (view.getTag() != null) {
                i = ((Integer) view.getTag()).intValue();
            } else {
                i = -1;
            }
            if (this.f8121m != null && !this.f8121m.isEmpty() && i >= 0 && i < this.f8121m.size()) {
                m10431a((C2757g) this.f8121m.get(i));
            }
        }
    }

    /* renamed from: a */
    private void m10431a(C2757g gVar) {
        if (gVar != null && !TextUtils.isEmpty(gVar.f8736a)) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b(gVar.f8736a));
            if (gVar.f8736a.contains("health_score")) {
                C8443c.m25663a().mo21607a("livesdk_know_health_score_page_show", new C8438j().mo21602e("shield"));
            }
        }
    }

    /* renamed from: a */
    public final void mo9089a(List<C2757g> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            this.f8119k.setVisibility(0);
            this.f8121m = list;
            if (this.f8119k.getChildCount() == this.f8121m.size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f8119k.removeAllViews();
            }
            for (int i = 0; i < list.size(); i++) {
                C2757g gVar = (C2757g) list.get(i);
                if (gVar != null && !TextUtils.isEmpty(gVar.f8738c)) {
                    m10432a(z, i, gVar.f8738c);
                }
            }
        }
    }

    /* renamed from: a */
    public static IllegalReviewDialog m10429a(Context context, C2442a aVar) {
        IllegalReviewDialog illegalReviewDialog = new IllegalReviewDialog();
        illegalReviewDialog.f8110a = context;
        illegalReviewDialog.f8122n = aVar;
        return illegalReviewDialog;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f8122n != null) {
            this.f8122n.mo8971d();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8111b = layoutInflater.inflate(R.layout.anu, viewGroup, false);
        m10430a();
        return this.f8111b;
    }

    /* renamed from: a */
    private static Spannable m10428a(String str, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) C3358ac.m12519b(25.0f));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C3358ac.m12521b((int) R.color.wd));
        spannableString.setSpan(absoluteSizeSpan, 4, i2, 18);
        spannableString.setSpan(foregroundColorSpan, 4, i2, 18);
        return spannableString;
    }

    /* renamed from: a */
    private void m10432a(boolean z, int i, String str) {
        boolean z2;
        int i2;
        int i3;
        if (!z) {
            HSImageView hSImageView = new HSImageView(this.f8110a);
            hSImageView.setScaleType(ScaleType.CENTER_INSIDE);
            hSImageView.setHierarchy(new C13439b(C3358ac.m12513a()).mo32915a(RoundingParams.m39399b((float) C3358ac.m12510a(4.0f))).mo32908a());
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            boolean z3 = true;
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i != this.f8121m.size() - 1) {
                z3 = false;
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = C3358ac.m12510a(4.25f);
            }
            if (z3) {
                i3 = 0;
            } else {
                i3 = C3358ac.m12510a(4.25f);
            }
            layoutParams.setMargins(i2, 0, i3, 0);
            hSImageView.setLayoutParams(layoutParams);
            hSImageView.setOnClickListener(this);
            hSImageView.setTag(Integer.valueOf(i));
            C5343e.m17040a(hSImageView, str);
            this.f8119k.addView(hSImageView);
            return;
        }
        HSImageView hSImageView2 = (HSImageView) this.f8119k.getChildAt(i);
        if (hSImageView2 != null) {
            C5343e.m17040a(hSImageView2, str);
        }
    }

    /* renamed from: a */
    public final void mo9091a(boolean z, int i, int i2) {
        if (z) {
            this.f8116g.setVisibility(0);
            this.f8116g.setText(m10428a(C3358ac.m12517a((int) R.string.f35, Integer.valueOf(i)), 4, String.valueOf(i).length() + 4));
            this.f8117h.setVisibility(0);
            this.f8117h.setText(m10428a(C3358ac.m12517a((int) R.string.f36, Integer.valueOf(i2)), 4, String.valueOf(i2).length() + 4));
            return;
        }
        this.f8116g.setVisibility(4);
        this.f8117h.setVisibility(4);
    }
}
