package com.p280ss.android.ugc.aweme.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.LogListActivity */
public class LogListActivity extends AmeBaseActivity {

    /* renamed from: a */
    public ArrayList<C22796ap> f60362a = new ArrayList<>();
    TextView clearBtn;
    ListView listView;

    /* renamed from: com.ss.android.ugc.aweme.app.LogListActivity$a */
    class C22674a extends BaseAdapter {

        /* renamed from: com.ss.android.ugc.aweme.app.LogListActivity$a$a */
        class C22675a {

            /* renamed from: a */
            TextView f60366a;

            private C22675a() {
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return LogListActivity.this.f60362a.size();
        }

        private C22674a() {
        }

        public final Object getItem(int i) {
            return LogListActivity.this.f60362a.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C22675a aVar;
            if (view == null) {
                C22675a aVar2 = new C22675a();
                View inflate = LayoutInflater.from(LogListActivity.this).inflate(R.layout.a41, null);
                aVar2.f60366a = (TextView) inflate.findViewById(R.id.c33);
                inflate.setTag(aVar2);
                View view2 = inflate;
                aVar = aVar2;
                view = view2;
            } else {
                aVar = (C22675a) view.getTag();
            }
            C22796ap apVar = (C22796ap) LogListActivity.this.f60362a.get(i);
            if (apVar != null) {
                String str = "";
                if (apVar.f60499f != null) {
                    StringBuilder sb = new StringBuilder();
                    JSONObject jSONObject = apVar.f60499f;
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String str2 = (String) keys.next();
                            String string = jSONObject.getString(str2);
                            StringBuilder sb2 = new StringBuilder("\n");
                            sb2.append(str2);
                            sb2.append(" = ");
                            sb2.append(string);
                            sb.append(sb2.toString());
                        } catch (Exception unused) {
                        }
                    }
                    str = sb.toString();
                }
                String str3 = "";
                if (apVar.f60500g == 1) {
                    StringBuilder sb3 = new StringBuilder("category: ");
                    sb3.append(apVar.f60494a);
                    sb3.append("\ntag: ");
                    sb3.append(apVar.f60495b);
                    sb3.append("\nlabel: ");
                    sb3.append(apVar.f60496c);
                    sb3.append("\nextValue:");
                    sb3.append(apVar.f60498e);
                    sb3.append("\nvalue: ");
                    sb3.append(apVar.f60497d);
                    sb3.append("\nextJson: ");
                    sb3.append(str);
                    str3 = sb3.toString();
                } else if (apVar.f60500g == 2) {
                    StringBuilder sb4 = new StringBuilder("eventName: ");
                    sb4.append(apVar.f60495b);
                    sb4.append("\nextra: ");
                    sb4.append(str);
                    str3 = sb4.toString();
                }
                aVar.f60366a.setText(str3);
            }
            return view;
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.ad3;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f60362a = C22795ao.m75204a().f60493a;
        final C22674a aVar = new C22674a();
        this.listView.setAdapter(aVar);
        this.listView.setSelection(this.f60362a.size() - 1);
        this.clearBtn.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                LogListActivity.this.f60362a.clear();
                aVar.notifyDataSetChanged();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onCreate", false);
    }
}
