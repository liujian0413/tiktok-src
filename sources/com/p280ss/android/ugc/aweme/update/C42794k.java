package com.p280ss.android.ugc.aweme.update;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.newmedia.C19929d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.update.k */
public final class C42794k extends Dialog implements C6310a {

    /* renamed from: a */
    public UpdateHelper f111214a;

    /* renamed from: b */
    public Handler f111215b;

    /* renamed from: c */
    private TextView f111216c;

    /* renamed from: d */
    private TextView f111217d;

    /* renamed from: e */
    private TextView f111218e;

    /* renamed from: f */
    private View f111219f;

    /* renamed from: g */
    private View f111220g;

    /* renamed from: h */
    private View f111221h;

    /* renamed from: i */
    private TextView f111222i;

    /* renamed from: j */
    private TextView f111223j;

    /* renamed from: k */
    private View f111224k;

    /* renamed from: l */
    private TextView f111225l;

    /* renamed from: m */
    private boolean f111226m;

    /* renamed from: n */
    private String f111227n = "upgrade_pop";

    /* renamed from: o */
    private String f111228o;

    /* renamed from: p */
    private final OnClickListener f111229p = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            view.setSelected(!view.isSelected());
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.update.k$a */
    class C42798a extends Thread {

        /* renamed from: a */
        C42781a f111239a = new C42781a();

        /* renamed from: b */
        volatile boolean f111240b = false;

        public final void run() {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                if (!C42794k.this.f111214a.mo104397h()) {
                    break;
                }
                C42794k.this.f111214a.mo104389a(this.f111239a);
                Message obtainMessage = C42794k.this.f111215b.obtainMessage(1);
                obtainMessage.obj = this.f111239a;
                synchronized (this) {
                    if (!this.f111240b) {
                        C42794k.this.f111215b.sendMessage(obtainMessage);
                    }
                }
            }
            if (!this.f111240b) {
                C42794k.this.f111215b.sendEmptyMessage(2);
            }
        }

        C42798a() {
        }
    }

    /* renamed from: b */
    private void m135825b() {
        m135823a();
    }

    /* renamed from: a */
    private void m135823a() {
        final boolean z;
        final boolean z2;
        int i;
        final UpdateHelper b = UpdateHelper.m135755b();
        this.f111214a = b;
        if (b != null) {
            if (b.mo104406q() != null) {
                z = true;
            } else {
                z = false;
            }
            boolean p = b.mo104405p();
            if (!b.mo104399j() || !this.f111226m) {
                z2 = false;
            } else {
                z2 = true;
            }
            String a = UpdateHelper.m135747a(b.mo104396g());
            if (!TextUtils.isEmpty(a) && a.charAt(a.length() - 1) == 10) {
                a = a.substring(0, a.length() - 1);
            }
            String k = b.mo104400k();
            String l = b.mo104401l();
            int i2 = R.string.by3;
            int i3 = R.string.by5;
            if (z2) {
                if (z) {
                    i2 = R.string.by4;
                } else {
                    i2 = R.string.by6;
                }
                i3 = R.string.by2;
            }
            if (z) {
                a = k;
            }
            this.f111216c.setText(l);
            TextView textView = this.f111217d;
            if (p) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f111218e.setText(a);
            this.f111222i.setText(i2);
            this.f111223j.setText(i3);
            this.f111222i.setVisibility(0);
            this.f111219f.setVisibility(8);
            this.f111222i.setEnabled(true);
            this.f111223j.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (z2 && z) {
                        C42794k.this.onEvent("forcible_downloaded_refuse");
                    } else if (z2 && !z) {
                        C42794k.this.onEvent("forcible_refuse");
                    } else if (z) {
                        C42794k.this.onEvent("downloaded_refuse");
                    } else {
                        C42794k.this.onEvent("refuse");
                    }
                    if (z2) {
                        C0688e.m2941a(C42794k.this.getContext()).mo2839a(new Intent("com.ss.android.common.app.action.exit_app"));
                    }
                    b.mo104411v();
                    if (!z2 && !z) {
                        C42794k.this.mo104436a(b);
                    }
                    C42794k.this.dismiss();
                    C19282c.m63182a(C42794k.this.getContext(), "update", "cancel");
                }
            });
            this.f111222i.setEnabled(true);
            this.f111222i.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (z2 && z) {
                        C42794k.this.onEvent("forcible_downloaded_accept");
                    } else if (z2 && !z) {
                        C42794k.this.onEvent("forcible_accept");
                    } else if (z) {
                        C42794k.this.onEvent("downloaded_accept");
                    } else {
                        C42794k.this.onEvent("accept");
                    }
                    b.mo104392c();
                    File q = b.mo104406q();
                    if (q != null) {
                        b.mo104393d();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.addFlags(1);
                        intent.setDataAndType(C19929d.m65754a(C42794k.this.getContext(), q), "application/vnd.android.package-archive");
                        intent.addFlags(268435456);
                        C42794k.this.getContext().startActivity(intent);
                    } else {
                        b.mo104412w();
                        if (z2) {
                            new C42798a().start();
                        }
                    }
                    if (!z2 && !z) {
                        C42794k.this.mo104436a(b);
                        C10761a.m31409e(C42794k.this.getContext(), (int) R.string.fk4).mo25750a();
                    }
                    if (!z2) {
                        C42794k.this.dismiss();
                    }
                    C19282c.m63182a(C42794k.this.getContext(), "update", "confirm");
                }
            });
            if (!z2 && !z) {
                b.mo104408s();
                if (b.mo104403n()) {
                    this.f111224k.setSelected(true);
                } else {
                    this.f111224k.setSelected(false);
                }
                if (b.mo104402m()) {
                    this.f111225l.setText(b.mo104404o());
                    this.f111224k.setVisibility(0);
                } else {
                    this.f111224k.setVisibility(8);
                }
                this.f111224k.setOnClickListener(this.f111229p);
            }
        }
    }

    public final void onEvent(String str) {
        if (getContext() != null) {
            C19282c.m63182a(getContext(), this.f111227n, str);
        }
    }

    /* renamed from: a */
    public final void mo104436a(UpdateHelper updateHelper) {
        if (updateHelper != null) {
            if (this.f111224k.isSelected()) {
                updateHelper.mo104409t();
            } else {
                updateHelper.mo104410u();
            }
        }
    }

    public final void handleMsg(Message message) {
        C42781a aVar;
        switch (message.what) {
            case 1:
                if (message.obj == null || !(message.obj instanceof C42781a)) {
                    aVar = new C42781a();
                } else {
                    aVar = (C42781a) message.obj;
                }
                m135824a(aVar.f111198a, aVar.f111199b);
                break;
            case 2:
                m135825b();
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        boolean z2 = true;
        requestWindowFeature(1);
        setContentView(R.layout.afm);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = C10730a.f28679f;
        window.addFlags(2);
        window.setBackgroundDrawableResource(R.drawable.blk);
        window.setGravity(17);
        window.setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f111215b = new C6309f(this);
        this.f111221h = findViewById(R.id.cwi);
        this.f111216c = (TextView) findViewById(R.id.dkm);
        this.f111217d = (TextView) findViewById(R.id.ab4);
        this.f111218e = (TextView) findViewById(R.id.a7m);
        this.f111219f = findViewById(R.id.e83);
        this.f111222i = (TextView) findViewById(R.id.e7z);
        this.f111223j = (TextView) findViewById(R.id.bga);
        this.f111220g = findViewById(R.id.a9t);
        this.f111224k = findViewById(R.id.mg);
        this.f111225l = (TextView) findViewById(R.id.avl);
        if (UpdateHelper.m135755b().mo104406q() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!UpdateHelper.m135755b().mo104399j() || !this.f111226m) {
            z2 = false;
        }
        if (z2 && z) {
            onEvent("forcible_downloaded_show");
        } else if (z2) {
            onEvent("forcible_show");
        } else if (z) {
            onEvent("downloaded_show");
        } else {
            onEvent("show");
        }
        m135823a();
    }

    public C42794k(Context context, boolean z) {
        super(context);
        this.f111226m = z;
        this.f111228o = context.getString(R.string.by7);
    }

    /* renamed from: a */
    private void m135824a(long j, long j2) {
        int i = 0;
        this.f111222i.setEnabled(false);
        this.f111219f.setVisibility(0);
        if (j > 0) {
            i = 5;
        }
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
            if (i > 99) {
                i = 99;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("%");
        sb.append(this.f111228o);
        this.f111222i.setText(sb.toString());
        this.f111219f.getLayoutParams().width = (int) ((((float) i) * ((float) this.f111220g.getWidth())) / 100.0f);
        this.f111219f.requestLayout();
    }
}
