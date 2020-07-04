package com.ixigua.downloader.pojo;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BlockInfo implements Serializable {
    private static final long serialVersionUID = 933239834152448790L;
    private final List<BlockItem> blockList = new ArrayList();

    public synchronized int getBlockSize() {
        return this.blockList.size();
    }

    public synchronized String getString() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (BlockItem string : this.blockList) {
                jSONArray.put(string.getString());
            }
            jSONObject.put("blockList", jSONArray);
        } catch (JSONException unused) {
            return null;
        }
        return jSONObject.toString();
    }

    public synchronized boolean isBlockAvailable() {
        for (BlockItem blockItem : this.blockList) {
            if (blockItem != null && (blockItem.getEnd() > 0 || blockItem.getDownloadedSize() > 0)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void addBlock(BlockItem blockItem) {
        if (blockItem != null) {
            this.blockList.add(blockItem);
        }
    }

    public synchronized BlockItem getBlockItemByIdx(int i) {
        if (i >= 0) {
            if (i < getBlockSize()) {
                return (BlockItem) this.blockList.get(i);
            }
        }
        return null;
    }

    static BlockInfo parse(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                BlockInfo blockInfo = new BlockInfo();
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("blockList");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        BlockItem parse = BlockItem.parse(optJSONArray.getString(i));
                        if (parse != null) {
                            blockInfo.addBlock(parse);
                        }
                    }
                    return blockInfo;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
