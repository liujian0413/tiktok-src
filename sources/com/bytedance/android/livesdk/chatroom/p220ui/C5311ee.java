package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.model.C4887at;
import com.bytedance.android.livesdk.chatroom.model.C4888au;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ee */
public final class C5311ee extends Dialog implements OnClickListener {

    /* renamed from: a */
    private View f15544a;

    /* renamed from: b */
    private TextView f15545b;

    /* renamed from: c */
    private View[] f15546c;

    /* renamed from: d */
    private String f15547d = null;

    /* renamed from: e */
    private Room f15548e;

    /* renamed from: f */
    private List<TaskGiftEvent> f15549f;

    /* renamed from: b */
    private void m16983b() {
        boolean z;
        String str = (String) LiveConfigSettingKeys.TASK_GIFT_DESC_URL.mo10240a();
        if (!TextUtils.isEmpty(str)) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b(str).mo11550a(""));
            return;
        }
        int i = 0;
        if (this.f15544a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f15544a;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m16981a() {
        boolean z;
        int i;
        int i2;
        int i3;
        TaskGiftEvent taskGiftEvent = (TaskGiftEvent) this.f15549f.get(0);
        if (taskGiftEvent.getType() == 1) {
            List asList = Arrays.asList((C4888au[]) C2317a.m9932a().mo15974a(taskGiftEvent.getData(), C4888au[].class));
            if (!C6307b.m19566a((Collection<T>) asList)) {
                int size = asList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C4888au auVar = (C4888au) asList.get(i4);
                    if (auVar != null) {
                        View view = this.f15546c[i4];
                        ImageView imageView = (ImageView) view.findViewById(R.id.oq);
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.or);
                        TextView textView = (TextView) view.findViewById(R.id.os);
                        if (auVar.f13998a > 0) {
                            i3 = R.drawable.cbp;
                            i2 = 0;
                            i = R.string.f4t;
                        } else if (auVar.f13999b > 0) {
                            int i5 = (int) ((((float) auVar.f13999b) / ((float) auVar.f14000c)) * 100.0f);
                            i = R.string.f4u;
                            i2 = i5;
                            i3 = R.drawable.cbn;
                            z = true;
                            imageView.setImageResource(i3);
                            progressBar.setProgress(i2);
                            textView.setText(i);
                            textView.setEnabled(z);
                        } else {
                            i3 = R.drawable.cbo;
                            i2 = 0;
                            i = R.string.f4w;
                        }
                        z = false;
                        imageView.setImageResource(i3);
                        progressBar.setProgress(i2);
                        textView.setText(i);
                        textView.setEnabled(z);
                    }
                }
                this.f15545b.setText(taskGiftEvent.getSubtitle());
            }
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (R.id.avj == id) {
            m16983b();
            C8448g.m25682a(getContext());
            return;
        }
        if (R.id.avi == id) {
            if (this.f15544a.getVisibility() == 0) {
                this.f15544a.setVisibility(8);
            }
        } else if (R.id.cn8 == id) {
            if (!TextUtils.isEmpty(this.f15547d)) {
                ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b(this.f15547d).mo11550a(getContext().getString(R.string.f4p)));
            }
            C8448g.m25682a(getContext());
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ap7, null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        View findViewById = findViewById(R.id.avj);
        this.f15544a = findViewById(R.id.avi);
        this.f15545b = (TextView) findViewById(R.id.efq);
        TextView textView = (TextView) findViewById(R.id.d62);
        TextView textView2 = (TextView) findViewById(R.id.d56);
        TextView textView3 = (TextView) findViewById(R.id.anz);
        TextView textView4 = (TextView) findViewById(R.id.ann);
        TextView textView5 = (TextView) findViewById(R.id.d4u);
        TextView textView6 = (TextView) findViewById(R.id.anl);
        this.f15546c = new View[6];
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ot);
        int childCount = viewGroup.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof ImageView)) {
                if (i > 5) {
                    break;
                }
                this.f15546c[i] = childAt;
                i++;
            }
        }
        findViewById(R.id.cn8).setOnClickListener(this);
        findViewById.setOnClickListener(this);
        this.f15544a.setOnClickListener(this);
        m16981a();
        m16982a((TaskGiftEvent) this.f15549f.get(1), 2, R.string.f4q, textView, textView2, textView5);
        m16982a((TaskGiftEvent) this.f15549f.get(2), 4, R.string.f4n, textView3, textView4, textView6);
    }

    public C5311ee(Context context, Room room, List<TaskGiftEvent> list, String str) {
        super(context, R.style.yh);
        this.f15548e = room;
        this.f15549f = list;
    }

    /* renamed from: a */
    private void m16982a(TaskGiftEvent taskGiftEvent, int i, int i2, TextView textView, TextView textView2, TextView textView3) {
        int i3;
        if (taskGiftEvent != null && i == taskGiftEvent.getType()) {
            C4887at atVar = (C4887at) C2317a.m9932a().mo15974a(taskGiftEvent.getData(), C4887at.class);
            int i4 = 3;
            if (atVar.f13997b < 3) {
                i3 = R.string.f4v;
            } else {
                i3 = R.string.f4t;
            }
            textView3.setEnabled(false);
            textView3.setText(i3);
            String string = getContext().getString(i2);
            if (atVar.f13997b <= 3) {
                i4 = atVar.f13997b;
            }
            textView.setText(C9078p.m27100a(string, Integer.valueOf(i4)));
            textView2.setText(taskGiftEvent.getSubtitle());
        }
    }
}
