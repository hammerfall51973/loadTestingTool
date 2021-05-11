package org.jsmart.zerocode.samples.tests.get;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.jsmart.zerocode.restapimockserver.RunMeFirstMockApiServer;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;


@TargetEnv("screening_service_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class GetScreeningServiceTest {

    @BeforeClass
    public static void startServer(){
        RunMeFirstMockApiServer.main(null);
    }

    @Test
    @JsonTestCase("load_tests/get/get_details_by_id.json")
    public void testGetScreeningLocalAndGlobal() {


    }

}
