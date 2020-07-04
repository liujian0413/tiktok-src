package com.bytedance.router;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.bytedance.router.util.Util;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SmartRouterTestActivity extends Activity {
    public int mCurrentClickPosition = -1;
    public WeakReference<View> mCurrentItemView;
    public List<Map<String, Object>> mDataList;
    private ListView mListView;
    public SimpleAdapter mSimpleAdapter;

    private void initView() {
        C125452 r0 = new SimpleAdapter(this, this.mDataList, R.layout.ahq, new String[]{"url", "target_class", "is_checked"}, new int[]{R.id.dh9, R.id.dgh, R.id.vh}) {
            public View getView(final int i, View view, ViewGroup viewGroup) {
                if (view != null) {
                    ((CheckBox) view.findViewById(R.id.vh)).setOnCheckedChangeListener(new OnCheckedChangeListener() {
                        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            if (!((Map) SmartRouterTestActivity.this.mDataList.get(i)).get("is_checked").equals(Boolean.valueOf(z))) {
                                ((Map) SmartRouterTestActivity.this.mDataList.get(i)).put("is_checked", Boolean.valueOf(z));
                                SmartRouterTestActivity.this.mSimpleAdapter.notifyDataSetChanged();
                            }
                        }
                    });
                }
                View view2 = super.getView(i, view, viewGroup);
                if (view == null) {
                    ((CheckBox) view2.findViewById(R.id.vh)).setOnCheckedChangeListener(new OnCheckedChangeListener() {
                        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            if (!((Map) SmartRouterTestActivity.this.mDataList.get(i)).get("is_checked").equals(Boolean.valueOf(z))) {
                                ((Map) SmartRouterTestActivity.this.mDataList.get(i)).put("is_checked", Boolean.valueOf(z));
                                SmartRouterTestActivity.this.mSimpleAdapter.notifyDataSetChanged();
                            }
                        }
                    });
                }
                return view2;
            }
        };
        this.mSimpleAdapter = r0;
        this.mListView.setAdapter(this.mSimpleAdapter);
        this.mListView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                String replace = ((String) ((Map) SmartRouterTestActivity.this.mDataList.get(i)).get("url")).replace("TestUrl is Empty: ", "");
                C0598c a = C0598c.m2486a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
                if (replace.contains("from_commerce_bill_share")) {
                    SmartRouter.buildRoute((Context) SmartRouterTestActivity.this, replace).withBundleAnimation(a.mo2580a()).open();
                } else {
                    SmartRouter.buildRoute((Context) SmartRouterTestActivity.this, replace).open();
                }
                SmartRouterTestActivity.this.mCurrentClickPosition = i;
                SmartRouterTestActivity.this.mCurrentItemView = new WeakReference<>(view);
            }
        });
    }

    private void initData() {
        List<String> testUrlList = RouteManager.getInstance().getTestUrlList();
        Map routeMap = RouteManager.getInstance().getRouteMap();
        ArrayList arrayList = new ArrayList();
        this.mDataList = new ArrayList();
        for (String str : testUrlList) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            String realRouteUrl = Util.getRealRouteUrl(str);
            String str2 = (String) routeMap.get(realRouteUrl);
            if (realRouteUrl != null && TextUtils.isEmpty(str2)) {
                int lastIndexOf = realRouteUrl.lastIndexOf("/");
                if (lastIndexOf > 3) {
                    realRouteUrl = realRouteUrl.substring(0, lastIndexOf);
                    str2 = (String) routeMap.get(realRouteUrl);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                realRouteUrl = Util.getRouteUrl(str);
                str2 = (String) routeMap.get(realRouteUrl);
            }
            if (realRouteUrl != null && TextUtils.isEmpty(str2)) {
                int lastIndexOf2 = realRouteUrl.lastIndexOf("/");
                if (lastIndexOf2 > 3) {
                    realRouteUrl = realRouteUrl.substring(0, lastIndexOf2);
                    str2 = (String) routeMap.get(realRouteUrl);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(realRouteUrl);
                hashMap.put("target_class", str2);
            } else {
                hashMap.put("target_class", "Custom Route");
            }
            hashMap.put("is_checked", Boolean.valueOf(false));
            this.mDataList.add(hashMap);
        }
        for (Entry entry : routeMap.entrySet()) {
            if (!arrayList.contains(entry.getKey())) {
                HashMap hashMap2 = new HashMap();
                StringBuilder sb = new StringBuilder("TestUrl is Empty: ");
                sb.append((String) entry.getKey());
                hashMap2.put("url", sb.toString());
                hashMap2.put("target_class", entry.getValue());
                hashMap2.put("is_checked", Boolean.valueOf(false));
                this.mDataList.add(hashMap2);
            }
        }
        getApplication().registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
                if (!(activity.getIntent() == null || activity.getIntent().getComponent() == null || SmartRouterTestActivity.this.mCurrentClickPosition == -1 || SmartRouterTestActivity.this.mCurrentClickPosition >= SmartRouterTestActivity.this.mDataList.size() || !TextUtils.equals((String) ((Map) SmartRouterTestActivity.this.mDataList.get(SmartRouterTestActivity.this.mCurrentClickPosition)).get("target_class"), activity.getIntent().getComponent().getClassName()) || ((View) SmartRouterTestActivity.this.mCurrentItemView.get()) == null)) {
                    ((Map) SmartRouterTestActivity.this.mDataList.get(SmartRouterTestActivity.this.mCurrentClickPosition)).put("is_checked", Boolean.valueOf(true));
                    SmartRouterTestActivity.this.mSimpleAdapter.notifyDataSetChanged();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ahr);
        this.mListView = (ListView) findViewById(R.id.bn1);
        initData();
        initView();
    }
}
