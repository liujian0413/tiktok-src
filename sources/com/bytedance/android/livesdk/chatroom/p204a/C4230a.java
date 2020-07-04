package com.bytedance.android.livesdk.chatroom.p204a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.a */
public final class C4230a extends Dialog implements OnCheckedChangeListener, OnSeekBarChangeListener {

    /* renamed from: a */
    private final C4231a f12352a;

    /* renamed from: b */
    private View f12353b;

    /* renamed from: c */
    private View f12354c;

    /* renamed from: d */
    private TextView f12355d;

    /* renamed from: e */
    private View f12356e;

    /* renamed from: f */
    private TextView f12357f;

    /* renamed from: g */
    private View f12358g;

    /* renamed from: h */
    private TextView f12359h;

    /* renamed from: i */
    private ToggleButton f12360i;

    /* renamed from: j */
    private SeekBar f12361j;

    /* renamed from: k */
    private SeekBar f12362k;

    /* renamed from: l */
    private TextView f12363l;

    /* renamed from: m */
    private TextView f12364m;

    /* renamed from: n */
    private TextView f12365n;

    /* renamed from: o */
    private View f12366o;

    /* renamed from: p */
    private OnClickListener f12367p = new C4235b(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a$a */
    public interface C4231a {
        /* renamed from: a */
        void mo11794a(boolean z);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: b */
    private void m14368b() {
        this.f12354c.setAlpha(1.0f);
        this.f12355d.setAlpha(1.0f);
        this.f12356e.setAlpha(1.0f);
        this.f12357f.setAlpha(1.0f);
        this.f12358g.setAlpha(1.0f);
        this.f12359h.setAlpha(1.0f);
        this.f12360i.setAlpha(1.0f);
        this.f12361j.setAlpha(1.0f);
        this.f12362k.setAlpha(1.0f);
        this.f12363l.setAlpha(1.0f);
        this.f12364m.setAlpha(1.0f);
        this.f12365n.setAlpha(1.0f);
        this.f12366o.setVisibility(8);
    }

    /* renamed from: c */
    private void m14369c() {
        this.f12354c.setAlpha(0.64f);
        this.f12355d.setAlpha(0.64f);
        this.f12356e.setAlpha(0.64f);
        this.f12357f.setAlpha(0.64f);
        this.f12358g.setAlpha(0.64f);
        this.f12359h.setAlpha(0.64f);
        this.f12360i.setAlpha(0.64f);
        this.f12361j.setAlpha(0.64f);
        this.f12362k.setAlpha(0.64f);
        this.f12363l.setAlpha(0.64f);
        this.f12364m.setAlpha(0.64f);
        this.f12365n.setAlpha(0.64f);
        this.f12366o.setVisibility(0);
    }

    /* renamed from: a */
    private void m14366a() {
        this.f12354c = this.f12353b.findViewById(R.id.b6h);
        this.f12355d = (TextView) this.f12353b.findViewById(R.id.dqv);
        this.f12356e = this.f12353b.findViewById(R.id.b6g);
        this.f12357f = (TextView) this.f12353b.findViewById(R.id.dqu);
        this.f12358g = this.f12353b.findViewById(R.id.b6f);
        this.f12359h = (TextView) this.f12353b.findViewById(R.id.dqt);
        this.f12361j = (SeekBar) this.f12353b.findViewById(R.id.fk);
        this.f12362k = (SeekBar) this.f12353b.findViewById(R.id.d7i);
        this.f12361j.setOnSeekBarChangeListener(this);
        this.f12362k.setOnSeekBarChangeListener(this);
        this.f12365n = (TextView) this.f12353b.findViewById(R.id.dqi);
        this.f12364m = (TextView) this.f12353b.findViewById(R.id.e22);
        this.f12363l = (TextView) this.f12353b.findViewById(R.id.dzs);
        this.f12366o = this.f12353b.findViewById(R.id.bzr);
        this.f12366o.setOnClickListener(C4240c.f12390a);
        this.f12360i = (ToggleButton) this.f12353b.findViewById(R.id.dl1);
        this.f12354c.setOnClickListener(this.f12367p);
        this.f12355d.setOnClickListener(this.f12367p);
        this.f12356e.setOnClickListener(this.f12367p);
        this.f12357f.setOnClickListener(this.f12367p);
        this.f12358g.setOnClickListener(this.f12367p);
        this.f12359h.setOnClickListener(this.f12367p);
        int i = 0;
        boolean z = true;
        if (!((Boolean) C8946b.f24373Y.mo22117a()).booleanValue() || ((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo10240a()).intValue() != 1) {
            z = false;
        }
        this.f12360i.setChecked(z);
        View view = this.f12366o;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
        this.f12362k.setProgress((int) (((Float) C8946b.f24371W.mo22117a()).floatValue() * 100.0f));
        this.f12361j.setProgress((int) (((Float) C8946b.f24370V.mo22117a()).floatValue() * 100.0f));
        m14367a(((Integer) C8946b.f24372X.mo22117a()).intValue());
        this.f12360i.setOnCheckedChangeListener(this);
        if (z) {
            m14368b();
        } else {
            m14369c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11788a(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.b6h || id == R.id.dqv) {
            i = 0;
        } else if (id == R.id.b6g || id == R.id.dqu) {
            i = 1;
        } else if (id == R.id.b6f || id == R.id.dqt) {
            i = 2;
        } else {
            return;
        }
        m14367a(i);
        C8946b.f24372X.mo22118a(Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m14367a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view = this.f12354c;
        if (i == 0) {
            i2 = R.drawable.c37;
        } else {
            i2 = R.drawable.c38;
        }
        view.setBackgroundResource(i2);
        TextView textView = this.f12355d;
        Resources resources = getContext().getResources();
        int i7 = R.color.aco;
        if (i == 0) {
            i3 = R.color.acn;
        } else {
            i3 = R.color.aco;
        }
        textView.setTextColor(resources.getColor(i3));
        View view2 = this.f12356e;
        if (i == 1) {
            i4 = R.drawable.c34;
        } else {
            i4 = R.drawable.c35;
        }
        view2.setBackgroundResource(i4);
        TextView textView2 = this.f12357f;
        Resources resources2 = getContext().getResources();
        if (i == 1) {
            i5 = R.color.acn;
        } else {
            i5 = R.color.aco;
        }
        textView2.setTextColor(resources2.getColor(i5));
        View view3 = this.f12358g;
        if (i == 2) {
            i6 = R.drawable.c32;
        } else {
            i6 = R.drawable.c33;
        }
        view3.setBackgroundResource(i6);
        TextView textView3 = this.f12359h;
        Resources resources3 = getContext().getResources();
        if (i == 2) {
            i7 = R.color.acn;
        }
        textView3.setTextColor(resources3.getColor(i7));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f12353b = LayoutInflater.from(getContext()).inflate(R.layout.amo, null);
            setContentView(this.f12353b);
            if (getWindow() != null) {
                getWindow().setLayout((int) C9738o.m28708b(getContext(), 256.0f), -1);
                getWindow().setGravity(8388613);
            }
            m14366a();
        } catch (Exception e) {
            C8444d.m25673b();
            C8444d.m11969a(6, e.getStackTrace());
        }
    }

    public C4230a(Context context, C4231a aVar) {
        super(context, R.style.ya);
        this.f12352a = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.dl1) {
            if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo10240a()).intValue() != 1) {
                this.f12360i.setChecked(false);
                C9049ap.m27022a((int) R.string.ep5);
                return;
            }
            if (z) {
                m14368b();
            } else {
                m14369c();
            }
            C8946b.f24373Y.mo22118a(Boolean.valueOf(z));
            this.f12352a.mo11794a(z);
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() == R.id.fk) {
            C8946b.f24370V.mo22118a(Float.valueOf(((float) i) / 100.0f));
            return;
        }
        if (seekBar.getId() == R.id.d7i) {
            C8946b.f24371W.mo22118a(Float.valueOf(((float) i) / 100.0f));
        }
    }
}
