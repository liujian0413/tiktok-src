package org.msgpack.template;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GenericCollectionTemplate implements GenericTemplate {
    Constructor<? extends Template> constructor;

    public Template build(Template[] templateArr) {
        try {
            return (Template) this.constructor.newInstance((Object[]) templateArr);
        } catch (InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public GenericCollectionTemplate(TemplateRegistry templateRegistry, Class<? extends Template> cls) {
        try {
            this.constructor = cls.getConstructor(new Class[]{Template.class});
            this.constructor.newInstance(new Object[]{new AnyTemplate(templateRegistry)});
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        } catch (InvocationTargetException e2) {
            throw new IllegalArgumentException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException(e3);
        } catch (InstantiationException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
