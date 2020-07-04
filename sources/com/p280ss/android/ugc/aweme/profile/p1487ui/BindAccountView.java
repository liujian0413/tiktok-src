package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.service.C36065a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.BindAccountView */
public class BindAccountView extends LinearLayout {

    /* renamed from: a */
    protected Context f94542a;

    /* renamed from: b */
    protected LinearLayout f94543b;

    /* renamed from: c */
    protected TextView f94544c;

    /* renamed from: d */
    protected AutoRTLImageView f94545d;

    /* renamed from: e */
    protected AutoRTLImageView f94546e;

    /* renamed from: f */
    protected AutoRTLImageView f94547f;

    /* renamed from: g */
    protected C36132a f94548g;

    /* renamed from: h */
    private ArrayList<Integer> f94549h;

    /* renamed from: i */
    private boolean f94550i;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.BindAccountView$a */
    public interface C36132a {
        /* renamed from: a */
        void mo91966a();

        /* renamed from: a */
        void mo91967a(int i);
    }

    public void setEventListener(C36132a aVar) {
        this.f94548g = aVar;
    }

    public void setIsMyProfile(boolean z) {
        this.f94550i = z;
    }

    public BindAccountView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private String m116528a(int i) {
        switch (i) {
            case 1:
                return this.f94542a.getString(R.string.buc);
            case 2:
                return this.f94542a.getString(R.string.ftd);
            case 3:
                return this.f94542a.getString(R.string.fh4);
            default:
                return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91959a(Context context) {
        this.f94542a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.b2l, this, true);
        this.f94543b = (LinearLayout) inflate.findViewById(R.id.bke);
        this.f94544c = (TextView) inflate.findViewById(R.id.ckr);
        this.f94545d = (AutoRTLImageView) inflate.findViewById(R.id.axl);
        this.f94546e = (AutoRTLImageView) inflate.findViewById(R.id.axt);
        this.f94547f = (AutoRTLImageView) inflate.findViewById(R.id.axx);
        this.f94543b.setOnTouchListener(new C36566p(this));
    }

    /* renamed from: b */
    private void m116530b(User user) {
        int size = this.f94549h.size();
        if (size == 1) {
            int intValue = ((Integer) this.f94549h.get(0)).intValue();
            m116529a(user, intValue);
            if (this.f94548g != null) {
                this.f94548g.mo91967a(intValue);
            }
        } else if (size > 1 && this.f94542a != null && user != null) {
            C1081a aVar = new C1081a(this.f94542a);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!TextUtils.isEmpty(user.getInsId())) {
                arrayList.add(Integer.valueOf(1));
                arrayList2.add(this.f94542a.getString(R.string.buc));
            }
            if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                arrayList.add(Integer.valueOf(2));
                arrayList2.add(this.f94542a.getString(R.string.ftd));
            }
            if (!C6399b.m19946v() && !TextUtils.isEmpty(user.getTwitterId())) {
                arrayList.add(Integer.valueOf(3));
                arrayList2.add(this.f94542a.getString(R.string.fh4));
            }
            aVar.mo4236a((CharSequence[]) arrayList2.toArray(new String[0]), (OnClickListener) new C36568r(this, arrayList, user));
            C42951au.m136342a(aVar.mo4242b());
        }
    }

    /* renamed from: a */
    public final void mo91960a(User user) {
        if (this.f94542a != null) {
            this.f94549h.clear();
            if (!TextUtils.isEmpty(user.getInsId())) {
                this.f94549h.add(Integer.valueOf(1));
                setVisibility(0);
                this.f94545d.setVisibility(0);
            } else {
                this.f94545d.setVisibility(8);
            }
            if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                this.f94549h.add(Integer.valueOf(2));
                setVisibility(0);
                this.f94546e.setVisibility(0);
            } else {
                this.f94546e.setVisibility(8);
            }
            if (TextUtils.isEmpty(user.getTwitterName()) || C6399b.m19946v()) {
                this.f94547f.setVisibility(8);
            } else {
                this.f94549h.add(Integer.valueOf(3));
                setVisibility(0);
                this.f94547f.setVisibility(0);
            }
            if (this.f94549h.size() == 0) {
                setVisibility(8);
                return;
            }
            if (this.f94549h.size() == 1) {
                String a = m116528a(((Integer) this.f94549h.get(0)).intValue());
                TextView textView = this.f94544c;
                if (TextUtils.isEmpty(a)) {
                    a = this.f94542a.getString(R.string.c_z);
                }
                textView.setText(a);
            } else {
                this.f94544c.setText(R.string.c_z);
            }
            setVisibility(0);
            this.f94543b.setOnClickListener(new C36567q(this, user));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91961a(User user, View view) {
        m116530b(user);
    }

    public BindAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m116529a(User user, int i) {
        if (user != null && this.f94542a != null) {
            C36065a.f94305a.mo91794a(this.f94542a, user, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo91963a(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                C41540at.m132302a(this.f94543b, 1.0f, 0.5f, 150);
                break;
            case 1:
                break;
        }
        C41540at.m132302a(this.f94543b, 0.5f, 1.0f, 150);
        if (this.f94548g != null) {
            this.f94548g.mo91966a();
        }
        return false;
    }

    public BindAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f94549h = new ArrayList<>();
        mo91959a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91962a(ArrayList arrayList, User user, DialogInterface dialogInterface, int i) {
        if (i < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i)).intValue();
            m116529a(user, intValue);
            if (this.f94548g != null) {
                this.f94548g.mo91967a(intValue);
            }
        }
    }
}
