package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.utils.C43020co;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.f */
final class C30525f extends C1293v implements OnClickListener {

    /* renamed from: a */
    public C30519a f80215a;

    /* renamed from: b */
    private CircleImageView f80216b;

    /* renamed from: c */
    private TextView f80217c;

    /* renamed from: d */
    private TextView f80218d;

    /* renamed from: e */
    private TextView f80219e;

    /* renamed from: f */
    private ImageView f80220f;

    /* renamed from: g */
    private int f80221g;

    /* renamed from: h */
    private ImageView f80222h;

    /* renamed from: i */
    private ImageView f80223i;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80237a() {
        this.f80220f.setVisibility(0);
        this.f80219e.setVisibility(8);
    }

    /* renamed from: b */
    private void m99683b() {
        this.f80216b = (CircleImageView) this.itemView.findViewById(R.id.b64);
        if (C6399b.m19946v()) {
            this.f80216b.mo60914a(true, false);
        }
        this.f80217c = (TextView) this.itemView.findViewById(R.id.dyg);
        this.f80218d = (TextView) this.itemView.findViewById(R.id.dvi);
        this.f80219e = (TextView) this.itemView.findViewById(R.id.duo);
        this.f80220f = (ImageView) this.itemView.findViewById(R.id.b61);
        this.f80222h = (ImageView) this.itemView.findViewById(R.id.a5e);
        this.f80223i = (ImageView) this.itemView.findViewById(R.id.afg);
        C43020co.m136534a(this.itemView);
        this.f80221g = this.itemView.getResources().getDimensionPixelSize(R.dimen.k1);
        this.itemView.setOnClickListener(this);
        this.f80219e.setOnClickListener(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80240a(String str) {
        this.f80217c.setText(str);
    }

    C30525f(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aen, viewGroup, false));
        m99683b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo80242b(String str) {
        if (C6399b.m19946v()) {
            TextView textView = this.f80218d;
            StringBuilder sb = new StringBuilder("@");
            sb.append(str);
            textView.setText(sb.toString());
            return;
        }
        this.f80218d.setText(str);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f80215a != null && getLayoutPosition() >= 0 && !C27326a.m89579a(view, 300)) {
            if (view == this.f80219e) {
                this.f80215a.mo80228b(getLayoutPosition());
                return;
            }
            if (view == this.itemView) {
                this.f80215a.mo80227a(getLayoutPosition());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80239a(UrlModel urlModel) {
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUri())) {
            this.f80216b.setImageURI("");
            this.f80216b.setTag("");
            return;
        }
        Object tag = this.f80216b.getTag();
        if (tag == null || !tag.equals(urlModel.getUri())) {
            C23323e.m76508a(this.f80216b, urlModel, this.f80221g, this.f80221g, null, this.f80216b.getControllerListener());
            this.f80216b.setTag(urlModel.getUri());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80238a(int i) {
        this.f80220f.setVisibility(4);
        switch (i) {
            case 0:
                this.f80219e.setText(R.string.cck);
                this.f80219e.setTextColor(this.f80219e.getResources().getColor(R.color.a6c));
                this.f80219e.setBackgroundResource(R.drawable.bay);
                this.f80219e.setVisibility(0);
                return;
            case 1:
                this.f80219e.setText(R.string.ccq);
                this.f80219e.setTextColor(this.f80219e.getResources().getColor(R.color.a5h));
                this.f80219e.setBackgroundResource(R.drawable.baz);
                this.f80219e.setVisibility(0);
                return;
            case 2:
                this.f80219e.setText(R.string.ccl);
                this.f80219e.setTextColor(this.f80219e.getResources().getColor(R.color.a5h));
                this.f80219e.setBackgroundResource(R.drawable.baz);
                this.f80219e.setVisibility(0);
                return;
            case 3:
                mo80237a();
                break;
            case 4:
                this.f80219e.setText(R.string.b8v);
                this.f80219e.setTextColor(this.f80219e.getResources().getColor(R.color.a5h));
                this.f80219e.setBackgroundResource(R.drawable.baz);
                this.f80219e.setVisibility(0);
                return;
        }
    }

    /* renamed from: a */
    public final void mo80241a(boolean z, boolean z2) {
        if (z) {
            this.f80222h.setVisibility(8);
            this.f80223i.setVisibility(0);
        } else if (z2) {
            this.f80222h.setVisibility(0);
            this.f80223i.setVisibility(8);
        } else {
            this.f80222h.setVisibility(8);
            this.f80223i.setVisibility(8);
        }
    }
}
