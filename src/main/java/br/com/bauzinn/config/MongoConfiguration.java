package br.com.bauzinn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration extends AbstractMongoConfiguration {
	
	
	@Override
    public MongoClient mongo() throws Exception {
       return new MongoClient( "localhost" , 27017 );
    }
 
	@Override
    protected String getMappingBasePackage(){
        return "br.com.bauzinn";
    }

	@Override
	protected String getDatabaseName() {
		return "bauzinn";

	}
}
