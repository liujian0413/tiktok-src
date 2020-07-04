package com.p280ss.android.ugc.aweme.setting.p336a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37633h;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.C7214e;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.a.c */
public final class C37531c {
    /* renamed from: a */
    private static void m120243a() {
        AbTestModel d = C7213d.m22500a().mo18803bo();
        for (Field a : d.getClass().getDeclaredFields()) {
            C37538g.m120252a(a, d);
        }
    }

    /* renamed from: a */
    public static void m120244a(final ViewGroup viewGroup) {
        C1592h.m7853a((Callable<TResult>) new Callable<ArrayList<View>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public ArrayList<View> call() {
                return C37531c.m120242a(viewGroup.getContext());
            }
        }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<ArrayList<View>, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<ArrayList<View>> hVar) {
                Iterator it = ((ArrayList) hVar.mo6890e()).iterator();
                while (it.hasNext()) {
                    viewGroup.addView((View) it.next(), 5);
                }
                return null;
            }
        }, C1592h.f5958b);
    }

    /* renamed from: b */
    private static SettingItemSwitch m120246b(Context context) {
        String str;
        SettingItemSwitch settingItemSwitch = new SettingItemSwitch(context);
        boolean b = C7214e.m22629b().mo16909b(context.getApplicationContext(), "ENABLED", false);
        StringBuilder sb = new StringBuilder();
        if (b) {
            str = "已开启";
        } else {
            str = "已关闭";
        }
        sb.append(str);
        sb.append("A/B Test Mock");
        settingItemSwitch.setStartText(sb.toString());
        settingItemSwitch.setChecked(b);
        settingItemSwitch.setOnSettingItemClickListener(new C37536d(settingItemSwitch, context));
        return settingItemSwitch;
    }

    /* renamed from: c */
    private static SettingItemSwitch m120248c(Context context) {
        String str;
        SettingItemSwitch settingItemSwitch = new SettingItemSwitch(context);
        StringBuilder sb = new StringBuilder();
        if (C37633h.m120442a()) {
            str = "已开启";
        } else {
            str = "已关闭";
        }
        sb.append(str);
        sb.append("BOE环境");
        settingItemSwitch.setStartText(sb.toString());
        settingItemSwitch.setChecked(C37633h.m120442a());
        settingItemSwitch.setOnSettingItemClickListener(new C37537e(settingItemSwitch, context));
        return settingItemSwitch;
    }

    /* renamed from: a */
    public static ArrayList<View> m120242a(final Context context) {
        final LinkedHashMap<String, ArrayList<C37538g>> linkedHashMap = C37538g.f97915a;
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public int compare(String str, String str2) {
                int size = ((ArrayList) linkedHashMap.get(str)).size() - ((ArrayList) linkedHashMap.get(str2)).size();
                if (size != 0) {
                    return size;
                }
                return 1;
            }
        });
        if (C6307b.m19566a((Collection<T>) linkedHashMap.entrySet())) {
            m120243a();
        }
        treeMap.putAll(linkedHashMap);
        ArrayList<View> arrayList = new ArrayList<>();
        for (Entry entry : treeMap.entrySet()) {
            C37529a aVar = new C37529a(context);
            aVar.mo94819a((String) entry.getKey(), (ArrayList) entry.getValue());
            arrayList.add(aVar);
        }
        arrayList.add(m120246b(context));
        arrayList.add(m120248c(context));
        SettingItem settingItem = new SettingItem(context);
        settingItem.setOnSettingItemClickListener(new C10813a() {
            public final void OnSettingItemClick(View view) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().startTestABActivity(context);
            }
        });
        settingItem.setStartText("AB 和 Setting （工具线）");
        arrayList.add(settingItem);
        return arrayList;
    }

    /* renamed from: b */
    static final /* synthetic */ void m120247b(SettingItemSwitch settingItemSwitch, Context context, View view) {
        String str;
        String str2;
        settingItemSwitch.toggle();
        StringBuilder sb = new StringBuilder();
        if (settingItemSwitch.isChecked()) {
            str = "已开启";
        } else {
            str = "已关闭";
        }
        sb.append(str);
        sb.append("A/B Test Mock");
        settingItemSwitch.setStartText(sb.toString());
        C7214e.m22629b().mo16902a(context.getApplicationContext(), "ENABLED", settingItemSwitch.mo26028a());
        if (settingItemSwitch.mo26028a()) {
            str2 = "已开启A/B Test Mock （不再接收网络A/B Test配置）";
        } else {
            str2 = "已关闭，杀掉应用后加载新的A/B Test配置";
        }
        C10761a.m31387a(context, str2).mo25750a();
    }

    /* renamed from: a */
    static final /* synthetic */ void m120245a(SettingItemSwitch settingItemSwitch, Context context, View view) {
        String str;
        String str2;
        settingItemSwitch.toggle();
        StringBuilder sb = new StringBuilder();
        if (settingItemSwitch.isChecked()) {
            str = "已开启";
        } else {
            str = "已关闭";
        }
        sb.append(str);
        sb.append("BOE环境");
        settingItemSwitch.setStartText(sb.toString());
        C37633h.m120441a(settingItemSwitch.mo26029b());
        if (settingItemSwitch.mo26028a()) {
            str2 = "已开启BOE环境, 冷启动后可切换至BOE环境";
        } else {
            str2 = "已关闭BOE环境，冷启动后可切换至线上环境";
        }
        C10761a.m31387a(context, str2).mo25750a();
    }
}
