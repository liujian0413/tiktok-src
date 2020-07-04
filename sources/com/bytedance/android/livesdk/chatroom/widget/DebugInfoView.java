package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p208b.C4261a;
import com.bytedance.android.livesdk.chatroom.p208b.C4261a.C4263a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class DebugInfoView extends LinearLayout {

    /* renamed from: a */
    private TextView f16886a;

    /* renamed from: b */
    private TextView f16887b;

    /* renamed from: c */
    private TextView f16888c;

    /* renamed from: d */
    private TextView f16889d;

    /* renamed from: e */
    private TextView f16890e;

    /* renamed from: f */
    private C4261a f16891f;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16891f.mo11939b();
    }

    /* renamed from: a */
    private void m18131a() {
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.ame, this);
        this.f16888c = (TextView) findViewById(R.id.a8z);
        this.f16886a = (TextView) findViewById(R.id.ara);
        this.f16889d = (TextView) findViewById(R.id.bxt);
        this.f16887b = (TextView) findViewById(R.id.v9);
        this.f16890e = (TextView) findViewById(R.id.cm_);
        this.f16891f = new C4261a();
        this.f16891f.mo11938a((C4263a) new C5796b(this));
        this.f16891f.mo11937a(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
        TextView textView = (TextView) findViewById(R.id.a8t);
        ((TextView) findViewById(R.id.e7j)).setText(String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
        textView.setText(TTLiveSDKContext.getHostService().mo22360a().getServerDeviceId());
    }

    public DebugInfoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo14202a(float f) {
        this.f16890e.getHandler().post(new C5797c(this, f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14204b(float f) {
        TextView textView = this.f16890e;
        StringBuilder sb = new StringBuilder();
        sb.append((int) f);
        sb.append("kbps");
        C9738o.m28704a(textView, (CharSequence) sb.toString());
    }

    public DebugInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14203a(MessageType messageType, long j) {
        switch (messageType) {
            case GIFT:
                this.f16886a.setText(String.valueOf(j));
                return;
            case DIGG:
                this.f16888c.setText(String.valueOf(j));
                return;
            case CHAT:
                this.f16887b.setText(String.valueOf(j));
                return;
            case MEMBER:
                this.f16889d.setText(String.valueOf(j));
                break;
        }
    }

    public DebugInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18131a();
    }
}
