package net.datafaker;

import java.util.Locale;

/**
 * @since 1.5.0
 */
public class DrivingLicense extends AbstractProvider<IProviders> {

    protected DrivingLicense(BaseFaker faker) {
        super(faker);
    }

    public String drivingLicense(String stateAbbreviation) {
        return faker.regexify(faker.bothify(faker.resolve("driving_license.usa." + stateAbbreviation))).toUpperCase(Locale.ROOT);
    }
}
