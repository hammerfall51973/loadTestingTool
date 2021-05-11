package org.jsmart.zerocode.runner;

import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.jsmart.zerocode.utils.DbIdPicker;
import org.junit.runners.model.InitializationError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Arrays.asList;

/**
 * Load from DB and start parallel tests
 *
 */
public class DbParameterizedLoadRunner extends ZeroCodeLoadRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbParameterizedLoadRunner.class);

    public DbParameterizedLoadRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        fetchDbIds();
    }

    private void fetchDbIds() {
        String fetchIdsSql = "select ID from CUSTOMER where SALARY < 60000";
        LOGGER.info("\nFetching all IDs from the DB......................................\n\n" + fetchIdsSql);

        // -------------------------------------------------
        // Connect to DB via JDBC then execute SQL
        // -------------------------------------------------

        DbIdPicker.ids = asList( "sample1", "sample2");
        LOGGER.info("\n......................................done.\n\n");
    }
}
