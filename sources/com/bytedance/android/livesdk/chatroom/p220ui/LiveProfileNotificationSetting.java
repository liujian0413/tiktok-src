package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.C4870ae;
import com.bytedance.android.livesdk.chatroom.presenter.C4949al;
import com.bytedance.android.livesdk.chatroom.presenter.C4949al.C4950a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileNotificationSetting */
public class LiveProfileNotificationSetting extends LiveDialogFragment implements OnClickListener, C4950a {

    /* renamed from: a */
    private C4949al f14993a;

    /* renamed from: b */
    private C5133a f14994b;

    /* renamed from: c */
    private String f14995c = "";

    /* renamed from: d */
    private String f14996d = "";

    /* renamed from: e */
    private String f14997e = "";

    /* renamed from: f */
    private boolean f14998f;

    /* renamed from: g */
    private ImageView f14999g;

    /* renamed from: h */
    private ImageView f15000h;

    /* renamed from: i */
    private ImageView f15001i;

    /* renamed from: k */
    private ClickPosition f15002k = ClickPosition.Part;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileNotificationSetting$ClickPosition */
    public enum ClickPosition {
        Null,
        All,
        Part,
        No
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileNotificationSetting$a */
    public interface C5133a {
        /* renamed from: a */
        void mo13303a();

        /* renamed from: a */
        void mo13304a(int i);
    }

    public void onDetach() {
        this.f14998f = false;
        this.f14994b.mo13303a();
        super.onDetach();
    }

    public void onAttach(Context context) {
        this.f14998f = true;
        super.onAttach(context);
    }

    /* renamed from: a */
    public final void mo12933a(Throwable th) {
        if (this.f14998f) {
            C9049ap.m27028a(getString(R.string.ezj));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yt);
    }

    /* renamed from: a */
    private void m16628a(int i) {
        switch (i) {
            case 1:
                this.f15002k = ClickPosition.All;
                return;
            case 2:
                this.f15002k = ClickPosition.Part;
                return;
            case 3:
                this.f15002k = ClickPosition.No;
                break;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("tuid", this.f14996d);
            bundle.putString("roomId", this.f14995c);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    private void m16632b(ClickPosition clickPosition) {
        switch (clickPosition) {
            case All:
                m16633c(ClickPosition.All);
                m16630a(this.f14999g, true);
                return;
            case Part:
                m16633c(ClickPosition.Part);
                m16630a(this.f15000h, true);
                return;
            case No:
                m16633c(ClickPosition.No);
                m16630a(this.f15001i, true);
                break;
        }
    }

    /* renamed from: c */
    private void m16633c(ClickPosition clickPosition) {
        switch (this.f15002k) {
            case All:
                m16630a(this.f14999g, false);
                this.f15002k = clickPosition;
                return;
            case Part:
                m16630a(this.f15000h, false);
                this.f15002k = clickPosition;
                return;
            case No:
                m16630a(this.f15001i, false);
                this.f15002k = clickPosition;
                break;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.b39) {
            m16631a(ClickPosition.All);
        } else if (id == R.id.b48) {
            m16631a(ClickPosition.Part);
        } else if (id == R.id.b46) {
            m16631a(ClickPosition.No);
        } else {
            if (id == R.id.a5a) {
                dismiss();
            }
        }
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
        if (bundle != null && bundle.containsKey("uid") && bundle.containsKey("tuid")) {
            this.f14996d = bundle.getString("tuid");
            this.f14995c = bundle.getString("roomId");
        }
    }

    /* renamed from: a */
    private void m16631a(ClickPosition clickPosition) {
        if (this.f15002k != clickPosition) {
            this.f14993a.mo12929a(clickPosition.ordinal(), this.f14996d);
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", this.f14997e);
            hashMap.put("room_id", this.f14995c);
            String str = "";
            switch (clickPosition) {
                case All:
                    str = "all";
                    break;
                case Part:
                    str = "personalized";
                    break;
                case No:
                    str = "off";
                    break;
            }
            hashMap.put("enter_from_merge", "message");
            hashMap.put("enter_method", "live_cell");
            hashMap.put("setting_type", str);
            C8443c.m25663a().mo21606a("livesdk_live_notification_choose", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("notification_setting"));
        }
    }

    /* renamed from: a */
    private void m16629a(View view) {
        TextView textView = (TextView) view.findViewById(R.id.title);
        View findViewById = view.findViewById(R.id.b39);
        View findViewById2 = view.findViewById(R.id.b48);
        View findViewById3 = view.findViewById(R.id.b46);
        this.f14999g = (ImageView) findViewById.findViewById(R.id.d2i);
        this.f15000h = (ImageView) findViewById2.findViewById(R.id.d2i);
        this.f15001i = (ImageView) findViewById3.findViewById(R.id.d2i);
        ImageView imageView = (ImageView) view.findViewById(R.id.a5a);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.b5a);
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.b5a);
        TextView textView4 = (TextView) findViewById3.findViewById(R.id.b5a);
        m16630a(this.f14999g, false);
        m16630a(this.f15000h, false);
        m16630a(this.f15001i, false);
        findViewById2.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setText(R.string.cwk);
        textView2.setText(R.string.cwl);
        textView3.setText(R.string.cwm);
        textView4.setText(R.string.cwn);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.l9);
        ImageView imageView3 = (ImageView) findViewById2.findViewById(R.id.l9);
        ImageView imageView4 = (ImageView) findViewById3.findViewById(R.id.l9);
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.ci7));
        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.cib));
        imageView4.setImageDrawable(getResources().getDrawable(R.drawable.cia));
        m16632b(this.f15002k);
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "message");
        hashMap.put("enter_method", "live_cell");
        hashMap.put("anchor_id", this.f14997e);
        hashMap.put("room_id", this.f14995c);
        C8443c.m25663a().mo21606a("livesdk_live_notification_show", hashMap, new C8438j().mo21603f("show").mo21599b("live").mo21598a("notification_setting"));
    }

    /* renamed from: a */
    public final void mo12932a(C4870ae aeVar) {
        if (this.f14998f) {
            m16628a(aeVar.f13935a);
            m16632b(this.f15002k);
        }
        this.f14994b.mo13304a(aeVar.f13935a);
        dismiss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m16629a(view);
    }

    /* renamed from: a */
    private void m16630a(ImageView imageView, boolean z) {
        if (z) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.ci8));
        } else {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.ci9));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aos, viewGroup, false);
    }

    /* renamed from: a */
    public static LiveProfileNotificationSetting m16627a(String str, int i, C5133a aVar, String str2, String str3) {
        LiveProfileNotificationSetting liveProfileNotificationSetting = new LiveProfileNotificationSetting();
        C4949al alVar = new C4949al();
        liveProfileNotificationSetting.f14993a = alVar;
        alVar.mo9142a(liveProfileNotificationSetting);
        liveProfileNotificationSetting.f14995c = str;
        if (i == 1) {
            liveProfileNotificationSetting.f15002k = ClickPosition.All;
        } else if (i != 3) {
            liveProfileNotificationSetting.f15002k = ClickPosition.Part;
        } else {
            liveProfileNotificationSetting.f15002k = ClickPosition.No;
        }
        liveProfileNotificationSetting.f14994b = aVar;
        liveProfileNotificationSetting.f14996d = str2;
        liveProfileNotificationSetting.f14997e = str3;
        return liveProfileNotificationSetting;
    }
}
