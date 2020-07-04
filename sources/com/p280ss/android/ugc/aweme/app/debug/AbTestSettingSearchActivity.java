package com.p280ss.android.ugc.aweme.app.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p336a.C37538g;
import com.p280ss.android.ugc.aweme.setting.p337ui.AbStateView;
import com.p280ss.android.ugc.aweme.setting.p337ui.AbSwitchView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity */
public class AbTestSettingSearchActivity extends AbsABActivity {

    /* renamed from: a */
    public ArrayList<C37538g> f60648a = new ArrayList<>();

    /* renamed from: b */
    public Handler f60649b = new Handler() {
        public final void handleMessage(Message message) {
            AbTestSettingSearchActivity.this.mo59892a((String) message.obj);
        }
    };

    /* renamed from: q */
    private EditText f60650q;

    /* renamed from: r */
    private RecyclerView f60651r;

    /* renamed from: s */
    private ArrayList<C37538g> f60652s = new ArrayList<>();

    /* renamed from: t */
    private C1262a f60653t = new C1262a() {
        public final int getItemCount() {
            return AbTestSettingSearchActivity.this.f60648a.size();
        }

        public final int getItemViewType(int i) {
            if (((C37538g) AbTestSettingSearchActivity.this.f60648a.get(i)).f97919e == null) {
                return 0;
            }
            return 1;
        }

        public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C1293v(new AbSwitchView(AbTestSettingSearchActivity.this)) {
                };
            }
            return new C1293v(new AbStateView(AbTestSettingSearchActivity.this)) {
            };
        }

        public final void onBindViewHolder(C1293v vVar, int i) {
            if (vVar.itemView instanceof AbSwitchView) {
                ((AbSwitchView) vVar.itemView).mo95091a(((C37538g) AbTestSettingSearchActivity.this.f60648a.get(i)).f97917c, AbTestSettingSearchActivity.this.f60662d);
                return;
            }
            if (vVar.itemView instanceof AbStateView) {
                ((AbStateView) vVar.itemView).mo95088a(((C37538g) AbTestSettingSearchActivity.this.f60648a.get(i)).f97917c, (Object) AbTestSettingSearchActivity.this.f60662d);
            }
        }
    };

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: i */
    private void m75424i() {
        this.f60653t.notifyDataSetChanged();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f60649b.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58711c() {
        this.f60652s.addAll(C37538g.f97916b);
        for (int size = this.f60652s.size() - 1; size >= 0; size--) {
            if (((C37538g) this.f60652s.get(size)).f97919e == null && ((C37538g) this.f60652s.get(size)).f97918d == null) {
                this.f60652s.remove(size);
            } else if (((C37538g) this.f60652s.get(size)).f97919e != null && !((C37538g) this.f60652s.get(size)).f97917c.getType().equals(Integer.TYPE)) {
                this.f60652s.remove(size);
            } else if (((C37538g) this.f60652s.get(size)).f97918d != null && !((C37538g) this.f60652s.get(size)).f97917c.getType().equals(Boolean.TYPE)) {
                this.f60652s.remove(size);
            }
        }
        Collections.sort(this.f60652s, new Comparator<C37538g>() {
            /* renamed from: a */
            private static int m75428a(C37538g gVar, C37538g gVar2) {
                return gVar.f97921g.compareTo(gVar2.f97921g);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m75428a((C37538g) obj, (C37538g) obj2);
            }
        });
        this.f60648a.addAll(this.f60652s);
        this.f60651r.setAdapter(this.f60653t);
        mo59892a("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo59893d() {
        findViewById(R.id.ef9).setVisibility(8);
        this.f60651r = (RecyclerView) findViewById(R.id.cxs);
        this.f60651r.setVisibility(0);
        this.f60663e = (AbTestSettingPageParam) getIntent().getSerializableExtra("paeg_param");
        ((TextView) findViewById(R.id.title)).setText("搜索并设置AB");
        this.f60650q = (EditText) findViewById(R.id.acu);
        this.f60650q.setVisibility(0);
        this.f60650q.setHint("搜索并设置AB(支持搜hint, key, 变量名)");
        this.f60661c = (LinearLayout) findViewById(R.id.bgh);
        this.f60661c.setVisibility(8);
        this.f60651r.setLayoutManager(new WrapLinearLayoutManager(this));
        this.f60662d = C7213d.m22500a().mo18803bo();
        mo58711c();
        this.f60650q.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 66) {
                    return true;
                }
                return false;
            }
        });
        this.f60650q.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                AbTestSettingSearchActivity.this.f60649b.removeCallbacksAndMessages(null);
                Message obtain = Message.obtain();
                obtain.obj = editable.toString();
                AbTestSettingSearchActivity.this.f60649b.sendMessageDelayed(obtain, 200);
            }
        });
        KeyboardUtils.m77056b(this.f60650q);
    }

    /* renamed from: a */
    public static void m75423a(Context context) {
        context.startActivity(new Intent(context, AbTestSettingSearchActivity.class));
    }

    /* renamed from: a */
    public final void mo59892a(String str) {
        this.f60648a.clear();
        if (TextUtils.isEmpty(str)) {
            this.f60648a.addAll(this.f60652s);
            m75424i();
            return;
        }
        Iterator it = this.f60652s.iterator();
        while (it.hasNext()) {
            C37538g gVar = (C37538g) it.next();
            Iterator it2 = gVar.f97920f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((String) it2.next()).contains(str.toLowerCase())) {
                        this.f60648a.add(gVar);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        m75424i();
    }
}
