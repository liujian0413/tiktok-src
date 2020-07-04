package org.msgpack.template;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class CollectionTemplate<E> extends AbstractTemplate<Collection<E>> {
    private Template<E> elementTemplate;

    public CollectionTemplate(Template<E> template) {
        this.elementTemplate = template;
    }

    public Collection<E> read(Unpacker unpacker, Collection<E> collection, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (collection == null) {
            collection = new LinkedList<>();
        } else {
            collection.clear();
        }
        for (int i = 0; i < readArrayBegin; i++) {
            collection.add(this.elementTemplate.read(unpacker, null));
        }
        unpacker.readArrayEnd();
        return collection;
    }

    public void write(Packer packer, Collection<E> collection, boolean z) throws IOException {
        if (collection != null) {
            packer.writeArrayBegin(collection.size());
            for (E write : collection) {
                this.elementTemplate.write(packer, write);
            }
            packer.writeArrayEnd();
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
