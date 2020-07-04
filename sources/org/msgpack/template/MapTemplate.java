package org.msgpack.template;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class MapTemplate<K, V> extends AbstractTemplate<Map<K, V>> {
    private Template<K> keyTemplate;
    private Template<V> valueTemplate;

    public MapTemplate(Template<K> template, Template<V> template2) {
        this.keyTemplate = template;
        this.valueTemplate = template2;
    }

    public Map<K, V> read(Unpacker unpacker, Map<K, V> map, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readMapBegin = unpacker.readMapBegin();
        if (map != null) {
            map.clear();
        } else {
            map = new HashMap<>(readMapBegin);
        }
        for (int i = 0; i < readMapBegin; i++) {
            map.put(this.keyTemplate.read(unpacker, null), this.valueTemplate.read(unpacker, null));
        }
        unpacker.readMapEnd();
        return map;
    }

    public void write(Packer packer, Map<K, V> map, boolean z) throws IOException {
        if (map instanceof Map) {
            packer.writeMapBegin(map.size());
            for (Entry entry : map.entrySet()) {
                this.keyTemplate.write(packer, entry.getKey());
                this.valueTemplate.write(packer, entry.getValue());
            }
            packer.writeMapEnd();
        } else if (map != null) {
            StringBuilder sb = new StringBuilder("Target is not a Map but ");
            sb.append(map.getClass());
            throw new MessageTypeException(sb.toString());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
