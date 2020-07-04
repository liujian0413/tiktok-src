package com.bytedance.router;

import com.bytedance.router.mapping.Params$$Mapping;
import java.util.HashMap;
import java.util.Map;

public class SmartRouterExtension {
    private static volatile SmartRouterExtension sInstance;
    private Map<String, String[]> mPathMap = new HashMap();

    private SmartRouterExtension() {
        new Params$$Mapping().init(this.mPathMap);
    }

    public static SmartRouterExtension getInstance() {
        if (sInstance == null) {
            synchronized (SmartRouterExtension.class) {
                if (sInstance == null) {
                    sInstance = new SmartRouterExtension();
                }
            }
        }
        return sInstance;
    }

    public String[] getPathParams(String str) {
        if (this.mPathMap == null) {
            return null;
        }
        return (String[]) this.mPathMap.get(str);
    }

    public boolean containsPath(String str) {
        if (this.mPathMap == null || this.mPathMap.isEmpty()) {
            return false;
        }
        return this.mPathMap.containsKey(str);
    }
}
