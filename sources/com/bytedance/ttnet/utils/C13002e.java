package com.bytedance.ttnet.utils;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ttnet.C12961d;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.utils.e */
public final class C13002e {
    /* renamed from: a */
    public static void m37945a(Context context, Map<String, String> map) {
        if (context != null && map != null) {
            try {
                m37944a(context, 1, C6319n.m19591a(map));
            } catch (Exception unused) {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x002d in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:60)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* renamed from: a */
    public static java.lang.String m37943a(android.content.Context r2, int r3) {
        /*
            java.lang.String r0 = ""
            switch(r3) {
                case 1: goto L_0x002d;
                case 2: goto L_0x0020;
                case 3: goto L_0x0013;
                case 4: goto L_0x0006;
                default: goto L_0x0005;
            }     // Catch:{ Exception -> 0x003a }
        L_0x0005:
            goto L_0x003c     // Catch:{ Exception -> 0x003a }
        L_0x0006:
            com.bytedance.ttnet.c r3 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "tnc_config"     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = ""     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = r3.mo31464a(r2, r0, r1)     // Catch:{ Exception -> 0x003a }
            goto L_0x003c     // Catch:{ Exception -> 0x003a }
        L_0x0013:
            com.bytedance.ttnet.c r3 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "https_dns"     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = ""     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = r3.mo31464a(r2, r0, r1)     // Catch:{ Exception -> 0x003a }
            goto L_0x003c     // Catch:{ Exception -> 0x003a }
        L_0x0020:
            com.bytedance.ttnet.c r3 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "dns"     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = ""     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = r3.mo31464a(r2, r0, r1)     // Catch:{ Exception -> 0x003a }
            goto L_0x003c     // Catch:{ Exception -> 0x003a }
        L_0x002d:
            com.bytedance.ttnet.c r3 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "ssids"     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = ""     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = r3.mo31464a(r2, r0, r1)     // Catch:{ Exception -> 0x003a }
            goto L_0x003c
            java.lang.String r0 = ""
        L_0x003c:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = java.lang.String.valueOf(r0)
            goto L_0x0047
        L_0x0045:
            java.lang.String r2 = ""
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.C13002e.m37943a(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    public static void m37944a(Context context, int i, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
            }
            C12961d.m37772a().mo31466a(context, (Map<String, ?>) linkedHashMap);
        } catch (Exception unused) {
        }
    }
}
