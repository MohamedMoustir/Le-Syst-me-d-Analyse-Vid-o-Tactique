package com.savt.backend;

import org.junit.jupiter.api.Test;
import org.springframework.ai.vectorstore.mongodb.autoconfigure.MongoDBAtlasVectorStoreAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude = {MongoDBAtlasVectorStoreAutoConfiguration.class})
class SavtBackendApplicationTests {


	@Test
	void contextLoads() {
	}

}
