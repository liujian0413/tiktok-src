package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct */
public final class CategoryStruct extends Message<CategoryStruct, Builder> {
    public static final DefaultValueProtoAdapter<CategoryStruct> ADAPTER = new ProtoAdapter_CategoryStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String category_name;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CategoryStruct, Builder> {
        public String category_name;

        public final CategoryStruct build() {
            return new CategoryStruct(this.category_name, super.buildUnknownFields());
        }

        public final Builder category_name(String str) {
            this.category_name = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct$ProtoAdapter_CategoryStruct */
    static final class ProtoAdapter_CategoryStruct extends DefaultValueProtoAdapter<CategoryStruct> {
        public final CategoryStruct redact(CategoryStruct categoryStruct) {
            return categoryStruct;
        }

        public ProtoAdapter_CategoryStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryStruct.class);
        }

        public final CategoryStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (CategoryStruct) null);
        }

        public final int encodedSize(CategoryStruct categoryStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, categoryStruct.category_name) + categoryStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CategoryStruct categoryStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, categoryStruct.category_name);
            protoWriter.writeBytes(categoryStruct.unknownFields());
        }

        public final CategoryStruct decode(ProtoReader protoReader, CategoryStruct categoryStruct) throws IOException {
            Builder builder;
            CategoryStruct categoryStruct2 = (CategoryStruct) C10938a.m32097a().mo26425a(CategoryStruct.class, categoryStruct);
            if (categoryStruct2 != null) {
                builder = categoryStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (categoryStruct2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.category_name((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getCategoryName() throws NullValueException {
        if (this.category_name != null) {
            return this.category_name;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.category_name != null) {
            i = this.category_name.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.category_name = this.category_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category_name != null) {
            sb.append(", category_name=");
            sb.append(this.category_name);
        }
        StringBuilder replace = sb.replace(0, 2, "CategoryStruct{");
        replace.append('}');
        return replace.toString();
    }

    public CategoryStruct(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryStruct)) {
            return false;
        }
        CategoryStruct categoryStruct = (CategoryStruct) obj;
        if (!unknownFields().equals(categoryStruct.unknownFields()) || !Internal.equals(this.category_name, categoryStruct.category_name)) {
            return false;
        }
        return true;
    }

    public CategoryStruct(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_name = str;
    }
}
