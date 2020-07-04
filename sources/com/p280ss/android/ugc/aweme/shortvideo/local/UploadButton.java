package com.p280ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.mediachoose.C33176h;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.local.UploadButton */
public class UploadButton extends FrameLayout implements C33176h {

    /* renamed from: a */
    AnimatedImageView f103927a;

    /* renamed from: b */
    private View f103928b;

    /* renamed from: c */
    private View f103929c;

    /* renamed from: d */
    private View f103930d;

    /* renamed from: e */
    private TextView f103931e;

    /* renamed from: f */
    private ViewGroup f103932f;

    /* renamed from: g */
    private Context f103933g;

    /* renamed from: a */
    public final void mo99460a() {
        this.f103931e.setVisibility(8);
    }

    /* renamed from: b */
    public final boolean mo99462b() {
        if (C35563c.f93224F.mo70088c().mo90360c(this.f103933g) != 0) {
            return false;
        }
        C33153d.m106975a(C35563c.f93238a.getApplicationContext());
        C33153d.m106972a().mo84900a(1, 1, 0, (C33176h) this);
        return true;
    }

    public UploadButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m127939a(Context context) {
        this.f103933g = context;
        this.f103928b = LayoutInflater.from(context).inflate(R.layout.b4p, this, true);
        this.f103927a = (AnimatedImageView) this.f103928b.findViewById(R.id.bdb);
        this.f103931e = (TextView) this.f103928b.findViewById(R.id.e4a);
        this.f103929c = this.f103928b.findViewById(R.id.ecg);
        this.f103930d = this.f103928b.findViewById(R.id.ech);
        this.f103932f = (ViewGroup) this.f103928b.findViewById(R.id.amf);
    }

    /* renamed from: a */
    public final void mo99461a(int i) {
        LayoutParams layoutParams = this.f103932f.getLayoutParams();
        layoutParams.width = C23486n.m77122a(32.0d);
        layoutParams.height = C23486n.m77122a(32.0d);
        this.f103932f.setLayoutParams(layoutParams);
        int a = C23486n.m77122a(3.5d);
        ((MarginLayoutParams) this.f103929c.getLayoutParams()).setMargins(a, a, a, a);
        this.f103929c.requestLayout();
        ((MarginLayoutParams) this.f103930d.getLayoutParams()).setMargins(a, a, a, a);
        this.f103930d.requestLayout();
        ((MarginLayoutParams) this.f103927a.getLayoutParams()).setMargins(a, a, a, a);
        this.f103927a.requestLayout();
    }

    public UploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UploadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m127939a(context);
    }

    /* renamed from: a */
    public final void mo84918a(boolean z, int i, List<MediaModel> list) {
        if (z && i == 1) {
            StringBuilder sb = new StringBuilder("res://");
            sb.append(C35563c.f93238a.getPackageName());
            sb.append("/2131233335");
            String sb2 = sb.toString();
            if (list != null && list.size() > 0) {
                MediaModel mediaModel = (MediaModel) list.get(0);
                if (mediaModel != null) {
                    StringBuilder sb3 = new StringBuilder("file://");
                    sb3.append(mediaModel.f88156b);
                    sb2 = sb3.toString();
                }
            }
            int measuredWidth = this.f103927a.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = C23486n.m77122a(32.0d);
            }
            C23323e.m76525b(this.f103927a, sb2, measuredWidth, measuredWidth);
        }
    }
}
