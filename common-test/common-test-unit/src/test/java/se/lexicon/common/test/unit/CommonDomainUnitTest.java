package se.lexicon.common.test.unit;

import com.so4it.serialization.jackson.ObjectMapperFactory;
import com.so4it.test.builder.domain.DomainMatchers;
import com.so4it.test.category.UnitTest;
import com.so4it.test.domain.TestBuilderExecutor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class CommonDomainUnitTest {

    private static final String PACKAGE_NAME = "se.lexicon.common.test.common.domain";

    @Test
    public void testDomainCompliance() {
        TestBuilderExecutor.execute(PACKAGE_NAME, DomainMatchers.builder().withObjectMapper(ObjectMapperFactory.instance()).build());
    }
}
