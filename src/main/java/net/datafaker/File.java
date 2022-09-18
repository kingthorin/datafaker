package net.datafaker;

/**
 * @since 0.8.0
 */
public class File extends AbstractProvider<IProviders> {

    protected File(BaseFaker faker) {
        super(faker);
    }

    public String extension() {
        return resolve("file.extension");
    }

    public String mimeType() {
        return resolve("file.mime_type");
    }

    public String fileName() {
        return fileName(null, null, null, null);
    }

    public String fileName(String dirOrNull, String nameOrNull, String extensionOrNull, String separatorOrNull) {
        final String sep = separatorOrNull == null ? System.getProperty("file.separator") : separatorOrNull;
        final String dir = dirOrNull == null ? faker.internet().slug() : dirOrNull;
        final String name = nameOrNull == null ? faker.lorem().word().toLowerCase(faker.getContext().getLocale()) : nameOrNull;
        final String ext = extensionOrNull == null ? extension() : extensionOrNull;
        return dir + sep + name + "." + ext;
    }
}
