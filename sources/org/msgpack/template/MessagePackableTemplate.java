package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C48351b;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class MessagePackableTemplate extends AbstractTemplate<C48351b> {
    private Class<?> targetClass;

    MessagePackableTemplate(Class<?> cls) {
        this.targetClass = cls;
    }

    public void write(Packer packer, C48351b bVar, boolean z) throws IOException {
        if (bVar != null) {
            return;
        }
        if (!z) {
            packer.writeNil();
            return;
        }
        throw new MessageTypeException("Attempted to write null");
    }

    public C48351b read(Unpacker unpacker, C48351b bVar, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        if (bVar == null) {
            try {
                bVar = (C48351b) this.targetClass.newInstance();
            } catch (InstantiationException e) {
                throw new MessageTypeException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new MessageTypeException((Throwable) e2);
            }
        }
        return bVar;
    }
}
